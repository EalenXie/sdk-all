package io.github.ealenxie.allegro;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by EalenXie on 2022/3/18 12:57
 * <a href="https://developer.allegro.pl/documentation/#section/Authentication">Allegro REST API</a>
 */
public abstract class AllegroClient {

    private final RestOperations restOperations;
    private final ObjectMapper mapper;
    /**
     * Allegro 认证服务器的域名 <a href="https://api.allegro.pl">https://allegro.pl</a>
     */
    public static final String AUTH_HOST = "https://allegro.pl";
    /**
     * Allegro 认证服务器的域名(沙箱环境)
     * <a href="https://developer.allegro.pl/about/#%c5%9brodowisko-testowe">https://allegro.pl.allegrosandbox.pl </a>
     */
    public static final String AUTH_SANDBOX_HOST = "https://allegro.pl.allegrosandbox.pl";
    /**
     * Allegro 资源服务器的域名 <a href="https://api.allegro.pl">https://api.allegro.pl</a>
     */
    public static final String API_HOST = "https://api.allegro.pl";
    /**
     * Allegro 资源服务器的域名(沙箱环境) <a href="https://api.allegro.pl.allegrosandbox.pl">https://api.allegro.pl.allegrosandbox.pl</a>
     */
    public static final String API_SANDBOX_HOST = "https://api.allegro.pl.allegrosandbox.pl";

    /**
     * 是否沙箱环境
     */
    private boolean sandBox = false;

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    protected AllegroClient(ObjectMapper mapper) {
        this(new RestTemplate(), mapper);
    }

    protected AllegroClient(RestOperations restOperations, ObjectMapper mapper) {
        this.restOperations = restOperations;
        this.mapper = mapper;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    /**
     * 获取包含认证的Allegro Bearer 标准请求头
     *
     * @param accessToken 令牌
     */
    public HttpHeaders getBearerHeaders(String accessToken) {
        HttpHeaders bearTokenHeader = new HttpHeaders();
        bearTokenHeader.setBearerAuth(accessToken);
        bearTokenHeader.set("Content-Type", "application/vnd.allegro.public.v1+json");
        bearTokenHeader.set("Accept", "application/vnd.allegro.public.v1+json");
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
     * <a href="https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika">获取授权地址</a>
     *
     * @param clientId    客户端Id
     * @param redirectUri 重定向URL
     * @return 获取授权地址, 用户在此生成的地址上进行授权, 获取到code
     */
    public String authorize(String clientId, String redirectUri) {
        return String.format("%s/auth/oauth/authorize?response_type=code&client_id=%s&redirect_uri=%s", isSandBox() ? AUTH_SANDBOX_HOST : AUTH_HOST, clientId, redirectUri);
    }

    /**
     * <a href="https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika">授权码模式获取accessToken</a>
     *
     * @param clientId     客户端Id
     * @param clientSecret 客户端密钥
     * @param code         授权码
     * @param redirectUri  重定向地址
     */
    public AllegroToken accessToken(String clientId, String clientSecret, String code, String redirectUri) {
        HttpHeaders headers = getBasicHeaders(clientId, clientSecret);
        return restOperations.exchange(URI.create(String.format("%s/auth/oauth/token?grant_type=authorization_code&code=%s&redirect_uri=%s", isSandBox() ? AUTH_SANDBOX_HOST : AUTH_HOST, code, redirectUri)), HttpMethod.POST, new HttpEntity<>(null, headers), AllegroToken.class).getBody();
    }

    /**
     * <a href="https://developer.allegro.pl/auth/#przed%c5%82u%c5%bcenie-wa%c5%bcno%c5%9bci-tokena">刷新令牌</a>
     *
     * @param clientId     客户端Id
     * @param clientSecret 客户端密钥
     * @param refreshToken 刷新令牌
     * @param redirectUri  重定向地址
     */
    public AllegroToken refreshToken(String clientId, String clientSecret, String refreshToken, String redirectUri) {
        HttpHeaders headers = getBasicHeaders(clientId, clientSecret);
        return restOperations.exchange(URI.create(String.format("%s/auth/oauth/token?grant_type=refresh_token&refresh_token=%s&redirect_uri=%s", isSandBox() ? AUTH_SANDBOX_HOST : AUTH_HOST, refreshToken, redirectUri)), HttpMethod.POST, new HttpEntity<>(null, headers), AllegroToken.class).getBody();
    }


    /**
     * GET 调用 Allegro API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param responseType 响应类型
     */
    protected <T> T getAllegro(String urlNotHost, String accessToken, @Nullable Object queryParams, Class<T> responseType) {
        return exchangeAllegro(urlNotHost, HttpMethod.GET, accessToken, queryParams, null, responseType);
    }

    /**
     * GET 调用 Allegro API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param responseType 响应类型
     */
    protected <T> T getAllegro(String urlNotHost, String accessToken, @Nullable Object queryParams, ParameterizedTypeReference<T> responseType) {
        return exchangeAllegro(urlNotHost, HttpMethod.GET, accessToken, queryParams, null, responseType);
    }

    /**
     * POST 调用 Allegro API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param payload      请求参数
     * @param responseType 响应类型
     */
    protected <T> T postAllegro(String urlNotHost, String accessToken, @Nullable Object payload, Class<T> responseType) {
        return exchangeAllegro(urlNotHost, HttpMethod.POST, accessToken, null, payload, responseType);
    }

    /**
     * POST 调用 Allegro API
     *
     * @param urlNotHost   不带host的请求url
     * @param accessToken  访问令牌
     * @param payload      请求参数
     * @param responseType 响应类型
     */
    protected <T> T postAllegro(String urlNotHost, String accessToken, @Nullable Object payload, ParameterizedTypeReference<T> responseType) {
        return exchangeAllegro(urlNotHost, HttpMethod.POST, accessToken, null, payload, responseType);
    }


    /**
     * 调用 Allegro API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param payload      请求body
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchangeAllegro(String urlNotHost, HttpMethod httpMethod, String accessToken, @Nullable Object queryParams, @Nullable Object payload, Class<T> responseType) {
        return getRestOperations().exchange(buildUri(urlNotHost, queryParams), httpMethod, new HttpEntity<>(payload, getBearerHeaders(accessToken)), responseType).getBody();
    }


    /**
     * 调用 Allegro API
     *
     * @param urlNotHost   不带host的请求url
     * @param httpMethod   HttpMethod
     * @param accessToken  访问令牌
     * @param queryParams  url请求参数
     * @param payload      请求body
     * @param responseType 响应类型
     * @return 响应结果对象
     */
    protected <T> T exchangeAllegro(String urlNotHost, HttpMethod httpMethod, String accessToken, @Nullable Object queryParams, @Nullable Object payload, ParameterizedTypeReference<T> responseType) {
        return getRestOperations().exchange(buildUri(urlNotHost, queryParams), httpMethod, new HttpEntity<>(payload, getBearerHeaders(accessToken)), responseType).getBody();

    }

    /**
     * 构建请求URI
     *
     * @param urlNotHost  不带host的请求url
     * @param queryParams url请求参数
     */
    protected URI buildUri(String urlNotHost, @Nullable Object queryParams) {
        String host = isSandBox() ? API_SANDBOX_HOST : API_HOST;
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", host, urlNotHost));
        if (queryParams != null) {
            if (queryParams instanceof String) {
                builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s?%s", host, urlNotHost, queryParams));
            } else {
                builderQueryParam(builder, mapper.convertValue(queryParams, new TypeReference<Map<String, Object>>() {
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
