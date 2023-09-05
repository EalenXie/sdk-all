package io.github.ealenxie.payoneer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.payoneer.oauth.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.lang.Nullable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * @author EalenXie created on 2023/9/5 15:30
 */
public class RestClient {

    private final String clientId;
    private final String clientSecret;

    private final RestOperations restOperations;

    private final ObjectMapper mapper = new ObjectMapper();
    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;
    /**
     * 沙箱环境认证接口地址
     */
    private static final String HOST_AUTH_SANDBOX = "https://login.sandbox.payoneer.com";
    /**
     * 认证正式环境接口地址
     */
    private static final String HOST_AUTH = "https://login.payoneer.com";
    /**
     * 沙箱环境接口地址
     */
    private static final String HOST_SANDBOX = "https://api.sandbox.payoneer.com";
    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://api.payoneer.com";

    public RestClient(String clientId, String clientSecret) {
        this(clientId, clientSecret, new RestTemplate());
    }

    public RestClient(String clientId, String clientSecret, RestOperations restOperations) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.restOperations = restOperations;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    public HttpHeaders getBearerHeaders(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken);
        return headers;
    }

    public HttpHeaders getBasicHeader(String clientId, String clientSecret) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(clientId, clientSecret);
        return headers;
    }


    public String authorize(String clientId, String redirectUri) {
        String state = UUID.randomUUID().toString().substring(0, 6);
        return String.format("%s/api/v2/oauth2/authorize?client_id=%s&response_type=code&scope=read write openid personal-details&redirect_uri=%s&state=%s", isSandBox() ? HOST_AUTH_SANDBOX : HOST_AUTH, clientId, redirectUri, state);
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/ZG9jOjM1Njc3Mzcz-requesting-an-application-token">客户端模式 获取应用令牌</a>
     */
    public PayoneerAccessToken applicationToken(ApplicationTokenQueryParams queryParams) {
        return getPayoneerAccessToken(queryParams);
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/165d55c0063ef-requesting-an-access-token">授权码模式 获取访问令牌</a>
     */
    public PayoneerAccessToken accessToken(String code, String redirectUri) {
        return getPayoneerAccessToken(new AccessTokenPayload(clientId, clientSecret, code, redirectUri));
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/d568eb67b0d74-refreshing-an-access-token">刷新访问令牌</a>
     */
    public PayoneerAccessToken refreshAccessToken(String refreshToken) {
        return getPayoneerAccessToken(new RefreshTokenPayload(refreshToken));
    }


    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/8b1ba91980ea6-revoking-a-refresh-token">撤销令牌</a>
     *
     * @param tokenTypeHint 令牌类型 "access_token" "refresh_token"
     * @param token         令牌值
     */
    public RevokeToken revokeToken(String tokenTypeHint, String token) {
        HttpHeaders headers = getBasicHeader(clientId, clientSecret);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        URI uri = buildUri(getAuthHost(), "/api/v2/oauth2/revoke", null);
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("token_type_hint", tokenTypeHint);
        queryParams.add("token", token);
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(queryParams, headers), RevokeToken.class).getBody();
    }

    @Nullable
    private PayoneerAccessToken getPayoneerAccessToken(Object authRequest) {
        HttpHeaders headers = getBasicHeader(clientId, clientSecret);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        URI uri = buildUri(getAuthHost(), "/api/v2/oauth2/token", null);
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.setAll(mapper.convertValue(authRequest, new TypeReference<Map<String, String>>() {
        }));
        ResponseEntity<PayoneerAccessToken> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(queryParams, headers), PayoneerAccessToken.class);
        return exchange.getBody();
    }

    /**
     * GET 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param responseType 响应类型
     */
    protected <T> T get(String urlNotHost, String accessToken, @Nullable Object queryParams, Class<T> responseType) {
        return exchange(urlNotHost, HttpMethod.GET, accessToken, queryParams, null, responseType);
    }

    /**
     * GET 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param responseType 响应类型
     */
    protected <T> T get(String urlNotHost, String accessToken, @Nullable Object queryParams, ParameterizedTypeReference<T> responseType) {
        return exchange(urlNotHost, HttpMethod.GET, accessToken, queryParams, null, responseType);
    }

    /**
     * POST 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param payload      请求参数
     * @param responseType 响应类型
     */
    protected <T> T post(String urlNotHost, String accessToken, @Nullable Object payload, Class<T> responseType) {
        return exchange(urlNotHost, HttpMethod.POST, accessToken, null, payload, responseType);
    }

    /**
     * POST 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param payload      请求参数
     * @param responseType 响应类型
     */
    protected <T> T post(String urlNotHost, String accessToken, @Nullable Object payload, ParameterizedTypeReference<T> responseType) {
        return exchange(urlNotHost, HttpMethod.POST, accessToken, null, payload, responseType);
    }

    /**
     * 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param payload      请求body
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchange(String urlNotHost, HttpMethod httpMethod, String accessToken, @Nullable Object queryParams, @Nullable Object payload, Class<T> responseType) {
        return exchange(urlNotHost, httpMethod, queryParams, new HttpEntity<>(payload, getBearerHeaders(accessToken)), responseType);
    }

    /**
     * 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param queryParams  url请求参数
     * @param httpEntity   httpEntity
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchange(String urlNotHost, HttpMethod httpMethod, @Nullable Object queryParams, HttpEntity<?> httpEntity, Class<T> responseType) {
        return getRestOperations().exchange(buildUri(urlNotHost, queryParams), httpMethod, httpEntity, responseType).getBody();
    }

    /**
     * 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param payload      请求body
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchange(String urlNotHost, HttpMethod httpMethod, String accessToken, @Nullable Object queryParams, @Nullable Object payload, ParameterizedTypeReference<T> responseType) {
        return exchange(buildUri(urlNotHost, queryParams), httpMethod, new HttpEntity<>(payload, getBearerHeaders(accessToken)), responseType);
    }

    /**
     * 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param queryParams  url请求参数
     * @param httpEntity   httpEntity
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchange(String urlNotHost, HttpMethod httpMethod, @Nullable Object queryParams, HttpEntity<?> httpEntity, ParameterizedTypeReference<T> responseType) {
        return exchange(buildUri(urlNotHost, queryParams), httpMethod, httpEntity, responseType);
    }

    /**
     * 调用 API
     *
     * @param uri          uri
     * @param httpMethod   HttpMethod
     * @param httpEntity   httpEntity
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchange(URI uri, HttpMethod httpMethod, HttpEntity<?> httpEntity, Class<T> responseType) {
        return getRestOperations().exchange(uri, httpMethod, httpEntity, responseType).getBody();
    }

    /**
     * 调用 API
     *
     * @param uri          uri
     * @param httpMethod   HttpMethod
     * @param httpEntity   httpEntity
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchange(URI uri, HttpMethod httpMethod, HttpEntity<?> httpEntity, ParameterizedTypeReference<T> responseType) {
        return getRestOperations().exchange(uri, httpMethod, httpEntity, responseType).getBody();
    }

    /**
     * 构建请求URI
     *
     * @param urlNotHost  不带host的请求url
     * @param queryParams url请求参数
     */
    protected URI buildUri(String urlNotHost, @Nullable Object queryParams) {
        return buildUri(getApiHost(), urlNotHost, queryParams);
    }

    protected String getApiHost() {
        return isSandBox() ? HOST_SANDBOX : HOST;
    }

    protected String getAuthHost() {
        return isSandBox() ? HOST_AUTH_SANDBOX : HOST_AUTH;
    }

    /**
     * 构建请求URI
     *
     * @param urlNotHost  不带host的请求url
     * @param queryParams url请求参数
     */
    protected URI buildUri(String host, String urlNotHost, @Nullable Object queryParams) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", host, urlNotHost));
        if (queryParams != null) {
            if (queryParams instanceof Map) {
                @SuppressWarnings("unchecked") Map<String, Object> valueMap = (Map<String, Object>) queryParams;
                Set<Map.Entry<String, Object>> entrySet = valueMap.entrySet();
                for (Map.Entry<String, Object> e : entrySet) {
                    builder.queryParam(e.getKey(), e.getValue());
                }
            } else if (queryParams instanceof String) {
                builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s?%s", host, urlNotHost, queryParams));
            } else {
                builderQueryParam(builder, mapper.convertValue(queryParams, new TypeReference<Map<String, Object>>() {
                }));
            }
        }
        return builder.build().encode().toUri();
    }


    @SuppressWarnings("all")
    private void builderQueryParam(UriComponentsBuilder builder, Map<String, Object> args) {
        Set<Map.Entry<String, Object>> entries = args.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            Object value = entry.getValue();
            if (value instanceof Map) {
                Map<String, Object> valueMap = (Map<String, Object>) value;
                Set<Map.Entry<String, Object>> entrySet = valueMap.entrySet();
                for (Map.Entry<String, Object> e : entrySet) {
                    builder.queryParam(e.getKey(), e.getValue());
                }
            }
            if (value instanceof Collection) {
                builder.queryParam(entry.getKey(), (Collection<?>) value);
            } else {
                builder.queryParam(entry.getKey(), value);
            }
        }
    }

    /**
     * 获取Payoneer接口返回消息体
     */
    public <T> T getNonNullResult(ResponseEntity<ResultResponse<T>> response) {
        ResultResponse<T> body = response.getBody();
        if (body == null || body.getResult() == null) {
            throw new UnsupportedOperationException("call Payoneer is null");
        }
        return body.getResult();
    }
}
