package io.github.ealenxie.payoneer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.payoneer.dto.TransactionsDTO;
import io.github.ealenxie.payoneer.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.lang.Nullable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.SortedMap;
import java.util.UUID;

/**
 * Created by EalenXie on 2022/3/29 11:36
 * <a href="https://developer.payoneer.com/">派安盈 跨境收款</a>
 */
public class PayoneerClient {

    private final RestOperations restOperations;

    private final ObjectMapper mapper = new ObjectMapper();
    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;
    /**
     * 沙箱环境接口地址
     */
    private static final String HOST_SANDBOX = "https://api.sandbox.payoneer.com";
    /**
     * 沙箱环境认证接口地址
     */
    private static final String HOST_AUTH_SANDBOX = "https://login.sandbox.payoneer.com";
    /**
     * 认证正式环境接口地址
     */
    private static final String HOST_AUTH = "https://login.payoneer.com";
    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://api.payoneer.com";

    public PayoneerClient() {
        this(new RestTemplate());
    }

    public PayoneerClient(RestOperations restOperations) {
        this.restOperations = restOperations;
    }


    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    private static final String GRANT_TYPE = "grant_type";

    public HttpHeaders getBearerHeader(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
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
    public PayoneerAccessToken applicationToken(String clientId, String clientSecret) {
        HttpHeaders headers = getBasicHeader(clientId, clientSecret);
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add(GRANT_TYPE, "client_credentials");
        queryParams.add("scope", "read write openid");
        return getPayoneerAccessToken(queryParams, headers);
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/165d55c0063ef-requesting-an-access-token">授权码模式 获取访问令牌</a>
     */
    public PayoneerAccessToken accessToken(String clientId, String clientSecret, String code, String redirectUri) {
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add(GRANT_TYPE, "authorization_code");
        queryParams.add("client_id", clientId);
        queryParams.add("client_secret", clientSecret);
        queryParams.add("code", code);
        queryParams.add("redirect_uri", redirectUri);
        return getPayoneerAccessToken(queryParams, new HttpHeaders());
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/d568eb67b0d74-refreshing-an-access-token">刷新访问令牌</a>
     */
    public PayoneerAccessToken refreshAccessToken(String clientId, String clientSecret, String refreshToken) {
        HttpHeaders headers = getBasicHeader(clientId, clientSecret);
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add(GRANT_TYPE, "refresh_token");
        queryParams.add("refresh_token", refreshToken);
        return getPayoneerAccessToken(queryParams, headers);
    }


    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/8b1ba91980ea6-revoking-a-refresh-token">撤销令牌</a>
     *
     * @param clientId      客户端ID
     * @param clientSecret  客户端密钥
     * @param tokenTypeHint 令牌类型 "access_token" "refresh_token"
     * @param token         令牌值
     */
    public RevokeToken revokeToken(String clientId, String clientSecret, String tokenTypeHint, String token) {
        HttpHeaders headers = getBasicHeader(clientId, clientSecret);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v2/oauth2/revoke", sandBox ? HOST_AUTH_SANDBOX : HOST_AUTH));
        URI uri = builder.build().encode().toUri();
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("token_type_hint", tokenTypeHint);
        queryParams.add("token", token);
        HttpEntity<LinkedMultiValueMap<String, String>> httpEntity = new HttpEntity<>(queryParams, headers);
        return restOperations.exchange(uri, HttpMethod.POST, httpEntity, RevokeToken.class).getBody();
    }

    @Nullable
    private PayoneerAccessToken getPayoneerAccessToken(LinkedMultiValueMap<String, String> queryParams, HttpHeaders headers) {
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v2/oauth2/token", sandBox ? HOST_AUTH_SANDBOX : HOST_AUTH));
        HttpEntity<LinkedMultiValueMap<String, String>> httpEntity = new HttpEntity<>(queryParams, headers);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<PayoneerAccessToken> exchange = restOperations.exchange(uri, HttpMethod.POST, httpEntity, PayoneerAccessToken.class);
        return exchange.getBody();
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/b3A6MzU2Nzc0MjA-get-account-balances">获取与 account_id 关联的所有接收帐户的余额(返回总余额)</a>
     *
     * @param accessToken 访问令牌
     * @param accountId   账户Id
     */
    public AccountBalance accountBalances(String accessToken, String accountId) {
        HttpHeaders headers = getBearerHeader(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v4/accounts/%s/balances", sandBox ? HOST_SANDBOX : HOST, accountId));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<PayoneerResult<AccountBalance>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<PayoneerResult<AccountBalance>>() {
        });
        return payoneerResult(exchange);
    }

    /**
     * <a href="https://developer.payoneer.com/docs/mass-payouts-and-services.html#/05ebea2fe666a-get-receiving-accounts">获取与 account_id关联的所有收款账户(每个账号的余额)</a>
     *
     * @param accessToken 访问令牌
     * @param accountId   账户Id
     */
    public ReceiveAccount receivingAccounts(String accessToken, String accountId) {
        HttpHeaders headers = getBearerHeader(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v4/accounts/%s/receiving_accounts", sandBox ? HOST_SANDBOX : HOST, accountId));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<PayoneerResult<ReceiveAccount>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<PayoneerResult<ReceiveAccount>>() {
        });
        return payoneerResult(exchange);
    }


    /**
     * <a href="https://developer.payoneer.com/docs/get-transactions-v4.html#/b3A6MzU2Nzc0MTI-get-transactions">Get Transactions</a>
     * <p>获取与 account_id 关联的所有收款帐户在一定日期范围内的交易流水。返回的事务数由 page_size 参数指定。后续调用会检索额外的交易数据页面。</p>
     *
     * @param accessToken 访问令牌
     * @param accountId   账号id
     * @param dto         请求参数
     */
    public Transaction transactions(String accessToken, String accountId, TransactionsDTO dto) {
        HttpHeaders headers = getBearerHeader(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v4/accounts/%s/transactions", sandBox ? HOST_SANDBOX : HOST, accountId));
        SortedMap<String, String> sortedMap = mapper.convertValue(dto, new TypeReference<SortedMap<String, String>>() {
        });
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.setAll(sortedMap);
        builder.queryParams(queryParams);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<PayoneerResult<Transaction>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<PayoneerResult<Transaction>>() {
        });
        return payoneerResult(exchange);
    }

    /**
     * <a href="https://developer.payoneer.com/docs/get-transactions-v4.html#/b3A6MzU2Nzc0MTI-get-transactions">Get Transactions</a>
     * <p>获取与 account_id 关联的所有收款帐户在一定日期范围内的交易流水。返回的事务数由 page_size 参数指定。后续调用会检索额外的交易数据页面。</p>
     *
     * @param accessToken 访问令牌
     * @param next        下一页
     */
    public Transaction transactions(String accessToken, String next) {
        HttpHeaders headers = getBearerHeader(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<PayoneerResult<Transaction>> exchange = restOperations.exchange(URI.create(String.format("%s%s", sandBox ? HOST_SANDBOX : HOST, next)), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<PayoneerResult<Transaction>>() {
        });
        return payoneerResult(exchange);
    }

    /**
     * 获取Payoneer接口返回消息体
     */
    public <T> T payoneerResult(ResponseEntity<PayoneerResult<T>> response) {
        PayoneerResult<T> body = response.getBody();
        if (body == null || body.getResult() == null) {
            throw new UnsupportedOperationException("call Payoneer is null");
        }
        return body.getResult();
    }


}
