package io.github.ealenxie.tianyancha;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.tianyancha.vo.ResponseJsonNode;
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
 * @author EalenXie created on 2023/7/31 9:51
 */
public abstract class RestClient {
    private final RestOperations restOperations;
    private final ObjectMapper objectMapper;
    private static final String HOST = "http://open.api.tianyancha.com";
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    protected RestClient(String token) {
        this(new RestTemplate(), new ObjectMapper(), token);
    }

    protected RestClient(RestOperations restOperations, String token) {
        this.restOperations = restOperations;
        this.objectMapper = new ObjectMapper();
        this.token = token;
    }


    protected RestClient(RestOperations restOperations, ObjectMapper objectMapper, String token) {
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
        this.token = token;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    private HttpHeaders getHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", getToken());
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    /**
     * GET 调用 API
     *
     * @param urlNotHost   不带host的请求url
     * @param queryParams  url请求参数
     * @param responseType 响应类型
     */
    protected <T> T get(String urlNotHost, @Nullable Object queryParams, ParameterizedTypeReference<T> responseType) {
        return getRestOperations().exchange(buildUri(urlNotHost, queryParams), HttpMethod.GET, new HttpEntity<>(null, getHeader()), responseType).getBody();
    }


    protected <T> T getByKeyword(String urlNotHost, String keyword, ParameterizedTypeReference<T> responseType) {
        return get(urlNotHost, String.format("keyword=%s", keyword), responseType);
    }


    /**
     * 获取 Result
     * <p>当 entityType 为null 则未成功查询到结果信息
     * <p>当 entityType = 2, 可调用  getResult(response, Result2.class)进行序列化</p>
     * <p>当 entityType = 3, 可调用  getResult(response, Result3.class)进行序列化</p>
     * <p>当 entityType = 4, 可调用  getResult(response, Result4.class)进行序列化</p>
     * <p>当 entityType = 5, 可调用  getResult(response, Result5.class)进行序列化</p>
     * <p>当 entityType = 6, 可调用  getResult(response, Result6.class)进行序列化</p>
     * <p>当 entityType = 9, 可调用  getResult(response, Result9.class)进行序列化</p>
     *
     * @param response        结果响应
     * @param entityTypeClass 由 {@link ResponseJsonNode#getEntityType()}返回值 决定
     * @return 返回值决定实体转换类型
     */

    public <T> T getResult(ResponseJsonNode response, Class<T> entityTypeClass) {
        return objectMapper.convertValue(response.getResult(), entityTypeClass);
    }


    /**
     * 构建请求URI
     *
     * @param urlNotHost  不带host的请求url
     * @param queryParams url请求参数
     */
    protected URI buildUri(String urlNotHost, @Nullable Object queryParams) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", HOST, urlNotHost));
        if (queryParams != null) {
            if (queryParams instanceof String) {
                builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s?%s", HOST, urlNotHost, queryParams));
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
