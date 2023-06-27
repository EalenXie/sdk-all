package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

/**
 * Created by EalenXie on 2022/9/22 9:54
 */
public abstract class FopClient {
    private static final String FOP_URL = "https://open.4px.com";
    private static final String TEST_FOP_URL = "https://open-test.4px.com";
    /**
     * 应用接入申请的AppKey
     */
    private final String appKey;
    /**
     * 签名密钥 ,用作于签名认证
     */
    private final String appSecret;
    private final RestOperations restOperations;
    private final ObjectMapper objectMapper;
    private final HttpHeaders headers = getFopHeader();

    protected FopClient(String appKey, String appSecret, RestOperations restOperations, ObjectMapper objectMapper) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
    }

    protected FopClient(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.restOperations = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    protected FopClient(String appKey, String appSecret, RestOperations restOperations) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.restOperations = restOperations;
        this.objectMapper = new ObjectMapper();
    }

    /**
     * 通过OAuth授权方式获得，要求平台服务商、第三方软件商必须传入，4PX客户（B类客户）可不传
     */
    private String accessToken;

    /**
     * 当前是否沙箱环境
     */
    private boolean sandBox = true;

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    private HttpHeaders getFopHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }

    /**
     * 调用FOP接口
     * <a href="http://open.4px.com/apiInfo/partner">http://open.4px.com/apiInfo/introduce</a>
     *
     * @param method        函数方法
     * @param body          请求body
     * @param typeReference 返回值类型
     * @return 调用FOP返回接口
     */
    public <T> T postFop(String method, Object body, TypeReference<T> typeReference) {
        try {
            CommonArgs common = new CommonArgs(new AppKeySecret(appKey, appSecret, accessToken), method);
            String bodyJson;
            if (body instanceof String) {
                bodyJson = (String) body;
            } else {
                bodyJson = body == null ? "" : objectMapper.writeValueAsString(body);
            }
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/router/api/service", isSandBox() ? TEST_FOP_URL : FOP_URL));
            SortedMap<String, String> sortedMap = objectMapper.convertValue(common, new TypeReference<SortedMap<String, String>>() {
            });
            LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.setAll(sortedMap);
            // 4PX 签名
            String signString = String.format("app_key%sformat%smethod%stimestamp%sv%s%s%s", common.getAppKey(), common.getFormat(), common.getMethod(), common.getTimestamp(), common.getVersion(), bodyJson, common.getAppSecret());
            String sign = DigestUtils.md5DigestAsHex(signString.getBytes(StandardCharsets.UTF_8));
            queryParams.set("sign", sign);
            builder.queryParams(queryParams);
            URI uri = builder.build().toUri();
            String respBody = getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(bodyJson, headers), String.class).getBody();
            return objectMapper.readValue(respBody, typeReference);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

}
