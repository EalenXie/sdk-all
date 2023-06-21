package io.github.ealenxie.paypal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.paypal.dto.BalancesDTO;
import io.github.ealenxie.paypal.dto.CaptureDTO;
import io.github.ealenxie.paypal.dto.ReauthorizeDTO;
import io.github.ealenxie.paypal.dto.TransactionsDTO;
import io.github.ealenxie.paypal.products.CreateProductPayload;
import io.github.ealenxie.paypal.products.ProductResponse;
import io.github.ealenxie.paypal.tracking.*;
import io.github.ealenxie.paypal.vo.*;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.SortedMap;

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

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }


    public HttpHeaders getBearerAuth(String accessToken) {
        return getBearerAuth(accessToken, MediaType.APPLICATION_JSON);
    }

    public HttpHeaders getBearerAuth(String accessToken, MediaType mediaType) {
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

    /**
     * <a href="https://developer.paypal.com/docs/api/identity/v1/">获取用户信息</a>
     */
    public UserInfo getUserInfo(String accessToken) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/identity/oauth2/userinfo?schema=paypalv1.1", sandBox ? HOST_SANDBOX : HOST));
        return restOperations.exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), UserInfo.class).getBody();
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_post">Add tracking information for multiple PayPal transactions</a>
     */
    public TrackersResponse trackersBatch(String accessToken, TrackersPayload trackers) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shipping/trackers-batch", sandBox ? HOST_SANDBOX : HOST));
        return restOperations.exchange(builder.build().toUri(), HttpMethod.POST, new HttpEntity<>(trackers, getBearerAuth(accessToken)), TrackersResponse.class).getBody();
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_post">Add tracking information for PayPal transaction</a>
     */
    public TrackersResponse trackers(String accessToken, TrackersPayload trackers) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shipping/trackers", sandBox ? HOST_SANDBOX : HOST));
        return restOperations.exchange(builder.build().toUri(), HttpMethod.POST, new HttpEntity<>(trackers, getBearerAuth(accessToken)), TrackersResponse.class).getBody();
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_get">List tracking information</a>
     */
    public TrackersResponse trackersInfo(String accessToken, TrackersInfoDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shipping/trackers", sandBox ? HOST_SANDBOX : HOST));
        setQueryParams(builder, dto);
        return restOperations.exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), TrackersResponse.class).getBody();
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_put">Update or cancel tracking information for PayPal transaction</a>
     */
    public void updateTracker(String accessToken, Tracker dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shipping/trackers/%s-%s", sandBox ? HOST_SANDBOX : HOST, dto.getTransactionId(), dto.getTrackingNumber()));
        restOperations.exchange(builder.build().toUri(), HttpMethod.PUT, new HttpEntity<>(dto, getBearerAuth(accessToken)), Void.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_get">Show tracking information</a>
     */
    public TrackerIdentifier trackerInfo(String accessToken, String transactionId, String trackingNumber) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/shipping/trackers/%s-%s", sandBox ? HOST_SANDBOX : HOST, transactionId, trackingNumber));
        return restOperations.exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), TrackerIdentifier.class).getBody();
    }


    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_create">Create product</a>
     */
    public ProductResponse createProduct(String accessToken, CreateProductPayload payload) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/catalogs/products", sandBox ? HOST_SANDBOX : HOST));
        return restOperations.exchange(builder.build().toUri(), HttpMethod.POST, new HttpEntity<>(payload, getBearerAuth(accessToken)), ProductResponse.class).getBody();
    }


    /**
     * <a href="https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_get">显示付款项目的详细信息</a>
     *
     * @param accessToken   访问令牌
     * @param payoutsItemId 付款批次id
     */
    public ReferencedPayoutsItems referencedPayoutsItems(String accessToken, String payoutsItemId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/payments/referenced-payouts-items/%s", sandBox ? HOST_SANDBOX : HOST, payoutsItemId));
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), ReferencedPayoutsItems.class).getBody();
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/transaction-search/v1/#transactions_get">列出交易</a>
     *
     * @param accessToken 访问令牌
     * @param dto         请求参数封装的对象TransactionsDTO
     */
    public TransactionDetailsVO transactions(String accessToken, TransactionsDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/reporting/transactions", sandBox ? HOST_SANDBOX : HOST));
        setQueryParams(builder, dto);
        return restOperations.exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), TransactionDetailsVO.class).getBody();
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/transaction-search/v1/#balances_get">列出所有余额</a>
     *
     * @param accessToken 访问令牌
     * @param dto         请求参数对象
     */
    public BalancesVO balances(String accessToken, BalancesDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/reporting/balances", sandBox ? HOST_SANDBOX : HOST));
        setQueryParams(builder, dto);
        return restOperations.exchange(builder.build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), BalancesVO.class).getBody();
    }

    /**
     * 设置url请求参数
     */
    public void setQueryParams(UriComponentsBuilder builder, Object dto) {
        SortedMap<String, String> sortedMap = mapper.convertValue(dto, new TypeReference<SortedMap<String, String>>() {
        });
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        if (!sortedMap.isEmpty()) {
            queryParams.setAll(sortedMap);
            builder.queryParams(queryParams);
        }
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts_get_batch_details">列出参考批次付款中的项目</a>
     */
    public ResponseEntity<Payouts> referencedPayouts(String accessToken, String payoutsBatchId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/payments/referenced-payouts/%s", sandBox ? HOST_SANDBOX : HOST, payoutsBatchId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), Payouts.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_get">显示授权付款的详细信息</a>
     */
    public ResponseEntity<PaymentDetails> showAuthorizedPaymentDetails(String accessToken, String authorizationId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/payments/authorizations/%s", sandBox ? HOST_SANDBOX : HOST, authorizationId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_capture">捕获授权支付</a>
     */
    public ResponseEntity<PaymentDetails> captureAuthorizedPayment(String accessToken, String authorizationId, CaptureDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/payments/authorizations/%s/capture", sandBox ? HOST_SANDBOX : HOST, authorizationId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.POST, new HttpEntity<>(dto, getBearerAuth(accessToken)), PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_reauthorize">通过ID重新授权已授权的PayPal账户支付</a>
     */
    public ResponseEntity<PaymentDetails> reauthorizePayment(String accessToken, String authorizationId, ReauthorizeDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/payments/authorizations/%s/reauthorize", sandBox ? HOST_SANDBOX : HOST, authorizationId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.POST, new HttpEntity<>(dto, getBearerAuth(accessToken)), PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_void">通过ID取消或取消已授权的付款</a>
     * <p>您不能取消已完全捕获的授权付款。</p>
     */
    public ResponseEntity<Void> voidAuthorizedPayment(String accessToken, String authorizationId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/payments/authorizations/%s/void", sandBox ? HOST_SANDBOX : HOST, authorizationId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.POST, new HttpEntity<>(null, getBearerAuth(accessToken)), Void.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#captures_get">显示捕获付款的详细信息</a>
     */
    public ResponseEntity<PaymentDetails> capturedPaymentDetails(String accessToken, String captureId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/payments/captures/%s", sandBox ? HOST_SANDBOX : HOST, captureId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.GET, new HttpEntity<>(null, getBearerAuth(accessToken)), PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#captures_refund">通过ID退还捕获的付款</a>
     * <p>通过ID退还捕获的付款。要获得全额退款，请在JSON请求体中包含一个空有效负载。对于部分退款，在JSON请求体中包含一个金额对象。</p>
     */
    public ResponseEntity<PaymentDetails> refundCapturedPayment(String accessToken, String captureId, CaptureDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/payments/captures/%s/refund", sandBox ? HOST_SANDBOX : HOST, captureId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.POST, new HttpEntity<>(dto, getBearerAuth(accessToken)), PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#refunds_get">Show refund details</a>
     */
    public ResponseEntity<PaymentDetails> showRefundDetails(String accessToken, String refundId, CaptureDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v2/payments/refunds/%s", sandBox ? HOST_SANDBOX : HOST, refundId));
        return restOperations.exchange(builder.encode().build().toUri(), HttpMethod.GET, new HttpEntity<>(dto, getBearerAuth(accessToken)), PaymentDetails.class);
    }

}
