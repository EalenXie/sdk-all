package io.github.ealenxie.wish;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.wish.dto.AccessTokenDTO;
import io.github.ealenxie.wish.dto.RefreshTokenDTO;
import io.github.ealenxie.wish.vo.MerchantIdVO;
import io.github.ealenxie.wish.vo.WishToken;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;


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
     * @param dto 请求参数信息
     */
    public WishToken accessToken(AccessTokenDTO dto) {
        return restOperations.exchange(URI.create(String.format("%s/api/v3/oauth/access_token", isSandbox() ? SANDBOX_HOST : HOST)), HttpMethod.POST, new HttpEntity<>(dto, new HttpHeaders()), WishToken.class).getBody();
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/oauthTest">Test if an access token is valid</a>
     * <p>验证令牌是否有效</p>
     *
     * @param accessToken 访问令牌
     */
    public MerchantIdVO oauthTest(String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        return restOperations.exchange(URI.create(String.format("%s/api/v3/oauth/test", isSandbox() ? SANDBOX_HOST : HOST)), HttpMethod.POST, new HttpEntity<>(null, headers), MerchantIdVO.class).getBody();
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/oauthRefreshToken">Obtain a new token when the current token expires</a>
     * <p>刷新授权</p>
     *
     * @param dto 请求参数信息
     */
    public WishToken refreshToken(String accessToken, RefreshTokenDTO dto) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v3/oauth/refresh_token", isSandbox() ? SANDBOX_HOST : HOST)).queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), WishToken.class).getBody();
    }

    @SuppressWarnings("all")
    public LinkedMultiValueMap<String, String> getQueryParams(Object dto) {
        Map<String, String> args = objectMapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        return req;
    }

}
