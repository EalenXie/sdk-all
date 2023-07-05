package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.offer.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;

/**
 * @author EalenXie created on 2023/6/29 15:27
 */
public class AllegroOfferClient extends AllegroClient {

    private static final String SALE_OFFERS = "/sale/offers";
    private static final String SALE_OFFER = SALE_OFFERS + "/%s";

    protected AllegroOfferClient() {
        super(new ObjectMapper());
    }

    protected AllegroOfferClient(ObjectMapper mapper) {
        super(mapper);
    }

    protected AllegroOfferClient(RestOperations restOperations, ObjectMapper mapper) {
        super(restOperations, mapper);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/searchOffersUsingGET">Get seller's offers</a>
     */
    public OffersResponse searchOffers(String accessToken, SearchOffersQueryParams queryParams) {
        return get(SALE_OFFERS, accessToken, queryParams, OffersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferUsingGET">Get all fields of the particular offer</a>
     *
     * @deprecated deprecated by Allegro
     */
    @Deprecated
    public DraftOfferPayload getDraftOffer(String accessToken, String offerId) {
        return get(String.format(SALE_OFFER, offerId), accessToken, null, DraftOfferPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferSmartClassificationGET">Get Smart! classification report of the particular offer</a>
     */
    public SmartOfferResponse getSmartOffer(String accessToken, String offerId, String marketplaceId) {
        return get(String.format("%s/%s/smart", SALE_OFFERS, offerId), accessToken, new MarketplaceIdQueryParams(marketplaceId), SmartOfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferEvents">Get events about the seller's offers</a>
     */
    public OfferEventsResponse getOfferEvents(String accessToken, OfferEventsQueryParams queryParams) {
        return get("/sale/offer-events", accessToken, queryParams, OfferEventsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createChangePriceCommandUsingPUT">Modify the Buy Now price in an offer</a>
     */
    public ModifyOfferPriceResponse modifyOfferPrice(String accessToken, String offerId, String commandId, IdInputPayload<BuyNowPricePayload> payload) {
        return exchange(String.format("/offers/%s/change-price-commands/%s", offerId, commandId), HttpMethod.PUT, accessToken, null, payload, ModifyOfferPriceResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createOfferUsingPOST">Create a draft offer</a>
     *
     * @deprecated deprecated by Allegro
     */
    @Deprecated
    public DraftOfferPayload createDraftOffer(String accessToken, DraftOfferPayload payload) {
        return post(SALE_OFFERS, accessToken, payload, DraftOfferPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateOfferUsingPUT">Complete a draft offer or edit an offer</a>
     *
     * @deprecated deprecated by Allegro
     */
    @Deprecated
    public DraftOfferPayload updateDraftOffer(String accessToken, String offerId, DraftOfferPayload payload) {
        return exchange(String.format(SALE_OFFER, offerId), HttpMethod.PUT, accessToken, null, payload, DraftOfferPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteOfferUsingDELETE">Delete a draft offer</a>
     */
    public void deleteDraftOffer(String accessToken, String offerId) {
        exchange(String.format(SALE_OFFER, offerId), HttpMethod.DELETE, accessToken, null, null, Void.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/changePublicationStatusUsingPUT">Batch offer publish / unpublish</a>
     */
    public TaskCountResponse changePublishStatus(String accessToken, String commandId, ChangePublishStatusPayload payload) {
        return exchange(String.format("/sale/offer-publication-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicationReportUsingGET">Publish command summary</a>
     */
    public TaskCountResponse getPublish(String accessToken, String commandId) {
        return get(String.format("/sale/offer-publication-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicationTasksUsingGET">Publish command detailed report</a>
     */
    public TasksResponse getPublicationTasks(String accessToken, String commandId) {
        return get(String.format("/sale/offer-publication-commands/%s/tasks", commandId), accessToken, null, TasksResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAvailableOfferPromotionPackages">Get all available offer promotion packages</a>
     */
    public PromotionPackagesResponse getAvailablePromotionPackages(String accessToken) {
        return get("/sale/offer-promotion-packages", accessToken, null, PromotionPackagesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/modifyOfferPromoOptionsUsingPOST">Modify offer promotion packages</a>
     */
    public PromoOptionResponse modifyOfferPromoOptions(String accessToken, String offerId, PromoOptionPayload payload) {
        return post(String.format("/sale/offers/%s/promo-options-modification", offerId), accessToken, payload, PromoOptionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferPromoOptionsUsingGET">Get offer promotion packages</a>
     */
    public PromoOptionResponse getOfferPromoOptions(String accessToken, String offerId) {
        return get(String.format("/sale/offers/%s/promo-options", offerId), accessToken, null, PromoOptionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromoOptionsForSellerOffersUsingGET">Get promo options for seller's offers</a>
     */
    public PromoOptionsResponse getSellerOffersPromoOptions(String accessToken, PageQueryParams queryParams) {
        return get("/sale/offers/promo-options", accessToken, queryParams, PromoOptionsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/promoModificationCommandUsingPUT">Batch offer promotion package modification</a>
     */
    public TaskCountResponse promoModify(String accessToken, String commandId, PromoModifyPayload payload) {
        return exchange(String.format("/sale/offers/promo-options-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromoModificationCommandResultUsingGET">Modification command summary</a>
     */
    public TaskCountResponse getPromoModify(String accessToken, String commandId) {
        return get(String.format("/sale/offers/promo-options-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromoModificationCommandDetailedResultUsingGET">Modification command detailed result</a>
     */
    public PromoModifyDetailResult getPromoModifyDetail(String accessToken, String commandId) {
        return get(String.format("/sale/offers/promo-options-commands/%s/tasks", commandId), accessToken, null, PromoModifyDetailResult.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createProductOffers">Create offer based on product</a>
     */
    public OfferResponse createOffer(String accessToken, OfferPayload payload) {
        return post("/sale/product-offers", accessToken, payload, OfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/editProductOffers">Edit an offer</a>
     */
    public OfferResponse editOffer(String accessToken, String offerId, OfferPayload payload) {
        return exchange(String.format("/sale/product-offers/%s", offerId), HttpMethod.PATCH, accessToken, null, payload, OfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getProductOffer">Get all data of the particular product-offer</a>
     */
    public OfferResponse getOffer(String accessToken, String offerId) {
        return get(String.format("/sale/product-offers/%s", offerId), accessToken, null, OfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getProductOfferProcessingStatus">Check the processing status of a POST or PATCH request</a>
     */
    public OfferProcessingStatusResponse getOfferProcessingStatus(String accessToken, String offerId, String operationId) {
        return get(String.format("/sale/product-offers/%s/operations/%s", offerId, operationId), accessToken, null, OfferProcessingStatusResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOffersUnfilledParametersUsingGET_1">Get offers with missing parameters</a>
     */
    public OffersUnfilledParametersResponse getOffersUnfilledParameters(String accessToken, OffersUnfilledParametersQueryParams queryParams) {
        return get("/sale/offers/unfilled-parameters", accessToken, queryParams, OffersUnfilledParametersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferTranslationUsingGET">Get offer translations</a>
     */
    public OfferTranslationResponse getOfferTranslation(String accessToken, String offerId, @Nullable String language) {
        return get(String.format("/sale/offers/%s/translations", offerId), accessToken, new LanguageQueryParam(language), OfferTranslationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateOfferTranslationUsingPATCH">Update offer translation</a>
     */
    public void updateOfferTranslation(String accessToken, String offerId, String language, UpdateOfferTranslationPayload payload) {
        exchange(String.format("/sale/offers/%s/translations/%s", offerId, language), HttpMethod.PATCH, accessToken, null, payload, OfferTranslationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteManualTranslationUsingDELETE">Delete offer translation</a>
     */
    public void deleteManualTranslation(String accessToken, String offerId, String language, @Nullable String element) {
        exchange(String.format("/sale/offers/%s/translations/%s", offerId, language), HttpMethod.DELETE, accessToken, new ElementQueryParam(element), null, OfferTranslationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoriesUsingGET">Get IDs of Allegro categories</a>
     */
    public CategoryResponse getCategories(String accessToken, @Nullable CategoryQueryParam queryParam) {
        return get("/sale/categories", accessToken, queryParam, CategoryResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoryUsingGET_1">Get a category by ID</a>
     */
    public Category getCategory(String accessToken, String categoryId) {
        return get(String.format("/sale/categories/%s", categoryId), accessToken, null, Category.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getFlatParametersUsingGET_2">Get parameters supported by a category</a>
     */
    public CategoryParametersResponse getCategoryParameters(String accessToken, String categoryId) {
        return get(String.format("/sale/categories/%s/parameters", categoryId), accessToken, null, CategoryParametersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoryParametersScheduledChangesUsingGET_1">Get planned changes in category parameters</a>
     */
    public ScheduledChangesResponse getCategoryScheduledChanges(String accessToken, CategoryScheduledChangesQueryParams queryParams) {
        return get("/sale/category-parameters-scheduled-changes", accessToken, queryParams, ScheduledChangesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoryEventsUsingGET_1">Get changes in categories</a>
     */
    public CategoryEventsResponse getCategoryEvents(String accessToken, CategoryEventsQueryParams queryParams) {
        return get("/sale/category-events", accessToken, queryParams, CategoryEventsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/categorySuggestionUsingGET">Get categories suggestions</a>
     */
    public MatchingCategoriesResponse categorySuggestion(String accessToken, String name) {
        return get("/sale/matching-categories", accessToken, new NameQueryParam(name), MatchingCategoriesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadOfferImageUsingPOST">Upload an offer image</a>
     */
    public UploadOfferImageResponse uploadOfferImage(String accessToken, UrlPayload payload) {
        return exchange(buildUri(getUploadHost(), "/sale/images", null), HttpMethod.POST, new HttpEntity<>(payload, getBearerHeaders(accessToken)), UploadOfferImageResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createOfferAttachmentUsingPOST">Create an offer attachment</a>
     */
    public OfferAttachmentResponse createOfferAttachment(String accessToken, CreateOfferAttachmentPayload payload) {
        return post("/sale/offer-attachments", accessToken, payload, OfferAttachmentResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadOfferAttachmentUsingPUT">Upload an offer attachment</a>
     */
    public OfferAttachmentResponse uploadOfferAttachment(String accessToken, String attachmentId, byte[] file) {
        return exchange(buildUri(getUploadHost(), String.format("/sale/offer-attachments/%s", attachmentId), null), HttpMethod.PUT, new HttpEntity<>(file, getBearerHeaders(accessToken)), OfferAttachmentResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getFlatProductParametersUsingGET">Get product parameters available in given category</a>
     */
    public ProductParametersResponse getProductParameters(String accessToken, String categoryId) {
        return get(String.format("/sale/categories/%s/product-parameters", categoryId), accessToken, null, ProductParametersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getSaleProducts">Get search products results</a>
     */
    public SaleProductsResponse getSaleProducts(String accessToken, SaleProductsQueryParams queryParams) {
        return get("/sale/products", accessToken, queryParams, SaleProductsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getSaleProduct">Get all data of the particular product</a>
     */
    public SaleProductResponse getSaleProduct(String accessToken, String productId, SaleProductQueryParams queryParams) {
        return get(String.format("/sale/products/%s", productId), accessToken, queryParams, SaleProductResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/proposeSaleProduct">Propose a product</a>
     */
    public ProposeSaleProductResponse proposeSaleProduct(String accessToken, ProposeSaleProductPayload payload) {
        return post("/sale/product-proposals", accessToken, payload, ProposeSaleProductResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/productChangeProposal">Propose changes in product</a>
     */
    public ProductChangeProposalResponse productChangeProposal(String accessToken, String productId, ProductChangeProposalPayload payload) {
        return post(String.format("/sale/products/%s/change-proposals", productId), accessToken, payload, ProductChangeProposalResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getProductChangeProposal">Get all data of the particular product changes proposal</a>
     */
    public ProductChangeProposalResponse getProductChangeProposal(String accessToken, String changeProposalId, @Nullable String acceptLanguage) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.set("Accept-Language", ObjectUtils.isEmpty(acceptLanguage) ? "en-US" : acceptLanguage);
        return exchange(String.format("/sale/products/change-proposals/%s", changeProposalId), HttpMethod.GET, null, new HttpEntity<>(null, headers), ProductChangeProposalResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getSaleSelectionInsights">[BETA] Get selection insights.</a>
     */
    public SaleSelectionInsightsResponse getSaleSelectionInsights(String accessToken, SaleSelectionInsightsQueryParams queryParams) {
        return get("/sale/selection-insights", accessToken, queryParams, SaleSelectionInsightsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/modificationCommandUsingPUT">Batch offer modification</a>
     */
    public TaskCountResponse batchOfferModify(String accessToken, String commandId, BatchOfferModifyPayload payload) {
        return exchange(String.format("/sale/offer-modification-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getGeneralReportUsingGET">Modification command summary</a>
     */
    public TaskCountResponse getModifySummary(String accessToken, String commandId) {
        return get(String.format("/sale/offer-modification-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getTasksUsingGET">Modification command detailed report</a>
     */
    public TasksResponse getTasks(String accessToken, String commandId, PageQueryParams queryParams) {
        return get(String.format("/sale/offer-modification-commands/%s/tasks", commandId), accessToken, queryParams, TasksResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/priceModificationCommandUsingPUT">Batch offer price modification</a>
     */
    public TaskCountResponse batchOfferPriceModify(String accessToken, String commandId, BatchOfferPriceModifyPayload payload) {
        return exchange(String.format("/sale/offer-price-change-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPriceModificationCommandStatusUsingGET">Change price command summary</a>
     */
    public TaskCountResponse getPriceModifyStatus(String accessToken, String commandId) {
        return get(String.format("/sale/offer-price-change-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPriceModificationCommandTasksStatusesUsingGET">Change price command detailed report</a>
     */
    public TasksResponse getPriceModifyTasksStatuses(String accessToken, String commandId, PageQueryParams queryParams) {
        return get(String.format("/sale/offer-price-change-commands/%s/tasks", commandId), accessToken, queryParams, TasksResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/quantityModificationCommandUsingPUT">Batch offer quantity modification</a>
     */
    public TaskCountResponse batchOfferQuantityModify(String accessToken, String commandId, BatchOfferQuantityModifyPayload payload) {
        return exchange(String.format("/sale/offer-quantity-change-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getQuantityModificationCommandStatusUsingGET">Change quantity command summary</a>
     */
    public TaskCountResponse getQuantityModifyStatus(String accessToken, String commandId) {
        return get(String.format("/sale/offer-quantity-change-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getQuantityModificationCommandTasksStatusesUsingGET">Change quantity command detailed report</a>
     */
    public TasksResponse getQuantityModifyTasksStatuses(String accessToken, String commandId, PageQueryParams queryParams) {
        return get(String.format("/sale/offer-quantity-change-commands/%s/tasks", commandId), accessToken, queryParams, TasksResponse.class);
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/classifiedSellerOfferStatsGET">Get the seller's advertisements daily statistics</a>
     */
    public SellerOffersStatsResponse getSellerOffersStats(String accessToken, DateQueryParams queryParams) {
        return get("/sale/classified-offers-stats", accessToken, queryParams, SellerOffersStatsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/classifiedOffersStatsGET">Get the advertisements daily statistics</a>
     */
    public OfferStatsResponse getOffersStats(String accessToken, OffersStatsQueryParams queryParams) {
        return get("/sale/classified-offers-stats", accessToken, queryParams, OfferStatsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getClassifiedPackagesUsingGET">Get classified packages assigned to an offer</a>
     */
    public AssignClassifiedPackageResponse getClassifiedPackages(String accessToken, String offerId) {
        return get(String.format("/sale/offer-classifieds-packages/%s", offerId), accessToken, null, AssignClassifiedPackageResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/assignClassifiedPackagesUsingPUT">Assign packages to a classified</a>
     */
    public void assignClassifiedPackages(String accessToken, String offerId, AssignClassifiedPackagePayload payload) {
        exchange(String.format("/sale/offer-classifieds-packages/%s", offerId), HttpMethod.PUT, accessToken, null, payload, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getClassifiedPackageConfigurationsForCategoryUsingGET">Get configurations of packages</a>
     */
    public PackageConfigurationResponse getPackageConfigurations(String accessToken, CategoryIdQueryParams queryParams) {
        return get("/sale/classifieds-packages", accessToken, queryParams, PackageConfigurationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getClassifiedPackageConfigurationUsingGET">Get the configuration of a package</a>
     */
    public PackageConfigurationPayload getPackageConfiguration(String accessToken, String packageId) {
        return get(String.format("/sale/classifieds-packages/%s", packageId), accessToken, null, PackageConfigurationPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/calculateFeePreviewUsingPOST">Calculate fee and commission for an offer</a>
     */
    public CalculateFeeResponse calculateFeePreview(String accessToken, CalculateFeePayload payload) {
        return post("/pricing/offer-fee-preview", accessToken, payload, CalculateFeeResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/offerQuotesPublicUsingGET">Get the user's current offer quotes</a>
     */
    public QuotesPayload getOfferQuotes(String accessToken, OfferIdQueryParams queryParams) {
        return post("/pricing/offer-quotes", accessToken, queryParams, QuotesPayload.class);
    }
}
