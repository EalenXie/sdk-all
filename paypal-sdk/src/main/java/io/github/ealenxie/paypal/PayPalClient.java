package io.github.ealenxie.paypal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.paypal.authentication.PayPalAccessToken;
import io.github.ealenxie.paypal.catalogproducts.CreateProductPayload;
import io.github.ealenxie.paypal.catalogproducts.ProductDetailResponse;
import io.github.ealenxie.paypal.catalogproducts.ProductListResponse;
import io.github.ealenxie.paypal.catalogproducts.ProductResponse;
import io.github.ealenxie.paypal.identity.UserInfo;
import io.github.ealenxie.paypal.payments.CapturePayload;
import io.github.ealenxie.paypal.payments.PaymentDetails;
import io.github.ealenxie.paypal.payments.Payouts;
import io.github.ealenxie.paypal.payments.ReauthorizePayload;
import io.github.ealenxie.paypal.referencedpayouts.ReferencedPayoutsItems;
import io.github.ealenxie.paypal.tracking.*;
import io.github.ealenxie.paypal.transaction.BalancesQueryParams;
import io.github.ealenxie.paypal.transaction.BalancesResponse;
import io.github.ealenxie.paypal.transaction.TransactionDetailsResponse;
import io.github.ealenxie.paypal.transaction.TransactionsQueryParams;
import io.github.ealenxie.paypal.webhooks.CreateWebhookPayload;
import io.github.ealenxie.paypal.webhooks.WebhookQueryParam;
import io.github.ealenxie.paypal.webhooks.WebhookResponse;
import io.github.ealenxie.paypal.webhooks.WebhooksResponse;
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
 * Created by EalenXie on 2022/3/29 11:36
 * <a href="https://developer.paypal.com/">PayPal Developer</a>
 */
public class PayPalClient {

    private final RestOperations restOperations;

    private final ObjectMapper mapper;
    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;
    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://api-m.paypal.com/v1";
    /**
     * 沙箱环境认证接口地址
     */
    private static final String HOST_SANDBOX = "https://api-m.sandbox.paypal.com/v1";


    public PayPalClient() {
        this(new RestTemplate(), new ObjectMapper());
    }

    public PayPalClient(RestOperations restOperations) {
        this(restOperations, new ObjectMapper());
    }

    public PayPalClient(RestOperations restOperations, ObjectMapper objectMapper) {
        this.restOperations = restOperations;
        this.mapper = objectMapper;
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
        return getBearerHeaders(accessToken, MediaType.APPLICATION_JSON);
    }

    public HttpHeaders getBearerHeaders(String accessToken, MediaType mediaType) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        headers.setContentType(mediaType);
        return headers;
    }

    /**
     * <a href="https://developer.paypal.com/api/rest/authentication/">客户端模式获取访问令牌</a>
     *
     * @param clientId     客户端ID
     * @param clientSecret 密钥
     */
    public PayPalAccessToken accessToken(String clientId, String clientSecret) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(clientId, clientSecret);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Accept-Language", "en_US");
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/oauth2/accessToken", sandBox ? HOST_SANDBOX : HOST));
        builder.queryParam("grant_type", "client_credentials");
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(null, headers), PayPalAccessToken.class).getBody();
    }

    private String getApiHost() {
        return sandBox ? HOST_SANDBOX : HOST;
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/identity/v1/">获取用户信息</a>
     */
    public UserInfo getUserInfo(String accessToken) {
        return get("/identity/oauth2/userinfo?schema=paypalv1.1", accessToken, null, UserInfo.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_post">Add tracking information for multiple PayPal transactions</a>
     */
    public TrackersResponse trackersBatch(String accessToken, TrackersPayload payload) {
        return post("/shipping/trackers-batch", accessToken, payload, TrackersResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_post">Add tracking information for PayPal transaction</a>
     */
    public TrackersResponse trackers(String accessToken, TrackersPayload payload) {
        return post("/shipping/trackers", accessToken, payload, TrackersResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_get">List tracking information</a>
     */
    public TrackersResponse trackersInfo(String accessToken, TrackersInfoQueryParams queryParams) {
        return get("/shipping/trackers", accessToken, queryParams, TrackersResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_put">Update or cancel tracking information for PayPal transaction</a>
     */
    public void updateTracker(String accessToken, TrackerPayload payload) {
        exchange(String.format("/shipping/trackers/%s-%s", payload.getTransactionId(), payload.getTrackingNumber()), HttpMethod.PUT, accessToken, null, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_get">Show tracking information</a>
     */
    public TrackerIdentifier trackerInfo(String accessToken, String transactionId, String trackingNumber) {
        return get(String.format("/shipping/trackers/%s-%s", transactionId, trackingNumber), accessToken, null, TrackerIdentifier.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_create">Create product</a>
     */
    public ProductResponse createProduct(String accessToken, CreateProductPayload payload) {
        return post("/catalogs/products", accessToken, payload, ProductResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_list">List products</a>
     */
    public ProductListResponse productList(String accessToken, PageQueryParams queryParams) {
        return get("/catalogs/products", accessToken, queryParams, ProductListResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_get">Show product details</a>
     */
    public ProductDetailResponse productDetail(String accessToken, String productId) {
        return get(String.format("/catalogs/products/%s", productId), accessToken, null, ProductDetailResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_patch">Update product</a>
     */
    public void updateProduct(String accessToken, String productId, List<OpValuePayload> payloads) {
        exchange(String.format("/catalogs/products/%s", productId), HttpMethod.PATCH, accessToken, null,payloads, Object.class);
    }


    /**
     * <a href="https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_get">显示付款项目的详细信息</a>
     *
     * @param accessToken   访问令牌
     * @param payoutsItemId 付款批次id
     */
    public ReferencedPayoutsItems referencedPayoutsItems(String accessToken, String payoutsItemId) {
        return get(String.format("/payments/referenced-payouts-items/%s", payoutsItemId), accessToken, null, ReferencedPayoutsItems.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts_get_batch_details">列出参考批次付款中的项目</a>
     */
    public Payouts referencedPayouts(String accessToken, String payoutsBatchId) {
        return get(String.format("/payments/referenced-payouts/%s", payoutsBatchId), accessToken, null, Payouts.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/transaction-search/v1/#transactions_get">列出交易</a>
     *
     * @param accessToken 访问令牌
     * @param queryParams 查询参数
     */
    public TransactionDetailsResponse transactions(String accessToken, TransactionsQueryParams queryParams) {
        return get("/reporting/transactions", accessToken, queryParams, TransactionDetailsResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/transaction-search/v1/#balances_get">列出所有余额</a>
     *
     * @param accessToken 访问令牌
     * @param queryParams 请求参数对象
     */
    public BalancesResponse balances(String accessToken, BalancesQueryParams queryParams) {
        return get("/reporting/balances", accessToken, queryParams, BalancesResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_get">显示授权付款的详细信息</a>
     */
    public PaymentDetails showAuthorizedPaymentDetails(String accessToken, String authorizationId) {
        return get(String.format("/v2/payments/authorizations/%s", authorizationId), accessToken, null, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_capture">捕获授权支付</a>
     */
    public PaymentDetails captureAuthorizedPayment(String accessToken, String authorizationId, CapturePayload payload) {
        return post(String.format("/v2/payments/authorizations/%s/capture", authorizationId), accessToken, payload, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_reauthorize">通过ID重新授权已授权的PayPal账户支付</a>
     */
    public PaymentDetails reauthorizePayment(String accessToken, String authorizationId, ReauthorizePayload payload) {
        return post(String.format("/v2/payments/authorizations/%s/reauthorize", authorizationId), accessToken, payload, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_void">通过ID取消或取消已授权的付款</a>
     * <p>您不能取消已完全捕获的授权付款。</p>
     */
    public void voidAuthorizedPayment(String accessToken, String authorizationId) {
        post(String.format("/v2/payments/authorizations/%s/void", authorizationId), accessToken, null, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#captures_get">显示捕获付款的详细信息</a>
     */
    public PaymentDetails capturedPaymentDetails(String accessToken, String captureId) {
        return get(String.format("/v2/payments/captures/%s", captureId), accessToken, null, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#captures_refund">通过ID退还捕获的付款</a>
     * <p>通过ID退还捕获的付款。要获得全额退款，请在JSON请求体中包含一个空有效负载。对于部分退款，在JSON请求体中包含一个金额对象。</p>
     */
    public PaymentDetails refundCapturedPayment(String accessToken, String captureId, CapturePayload payload) {
        return post(String.format("/v2/payments/captures/%s/refund", captureId), accessToken, payload, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#refunds_get">Show refund details</a>
     */
    public PaymentDetails showRefundDetails(String accessToken, String refundId, CapturePayload payload) {
        return post(String.format("/v2/payments/refunds/%s", refundId), accessToken, payload, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_post">Create webhook</a>
     */
    public WebhookResponse createWebhook(String accessToken, CreateWebhookPayload payload) {
        return post("notifications/webhooks", accessToken, payload, WebhookResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_list">List webhooks</a>
     */
    public WebhooksResponse webhookList(String accessToken, WebhookQueryParam queryParam) {
        return get("notifications/webhooks", accessToken, queryParam, WebhooksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_get">Show webhook details</a>
     */
    public WebhookResponse webhookDetails(String accessToken, String webhookId) {
        return get(String.format("notifications/webhooks/%s", webhookId), accessToken, null, WebhookResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_update">Update webhook</a>
     */
    public WebhookResponse updateWebhook(String accessToken, String webhookId, List<OpValuePayload> payloads) {
        return exchange(String.format("notifications/webhooks/%s", webhookId), HttpMethod.PATCH, accessToken, null, payloads, WebhookResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_delete">Delete webhook</a>
     */
    public Void deleteWebhook(String accessToken, String webhookId) {
        return exchange(String.format("notifications/webhooks/%s", webhookId), HttpMethod.DELETE, accessToken, null, null, Void.class);
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
