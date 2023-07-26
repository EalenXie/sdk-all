package io.github.ealenxie.paypal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.paypal.authentication.PayPalAccessToken;
import io.github.ealenxie.paypal.catalogproducts.CreateProductPayload;
import io.github.ealenxie.paypal.catalogproducts.ProductDetailResponse;
import io.github.ealenxie.paypal.catalogproducts.ProductListResponse;
import io.github.ealenxie.paypal.catalogproducts.ProductResponse;
import io.github.ealenxie.paypal.disputes.*;
import io.github.ealenxie.paypal.identity.UserInfo;
import io.github.ealenxie.paypal.invoices.*;
import io.github.ealenxie.paypal.payments.CapturePayload;
import io.github.ealenxie.paypal.payments.PaymentDetails;
import io.github.ealenxie.paypal.payments.Payouts;
import io.github.ealenxie.paypal.payments.ReauthorizePayload;
import io.github.ealenxie.paypal.referencedpayouts.ReferencedPayoutsItems;
import io.github.ealenxie.paypal.subscriptions.*;
import io.github.ealenxie.paypal.tracking.*;
import io.github.ealenxie.paypal.transaction.BalancesQueryParams;
import io.github.ealenxie.paypal.transaction.BalancesResponse;
import io.github.ealenxie.paypal.transaction.TransactionDetailsResponse;
import io.github.ealenxie.paypal.transaction.TransactionsQueryParams;
import io.github.ealenxie.paypal.webhooks.*;
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
    private static final String HOST = "https://api-m.paypal.com";
    /**
     * 沙箱环境认证接口地址
     */
    private static final String HOST_SANDBOX = "https://api-m.sandbox.paypal.com";


    private static final String NOTIFICATIONS_WEBHOOKS = "/v1/notifications/webhooks/%s";
    private static final String INVOICING_INVOICES = "/v2/invoicing/invoices/%s";
    private static final String INVOICING_TEMPLATES = "/v2/invoicing/templates/%s";


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
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/v1/oauth2/token", sandBox ? HOST_SANDBOX : HOST));
        builder.queryParam("grant_type", "client_credentials");
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(null, headers), PayPalAccessToken.class).getBody();
    }

    private String getApiHost() {
        return sandBox ? HOST_SANDBOX : HOST;
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_post">Add tracking information for multiple PayPal transactions</a>
     */
    public TrackersResponse trackersBatch(String accessToken, TrackersPayload payload) {
        return post("/v1/shipping/trackers-batch", accessToken, payload, TrackersResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_post">Add tracking information for PayPal transaction</a>
     */
    public TrackersResponse trackers(String accessToken, TrackersPayload payload) {
        return post("/v1/shipping/trackers", accessToken, payload, TrackersResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_get">List tracking information</a>
     */
    public TrackersResponse trackersInfo(String accessToken, TrackersInfoQueryParams queryParams) {
        return get("/v1/shipping/trackers", accessToken, queryParams, TrackersResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_put">Update or cancel tracking information for PayPal transaction</a>
     */
    public void updateTracker(String accessToken, TrackerPayload payload) {
        exchange(String.format("/v1/shipping/trackers/%s-%s", payload.getTransactionId(), payload.getTrackingNumber()), HttpMethod.PUT, accessToken, null, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/tracking/v1/#trackers_get">Show tracking information</a>
     */
    public TrackerIdentifier trackerInfo(String accessToken, String transactionId, String trackingNumber) {
        return get(String.format("/v1/shipping/trackers/%s-%s", transactionId, trackingNumber), accessToken, null, TrackerIdentifier.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_create">Create product</a>
     */
    public ProductResponse createProduct(String accessToken, CreateProductPayload payload) {
        return post("/v1/catalogs/products", accessToken, payload, ProductResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_list">List products</a>
     */
    public ProductListResponse productList(String accessToken, PageQueryParams queryParams) {
        return get("/v1/catalogs/products", accessToken, queryParams, ProductListResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_get">Show product details</a>
     */
    public ProductDetailResponse productDetail(String accessToken, String productId) {
        return get(String.format("/v1/catalogs/products/%s", productId), accessToken, null, ProductDetailResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/catalog-products/v1/#products_patch">Update product</a>
     */
    public void updateProduct(String accessToken, String productId, List<OpValuePayload<String>> payloads) {
        exchange(String.format("/v1/catalogs/products/%s", productId), HttpMethod.PATCH, accessToken, null, payloads, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_list">List disputes</a>
     */
    public DisputesResponse listDisputes(String accessToken, DisputesQueryParams queryParams) {
        return get("/v1/customer/disputes", accessToken, queryParams, DisputesResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_get">Show dispute details</a>
     */
    public DisputeDetailsResponse disputeDetails(String accessToken, String id) {
        return get(String.format("/v1/customer/disputes/%s", id), accessToken, null, DisputeDetailsResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_patch">Partially update dispute</a>
     */
    public void partiallyUpdateDispute(String accessToken, String id, List<OpValuePayload<UpdateDisputePayload>> payloads) {
        exchange(String.format("/v1/customer/disputes/%s", id), HttpMethod.PATCH, accessToken, null, payloads, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_provide-evidence">Provide evidence</a>
     */
    public LinksResponse provideEvidence(String accessToken, String id, byte files) {
        return exchange(String.format("/v1/customer/disputes/%s/provide-evidence", id), HttpMethod.POST, null, new HttpEntity<>(files, getBearerHeaders(accessToken, MediaType.MULTIPART_FORM_DATA)), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_appeal">Appeal dispute</a>
     */
    public LinksResponse appealDispute(String accessToken, String id, byte files) {
        return exchange(String.format("/v1/customer/disputes/%s/appeal", id), HttpMethod.POST, null, new HttpEntity<>(files, getBearerHeaders(accessToken, MediaType.MULTIPART_FORM_DATA)), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_accept-claim">Accept claim</a>
     */
    public LinksResponse acceptClaim(String accessToken, String id, byte files) {
        return exchange(String.format("/v1/customer/disputes/%s/accept-claim", id), HttpMethod.POST, null, new HttpEntity<>(files, getBearerHeaders(accessToken, MediaType.MULTIPART_FORM_DATA)), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_adjudicate">Settle dispute</a>
     */
    public LinksResponse settleDispute(String accessToken, String id, String adjudicationOutcome) {
        return post(String.format("/v1/customer/disputes/%s/adjudicate", id), accessToken, new AdjudicatePayload(adjudicationOutcome), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_require-evidence">Update dispute status</a>
     */
    public LinksResponse updateDisputeStatus(String accessToken, String id, String action) {
        return post(String.format("/v1/customer/disputes/%s/require-evidence", id), accessToken, new ActionPayload(action), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_escalate">Escalate dispute to claim</a>
     */
    public LinksResponse escalateDispute(String accessToken, String id, String note) {
        return post(String.format("/v1/customer/disputes/%s/escalate", id), accessToken, new NotePayload(note), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_send-message">Send message about dispute to other party</a>
     */
    public LinksResponse disputesSendMessage(String accessToken, String id, String message) {
        return post(String.format("/v1/customer/disputes/%s/send-message", id), accessToken, new MessagePayload(message), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_make-offer">Make offer to resolve dispute</a>
     */
    public LinksResponse disputesMakeOffer(String accessToken, String id, DisputesMakeOfferPayload payload) {
        return post(String.format("/v1/customer/disputes/%s/make-offer", id), accessToken, payload, LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_accept-offer">Accept offer to resolve dispute</a>
     */
    public LinksResponse disputesAcceptOffer(String accessToken, String id, String note) {
        return post(String.format("/v1/customer/disputes/%s/accept-offer", id), accessToken, new NotePayload(note), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_deny-offer">Deny offer to resolve dispute</a>
     */
    public LinksResponse disputesDenyOffer(String accessToken, String id, String note) {
        return post(String.format("/v1/customer/disputes/%s/deny-offer", id), accessToken, new NotePayload(note), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_acknowledge-return-item">Acknowledge returned item</a>
     */
    public LinksResponse acknowledgeReturnItem(String accessToken, String id, AcknowledgementNotePayload payload) {
        return post(String.format("/v1/customer/disputes/%s/acknowledge-return-item", id), accessToken, payload, LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_provide-supporting-info">Provide supporting information for dispute</a>
     */
    public LinksResponse provideSupportingInfo(String accessToken, String id, String notes) {
        return post(String.format("/v1/customer/disputes/%s/provide-supporting-info", id), accessToken, new NotesPayload(notes), LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/identity/v1/">获取用户信息</a>
     */
    public UserInfo getUserInfo(String accessToken) {
        return get("/v1/identity/oauth2/userinfo?schema=paypalv1.1", accessToken, null, UserInfo.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_create">Create draft invoice</a>
     */
    public InvoiceResponse createDraftInvoice(String accessToken, DraftInvoiceCreatePayload payload) {
        return post("/v2/invoicing/invoices", accessToken, payload, InvoiceResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_list">List invoices</a>
     */
    public InvoicesListResponse invoicesList(String accessToken, InvoicesQueryParams queryParams) {
        return get("/v2/invoicing/invoices", accessToken, queryParams, InvoicesListResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_send">Send invoice</a>
     */
    public LinksResponse sendInvoice(String accessToken, String invoiceId, InvoiceSendPayload payload) {
        return post(String.format("/v2/invoicing/invoices/%s/send", invoiceId), accessToken, payload, LinksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_remind">Send invoice reminder</a>
     */
    public void sendInvoiceReminder(String accessToken, String invoiceId, InvoiceSendPayload payload) {
        post(String.format("/v2/invoicing/invoices/%s/remind", invoiceId), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_cancel">Cancel sent invoice</a>
     */
    public void cancelSentInvoice(String accessToken, String invoiceId, InvoiceSendPayload payload) {
        post(String.format("/v2/invoicing/invoices/%s/cancel", invoiceId), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_payments">Record payment for invoice</a>
     */
    public PaymentIdPayload invoicesPayments(String accessToken, String invoiceId, InvoicesPaymentsPayload payload) {
        return post(String.format("/v2/invoicing/invoices/%s/payments", invoiceId), accessToken, payload, PaymentIdPayload.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_payments-delete">Delete external payment</a>
     */
    public void deleteExternalPayment(String accessToken, String invoiceId, String transactionId) {
        exchange(String.format("/v2/invoicing/invoices/%s/payments/%s", invoiceId, transactionId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_refunds">Record refund for invoice</a>
     */
    public RefundIdPayload invoicesRefunds(String accessToken, String invoiceId, InvoicesRefundsPayload payload) {
        return post(String.format("/v2/invoicing/invoices/%s/refunds", invoiceId), accessToken, payload, RefundIdPayload.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_refunds-delete">Delete external refund</a>
     */
    public void deleteExternalRefund(String accessToken, String invoiceId, String transactionId) {
        exchange(String.format("/v2/invoicing/invoices/%s/refunds/%s", invoiceId, transactionId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_generate-qr-code">Generate QR code</a>
     */
    public byte[] generateQrCode(String accessToken, String invoiceId, GenerateQrCodePayload payload) {
        return post(String.format("/v2/invoicing/invoices/%s/generate-qr-code", invoiceId), accessToken, payload, byte[].class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoicing_generate-next-invoice-number">Generate invoice number</a>
     */
    public InvoiceNumberPayload generateInvoiceNumber(String accessToken) {
        return post("/v2/invoicing/generate-next-invoice-number", accessToken, null, InvoiceNumberPayload.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_get">Show invoice details</a>
     */
    public InvoiceResponse invoiceDetails(String accessToken, String invoiceId) {
        return get(String.format(INVOICING_INVOICES, invoiceId), accessToken, null, InvoiceResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_update">Fully update invoice</a>
     */
    public InvoiceResponse updateInvoice(String accessToken, String invoiceId, InvoiceUpdatePayload payload) {
        return exchange(String.format(INVOICING_INVOICES, invoiceId), HttpMethod.PUT, accessToken, null, payload, InvoiceResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_delete">Delete invoice</a>
     */
    public void deleteInvoice(String accessToken, String invoiceId) {
        exchange(String.format(INVOICING_INVOICES, invoiceId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#invoices_search-invoices">Search for invoices</a>
     */
    public SearchInvoicesResponse searchInvoices(String accessToken, PageQueryParams queryParams, SearchInvoicesPayload payload) {
        return exchange("/v2/invoicing/search-invoices", HttpMethod.POST, accessToken, queryParams, payload, SearchInvoicesResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#templates_list">List templates</a>
     */
    public TemplatesResponse listTemplates(String accessToken, PageParams pageParams) {
        return get("/v2/invoicing/templates", accessToken, pageParams, TemplatesResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#templates_create">Create template</a>
     */
    public Template createTemplate(String accessToken, CreateTemplatePayload payload) {
        return post("/v2/invoicing/templates", accessToken, payload, Template.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#templates_get">Show template details</a>
     */
    public Template templateDetails(String accessToken, String templateId) {
        return get(String.format(INVOICING_TEMPLATES, templateId), accessToken, null, Template.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#templates_update">Fully update template</a>
     */
    public Template updateTemplate(String accessToken, String templateId, TemplateUpdatePayload payload) {
        return exchange(String.format(INVOICING_TEMPLATES, templateId), HttpMethod.PUT, accessToken, null, payload, Template.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/invoicing/v2/#templates_delete">Delete template</a>
     */
    public void deleteTemplate(String accessToken, String templateId) {
        exchange(String.format(INVOICING_TEMPLATES, templateId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }


    /**
     * <a href="https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_get">Show referenced payout item details</a>
     */
    public ReferencedPayoutsItems referencedPayoutsItems(String accessToken, String payoutsItemId) {
        return get(String.format("/v1/payments/referenced-payouts-items/%s", payoutsItemId), accessToken, null, ReferencedPayoutsItems.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts_get_batch_details">List items in referenced batch payout</a>
     */
    public Payouts referencedPayouts(String accessToken, String payoutsBatchId) {
        return get(String.format("/v1/payments/referenced-payouts/%s", payoutsBatchId), accessToken, null, Payouts.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#plans_create">Create plan</a>
     */
    public PlanResponse createPlan(String accessToken, CreatePlanPayload payload) {
        return post("/v1/billing/plans", accessToken, payload, PlanResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#plans_list">List plans</a>
     */
    public PlanPayload getPlans(String accessToken, PlanQueryParams queryParams) {
        return get("/v1/billing/plans", accessToken, queryParams, PlanPayload.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#plans_get">Show plan details</a>
     */
    public PlanDetailPayload getPlanDetails(String accessToken, String id) {
        return get(String.format("/v1/billing/plans/{%s}", id), accessToken, null, PlanDetailPayload.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#plans_patch">Update plan</a>
     */
    public void updatePlan(String accessToken, String id, List<UpdatePlanPayload> payload) {
        exchange(String.format("/v1/billing/plans/{%s}", id), HttpMethod.PATCH, accessToken, null, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#plans_activate">Activate plan</a>
     */
    public void activatePlan(String accessToken, String id) {
        post(String.format("/v1/billing/plans/{%s}/activate", id), accessToken, null, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#plans_deactivate">Deactivate plan</a>
     */
    public void deactivatePlan(String accessToken, String id) {
        post(String.format("/v1/billing/plans/%s/deactivate", id), accessToken, null, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#plans_update-pricing-schemes">Update pricing</a>
     */
    public void updatePricing(String accessToken, String id, UpdatePricingPayload payload) {
        post(String.format("/v1/billing/plans/%s/update-pricing-schemes", id), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_create">Create subscription</a>
     */
    public void createSubscription(String accessToken, SubscriptionPayload payload) {
        post("/v1/billing/subscriptions", accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_get">Show subscription details</a>
     */
    public SubscriptionResponse getSubscriptions(String accessToken, String id, FiledQueryParams queryParams) {
        return get(String.format("/v1/billing/subscriptions/%s", id), accessToken, queryParams, SubscriptionResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_patch">Update subscription</a>
     */
    public void updateSubscription(String accessToken, String id, List<UpdateSubscriptionPayload> payloads) {
        exchange(String.format("/v1/billing/subscriptions/%s", id), HttpMethod.PATCH, accessToken, null, payloads, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_revise">Revise plan or quantity of subscription</a>
     */
    public void reviseSubscription(String accessToken, String id, ReviseSubscriptionPayload payload) {
        post(String.format("/v1/billing/subscriptions/%s/revise", id), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_suspend">Suspend subscription</a>
     */
    public void suspendSubscription(String accessToken, String id, ReasonPayload payload) {
        post(String.format("/v1/billing/subscriptions/%s/suspend", id), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_cancel">Cancel subscription</a>
     */
    public void cancelSubscription(String accessToken, String id, ReasonPayload payload) {
        post(String.format("/v1/billing/subscriptions/%s/cancel", id), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_activate">Activate subscription</a>
     */
    public void activateSubscription(String accessToken, String id, ReasonPayload payload) {
        post(String.format("/v1/billing/subscriptions/%s/activate", id), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_capture">Capture authorized payment on subscription</a>
     */
    public void captureSubscription(String accessToken, String id, CaptureSubscriptionPayload payload) {
        post(String.format("/v1/billing/subscriptions/%s/capture", id), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_transactions">List transactions for subscription</a>
     */
    public SubscriptionTransactionResponse getSubscriptionTransactions(String accessToken, String id, DateQueryParams queryParams) {
        return get(String.format("/v1/billing/subscriptions/%s/transactions", id), accessToken, queryParams, SubscriptionTransactionResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/transaction-search/v1/#transactions_get">List transactions</a>
     */
    public TransactionDetailsResponse transactions(String accessToken, TransactionsQueryParams queryParams) {
        return get("/v1/reporting/transactions", accessToken, queryParams, TransactionDetailsResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/transaction-search/v1/#balances_get">List all balances</a>
     */
    public BalancesResponse balances(String accessToken, BalancesQueryParams queryParams) {
        return get("/v1/reporting/balances", accessToken, queryParams, BalancesResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_get">Show details for authorized payment</a>
     */
    public PaymentDetails showAuthorizedPaymentDetails(String accessToken, String authorizationId) {
        return get(String.format("/v2/payments/authorizations/%s", authorizationId), accessToken, null, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_capture">Capture authorized payment</a>
     */
    public PaymentDetails captureAuthorizedPayment(String accessToken, String authorizationId, CapturePayload payload) {
        return post(String.format("/v2/payments/authorizations/%s/capture", authorizationId), accessToken, payload, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_reauthorize">Reauthorize authorized payment</a>
     */
    public PaymentDetails reauthorizePayment(String accessToken, String authorizationId, ReauthorizePayload payload) {
        return post(String.format("/v2/payments/authorizations/%s/reauthorize", authorizationId), accessToken, payload, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#authorizations_void">Void authorized payment</a>
     */
    public void voidAuthorizedPayment(String accessToken, String authorizationId) {
        post(String.format("/v2/payments/authorizations/%s/void", authorizationId), accessToken, null, Object.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#captures_get">Show captured payment details</a>
     */
    public PaymentDetails capturedPaymentDetails(String accessToken, String captureId) {
        return get(String.format("/v2/payments/captures/%s", captureId), accessToken, null, PaymentDetails.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/payments/v2/#captures_refund">Refund captured payment</a>
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
        return post("/v1/notifications/webhooks", accessToken, payload, WebhookResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_list">List webhooks</a>
     */
    public WebhooksResponse webhookList(String accessToken, WebhookQueryParam queryParam) {
        return get("/v1/notifications/webhooks", accessToken, queryParam, WebhooksResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_get">Show webhook details</a>
     */
    public WebhookResponse webhookDetails(String accessToken, String webhookId) {
        return get(String.format(NOTIFICATIONS_WEBHOOKS, webhookId), accessToken, null, WebhookResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_update">Update webhook</a>
     */
    public WebhookResponse updateWebhook(String accessToken, String webhookId, List<OpValuePayload<List<NamePayload>>> payloads) {
        return exchange(String.format(NOTIFICATIONS_WEBHOOKS, webhookId), HttpMethod.PATCH, accessToken, null, payloads, WebhookResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_delete">Delete webhook</a>
     */
    public Void deleteWebhook(String accessToken, String webhookId) {
        return exchange(String.format(NOTIFICATIONS_WEBHOOKS, webhookId), HttpMethod.DELETE, accessToken, null, null, Void.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#event-types_list">List event subscriptions for webhook</a>
     */
    public EventTypePayload eventTypesList(String accessToken, String webhookId) {
        return get(String.format("/v1/notifications/webhooks/%s/event-types", webhookId), accessToken, null, EventTypePayload.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-lookup_post">Create webhook lookup</a>
     */
    public WebhookLookupResponse createWebhookLookup(String accessToken) {
        return post("/v1/notifications/webhooks-lookup", accessToken, null, WebhookLookupResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#event-types_list">List event subscriptions for webhook</a>
     */
    public WebhookLookupsResponse webhookLookupList(String accessToken) {
        return get("v1/notifications/webhooks-lookup", accessToken, null, WebhookLookupsResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-lookup_get">Show webhook lookup details</a>
     */
    public WebhookLookupResponse webhookLookupDetails(String accessToken, String webhookLookupId) {
        return get(String.format("v1/notifications/webhooks-lookup/%s", webhookLookupId), accessToken, null, WebhookLookupResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-lookup_delete">Delete webhook lookup</a>
     */
    public Void deleteWebhookLookup(String accessToken, String webhookLookupId) {
        return exchange(String.format("/v1/notifications/webhooks-lookup/%s", webhookLookupId), HttpMethod.DELETE, accessToken, null, null, Void.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#verify-webhook-signature_post">Verify webhook signature</a>
     */
    public WebhookSignatureResponse verifyWebhookSignature(String accessToken, WebhookSignaturePayload payload) {
        return post("/v1/notifications/verify-webhook-signature", accessToken, payload, WebhookSignatureResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-event-types_list">List available events</a>
     */
    public EventTypePayload availableEventsList(String accessToken) {
        return get("/v1/notifications/webhooks-event-types", accessToken, null, EventTypePayload.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-events_list">List event notifications</a>
     */
    public EventResponse eventNotificationsList(String accessToken, EventNotificationsQueryParams params) {
        return get("/v1/notifications/webhooks-events", accessToken, params, EventResponse.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-events_get">Show event notification details</a>
     */
    public WebhookEvent eventNotificationsDetails(String accessToken, String eventId) {
        return get(String.format("/v1/notifications/webhooks-events/%s", eventId), accessToken, null, WebhookEvent.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-events_resend">Resend event notification</a>
     */
    public WebhookEvent resendEventNotification(String accessToken, String eventId, EventNotificationPayload payload) {
        return post(String.format("/v1/notifications/webhooks-events/%s/resend", eventId), accessToken, payload, WebhookEvent.class);
    }

    /**
     * <a href="https://developer.paypal.com/docs/api/webhooks/v1/#simulate-event_post">Simulate webhook event</a>
     */
    public WebhookEvent simulateEvent(String accessToken, SimulateEventPayload payload) {
        return post("/v1/notifications/simulate-event", accessToken, payload, WebhookEvent.class);
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

    private void builderQueryParam(UriComponentsBuilder builder, Map<String, Object> args) {
        Set<Map.Entry<String, Object>> entries = args.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            Object value = entry.getValue();
            if (value instanceof Map) {
                @SuppressWarnings("unchecked") Map<String, Object> valueMap = (Map<String, Object>) value;
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
