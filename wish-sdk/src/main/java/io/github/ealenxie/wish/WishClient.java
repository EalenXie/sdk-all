package io.github.ealenxie.wish;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.wish.dto.AccessTokenQueryParams;
import io.github.ealenxie.wish.dto.RefreshTokenQueryParams;
import io.github.ealenxie.wish.vo.MerchantIdPayload;
import io.github.ealenxie.wish.vo.WishToken;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;


/**
 * Created by EalenXie on 2022/2/23 9:51
 */
public abstract class WishClient {

    private final ObjectMapper objectMapper;

    private final RestOperations restOperations;
    /**
     * Wish Host 地址 <a href="https://merchant.wish.co">https://merchant.wish.co</a>
     */
    public static final String HOST = "https://merchant.wish.com";

    /**
     * Wish Host 地址(沙箱环境) <a href="https://sandbox.merchant.wish.com">https://sandbox.merchant.wish.com</a>
     */
    public static final String SANDBOX_HOST = "https://sandbox.merchant.wish.com";
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

    protected WishClient() {
        this(new ObjectMapper());
    }

    protected WishClient(ObjectMapper objectMapper) {
        this(objectMapper, new RestTemplate());
    }

    protected WishClient(ObjectMapper objectMapper, RestOperations restOperations) {
        this.objectMapper = objectMapper;
        this.restOperations = restOperations;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#section/Authentication">Authentication</a>
     *
     * <p>获取授权地址</p>
     *
     * @param state 应用程序生成的状态值。
     */
    public String authorize(String clientId, String state) {
        return String.format("%s/v3/oauth/authorize?client_id=%s&state=%s", isSandbox() ? SANDBOX_HOST : HOST, clientId, state);
    }

    /**
     * 获取包含认证的 Bearer 标准请求头
     *
     * @param accessToken 令牌
     */
    public HttpHeaders getBearerHeaders(String accessToken) {
        HttpHeaders bearTokenHeader = new HttpHeaders();
        bearTokenHeader.setBearerAuth(accessToken);
        return bearTokenHeader;
    }

    /**
     * 获取包含认证的 Basic 标准请求头
     *
     * @param clientId     客户端Id
     * @param clientSecret 客户端密钥
     */
    public HttpHeaders getBasicHeaders(String clientId, String clientSecret) {
        HttpHeaders basicHeader = new HttpHeaders();
        basicHeader.setBasicAuth(clientId, clientSecret);
        return basicHeader;
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/oauthAccessToken">Retrieve an access token</a>
     * <p>授权码模式获取accessToken</p>
     *
     * @param queryParams 请求参数信息
     */
    public WishToken accessToken(AccessTokenQueryParams queryParams) {
        return restOperations.exchange(URI.create(String.format("%s/api/v3/oauth/access_token", isSandbox() ? SANDBOX_HOST : HOST)), HttpMethod.POST, new HttpEntity<>(queryParams, new HttpHeaders()), WishToken.class).getBody();
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/oauthTest">Test if an access token is valid</a>
     * <p>验证令牌是否有效</p>
     *
     * @param accessToken 访问令牌
     */
    public MerchantIdPayload oauthTest(String accessToken) {
        return postWish("/api/v3/oauth/test", accessToken, null, MerchantIdPayload.class);
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/oauthRefreshToken">Obtain a new token when the current token expires</a>
     * <p>刷新授权</p>
     *
     * @param dto 请求参数信息
     */
    public WishToken refreshToken(String accessToken, RefreshTokenQueryParams dto) {
        return getWish("/api/v3/oauth/refresh_token", accessToken, dto, WishToken.class);
    }


    /**
     * GET 调用 WISH API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param responseType 响应类型
     */
    protected <T> T getWish(String urlNotHost, String accessToken, @Nullable Object queryParams, Class<T> responseType) {
        return exchangeWish(urlNotHost, HttpMethod.GET, accessToken, queryParams, null, responseType);
    }

    /**
     * GET 调用 WISH API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param responseType 响应类型
     */
    protected <T> T getWish(String urlNotHost, String accessToken, @Nullable Object queryParams, ParameterizedTypeReference<T> responseType) {
        return exchangeWish(urlNotHost, HttpMethod.GET, accessToken, queryParams, null, responseType);
    }

    /**
     * POST 调用 WISH API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param payload      请求参数
     * @param responseType 响应类型
     */
    protected <T> T postWish(String urlNotHost, String accessToken, @Nullable Object payload, Class<T> responseType) {
        return exchangeWish(urlNotHost, HttpMethod.POST, accessToken, null, payload, responseType);
    }

    /**
     * POST 调用 WISH API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param payload      请求参数
     * @param responseType 响应类型
     */
    protected <T> T postWish(String urlNotHost, String accessToken, @Nullable Object payload, ParameterizedTypeReference<T> responseType) {
        return exchangeWish(urlNotHost, HttpMethod.POST, accessToken, null, payload, responseType);
    }


    /**
     * 调用 WISH API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param payload      请求body
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchangeWish(String urlNotHost, HttpMethod httpMethod, String accessToken, @Nullable Object queryParams, @Nullable Object payload, Class<T> responseType) {
        return getRestOperations().exchange(buildUri(urlNotHost, queryParams), httpMethod, new HttpEntity<>(payload, getBearerHeaders(accessToken)), responseType).getBody();
    }


    /**
     * 调用 WISH API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param payload      请求body
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchangeWish(String urlNotHost, HttpMethod httpMethod, String accessToken, @Nullable Object queryParams, @Nullable Object payload, ParameterizedTypeReference<T> responseType) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return getRestOperations().exchange(buildUri(urlNotHost, queryParams), httpMethod, new HttpEntity<>(payload, headers), responseType).getBody();
    }

    /**
     * 构建请求URI
     *
     * @param urlNotHost  不带host的请求url
     * @param queryParams url请求参数
     */
    protected URI buildUri(String urlNotHost, @Nullable Object queryParams) {
        String host = isSandbox() ? SANDBOX_HOST : HOST;
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", host, urlNotHost));
        if (queryParams != null) {
            if (queryParams instanceof String) {
                builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s?%s", host, urlNotHost, queryParams));
            } else {
                builderQueryParam(builder, objectMapper.convertValue(queryParams, new TypeReference<Map<String, Object>>() {
                }));
            }
        }
        return builder.build().encode().toUri();
    }

    private void builderQueryParam(UriComponentsBuilder builder, Map<String, Object> args) {
        Set<Map.Entry<String, Object>> entries = args.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            Object value = entry.getValue();
            if (value instanceof Collection) {
                builder.queryParam(entry.getKey(), (Collection<?>) value);
            } else {
                builder.queryParam(entry.getKey(), value);
            }
        }
    }

}
