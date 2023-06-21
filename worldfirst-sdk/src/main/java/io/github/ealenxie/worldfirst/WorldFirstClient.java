package io.github.ealenxie.worldfirst;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.worldfirst.dto.RequireArgs;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * @author jadechiang
 * @since 2023/6/2 14:19
 * 万里汇平台
 */
public abstract class WorldFirstClient {

    private final RestOperations restOperations;
    private final ObjectMapper objectMapper;
    /**
     * 是否是沙箱环境
     */
    private boolean sandbox = false;

    public boolean isSandbox() {
        return sandbox;
    }

    public void setSandbox(boolean sandbox) {
        this.sandbox = sandbox;
    }

    protected WorldFirstClient() {
        this(new RestTemplate(), new ObjectMapper());
    }

    protected WorldFirstClient(RestOperations restOperations, ObjectMapper objectMapper) {
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    /**
     * 正式环境接口地址 Host 地址
     */
    public static final String HOST = "https://open-sea.worldfirst.com";

    private static final Signature SIGNATURE;

    static {
        try {
            SIGNATURE = Signature.getInstance("SHA256withRSA");
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 默认转换格式
     */
    public static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
    /**
     * 默认转换时区
     */
    public static final ZoneId DEFAULT_ZONEID = ZoneId.of("Asia/Shanghai");


    /**
     * 调用万里汇接口
     *
     * @param serviceName   服务名
     * @param requireArgs   系统级必填参数
     * @param dto           业务请求参数
     * @param typeReference 响应结果类型
     */
    public <T> T postWorldfirst(String serviceName, RequireArgs requireArgs, Object dto, String customerId, ParameterizedTypeReference<T> typeReference) {
        String url = getUrlNotHost(serviceName);
        // 时间戳
        String timeString = LocalDateTime.now().atZone(DEFAULT_ZONEID).format(DEFAULT_FORMATTER);
        // 签名过后的字符串
        String signature = sign(HttpMethod.POST.name(), serviceName, requireArgs.getClientId(), timeString, getReqBody(dto), requireArgs.getPrivateKey());
        HttpHeaders headers = getHeaders(requireArgs.getClientId(), requireArgs.getPrivateKey(), signature, timeString, customerId);
        return getRestOperations().exchange(URI.create(String.format("%s%s", HOST, url)), HttpMethod.POST, new HttpEntity<>(dto, headers), typeReference).getBody();
    }

    /**
     * @param clientId 客户端id
     */
    @SuppressWarnings("all")
    public HttpHeaders getHeaders(String clientId, String privateKey, String signature, String timeString, String customerId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Client-Id", clientId);
        httpHeaders.set("Signature", signature);
        httpHeaders.set("Request-Time", timeString);
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        if (!ObjectUtils.isEmpty(customerId)) {
            httpHeaders.set("Connected-CustomerId", customerId);
        }
        return httpHeaders;
    }


    /**
     * Sign the contents of the merchant request
     *
     * @param httpMethod         http method                e.g., POST, GET
     * @param uriWithQueryString query string in url        e.g., if your request url is https://{domain_name}.com/ams/api/pay/query uriWithQueryString should be /ams/api/pay/query not https://{domain_name}.com/ams/api/pay/query
     * @param clientId           clientId issued by WorldFirst  e.g., *****
     * @param timeString         "request-time" in request  e.g., 2020-01-03T14:36:27+08:00
     * @param reqBody            json format request        e.g., "{"paymentRequestId":"*****","refundRequestId":"*****","refundAmount":{"currency":"USD","value":"123"},"extendInfo":{"":""}}"
     * @param privateKey         your private key
     */
    public static String sign(String httpMethod, String uriWithQueryString, String clientId, String timeString, String reqBody, String privateKey) {
        String reqContent = httpMethod + " " + uriWithQueryString + "\n" + clientId + "." + timeString + "." + reqBody;
        String signature = signature(reqContent, privateKey);
        return String.format("algorithm=RSA256,keyVersion=1,signature=%s", signature);
    }

    /**
     * Generate base64 encoded signature using the sender's private key
     *
     * @param signString: 签名字符串
     * @param privateKey: 这是一个应该被64编码过后的私钥信息
     */
    private static String signature(String signString, String privateKey) {
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey));
        try {
            KeyFactory kf = KeyFactory.getInstance("RSA");
            SIGNATURE.initSign(kf.generatePrivate(spec));
            SIGNATURE.update(signString.getBytes(StandardCharsets.UTF_8));
            return URLEncoder.encode(Base64.getEncoder().encodeToString(SIGNATURE.sign()), "UTF-8");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | SignatureException | InvalidKeyException |
                 UnsupportedEncodingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 在api前面加 sandbox/ 代表是沙箱环境
     *
     * @param serviceName 类似于 /amsin/api/v1/business/fund/consultPayout
     */
    public String getUrlNotHost(String serviceName) {
        return isSandbox() ? serviceName.replace("api", "sandbox/api") : serviceName;
    }

    @Nullable
    public String getReqBody(Object body) {
        try {
            return objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }
}
