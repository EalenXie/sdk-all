package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.walmart.marketplace.feeds.*;
import io.github.ealenxie.walmart.marketplace.fulfillment.*;
import io.github.ealenxie.walmart.marketplace.insights.*;
import io.github.ealenxie.walmart.marketplace.items.SkuPayload;
import io.github.ealenxie.walmart.marketplace.items.*;
import io.github.ealenxie.walmart.marketplace.notifications.*;
import io.github.ealenxie.walmart.marketplace.onerequestreport.*;
import io.github.ealenxie.walmart.marketplace.orders.*;
import io.github.ealenxie.walmart.marketplace.prices.*;
import io.github.ealenxie.walmart.marketplace.promotion.PromoQueryParams;
import io.github.ealenxie.walmart.marketplace.promotion.PromotionalPayload;
import io.github.ealenxie.walmart.marketplace.promotion.PromotionalPricePayload;
import io.github.ealenxie.walmart.marketplace.promotion.UpdatePromotionalResponse;
import io.github.ealenxie.walmart.marketplace.recommendations.*;
import io.github.ealenxie.walmart.marketplace.reports.AvailableApReportDatesResponse;
import io.github.ealenxie.walmart.marketplace.reports.PartnerStatementResponse;
import io.github.ealenxie.walmart.marketplace.reports.ReportQueryParams;
import io.github.ealenxie.walmart.marketplace.reports.ReportVersionQueryParams;
import io.github.ealenxie.walmart.marketplace.reviews.*;
import io.github.ealenxie.walmart.marketplace.rules.*;
import io.github.ealenxie.walmart.marketplace.shipping.*;
import io.github.ealenxie.walmart.marketplace.utilities.ApiStatusesResponse;
import io.github.ealenxie.walmart.marketplace.utilities.CategoriesResponse;
import io.github.ealenxie.walmart.marketplace.utilities.DepartmentPayload;
import io.github.ealenxie.walmart.marketplace.utilities.TaxonomyQueryParams;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestOperations;

import java.util.Collections;
import java.util.List;

/**
 * Created by EalenXie on 2022/3/16 14:02
 * <a href="https://developer.walmart.com/api/us/mp/orders">walmart 商户平台</a>
 */
public class WalmartOrderClient extends WalmartClient {


    public WalmartOrderClient(String clientId, String clientSecret) {
        super(clientId, clientSecret);
    }

    public WalmartOrderClient(String clientId, String clientSecret, RestOperations restOperations) {
        super(clientId, clientSecret, new ObjectMapper(), restOperations);
    }

    public WalmartOrderClient(String clientId, String clientSecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(clientId, clientSecret, objectMapper, restOperations);
    }

    public WalmartOrderClient(String clientId, String clientSecret, ObjectMapper objectMapper) {
        super(clientId, clientSecret, objectMapper);
    }


    private static final String FEEDS_URL = "/v3/feeds";
    private static final String RULES_EXCEPTIONS_URL = "/v3/rules/exceptions";


    /**
     * <a href="https://developer.walmart.com/api/us/mp/feeds">All feed statuses</a>
     */
    public FeedResponse getFeeds(String accessToken, FeedQueryParams queryParams) {
        return get(FEEDS_URL, accessToken, queryParams, FeedResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/feeds#operation/getFeedItemStatus">Feed item status</a>
     */
    public FeedItemPayload getFeedItemStatus(String accessToken, String feedId, FeedItemQueryParams queryParams) {
        return get(String.format("/v3/feeds/%s", feedId), accessToken, queryParams, FeedItemPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/feeds#operation/getFeedErrorReport">Get Feed Error Report</a>
     */
    public void getFeedErrorReport(String accessToken, String feedId, String feedType) {
        get(String.format("/v3/feeds/%s/errorReport", feedId), accessToken, new FeedTypePayload(feedType), Object.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getCatalogSearch">Catalog Search</a>
     */
    public CatalogResponse getCatalogSearch(String accessToken, CatalogQueryParams queryParams, CatalogPayload payload) {
        return exchange("/v3/items/catalog/search", HttpMethod.POST, accessToken, queryParams, payload, CatalogResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getItemAssociations">Get Item Associations</a>
     */
    public ItemsPayload<ItemAssociation> getItemAssociations(String accessToken, ItemsPayload<SkuPayload> payload) {
        return post("/v3/items/associations", accessToken, payload, new ParameterizedTypeReference<ItemsPayload<ItemAssociation>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/itemBulkUploads">Bulk Item Setup</a>
     */
    public ItemBulkResponse itemBulkUploads(String accessToken, String feedType, byte[] file) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        return exchange("/v3/items/associations", HttpMethod.POST, accessToken, new FeedTypePayload(feedType), new HttpEntity<>(file, headers), ItemBulkResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getAllItems">All items</a>
     */
    public ItemPayload getAllItems(String accessToken, ItemQueryParams queryParams) {
        return get("/v3/items", accessToken, queryParams, ItemPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getAnItem">An item</a>
     */
    public ItemPayload getItem(String accessToken, String id, String productIdType) {
        return get(String.format("/v3/items/%s", id), accessToken, new ProductIdTypeQueryParams(productIdType), ItemPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getSearchResult">Item Search</a>
     */
    public ItemsPayload<ItemSearch> getSearchResult(String accessToken, ItemSearchQueryParams queryParams) {
        return get("/v3/items/walmart/search", accessToken, queryParams, new ParameterizedTypeReference<ItemsPayload<ItemSearch>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getTaxonomyResponse">Taxonomy</a>
     */
    public StatusPayloadResponse<List<TaxonomyPayload>> getTaxonomy(String accessToken, ProductIdTypeQueryParams queryParams) {
        return get("/v3/items/taxonomy", accessToken, queryParams, new ParameterizedTypeReference<StatusPayloadResponse<List<TaxonomyPayload>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getVariantCount">Get item count by groups</a>
     */
    public StatusPayloadResponse<List<VariantPayload>> getVariantCount(String accessToken, VariantQueryParams queryParams) {
        return get("/v3/items/groups/count", accessToken, queryParams, new ParameterizedTypeReference<StatusPayloadResponse<List<VariantPayload>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/getCountByStatus">Get items count by status</a>
     */
    public String getCountByStatus(String accessToken, StatusQueryParams queryParams) {
        return get("/v3/items/count", accessToken, queryParams, String.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/items#operation/retireAnItem">Retire an item</a>
     */
    public RetireItemResponse retireItem(String accessToken, String sku) {
        return exchange(String.format("/v3/items/%s", sku), HttpMethod.DELETE, accessToken, null, null, RetireItemResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/updateStrategy">Update Repricer Strategy</a>
     */
    public StrategyResponse updateStrategy(String accessToken, String strategyCollectionId, StrategyPayload payload) {
        return exchange(String.format("/v3/repricer/strategy/%s", strategyCollectionId), HttpMethod.PUT, accessToken, null, payload, StrategyResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/deleteStrategy">Delete Repricer Strategy</a>
     */
    public void deleteStrategy(String accessToken, String strategyCollectionId) {
        exchange(String.format("/v3/repricer/strategy/%s", strategyCollectionId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/getRepricerIncentive">List of Incentive Items</a>
     */
    public IncentiveResponse getIncentive(String accessToken, IncentiveQueryParams queryParams) {
        return get("/v3/repricer/incentive", accessToken, queryParams, IncentiveResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/updateRepricerIncentive">Assign Incentive items to Repricer</a>
     */
    public UpdateInventiveResponse updateIncentive(String accessToken, UpdateIncentivePayload payload) {
        return exchange("/v3/repricer/incentive", HttpMethod.PUT, accessToken, null, payload, UpdateInventiveResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/updatePrice">Update a price</a>
     */
    public PriceResponse updatePrice(String accessToken, UpdatePricePayload payload) {
        return exchange("/v3/price", HttpMethod.PUT, accessToken, null, payload, PriceResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/getRepricerFeed">Assign/Unassign items to/from Repricer Strategy</a>
     */
    public FeedIdPayload repricerFeed(String accessToken, FeedPayload payload) {
        return post("/v3/repricerFeeds", accessToken, payload, FeedIdPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/createStrategy">Create Repricer Strategy</a>
     */
    public StrategyResponse createStrategy(String accessToken, StrategyPayload payload) {
        return post("/v3/repricer/strategy", accessToken, payload, StrategyResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/priceBulkUploads">Update bulk prices (Multiple)</a>
     */
    public ItemBulkResponse priceBulkUploads(String accessToken, String feedType, byte[] file) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        return exchange(FEEDS_URL, HttpMethod.POST, accessToken, new FeedTypePayload(feedType), new HttpEntity<>(file, headers), ItemBulkResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/optCapProgramInPrice">Set up CAP SKU All</a>
     */
    public OptCapProgramPayload optCapProgramInPrice(String accessToken, StrategyPayload payload) {
        return post("/v3/cppreference", accessToken, payload, OptCapProgramPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/price#operation/getStrategies">List of Repricer Strategies</a>
     */
    public StrategiesResponse getStrategies(String accessToken) {
        return get("/v3/cppreference", accessToken, null, StrategiesResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/promotion">Update a promotional price</a>
     */
    public UpdatePromotionalResponse updatePromotionalPrice(String accessToken, Boolean promo, PromotionalPayload payload) {
        return exchange("/v3/price", HttpMethod.PUT, accessToken, new PromoQueryParams(promo), payload, UpdatePromotionalResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/promotion#operation/updateBulkPromotionalPrice">Updates bulk promotional prices</a>
     */
    public FeedIdPayload updateBulkPromotionalPrice(String accessToken, String feedType, byte[] file) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        return exchange(FEEDS_URL, HttpMethod.POST, accessToken, new FeedTypePayload(feedType), new HttpEntity<>(file, headers), FeedIdPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/promotion#operation/getPromotionalPrices">Promotional prices</a>
     */
    public StatusPayloadResponse<PromotionalPricePayload> getPromotionalPrices(String accessToken, String sku) {
        return get(String.format("/v3/promo/sku/%s", sku), accessToken, null, new ParameterizedTypeReference<StatusPayloadResponse<PromotionalPricePayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates">Ship Order Lines</a>
     */
    public OrderResponse shipOrderLines(String accessToken, String purchaseOrderId, OrderShipmentPayload payload) {
        return post(String.format("/v3/orders/%s/shipping", purchaseOrderId), accessToken, payload, OrderResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines">Refund Order Lines</a>
     */
    public RefundResponse refundOrderLines(String accessToken, String purchaseOrderId, OrderRefundPayload payload) {
        return post(String.format("/v3/orders/%s/refund", purchaseOrderId), accessToken, payload, RefundResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines">Cancel Order Lines</a>
     */
    public OrderResponse cancelOrderLines(String accessToken, String purchaseOrderId, CancelPayload payload) {
        return post(String.format("/v3/orders/%s/cancel", purchaseOrderId), accessToken, payload, OrderResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders">Acknowledge Orders</a>
     */
    public AcknowledgeOrdersResponse acknowledgeOrders(String accessToken, String purchaseOrderId) {
        return post(String.format("/v3/orders/%s/acknowledge", purchaseOrderId), accessToken, null, AcknowledgeOrdersResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     */
    public ListElementResponse<OrdersResponse> getAllOrders(String accessToken, OrdersQueryParams queryParams) {
        return get("/v3/orders", accessToken, queryParams, new ParameterizedTypeReference<ListElementResponse<OrdersResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     */
    public ListElementResponse<OrdersResponse> getAllOrders(String accessToken, String nextCursor) {
        return get(String.format("/v3/orders%s", nextCursor), accessToken, null, new ParameterizedTypeReference<ListElementResponse<OrdersResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder">An order</a>
     */
    public Order getAnOrder(String accessToken, String purchaseOrderId) {
        return get(String.format("/v3/orders/%s", purchaseOrderId), accessToken, null, Order.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders">All released orders</a>
     */
    public ListElementResponse<OrdersResponse> getAllReleasedOrders(String accessToken) {
        return get("/v3/orders/released", accessToken, null, new ParameterizedTypeReference<ListElementResponse<OrdersResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/rules#operation/inactivateRule">Inactivate rule</a>
     */
    public MessageStatusResponse inactivateRule(String accessToken, InactivateRulePayload payload) {
        return post("/v3/rules/inactivate", accessToken, payload, MessageStatusResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/rules#operation/getAllExceptions">Gets all exceptions</a>
     */
    public RuleExceptionsResponse getAllExceptions(String accessToken) {
        return get(RULES_EXCEPTIONS_URL, accessToken, null, RuleExceptionsResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/rules#operation/deleteExceptions">Delete exceptions</a>
     */
    public FeedIdStatusPayload deleteExceptions(String accessToken, ExceptionsPayload payload) {
        return exchange(RULES_EXCEPTIONS_URL, HttpMethod.PUT, accessToken, null, payload, FeedIdStatusPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/rules#operation/createOverrideExceptions">Create override exceptions</a>
     */
    public FeedIdStatusPayload createExceptions(String accessToken, ExceptionsPayload payload) {
        return post(RULES_EXCEPTIONS_URL, accessToken, payload, FeedIdStatusPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/rules#operation/changeAssortmentType">Change assortment type</a>
     */
    public StatusPayloadResponse<IdPayload> changeAssortmentType(String accessToken) {
        return exchange("/v3/rules/assortment", HttpMethod.PUT, accessToken, null, null, new ParameterizedTypeReference<StatusPayloadResponse<IdPayload>>() {
        });
    }




    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports">Recon report</a>
     */
    public byte[] reconReport(String accessToken, ReportQueryParams queryParams) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_OCTET_STREAM));
        return exchange("/v3/report/reconreport/reconFile", HttpMethod.GET, queryParams, new HttpEntity<>(null, headers), byte[].class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports">Available recon report dates</a>
     */
    public AvailableApReportDatesResponse availableReconFiles(String accessToken, ReportVersionQueryParams queryParams) {
        return get("/v3/report/reconreport/availableReconFiles", accessToken, queryParams, AvailableApReportDatesResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports#operation/getPartnerStatement">Payment Statement Report</a>
     */
    public PartnerStatementResponse getPartnerStatement(String accessToken) {
        return get("/v3/report/payment/statement", accessToken, null, PartnerStatementResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports#operation/getPartnerPerformance">Performance Report</a>
     */
    public PartnerStatementResponse getPartnerPerformance(String accessToken) {
        return get("/v3/report/payment/performance", accessToken, null, PartnerStatementResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/onrequestreports#operation/getRequestsStatus">Get All Report Requests</a>
     */
    public ReportRequestsResponse getReportRequests(String accessToken, ReportRequestsQueryParams queryParams) {
        return get("/v3/reports/reportRequests", accessToken, queryParams, ReportRequestsResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/onrequestreports#operation/generateReport">Create Report Request</a>
     */
    public GenerateReportResponse generateReport(String accessToken, GenerateReportRequestParams queryParams, GenerateReportPayload payload) {
        return exchange("/v3/reports/reportRequests", HttpMethod.POST, accessToken, queryParams, payload, GenerateReportResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/onrequestreports#operation/getSingleRequestStatus">Report Request Status</a>
     */
    public GenerateReportResponse getSingleRequest(String accessToken, String requestId) {
        return get(String.format("/v3/reports/reportRequests/%s", requestId), accessToken, null, GenerateReportResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/onrequestreports#operation/downloadReport">Download Report URL</a>
     */
    public DownloadReportResponse downloadReport(String accessToken, String requestId) {
        return get("/v3/reports/downloadReport", accessToken, new RequestIdQueryParams(requestId), DownloadReportResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/updateShipmentQuantity">Update Shipment Quantities</a>
     */
    public StatusPayloadResponse<Void> updateShipmentQuantity(String accessToken, UpdatedShipmentQtyPayload payload) {
        return exchange("/v3/fulfillment/shipment-quantities", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<StatusPayloadResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/wercsFeedback">Hazmat Items On hold</a>
     */
    public StatusPayloadResponse<OnholdItemsResponse> onholdSearch(String accessToken, OnholdSearchPayload payload) {
        return post("/v3/items/onhold/search", accessToken, payload, new ParameterizedTypeReference<StatusPayloadResponse<OnholdItemsResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/updateShipmentTrackingDetails">Update Shipment Tracking</a>
     */
    public StatusPayloadResponse<Void> shipmentTracking(String accessToken, ShipmentTrackingPayload payload) {
        return post("/v3/fulfillment/shipment-tracking", accessToken, payload, new ParameterizedTypeReference<StatusPayloadResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/createInboundShipmentLabelV2">Create Inbound Shipment label</a>
     */
    public byte[] shipmentLabel(String accessToken, ShipmentLabelPayload payload) {
        return post("/v3/fulfillment/shipment-label", accessToken, payload, byte[].class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/createFulfillment">Create Customer Order</a>
     */
    public StatusHeaderPayload<RequestIdPayload> createFulfillment(String accessToken, HeaderPayload<FulfillmentPayload> payload) {
        return post("/v3/fulfillment/orders-fulfillments", accessToken, payload, new ParameterizedTypeReference<StatusHeaderPayload<RequestIdPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/promiseFulfillments">Fetch Delivery Promise Details</a>
     */
    public StatusHeaderPayload<OrderPromiseOptionsResponse> fetchOrderPromiseOptions(String accessToken, HeaderPayload<FetchOrderPromiseOptionsPayload> payload) {
        return post("/v3/fulfillment/orders-fulfillments/fetchOrderPromiseOptions", accessToken, payload, new ParameterizedTypeReference<StatusHeaderPayload<OrderPromiseOptionsResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/cancelFulfillment">Cancel Customer Order</a>
     */
    public StatusHeaderPayload<RequestIdPayload> cancelFulfillment(String accessToken, HeaderPayload<CancelFulfillmentPayload> payload) {
        return post("/v3/fulfillment/orders-fulfillments/cancel", accessToken, payload, new ParameterizedTypeReference<StatusHeaderPayload<RequestIdPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/getInboundShipments">Get Shipments</a>
     */
    public InboundShipmentsResponse getInboundShipments(String accessToken, InboundShipmentsQueryParams queryParams) {
        return get("/v3/fulfillment/inbound-shipments", accessToken, queryParams, InboundShipmentsResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/createShipment">Create Inbound Shipment</a>
     */
    public StatusPayloadResponse<List<CreateShipmentResponse>> createShipment(String accessToken, CreateShipmentPayload payload) {
        return post("/v3/fulfillment/inbound-shipments", accessToken, payload, new ParameterizedTypeReference<StatusPayloadResponse<List<CreateShipmentResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/inboundPreview">Fetch Inbound Preview</a>
     */
    public StatusPayloadResponse<List<InboundPreviewResponse>> inboundPreview(String accessToken, HeaderPayload<InboundPreviewPayload> payload) {
        return post("/v3/fulfillment/inbound-preview", accessToken, payload, new ParameterizedTypeReference<StatusPayloadResponse<List<InboundPreviewResponse>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/getCarrierRateQuote">Get Carrier Rate Quote</a>
     */
    public CarrierRateQuoteResponse getCarrierRateQuote(String accessToken, CarrierRateQuoteQueryParams queryParams) {
        return get("/v3/fulfillment/carrier-rate-quotes", accessToken, queryParams, CarrierRateQuoteResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/createCarrierRateQuotes">Create Carrier Rate Quote</a>
     */
    public CarrierRateQuotesCreateResponse createCarrierRateQuotes(String accessToken, CarrierRateQuotesCreatePayload payload) {
        return post("/v3/fulfillment/carrier-rate-quotes", accessToken, payload, CarrierRateQuotesCreateResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/confirmCarrierRateQuote">Confirm Carrier Rate Quote</a>
     */
    public StatusPayloadResponse<Void> confirmCarrierRateQuote(String accessToken, String shipmentId) {
        return post("/v3/fulfillment/carrier-rate-quote/confirm", accessToken, new ShipmentIdPayload(shipmentId), new ParameterizedTypeReference<StatusPayloadResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/fulfillment#operation/printCarrierLabel">Print Carrier Label</a>
     */
    public StatusPayloadResponse<Void> printCarrierLabel(String accessToken, String shipmentId, ShipDatePayload payload) {
        return post(String.format("/v3/fulfillment/carrier-label/%s", shipmentId), accessToken, payload, new ParameterizedTypeReference<StatusPayloadResponse<Void>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/notifications#operation/testNotification">Test Notification</a>
     */
    public MessageResponse testNotification(String accessToken, TestNotificationPayload payload) {
        return post("/v3/webhooks/test", accessToken, payload, MessageResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/notifications#operation/getAllSubscriptions">All subscriptions</a>
     */
    public AllSubscriptionsResponse getAllSubscriptions(String accessToken, AllSubscriptionsQueryParams queryParams) {
        return get("/v3/webhooks/subscriptions", accessToken, queryParams, AllSubscriptionsResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/notifications#operation/createSubscription">Create subscription</a>
     */
    public SubscriptionPayload createSubscription(String accessToken, SubscriptionPayload payload) {
        return post("/v3/webhooks/subscriptions", accessToken, payload, SubscriptionPayload.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/notifications#operation/deleteSubscription">Delete Subscription</a>
     */
    public DeleteSubscriptionResponse deleteSubscription(String accessToken, String subscriptionId) {
        return exchange(String.format("/v3/webhooks/subscriptions/%s", subscriptionId), HttpMethod.DELETE, accessToken, null, null, DeleteSubscriptionResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/notifications#operation/updateSubscription">Update Subscription</a>
     */
    public Events updateSubscription(String accessToken, String subscriptionId, Events payload) {
        return exchange(String.format("/v3/webhooks/subscriptions/%s", subscriptionId), HttpMethod.PUT, accessToken, null, payload, Events.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/notifications#operation/getEventTypes">Event Types</a>
     */
    public EventTypesResponse getEventTypes(String accessToken) {
        return get("/v3/webhooks/eventTypes", accessToken, null, EventTypesResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/utilities#operation/getTaxonomyResponse">Taxonomy by spec</a>
     */
    public StatusPayloadResponse<List<TaxonomyPayload>> getTaxonomy(String accessToken, TaxonomyQueryParams queryParams) {
        return get("/v3/utilities/taxonomy", accessToken, queryParams, new ParameterizedTypeReference<StatusPayloadResponse<List<TaxonomyPayload>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/utilities#operation/getDepartmentList">All Departments</a>
     */
    public StatusPayloadResponse<List<DepartmentPayload>> getDepartmentList(String accessToken) {
        return get("/v3/utilities/taxonomy/departments", accessToken, null, new ParameterizedTypeReference<StatusPayloadResponse<List<DepartmentPayload>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/utilities#operation/getCategories">All Categories</a>
     */
    public CategoriesResponse getCategories(String accessToken, String departmentId) {
        return get(String.format("/v3/utilities/taxonomy/departments/%s", departmentId), accessToken, null, CategoriesResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/utilities#operation/getApiPlatformStatus">API Platform Status</a>
     */
    public ApiStatusesResponse getApiPlatformStatus(String accessToken) {
        return get("/v3/utilities/apiStatus", accessToken, null, ApiStatusesResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/insights#operation/itemsDetailsForListing">Item Listing Quality Details</a>
     */
    public ItemsPayload<ItemAssociation> itemListingDetails(String accessToken, ItemListingDetailsQueryParams queryParams, ItemListingDetailsPayload payload) {
        return exchange("/v3/insights/items/listingQuality/items", HttpMethod.POST, accessToken, queryParams, payload, new ParameterizedTypeReference<ItemsPayload<ItemAssociation>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/insights#operation/getProSellerBadgeInfo">Pro Seller Badge Status</a>
     */
    public ProSellerBadgeInfoResponse getProSellerBadgeInfo(String accessToken) {
        return get("/v3/insights/prosellerbadge", accessToken, null, ProSellerBadgeInfoResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/insights#operation/getUnpublishedItems">Unpublished Items</a>
     */
    public UnpublishedItemsResponse getUnpublishedItems(String accessToken) {
        return get("/v3/insights/items/unpublished/items", accessToken, null, UnpublishedItemsResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/insights#operation/getUnpublishedItemCount">Unpublished Item Counts</a>
     */
    public PayloadResponse<List<UnpublishedCountPayload>> getUnpublishedItemCount(String accessToken, String fromDate) {
        return get("/v3/insights/items/unpublished/counts", accessToken, new FromDataQueryParams(fromDate), new ParameterizedTypeReference<PayloadResponse<List<UnpublishedCountPayload>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/insights#operation/getTrendingResult">Top Trending Items</a>
     */
    public StatusPayloadResponse<TrendingItemPayload> getTrendingItems(String accessToken, TrendingItemsQueryParams queryParams) {
        return get("/v3/insights/items/trending", accessToken, queryParams, new ParameterizedTypeReference<StatusPayloadResponse<TrendingItemPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/insights#operation/getListingQualityScore">Seller Listing Quality Score</a>
     */
    public StatusPayloadResponse<ListingQualityScorePayload> listingQualityScore(String accessToken, ListingQualityScoreQueryParams queryParams) {
        return get("/v3/insights/items/listingQuality/score", accessToken, queryParams, new ParameterizedTypeReference<StatusPayloadResponse<ListingQualityScorePayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/insights#operation/getCategoriesList">Item count with listing quality issues</a>
     */
    public StatusPayloadResponse<List<ListingQualityCountPayload>> listingQualityCount(String accessToken, ListingQualityCountQueryParams queryParams) {
        return get("/v3/insights/items/listingQuality/count", accessToken, queryParams, new ParameterizedTypeReference<StatusPayloadResponse<List<ListingQualityCountPayload>>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reviews#operation/bulkUpdateItemStatus">Bulk update item status</a>
     */
    public StatusCodePayloadResponse<BulkItemResponse> bulkUpdateItemStatus(String accessToken, BulkUpdateItemPayload payload) {
        return exchange("/v3/growth/reviews-accelerator/items/status", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<StatusCodePayloadResponse<BulkItemResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reviews#operation/getIrpItems">Get RAP post-purchase items</a>
     */
    public StatusCodePayloadResponse<IrpItemPayload> getIrpItems(String accessToken, IrpItemsGetPayload payload) {
        return post("/v3/growth/reviews-accelerator/items", accessToken, payload, new ParameterizedTypeReference<StatusCodePayloadResponse<IrpItemPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reviews#operation/getIrpCategories">Get categories</a>
     */
    public StatusCodePayloadResponse<IrpCategoriesPayload> getIrpCategories(String accessToken, IrpCategoriesGetPayload payload) {
        return post("/v3/growth/reviews-accelerator/categories", accessToken, payload, new ParameterizedTypeReference<StatusCodePayloadResponse<IrpCategoriesPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/rejectAssortmentRecommendations">Reject Recommendations</a>
     */
    public PayloadResponse<MessagePayload> rejectRecommendations(String accessToken, RecommendationsRejectFilterPayload payload) {
        return exchange("/v3/growth/assortment/recommendations/rejections", HttpMethod.PUT, accessToken, payload, null, new ParameterizedTypeReference<PayloadResponse<MessagePayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/rejectAssortmentRecommendations">Reject Recommendations</a>
     */
    public PayloadResponse<MessagePayload> rejectRecommendations(String accessToken, RecommendationsRejectIdentifierPayload payload) {
        return exchange("/v3/growth/assortment/recommendations/rejections", HttpMethod.PUT, accessToken, payload, null, new ParameterizedTypeReference<PayloadResponse<MessagePayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getAssortmentRecommendations">Get Recommendations</a>
     */
    public PayloadResponse<RecommendationsPayload> getRecommendations(String accessToken, RecommendationsAllPayload payload) {
        return post("/v3/growth/assortment/recommendations", accessToken, payload, new ParameterizedTypeReference<PayloadResponse<RecommendationsPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getAssortmentRecommendations">Get Recommendations</a>
     */
    public PayloadResponse<RecommendationsPayload> getRecommendations(String accessToken, RecommendationsFilterPayload payload) {
        return post("/v3/growth/assortment/recommendations", accessToken, payload, new ParameterizedTypeReference<PayloadResponse<RecommendationsPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/createFileOnRequest">Download Recommendations</a>
     */
    public PayloadResponse<RecommendationsDownloadResponse> downloadRecommendations(String accessToken, RecommendationDownloadPayload payload) {
        return post("/v3/growth/assortment/recommendations/fileOnRequest", accessToken, payload, new ParameterizedTypeReference<PayloadResponse<RecommendationsDownloadResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getCategorizationDetailsOfAssortmentRecommendations">Get Categorization</a>
     */
    public PayloadResponse<CategorizationPayload> getCategorization(String accessToken, CategorizationGetPayload payload) {
        return post("/v3/growth/assortment/recommendations/categorization/counts", accessToken, payload, new ParameterizedTypeReference<PayloadResponse<CategorizationPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getFileOnRequestStatus">Get Download Request Status</a>
     */
    public PayloadResponse<FileOnRequestStatus> getDownloadRequestStatus(String accessToken, String requestId) {
        return get(String.format("/v3/growth/assortment/recommendations/fileOnRequest/%s", requestId), accessToken, null, new ParameterizedTypeReference<PayloadResponse<FileOnRequestStatus>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/downloadFileAsPerTheRequestId">Get Download URL</a>
     */
    public PayloadResponse<DownloadUrlPayload> getDownloadUrl(String accessToken, String requestId) {
        return get(String.format("/v3/growth/assortment/recommendations/download/%s", requestId), accessToken, null, new ParameterizedTypeReference<PayloadResponse<DownloadUrlPayload>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/sww#operation/createLabel">Create label</a>
     */
    public DataResponse<LabelResponse> createLabel(String accessToken, CreateLabelPayload payload) {
        return post("/v3/shipping/labels", accessToken, payload, new ParameterizedTypeReference<DataResponse<LabelResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/sww#operation/getShippingEstimate">Shipping estimates</a>
     */
    public DataResponse<ShippingEstimateResponse> getShippingEstimate(String accessToken, ShippingEstimatePayload payload) {
        return post("/v3/shipping/labels/shipping-estimates", accessToken, payload, new ParameterizedTypeReference<DataResponse<ShippingEstimateResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/sww#operation/getLabel">Labels detail by purchase order id</a>
     */
    public DataResponse<LabelResponse> getLabel(String accessToken, String purchaseOrderId) {
        return get(String.format("/v3/shipping/labels/purchase-orders/%s", purchaseOrderId), accessToken, null, new ParameterizedTypeReference<DataResponse<LabelResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/sww#operation/getCarriers">Supported carriers</a>
     */
    public CarriersResponse getCarriers(String accessToken) {
        return get("/v3/shipping/labels/carriers", accessToken, null, CarriersResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/sww#operation/getLabelByTrackingAndCarrier">Download label</a>
     */
    public byte[] downloadLabel(String accessToken, String carrierShortName, String trackingNo) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_OCTET_STREAM));
        return exchange(String.format("/v3/shipping/labels/carriers/%s/trackings/%s", carrierShortName, trackingNo), HttpMethod.GET, accessToken, new HttpEntity<>(null, headers), byte[].class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/sww#operation/discardLabel">Discard label</a>
     */
    public DataResponse<Boolean> discardLabel(String accessToken, String carrierShortName, String trackingNo) {
        return exchange(String.format("/v3/shipping/labels/carriers/%s/trackings/%s", carrierShortName, trackingNo), HttpMethod.DELETE, accessToken, null, null, new ParameterizedTypeReference<DataResponse<Boolean>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/sww#operation/getCarrierPackageTypes">Supported carrier package types</a>
     */
    public DataResponse<List<CarrierPackageType>> getCarrierPackageTypes(String accessToken, String carrierShortName) {
        return get(String.format("/v3/shipping/labels/carriers/%s/package-types", carrierShortName), accessToken, null, new ParameterizedTypeReference<DataResponse<List<CarrierPackageType>>>() {
        });
    }

}
