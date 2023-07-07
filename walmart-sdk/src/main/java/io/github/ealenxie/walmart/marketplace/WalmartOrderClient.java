package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.walmart.marketplace.feeds.FeedTypePayload;
import io.github.ealenxie.walmart.marketplace.insights.*;
import io.github.ealenxie.walmart.marketplace.items.*;
import io.github.ealenxie.walmart.marketplace.orders.*;
import io.github.ealenxie.walmart.marketplace.recommendations.*;
import io.github.ealenxie.walmart.marketplace.reports.AvailableApReportDatesResponse;
import io.github.ealenxie.walmart.marketplace.reports.PartnerStatementResponse;
import io.github.ealenxie.walmart.marketplace.reports.ReportQueryParams;
import io.github.ealenxie.walmart.marketplace.reports.ReportVersionQueryParams;
import io.github.ealenxie.walmart.marketplace.reviews.*;
import io.github.ealenxie.walmart.marketplace.shipping.*;
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
    public ItemPayload getItem(String accessToken, String id, String productIdType ) {
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
        return get(String.format("/v3/shipping/labels/carriers/%s/trackings/%s", carrierShortName, trackingNo), accessToken, null, byte[].class);
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
