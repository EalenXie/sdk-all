package io.github.ealenxie.alibaba;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.alibaba.dto.RequireArgs;
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
    /**
     * 正式环境接口地址
     */
    public static final String HOST = "https://gw.open.1688.com/openapi/";

    protected Alibaba1688Client() {
        this(new ObjectMapper(), new RestTemplate());
    }

    protected Alibaba1688Client(ObjectMapper objectMapper, RestOperations restOperations) {
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
     * @param requireArgs   系统级必填参数
     * @param dto           业务请求参数
     * @param typeReference 响应结果类型
     */
    public <T> T postAlibaba(String serviceName, RequireArgs requireArgs, Object dto, ParameterizedTypeReference<T> typeReference) {
        String urlNotHost = getUrlNotHost(serviceName, requireArgs.getAppKey());
        URI uri = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", HOST, urlNotHost)).build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(getArgs(urlNotHost, requireArgs, dto), getHeader()), typeReference).getBody();
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
     * @param urlNotHost  不包含host的请求路径
     * @param requireArgs 系统级必填参数
     * @param dto         业务请求参数
     */
    public MultiValueMap<String, Object> getArgs(String urlNotHost, RequireArgs requireArgs, Object dto) {
        SortedMap<String, Object> args = objectMapper.convertValue(dto, new TypeReference<SortedMap<String, Object>>() {
        });
        args.put("_aop_timestamp", String.valueOf(System.currentTimeMillis()));
        if (!ObjectUtils.isEmpty(requireArgs.getAccessToken())) {
            args.put("access_token", requireArgs.getAccessToken());
        }
        String signStr = getSignStr(urlNotHost, args);
        String sign = getSign(signStr, requireArgs.getAppSecret());
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


    /**
     * 获取阿里巴巴签名字符串
     *
     * @param urlNotHost 不包含host的url路径
     * @param urlParams  URL路径参数
     * @return 签名字符串
     */
    public String getSignStr(String urlNotHost, SortedMap<String, Object> urlParams) {
        StringBuilder signStr = new StringBuilder(urlNotHost);
        Set<Map.Entry<String, Object>> entries = urlParams.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            if (!entry.getKey().equals("_aop_signature")) {
                signStr.append(entry.getKey()).append(entry.getValue());
            }
        }
        return signStr.toString();
    }

    public HttpHeaders getHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        return headers;

    }
}
