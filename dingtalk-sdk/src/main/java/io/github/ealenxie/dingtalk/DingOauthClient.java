package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.dingtalk.oauth.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * 钉钉授权相关客户端
 *
 * @author lanzhi
 * Created on 2023/4/27 10:00
 **/
public class DingOauthClient extends DingClient {

    public DingOauthClient(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public DingOauthClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-user-token">获取用户token</a>
     */
    public GetUserTokenResponseBody userAccessToken(GetUserTokenRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/oauth2/userAccessToken", DEFAULT_API_URL, VERSION));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<GetUserTokenResponseBody> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<GetUserTokenResponseBody>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtains-the-identity-of-an-application-administrator">获取应用管理后台免登的用户信息</a>
     */
    public GetSsoUserInfoResponseBody ssoUserInfo(String accessToken, String code) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/oauth2/ssoUserInfo?code=%s", DEFAULT_API_URL, VERSION, code));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<GetSsoUserInfoResponseBody> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(null, getDingHeader(accessToken)), new ParameterizedTypeReference<GetSsoUserInfoResponseBody>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-access_token-of-an-internal-app">获取企业内部应用的accessToken</a>
     */
    public GetAccessTokenResponseBody accessToken(GetAccessTokenRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/oauth2/accessToken", DEFAULT_API_URL, VERSION));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<GetAccessTokenResponseBody> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<GetAccessTokenResponseBody>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-access_token-of-the-authorized-enterprise">获取定制应用的accessToken</a>
     */
    public GetCorpAccessTokenResponseBody corpAccessToken(GetCorpAccessTokenRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/oauth2/corpAccessToken", DEFAULT_API_URL, VERSION));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<GetCorpAccessTokenResponseBody> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<GetCorpAccessTokenResponseBody>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/create-a-jsapi-ticket">获取jsapiTicket</a>
     */
    public CreateJsapiTicketResponseBody jsapiTickets(String accessToken) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/oauth2/jsapiTickets", DEFAULT_API_URL, VERSION));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<CreateJsapiTicketResponseBody> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(null, getDingHeader(accessToken)), new ParameterizedTypeReference<CreateJsapiTicketResponseBody>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-access_token-of-the-micro-application-background-without-log-on">获取微应用后台免登的access_token</a>
     */
    public GetSsoAccessTokenResponseBody ssoAccessToken(GetSsoAccessTokenRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/oauth2/ssoAccessToken", DEFAULT_API_URL, VERSION));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<GetSsoAccessTokenResponseBody> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<GetSsoAccessTokenResponseBody>() {
        });
        return exchange.getBody();
    }


}

