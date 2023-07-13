package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.*;

/**
 * Created by EalenXie on 2022/3/16 14:02
 */
public class WalmartClient {

    private final ObjectMapper mapper;
    private final RestOperations restOperations;
    /**
     * Walmart Marketplace API Host地址
     */
    public static final String HOST = "https://marketplace.walmartapis.com";
    /**
     * Walmart Marketplace API 沙箱环境 Host地址
     */
    public static final String SANDBOX_HOST = "https://sandbox.walmartapis.com";
    /**
     * 沙箱模式
     */
    private boolean sandBox = false;
    private final String clientId;
    private final String clientSecret;

    public WalmartClient(String clientId, String clientSecret) {
        this(clientId, clientSecret, new ObjectMapper(), new RestTemplate());
    }

    public WalmartClient(String clientId, String clientSecret, ObjectMapper mapper) {
        this(clientId, clientSecret, mapper, new RestTemplate());
    }

    public WalmartClient(String clientId, String clientSecret, ObjectMapper mapper, RestOperations restOperations) {
        this.mapper = mapper;
        this.restOperations = restOperations;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBoxMode) {
        this.sandBox = sandBoxMode;
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/auth#operation/tokenAPI">获取accessToken</a>
     *
     * @return 访问令牌
     */
    public WalmartToken accessToken() {
        HttpHeaders headers = getBasicHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        return getRestOperations().exchange(URI.create(String.format("%s/v3/token?grant_type=client_credentials", isSandBox() ? SANDBOX_HOST : HOST)), HttpMethod.POST, new HttpEntity<>(null, headers), WalmartToken.class).getBody();
    }

    /**
     * 获取公共的请求头
     */
    @SuppressWarnings("all")
    public HttpHeaders getBasicHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(clientId, clientSecret);
        headers.set("WM_SVC.NAME", "Walmart Marketplace");
        headers.set("WM_QOS.CORRELATION_ID", UUID.randomUUID().toString());
        return headers;
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
        return isSandBox() ? SANDBOX_HOST : HOST;
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
                @SuppressWarnings("unchecked")
                Map<String, Object> valueMap = (Map<String, Object>) queryParams;
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

    /**
     * 获取公共的请求头
     */
    @SuppressWarnings("all")
    public HttpHeaders getBearerHeaders(String accessToken) {
        HttpHeaders headers = getBasicHeaders();
        headers.set("WM_SEC.ACCESS_TOKEN", accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return headers;
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
}
