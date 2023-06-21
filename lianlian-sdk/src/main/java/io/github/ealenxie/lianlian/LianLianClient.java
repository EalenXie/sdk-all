package io.github.ealenxie.lianlian;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.lianlian.dto.AccountDTO;
import io.github.ealenxie.lianlian.dto.TransactionsDTO;
import io.github.ealenxie.lianlian.dto.TransactionsEntryListDTO;
import io.github.ealenxie.lianlian.dto.WithdrawRecordDTO;
import io.github.ealenxie.lianlian.vo.*;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by EalenXie on 2022/4/6 17:20
 */
public class LianLianClient {

    /**
     * 开发者账号ID
     */
    private final String developerId;
    /**
     * 主令牌 masterToken 能行使用户所有权限，请您务必安全保管
     */
    private final String masterToken;
    /**
     *
     */
    private final String rsaPrivateKeyUrl;
    /**
     * LianLian的接口 只能用OkHttp3才能调通  故使用OkHttpClient初始化RestOperations
     */
    private final RestOperations restOperations;

    private final ObjectMapper mapper;
    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;
    /**
     * 沙箱环境接口地址
     */
    private static final String HOST_SANDBOX = "https://gtest-open-api.lianlianpay-inc.com";
    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://global-open-api.lianlianpay.com";

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    private static final RestTemplate defaultRestOperations;

    static {
        OkHttpClient okHttpConfigClient = new OkHttpClient().newBuilder().connectionPool(new ConnectionPool(15, 20, TimeUnit.SECONDS)).connectTimeout(10, TimeUnit.SECONDS).readTimeout(20, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).build();
        OkHttp3ClientHttpRequestFactory okHttp3ClientHttpRequestFactory = new OkHttp3ClientHttpRequestFactory(okHttpConfigClient);
        RestTemplate restTemplate = new RestTemplate(okHttp3ClientHttpRequestFactory);
        List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
        // 字符串序列化转换器 字符集采用UTF-8
        for (int i = 0; i < converters.size(); i++) {
            if (converters.get(i) instanceof StringHttpMessageConverter) {
                StringHttpMessageConverter converter = (StringHttpMessageConverter) converters.get(i);
                converter.setDefaultCharset(StandardCharsets.UTF_8);
                converters.set(i, converter);
                break;
            }
        }
        restTemplate.setMessageConverters(converters);
        defaultRestOperations = restTemplate;
    }

    public LianLianClient(String developerId, String masterToken, String rsaPrivateKeyUrl) {
        this(developerId, masterToken, rsaPrivateKeyUrl, defaultRestOperations, new ObjectMapper());
    }

    public LianLianClient(String developerId, String masterToken, String rsaPrivateKeyUrl, ObjectMapper mapper) {
        this(developerId, masterToken, rsaPrivateKeyUrl, defaultRestOperations, mapper);
    }

    public LianLianClient(String developerId, String masterToken, String rsaPrivateKeyUrl, RestOperations restOperations, ObjectMapper mapper) {
        this.developerId = developerId;
        this.masterToken = masterToken;
        this.rsaPrivateKeyUrl = rsaPrivateKeyUrl;
        this.mapper = mapper;
        this.restOperations = restOperations;
        Security.addProvider(new BouncyCastleProvider());
    }

    /**
     * 获取包含认证的 Basic 标准请求头
     *
     * @return the basic headers.
     */
    public HttpHeaders getBasicHeaders() {
        HttpHeaders basicHeader = new HttpHeaders();
        basicHeader.setBasicAuth(developerId, masterToken);
        return basicHeader;
    }

    /**
     * <a href="https://developer.lianlianglobal.com/docs/llp-api/6e3c95aa7b658-">查询用户收款账户余额</a>
     *
     * @return 余额信息
     */
    public LianLianResp<List<BalanceVO>> accountBalance() {
        String urlNotHost = getUrlNotHost("/account/balance/query");
        HttpMethod method = HttpMethod.POST;
        UriComponentsBuilder builder = uriComponentsBuilder(urlNotHost);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headersWithSign = getHeadersWithSign(method.name(), urlNotHost, null, uri.getQuery());
        return restOperations.exchange(uri, method, new HttpEntity<>(null, headersWithSign), new ParameterizedTypeReference<LianLianResp<List<BalanceVO>>>() {
        }).getBody();
    }

    /**
     * <a href="https://developer.lianlianglobal.com/docs/llp-api/5f2e875a7a8d2-">用户账户详情查询</a>
     *
     * @return 账号信息
     */
    public LianLianResp<AccountVO> account(AccountDTO dto) {
        String urlNotHost = getUrlNotHost("/account/query");
        HttpMethod method = HttpMethod.POST;
        UriComponentsBuilder builder = uriComponentsBuilder(urlNotHost);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headersWithSign = getHeadersWithSign(method.name(), urlNotHost, dto, uri.getQuery());
        return restOperations.exchange(uri, method, new HttpEntity<>(dto, headersWithSign), new ParameterizedTypeReference<LianLianResp<AccountVO>>() {
        }).getBody();
    }

    /**
     * <a href="https://developer.lianlianglobal.com/docs/llp-api/9250a1f8d5c54-">资金流水查询</a>
     *
     * @return 资金流水信息
     */
    public LianLianResp<TransactionVO> transactions(TransactionsDTO dto) {
        String urlNotHost = getUrlNotHost("/myshop/transaction");
        HttpMethod method = HttpMethod.POST;
        UriComponentsBuilder builder = uriComponentsBuilder(urlNotHost);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headersWithSign = getHeadersWithSign(method.name(), urlNotHost, dto, uri.getQuery());
        return restOperations.exchange(uri, method, new HttpEntity<>(dto, headersWithSign), new ParameterizedTypeReference<LianLianResp<TransactionVO>>() {
        }).getBody();
    }

    /**
     * <a href="https://developer.lianlianglobal.com/docs/llp-api/e361747518aa8-">入账交易查询</a>
     *
     * @return 入账交易信息
     */
    public LianLianResp<TransactionEntryVO> transactionEntry(TransactionsEntryListDTO dto) {
        String urlNotHost = getUrlNotHost("/transaction/entry/list");
        HttpMethod method = HttpMethod.POST;
        UriComponentsBuilder builder = uriComponentsBuilder(urlNotHost);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headersWithSign = getHeadersWithSign(method.name(), urlNotHost, dto, uri.getQuery());
        headersWithSign.setContentType(MediaType.APPLICATION_JSON);
        return restOperations.exchange(uri, method, new HttpEntity<>(dto, headersWithSign), new ParameterizedTypeReference<LianLianResp<TransactionEntryVO>>() {
        }).getBody();
    }


    /**
     * <a href="https://developer.lianlianglobal.com/docs/llp-api/3f7ebd879c7c2-">提现交易查询</a>
     *
     * @return 提现交易信息
     */
    public LianLianResp<WithdrawRecordVO> withdrawRecord(WithdrawRecordDTO dto) {
        String urlNotHost = getUrlNotHost("/withdraw/record/list");
        HttpMethod method = HttpMethod.POST;
        UriComponentsBuilder builder = uriComponentsBuilder(urlNotHost);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headersWithSign = getHeadersWithSign(method.name(), urlNotHost, dto, uri.getQuery());
        headersWithSign.setContentType(MediaType.APPLICATION_JSON);
        return restOperations.exchange(uri, method, new HttpEntity<>(dto, headersWithSign), new ParameterizedTypeReference<LianLianResp<WithdrawRecordVO>>() {
        }).getBody();
    }


    /**
     * @param urlNotHost 不包含host的url路径
     * @return UriComponentsBuilder
     */
    public UriComponentsBuilder uriComponentsBuilder(String urlNotHost) {
        return UriComponentsBuilder.fromHttpUrl(String.format("%s/%s", sandBox ? HOST_SANDBOX : HOST, urlNotHost));
    }


    public String getUrlNotHost(String urlNotHost) {
        return isSandBox() ? String.format("/api%s", urlNotHost) : urlNotHost;
    }

    /**
     * 获取LianLian 包含正常状态码0000的接口返回消息体
     */
    public <T> T getLianLianOkRespBody(ResponseEntity<LianLianResp<T>> response) {
        LianLianResp<T> body = response.getBody();
        if (body == null) {
            throw new UnsupportedOperationException("call LianLian is null");
        }
        if (body.isOk()) {
            return body.getData();
        }
        throw new UnsupportedOperationException("call LianLian is not ok :" + body.getCode());
    }

    /**
     * <a href="https://developer.lianlianglobal.com/docs/llp-api/ZG9jOjI5ODg2NzEw-">签名字符串 拼接公式</a>
     *
     * @param httpMethod     请求方法
     * @param urlNotHost     请求的URI地址（除去host）
     * @param requestEpoch   请求时间戳
     * @param requestPayload 请求体对象
     * @param queryString    未编码的url参数
     * @return SignStr
     */
    public String getSignStr(String httpMethod, String urlNotHost, String requestEpoch, @Nullable Object requestPayload, @Nullable String queryString) {
        try {
            final String separator = "&";
            StringBuilder sb = new StringBuilder();
            sb.append(httpMethod.toUpperCase()).append(separator).append(urlNotHost).append(separator).append(requestEpoch).append(separator);
            if (requestPayload != null) {
                String payload = (requestPayload instanceof String) ? (String) requestPayload : mapper.writeValueAsString(requestPayload);
                sb.append(payload);
            }
            if (queryString != null) {
                sb.append(separator).append(URLEncoder.encode(queryString, StandardCharsets.UTF_8.name()));
            }
            return sb.toString();
        } catch (JsonProcessingException | UnsupportedEncodingException e) {
            throw new UnsupportedOperationException(e);
        }
    }


    /**
     * <a href="https://developer.lianlianglobal.com/docs/llp-api/ZG9jOjI5ODg2NzEw-">获取包含认证与签名的请求头</a>
     *
     * @param method      请求方法
     * @param urlNotHost  请求路径
     * @param body        请求体
     * @param queryParams 请求的URL参数
     * @return HttpHeaders
     */
    public HttpHeaders getHeadersWithSign(String method, String urlNotHost, @Nullable Object body, @Nullable String queryParams) {
        HttpHeaders headers = getBasicHeaders();
        String requestEpoch = String.valueOf(System.currentTimeMillis() / 1000);
        String signStr = getSignStr(method, urlNotHost, requestEpoch, body, queryParams);
        PrivateKey pkcs1PrivateKey = getPkcs1PrivateKey(rsaPrivateKeyUrl);
        String signSha256Rsa = getSignSha256Rsa(signStr, pkcs1PrivateKey);
        headers.set("LLPAY-Signature", String.format("t=%s,v=%s", requestEpoch, signSha256Rsa));
        return headers;
    }

    /**
     * RSA SHA256 签名
     *
     * @param signStr    签名字符串
     * @param privateKey 签名私钥
     * @return 签名
     */
    public String getSignSha256Rsa(String signStr, PrivateKey privateKey) {
        try {
            // SHA256withRSA 签名
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);
            signature.update(signStr.getBytes(StandardCharsets.UTF_8));
            // base64计算
            return Base64.encodeBase64String(signature.sign());
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 获取 pkcs1的 PrivateKey
     *
     * @param pkcs1PrivateKeyFilePath pkcs1 文件路径
     * @return PrivateKey
     */
    public PrivateKey getPkcs1PrivateKey(String pkcs1PrivateKeyFilePath) {
        ClassPathResource classPathResource = new ClassPathResource(pkcs1PrivateKeyFilePath);
        try {
            return getPkcs1PrivateKey(classPathResource.getInputStream());
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 获取 pkcs1的 PrivateKey
     *
     * @param inputStream pkcs1 文件流
     * @return PrivateKey
     */
    public PrivateKey getPkcs1PrivateKey(InputStream inputStream) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream); PEMParser pemParser = new PEMParser(inputStreamReader)) {
            //  RSA PKCS1 私钥读取
            JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
            Object object = pemParser.readObject();
            KeyPair kp = converter.getKeyPair((PEMKeyPair) object);
            return kp.getPrivate();
        } catch (IOException e) {
            throw new UnsupportedOperationException(e);
        }
    }


}
