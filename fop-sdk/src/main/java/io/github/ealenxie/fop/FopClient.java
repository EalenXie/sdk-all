package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
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

    /**
     * 递四方 正式API地址
     */
    private static final String FOP_URL = "https://open.4px.com";
    /**
     * 递四方 沙箱API地址
     */
    private static final String TEST_FOP_URL = "https://open-test.4px.com";
    /**
     * 菜鸟驿站 正式API 地址
     */
    private static final String CAINIAO_URL = "https://open.gfn.cainiao.com";
    /**
     * 菜鸟驿站 沙箱API地址
     */
    private static final String TEST_CAINIAO_URL = "https://open-test.gfn.cainiao.com";
    /**
     * 默认4PX 初始化Client时 ,为否则是菜鸟接口
     */
    private final boolean isFop;
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

    protected FopClient(String appKey, String appSecret, boolean isFop, RestOperations restOperations, ObjectMapper objectMapper) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.isFop = isFop;
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
    }

    protected FopClient(String appKey, String appSecret) {
        this(appKey, appSecret, true, new RestTemplate(), defaultObjectMapper());
    }

    protected FopClient(String appKey, String appSecret, RestOperations restOperations) {
        this(appKey, appSecret, true, restOperations, defaultObjectMapper());
    }

    public static ObjectMapper defaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
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
     * 获取授权地址
     *
     * @param redirectUri redirectUri
     */
    public String getAuthorizeUrl(String redirectUri) {
        return String.format("%s/authorize/get?client_id=%s&response_type=code&redirect_uri=%s", getHost(), appKey, redirectUri);
    }

    /**
     * <a href="https://open.gfn.cainiao.com/apiInfo/partner">授权码模式获取accessToken</a>
     *
     * @param code        授权码
     * @param redirectUri 重定向地址
     */
    public AccessTokenResponse accessToken(String code, String redirectUri) {
        LinkedMultiValueMap<String, String> tokenRequest = new LinkedMultiValueMap<>();
        tokenRequest.add("client_id", appKey);
        tokenRequest.add("client_secret", appSecret);
        tokenRequest.add("redirect_uri", redirectUri);
        tokenRequest.add("grant_type", "authorization_code");
        tokenRequest.add("code", code);
        return getToken(tokenRequest);
    }

    /**
     * <a href="https://open.gfn.cainiao.com/apiInfo/partner">刷新令牌</a>
     *
     * @param refreshToken 授权码
     * @param redirectUri  重定向地址
     */
    public AccessTokenResponse refreshToken(String refreshToken, String redirectUri) {
        LinkedMultiValueMap<String, String> tokenRequest = new LinkedMultiValueMap<>();
        tokenRequest.add("client_id", appKey);
        tokenRequest.add("client_secret", appSecret);
        tokenRequest.add("grant_type", "refreshToken");
        tokenRequest.add("refresh_token", refreshToken);
        tokenRequest.add("redirect_uri", redirectUri);
        return getToken(tokenRequest);
    }

    private AccessTokenResponse getToken(LinkedMultiValueMap<String, String> tokenRequest) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/accessToken/get", getHost()));
        return restOperations.exchange(builder.build().encode().toUri(), HttpMethod.POST, new HttpEntity<>(tokenRequest, httpHeaders), AccessTokenResponse.class).getBody();
    }


    /**
     * 调用FOP接口
     * <a href="http://open.4px.com/apiInfo/partner">http://open.4px.com/apiInfo/introduce</a>
     *
     * @param method        函数方法
     * @param payload       请求body
     * @param typeReference 返回值类型
     * @return 调用FOP返回接口
     */
    public <T> T postFop(String method, Object payload, TypeReference<T> typeReference) {
        try {
            CommonArgs common = new CommonArgs(new AppKeySecret(appKey, appSecret, accessToken), method);
            String bodyJson;
            if (payload instanceof String) {
                bodyJson = (String) payload;
            } else {
                bodyJson = payload == null ? "" : objectMapper.writeValueAsString(payload);
            }
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/router/api/service", getHost()));
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

    public String getHost() {
        return isFop ? getFopHost() : getCaiNiaoHost();
    }

    private String getFopHost() {
        return isSandBox() ? TEST_FOP_URL : FOP_URL;
    }

    private String getCaiNiaoHost() {
        return isSandBox() ? TEST_CAINIAO_URL : CAINIAO_URL;
    }
}
