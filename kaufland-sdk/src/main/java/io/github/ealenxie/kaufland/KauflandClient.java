package io.github.ealenxie.kaufland;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.codec.binary.Hex;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @author jadechiang
 * @since 2022/08/12 12:45
 */
public abstract class KauflandClient {

    public static final String DEFAULT_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36";
    // real 的加密算法为 HmacSHA256
    private static final String HMAC_SHA_256 = "HmacSHA256";

    private final ObjectMapper mapper;

    private final RestOperations restOperations;


    protected KauflandClient(ObjectMapper objectMapper, RestOperations restOperations) {
        this.restOperations = restOperations;
        this.mapper = objectMapper;
    }

    protected KauflandClient(RestOperations restOperations) {
        this.restOperations = restOperations;
        this.mapper = new ObjectMapper();
    }

    public ObjectMapper getMapper() {
        return mapper;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }


    /**
     * 获取包含认证的 Real Bearer 标准请求头
     *
     * @param appKey    令牌
     * @param signature 签名
     */
    public abstract HttpHeaders getHeaders(String appKey, String signature, String timestamp);


    public HttpHeaders getHttpHeadersWithSign(String appKey, String secretKey, HttpMethod method, String body, URI uri) {
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000L);
        String signatureString = getSignatureString(method.name(), uri.toString(), body, timestamp);
        String signature = getSign(signatureString, secretKey);
        return getHeaders(appKey, signature, timestamp);
    }


    @SuppressWarnings("all")
    public LinkedMultiValueMap<String, String> queryParam(Object dto) {
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        return req;
    }


    /**
     * 加密
     *
     * @param signString 签名字符串
     * @param secretKey  加密的密钥
     */
    public static String getSign(String signString, String secretKey) {
        try {
            SecretKeySpec signingKey = new SecretKeySpec(secretKey.getBytes(UTF_8), HMAC_SHA_256);
            Mac mac = Mac.getInstance(HMAC_SHA_256);
            mac.init(signingKey);
            byte[] rawHmac = mac.doFinal(signString.getBytes(UTF_8));
            return Hex.encodeHexString(rawHmac);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new UnsupportedOperationException(e);
        }
    }


    /**
     * <a href="https://sellerapi.kaufland.com/?page=rest-api#signrequest-java">签名字符串算法</a>
     */
    public static String getSignatureString(String method, String uri, String body, String timestamp) {
        return method + "\n" + uri + "\n" + (ObjectUtils.isEmpty(body) ? "" : body) + "\n" + timestamp;
    }
}
