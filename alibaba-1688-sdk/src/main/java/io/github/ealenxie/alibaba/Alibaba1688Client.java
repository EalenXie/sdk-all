package io.github.ealenxie.alibaba;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.codec.binary.Hex;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by EalenXie on 2022/12/15 9:51
 */
public abstract class Alibaba1688Client {
    private final RestOperations restOperations;
    private final ObjectMapper objectMapper;
    private final String appKey;
    private final String appSecret;
    private String accessToken;

    /**
     * 设置 accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 正式环境接口地址
     */
    public static final String HOST = "https://gw.open.1688.com/openapi/";

    protected Alibaba1688Client(String appKey, String appSecret, String accessToken) {
        this(appKey, appSecret, accessToken, new ObjectMapper(), new RestTemplate());
    }

    protected Alibaba1688Client(String appKey, String appSecret, String accessToken, ObjectMapper objectMapper, RestOperations restOperations) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.accessToken = accessToken;
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    /**
     * 调用alibaba 1688接口
     *
     * @param serviceName   服务名
     * @param dto           业务请求参数
     * @param typeReference 响应结果类型
     */
    public <T> T postAlibaba(String serviceName, Object dto, ParameterizedTypeReference<T> typeReference) {
        String urlNotHost = getUrlNotHost(serviceName, appKey);
        URI uri = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", HOST, urlNotHost)).build().encode().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        return getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(getArgs(urlNotHost, dto), headers), typeReference).getBody();
    }

    /**
     * 获取签名
     *
     * @param signStr   签名字符串
     * @param appSecret 签名secret
     * @return 签名
     */
    public String getSign(String signStr, String appSecret) {
        try {
            final String algorithm = "HmacSHA1";
            // 算法签名
            SecretKeySpec signingKey = new SecretKeySpec(appSecret.getBytes(UTF_8), algorithm);
            Mac mac = Mac.getInstance(algorithm);
            mac.init(signingKey);
            byte[] rawHmac = mac.doFinal(signStr.getBytes(UTF_8));
            return Hex.encodeHexString(rawHmac).toUpperCase();
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 构建请求参数
     *
     * @param urlNotHost 不包含host的请求路径
     * @param dto        业务请求参数
     */
    public MultiValueMap<String, Object> getArgs(String urlNotHost, Object dto) {
        SortedMap<String, Object> args = objectMapper.convertValue(dto, new TypeReference<SortedMap<String, Object>>() {
        });
        args.put("_aop_timestamp", String.valueOf(System.currentTimeMillis()));
        if (!ObjectUtils.isEmpty(accessToken)) {
            args.put("access_token", accessToken);
        }
        // 获取阿里巴巴签名字符串
        StringBuilder sb = new StringBuilder(urlNotHost);
        Set<Map.Entry<String, Object>> entries = args.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            if (!entry.getKey().equals("_aop_signature")) {
                sb.append(entry.getKey()).append(entry.getValue());
            }
        }
        String signStr = sb.toString();
        String sign = getSign(signStr, appSecret);
        args.put("_aop_signature", sign);
        MultiValueMap<String, Object> valueMap = new LinkedMultiValueMap<>();
        valueMap.setAll(args);
        return valueMap;
    }

    /**
     * 根据 服务名 获取不包含HOST的路径URL
     * 拼接规则  : 替换为 /  -符号最后的数字作为版本路径
     *
     * @param serviceName 类似于 com.alibaba.trade:alibaba.trade.get.buyerView-1
     * @param appKey      appKey
     */
    public static String getUrlNotHost(String serviceName, String appKey) {
        String[] paths = serviceName.replace(':', '/').split("-");
        return String.format("param2/%s/%s/%s", paths[1], paths[0], appKey);
    }


}
