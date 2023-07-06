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
    private static final String OFFER_VARIANTS_URL = "/offer-variants/%s";
    private static final String LOYALTY_PROMOTIONS_URL = "/sale/loyalty/promotions/%s";
    private static final String LOYALTY_PROMOTION_CAMPAIGNS_URL = "/sale/loyalty/promotion-campaigns";

    public AllegroOfferClient() {
    }

    public AllegroOfferClient(ObjectMapper mapper) {
        super(mapper);
    }

    public AllegroOfferClient(RestOperations restOperations, ObjectMapper mapper) {
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
    public CategoryEventsResponse getCategoryEvents(String accessToken, OfferEventsQueryParams queryParams) {
        return get("/sale/category-events", accessToken, queryParams, CategoryEventsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/categorySuggestionUsingGET">Get categories suggestions</a>
     */
    public MatchingCategoriesResponse categorySuggestion(String accessToken, String name) {
        return get("/sale/matching-categories", accessToken, new NamePayload(name), MatchingCategoriesResponse.class);
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
     * <a href="https://developer.allegro.pl/documentation/#operation/createVariantSet">Create variant set</a>
     */
    public CreateVariantSetResponse createVariantSet(String accessToken, VariantSetPayload payload) {
        return post("/sale/offer-variants", accessToken, payload, CreateVariantSetResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getVariantSets">Get the user's variant sets</a>
     */
    public VariantSetsResponse getVariantSets(String accessToken, VariantSetsQueryParams queryParams) {
        return get("/sale/offer-variants", accessToken, queryParams, VariantSetsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateVariantSet">Update variant set</a>
     */
    public VariantSetsResponse updateVariantSet(String accessToken, String setId, VariantSetPayload payload) {
        return exchange(String.format(OFFER_VARIANTS_URL, setId), HttpMethod.PUT, accessToken, null, payload, VariantSetsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getVariantSet">Get a variant set</a>
     */
    public VariantSetsResponse getVariantSet(String accessToken, String setId) {
        return get(String.format(OFFER_VARIANTS_URL, setId), accessToken, null, VariantSetsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteVariantSet">Delete a variant set</a>
     */
    public void deleteVariantSet(String accessToken, String setId) {
        exchange(String.format(OFFER_VARIANTS_URL, setId), HttpMethod.DELETE, accessToken, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createTagPOST_1">Create a tag</a>
     */
    public IdPayload createTag(String accessToken, OfferTagPayload payload) {
        return post("/sale/offer-tags", accessToken, payload, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/listSellerTagsGET_1">Get the user's tags</a>
     */
    public OfferTagsResponse getTags(String accessToken, PageQueryParams queryParams) {
        return get("/sale/offer-tags", accessToken, queryParams, OfferTagsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteTagUsingDELETE">Delete a tag</a>
     */
    public void deleteTag(String accessToken, String tagId) {
        exchange(String.format("/sale/offer-tags/%s", tagId), HttpMethod.DELETE, accessToken, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateTagPUT">Modify a tag</a>
     */
    public void updateTag(String accessToken, String tagId, OfferTagPayload payload) {
        exchange(String.format("/sale/offer-tags/%s", tagId), HttpMethod.PUT, accessToken, null, payload, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/assignTagToOfferPOST">Assign tags to an offer</a>
     */
    public void assignTagToOffer(String accessToken, String offerId, AssignTagToOfferPayload payload) {
        post(String.format("/sale/offers/%s/tags", offerId), accessToken, payload, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/listAssignedOfferTagsGET">Get tags assigned to an offer</a>
     */
    public OfferTagsResponse getAssignedOfferTags(String accessToken, String offerId) {
        return get(String.format("/sale/offers/%s/tags", offerId), accessToken, null, OfferTagsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getTaxSettingsForCategory">Get all tax settings for category</a>
     */
    public TaxSettingsResponse getTaxSettings(String accessToken, TaxSettingsQueryParams queryParams) {
        return get("/sale/tax-settings", accessToken, queryParams, TaxSettingsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoriesThatSupportCompatibilityList">Get list of categories where compatibility list is supported</a>
     */
    public SupportedCategoriesResponse getSupportedCategories(String accessToken) {
        return get("/sale/compatibility-list/supported-categories", accessToken, null, SupportedCategoriesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCompatibilityListSuggestion">Get suggested compatibility list</a>
     */
    public CompatibilityListSuggestionResponse getCompatibilityListSuggestion(String accessToken, CompatibilityListSuggestionQueryParams queryParams) {
        return get("/sale/compatibility-list-suggestions", accessToken, queryParams, CompatibilityListSuggestionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCompatibleProductsGroups">Get list of compatible product groups</a>
     */
    public CompatibleProductsGroupsResponse getCompatibleProductsGroups(String accessToken, CompatibleProductsGroupsQueryParams queryParams) {
        return get("/sale/compatible-products/groups", accessToken, queryParams, CompatibleProductsGroupsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCompatibleProducts">Get list of compatible products</a>
     */
    public CompatibleProductsResponse getCompatibleProducts(String accessToken, CompatibleProductsQueryParams queryParams) {
        return get("/sale/compatible-products", accessToken, queryParams, CompatibleProductsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#tag/Rebates-and-promotions">Create a new promotion</a>
     */
    public CreatePromotionResponse createPromotion(String accessToken, CreatePromotionPayload payload) {
        return post("/sale/loyalty/promotions", accessToken, payload, CreatePromotionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/listSellerPromotionsUsingGET_1">Get the user's list of promotions</a>
     */
    public SellerPromotionResponse getSellerPromotions(String accessToken, PromotionQueryParams queryParams) {
        return get("/sale/loyalty/promotions", accessToken, queryParams, SellerPromotionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromotionUsingGET">Get a promotion data by id</a>
     */
    public SellerPromotions getSellerPromotion(String accessToken, String promotionId) {
        return get(String.format(LOYALTY_PROMOTIONS_URL, promotionId), accessToken, null, SellerPromotions.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updatePromotionUsingPUT">Modify a promotion</a>
     */
    public CreatePromotionResponse updatePromotion(String accessToken, String promotionId, CreatePromotionPayload payload) {
        return exchange(String.format(LOYALTY_PROMOTIONS_URL, promotionId), HttpMethod.PUT, accessToken, null, payload, CreatePromotionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deactivatePromotionUsingDELETE">Deactivate a promotion by id</a>
     */
    public void deletePromotion(String accessToken, String promotionId) {
        exchange(String.format(LOYALTY_PROMOTIONS_URL, promotionId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/addPromotionToCampaignUsingPOST">Create an application for a promotion campaign</a>
     */
    public CreatePromotionCampaignResponse createPromotionCampaign(String accessToken, PromotionCampaignPayload payload) {
        return post(LOYALTY_PROMOTION_CAMPAIGNS_URL, accessToken, payload, CreatePromotionCampaignResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromotionCampaignsUsingGET">Get the user's promotion campaigns</a>
     */
    public PromotionCampaignResponse getPromotionCampaigns(String accessToken, PromotionCampaignQueryParams queryParams) {
        return get(LOYALTY_PROMOTION_CAMPAIGNS_URL, accessToken, queryParams, PromotionCampaignResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteCampaignFromPromotionUsingDELETE">Delete a campaign in a promotion</a>
     */
    public void deleteCampaign(String accessToken, CampaignQueryParam queryParams) {
        exchange(LOYALTY_PROMOTION_CAMPAIGNS_URL, HttpMethod.DELETE, accessToken, queryParams, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromotionCampaignApplicationUsingGET">Get an application for promotion campaign</a>
     */
    public Object getPromotionCampaign(String accessToken, String applicationId) {
        return get(String.format("/sale/loyalty/promotion-campaign-applications/%s", applicationId), accessToken, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deletePromotionCampaignApplicationUsingDELETE">Delete an application for promotion campaign</a>
     */
    public void deletePromotionCampaign(String accessToken, String applicationId) {
        exchange(String.format("/sale/loyalty/promotion-campaign-applications/%s", applicationId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/badgeCampaigns_get_all">Get a list of available badge campaigns</a>
     */
    public BadgeCampaignResponse getAllBadgeCampaigns(String accessToken) {
        return get("/sale/badge-campaigns", accessToken, null, BadgeCampaignResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/postBadges">Apply for badge in selected offer</a>
     */
    public CreateBadgeResponse createBadges(String accessToken, BadgePayload payload) {
        return post("/sale/badges", accessToken, payload, CreateBadgeResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBadges">Get a list of badges</a>
     */
    public BadgeResponse getBadges(String accessToken, BadgeQueryParams queryParams) {
        return get("/sale/badges", accessToken, queryParams, BadgeResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/badgeApplications_get_one">Get a badge application details</a>
     */
    public CreateBadgeResponse getBadgeApplication(String accessToken, String applicationId) {
        return get(String.format("/sale/badge-applications/%s", applicationId), accessToken, null, CreateBadgeResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/badgeApplications_get_all">Get a list of badge applications</a>
     */
    public BadgeApplicationResponse getBadgeApplications(String accessToken, BadgeApplicationQueryParams queryParams) {
        return get("/sale/badge-applications", accessToken, queryParams, BadgeApplicationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/badgeOperations_get_one">Get badge operation details</a>
     */
    public BadgeOperationResponse getBadgeOperation(String accessToken, String operationId) {
        return get(String.format("/sale/badge-operations/%s", operationId), accessToken, null, BadgeOperationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/patchBadge">Update campaign badge for the given offer</a>
     */
    public IdPayload updateBadge(String accessToken, String offerId, String campaignId, UpdateBadgePayload payload) {
        return exchange(String.format("/sale/badges/offers/%s/campaigns/%s", offerId, campaignId), HttpMethod.PATCH, accessToken, null, payload, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAllegroPricesConsentForOffer">Get the current consent value for an offer</a>
     */
    public StatusPayload getAllegroPricesConsent(String accessToken, String offerId) {
        return get(String.format("/sale/allegro-prices-offer-consents/%s", offerId), accessToken, null, StatusPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateAllegroPricesConsentForOffer">Update consent value for an offer</a>
     */
    public StatusPayload updateAllegroPricesConsentForOffer(String accessToken, String offerId, StatusPayload payload) {
        return post(String.format("/sale/allegro-prices-offer-consents/%s", offerId), accessToken, payload, StatusPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAllegroPricesEligibilityForAccount">Get the current eligibility information for the account</a>
     */
    public EligibilityResponse getAllegroPricesEligibility(String accessToken) {
        return get("/sale/allegro-prices-account-eligibility", accessToken, null, EligibilityResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateAllegroPricesConsentForAccount">Update consent value for the account</a>
     */
    public StatusPayload updateAllegroPricesConsentForAccount(String accessToken, StatusPayload payload) {
        return exchange("/sale/allegro-prices-account-consent", HttpMethod.PUT, accessToken, null, payload, StatusPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/offerRatingGET">Get offer rating</a>
     */
    public OfferRateResponse getOfferRating(String accessToken, String offerId) {
        return get(String.format("/sale/offers/%s/rating", offerId), accessToken, null, OfferRateResponse.class);
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
