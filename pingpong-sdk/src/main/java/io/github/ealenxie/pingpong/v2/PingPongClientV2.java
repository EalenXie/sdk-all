package io.github.ealenxie.pingpong.v2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.pingpong.v2.dto.*;
import io.github.ealenxie.pingpong.v2.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.tomitribe.auth.signatures.Signature;
import org.tomitribe.auth.signatures.Signer;

import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * PingPong平台V2接口，<a href="http://222.209.91.242:4999/Public/Uploads/2023-06-07/64804400649b8.pdf">文档链接</a>
 *
 * @author create by sch  2023/6/7 17:16
 * @version 1.0
 */
public class PingPongClientV2 {

    private final RestOperations restOperations;
    private final ObjectMapper mapper;
    private static final List<String> SIGNATURE_HEADERS = new ArrayList<>(Arrays.asList("(request-target)", "Host", "Date", "Digest"));

    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;

    /**
     * 沙箱环境接口地址
     */
    private static final String HOST_SANDBOX = "https://test-gateway.pingpongx.com";
    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://gateway.pingpongx.com";

    private static final MessageDigest SHA256;

    public PingPongClientV2() {
        this(new ObjectMapper(), new RestTemplate());
    }

    public PingPongClientV2(ObjectMapper mapper, RestOperations restOperations) {
        this.restOperations = restOperations;
        this.mapper = mapper;
    }

    static {
        try {
            SHA256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    /**
     * 获取访问令牌
     */
    public AuthVO getAccessToken(PingPongConfig dto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/token/get", isSandBox() ? HOST_SANDBOX : HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        return getPingPongOkRespBody(restOperations.exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<PingPongResp<AuthVO>>() {
        }));
    }

    /**
     * 获取开发者关联的clientId信息
     */
    public List<String> getStoreClientId(PingPongConfig pingPongConfig, String clientId) {
        String requestUri = "/v2/dataapi/v2/store/clientIds";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, new ClientIdDTO(clientId), HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(null, httpHeaders), new ParameterizedTypeReference<PingPongResp<List<String>>>() {
        }));
    }

    /**
     * 获取平台列表
     */
    public List<PlatformVO> getPlatforms(PingPongConfig pingPongConfig, ClientIdDTO dto) {
        String requestUri = "/v2/dataapi/v2/store/platforms";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<List<PlatformVO>>>() {
        }));
    }

    /**
     * 查询店铺信息
     */
    public PageResp<StoreInfoVO> getStoreInfo(PingPongConfig pingPongConfig, StoreInfoDTO dto) {
        String requestUri = "/v2/dataapi/v2/store/store-info";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<StoreInfoVO>>>() {
        }));
    }

    /**
     * 查询余额
     */
    public PageResp<AccountBalanceVO> getAccountBalance(PingPongConfig pingPongConfig, AccountBalanceDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/balance";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<AccountBalanceVO>>>() {
        }));
    }

    /**
     * 查询流水
     */
    public PageResp<AccountStatementVO> getAccountStatement(PingPongConfig pingPongConfig, AccountStatementDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/statement";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<AccountStatementVO>>>() {
        }));
    }

    /**
     * 查询提现记录
     */
    public PageResp<WithdrawRecordVO> getWithdrawRecords(PingPongConfig pingPongConfig, WithdrawRecordDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/withdraw-records";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<WithdrawRecordVO>>>() {
        }));
    }

    /**
     * 查询提现明细
     */
    public PageResp<WithdrawDetailVO> getWithdrawDetail(PingPongConfig pingPongConfig, WithdrawDetailDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/withdraw-detail";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<WithdrawDetailVO>>>() {
        }));
    }

    /**
     * 查询付款记录
     */
    public PageResp<PayoutRecordVO> getPayoutRecords(PingPongConfig pingPongConfig, PayoutRecordDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/payout-records";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<PayoutRecordVO>>>() {
        }));
    }

    /**
     * 查询付款明细
     */
    public PageResp<PayoutDetailVO> getPayoutDetail(PingPongConfig pingPongConfig, PayoutDetailDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/payout-detail";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<PayoutDetailVO>>>() {
        }));
    }

    /**
     * 查询归集记录
     */
    public PageResp<CollectionRecordVO> getCollectionRecords(PingPongConfig pingPongConfig, CollectionRecordDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/collection-records";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<CollectionRecordVO>>>() {
        }));
    }

    /**
     * 查询专用账户流水
     */
    public PageResp<AccountStatementVO> getSpecialAccountStatement(PingPongConfig pingPongConfig, SpecialAccountStatementDTO dto) {
        String requestUri = "/v2/dataapi/v2/account/special-account-statement";
        HttpHeaders httpHeaders = getHttpHeaders(pingPongConfig, dto, HttpMethod.POST.name(), requestUri);
        return getPingPongOkRespBody(restOperations.exchange(getUri(requestUri), HttpMethod.POST, new HttpEntity<>(dto, httpHeaders), new ParameterizedTypeReference<PingPongResp<PageResp<AccountStatementVO>>>() {
        }));
    }

    /**
     * 获取URI
     */
    public URI getUri(String requestUri) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", sandBox ? HOST_SANDBOX : HOST, requestUri));
        return builder.build().encode().toUri();
    }

    private LinkedMultiValueMap<String, String> getQueryParams(Object dto) {
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        return req;
    }

    /**
     * 获取PingPong 包含正常状态码0000的接口返回消息体
     */
    public <T> T getPingPongOkRespBody(ResponseEntity<PingPongResp<T>> response) {
        PingPongResp<T> body = response.getBody();
        if (body == null) {
            throw new UnsupportedOperationException("call PingPong is null");
        }
        if (body.isOk()) {
            return body.getData();
        }
        throw new UnsupportedOperationException("call PingPong is not ok :" + body.getMessage());
    }


    /**
     * 获取请求头
     */
    public HttpHeaders getHttpHeaders(PingPongConfig config, Object payload, String method, String uri) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(config.getAccessToken());
        headers.setContentType(MediaType.APPLICATION_JSON);
        Map<String, String> map = getHeadersMap(config, payload, method, uri);
        map.forEach(headers::set);
        return headers;
    }

    /**
     * 获取请求头Map
     */
    public Map<String, String> getHeadersMap(PingPongConfig config, Object payloadObj, String method, String uri) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Host", sandBox ? "test-gateway.pingpongx.com" : "gateway.pingpongx.com");
        String date = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US).format(new Date());
        headers.put("Date", date);
        try {
            String payload = mapper.writeValueAsString(payloadObj);
            String digest = getDigest(payload);
            headers.put("Digest", digest);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
        headers.put("Signature", generateSignature(config.getAppId(), config.getAppSecret(), method, uri, headers));
        return headers;
    }

    /**
     * 摘要信息加密
     */
    public static String getDigest(String payload) {
        byte[] digest = SHA256.digest(payload.getBytes());
        return "SHA-256=" + new String(org.tomitribe.auth.signatures.Base64.encodeBase64(digest));
    }

    /**
     * 签名
     */
    public static String generateSignature(String appId, String appSecret, String method, String uri, Map<String, String> headers) {
        try {
            // 计算签名
            Signature signature = new Signature(appId, "hmac-sha256", "hmac-sha256", null, SIGNATURE_HEADERS);
            byte[] secretHashBytes = SHA256.digest(appSecret.getBytes());
            String secretHash = new String(org.tomitribe.auth.signatures.Base64.encodeBase64(secretHashBytes));
            Key key = new SecretKeySpec(secretHash.getBytes(), "HmacSHA256");
            Signer signer = new Signer(key, signature);
            Signature sign = signer.sign(method, uri, headers);
            return sign.toString();
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

}
