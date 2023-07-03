package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.offer.*;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
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
        return getAllegro(SALE_OFFERS, accessToken, queryParams, OffersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferUsingGET">Get all fields of the particular offer</a>
     *
     * @deprecated deprecated by Allegro
     */
    @Deprecated
    public DraftOfferPayload getDraftOffer(String accessToken, String offerId) {
        return getAllegro(String.format(SALE_OFFER, offerId), accessToken, null, DraftOfferPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferSmartClassificationGET">Get Smart! classification report of the particular offer</a>
     */
    public SmartOfferResponse getSmartOffer(String accessToken, String offerId, String marketplaceId) {
        return getAllegro(String.format("%s/%s/smart", SALE_OFFERS, offerId), accessToken, new MarketplaceIdQueryParams(marketplaceId), SmartOfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferEvents">Get events about the seller's offers</a>
     */
    public OfferEventsResponse getOfferEvents(String accessToken, OfferEventsQueryParams queryParams) {
        return getAllegro("/sale/offer-events", accessToken, queryParams, OfferEventsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createChangePriceCommandUsingPUT">Modify the Buy Now price in an offer</a>
     */
    public ModifyOfferPriceResponse modifyOfferPrice(String accessToken, String offerId, String commandId, IdInputPayload<BuyNowPricePayload> payload) {
        return exchangeAllegro(String.format("/offers/%s/change-price-commands/%s", offerId, commandId), HttpMethod.PUT, accessToken, null, payload, ModifyOfferPriceResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createOfferUsingPOST">Create a draft offer</a>
     *
     * @deprecated deprecated by Allegro
     */
    @Deprecated
    public DraftOfferPayload createDraftOffer(String accessToken, DraftOfferPayload payload) {
        return postAllegro(SALE_OFFERS, accessToken, payload, DraftOfferPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateOfferUsingPUT">Complete a draft offer or edit an offer</a>
     *
     * @deprecated deprecated by Allegro
     */
    @Deprecated
    public DraftOfferPayload updateDraftOffer(String accessToken, String offerId, DraftOfferPayload payload) {
        return exchangeAllegro(String.format(SALE_OFFER, offerId), HttpMethod.PUT, accessToken, null, payload, DraftOfferPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteOfferUsingDELETE">Delete a draft offer</a>
     */
    public void deleteDraftOffer(String accessToken, String offerId) {
        exchangeAllegro(String.format(SALE_OFFER, offerId), HttpMethod.DELETE, accessToken, null, null, Void.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/changePublicationStatusUsingPUT">Batch offer publish / unpublish</a>
     */
    public TaskCountResponse changePublishStatus(String accessToken, String commandId, ChangePublishStatusPayload payload) {
        return exchangeAllegro(String.format("/sale/offer-publication-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicationReportUsingGET">Publish command summary</a>
     */
    public TaskCountResponse getPublish(String accessToken, String commandId) {
        return getAllegro(String.format("/sale/offer-publication-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicationTasksUsingGET">Publish command detailed report</a>
     */
    public PublishTasksResponse getPublicationTasks(String accessToken, String commandId) {
        return getAllegro(String.format("/sale/offer-publication-commands/%s/tasks", commandId), accessToken, null, PublishTasksResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAvailableOfferPromotionPackages">Get all available offer promotion packages</a>
     */
    public PromotionPackagesResponse getAvailablePromotionPackages(String accessToken) {
        return getAllegro("/sale/offer-promotion-packages", accessToken, null, PromotionPackagesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/modifyOfferPromoOptionsUsingPOST">Modify offer promotion packages</a>
     */
    public PromoOptionResponse modifyOfferPromoOptions(String accessToken, String offerId, PromoOptionPayload payload) {
        return postAllegro(String.format("/sale/offers/%s/promo-options-modification", offerId), accessToken, payload, PromoOptionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferPromoOptionsUsingGET">Get offer promotion packages</a>
     */
    public PromoOptionResponse getOfferPromoOptions(String accessToken, String offerId) {
        return getAllegro(String.format("/sale/offers/%s/promo-options", offerId), accessToken, null, PromoOptionResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromoOptionsForSellerOffersUsingGET">Get promo options for seller's offers</a>
     */
    public PromoOptionsResponse getSellerOffersPromoOptions(String accessToken, PageQueryParams queryParams) {
        return getAllegro("/sale/offers/promo-options", accessToken, queryParams, PromoOptionsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/promoModificationCommandUsingPUT">Batch offer promotion package modification</a>
     */
    public TaskCountResponse promoModify(String accessToken, String commandId, PromoModifyPayload payload) {
        return exchangeAllegro(String.format("/sale/offers/promo-options-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromoModificationCommandResultUsingGET">Modification command summary</a>
     */
    public TaskCountResponse getPromoModify(String accessToken, String commandId) {
        return getAllegro(String.format("/sale/offers/promo-options-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPromoModificationCommandDetailedResultUsingGET">Modification command detailed result</a>
     */
    public PromoModifyDetailResult getPromoModifyDetail(String accessToken, String commandId) {
        return getAllegro(String.format("/sale/offers/promo-options-commands/%s/tasks", commandId), accessToken, null, PromoModifyDetailResult.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createProductOffers">Create offer based on product</a>
     */
    public OfferResponse createOffer(String accessToken, OfferPayload payload) {
        return postAllegro("/sale/product-offers", accessToken, payload, OfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/editProductOffers">Edit an offer</a>
     */
    public OfferResponse editOffer(String accessToken, String offerId, OfferPayload payload) {
        return exchangeAllegro(String.format("/sale/product-offers/%s", offerId), HttpMethod.PATCH, accessToken, null, payload, OfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getProductOffer">Get all data of the particular product-offer</a>
     */
    public OfferResponse getOffer(String accessToken, String offerId) {
        return getAllegro(String.format("/sale/product-offers/%s", offerId), accessToken, null, OfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getProductOfferProcessingStatus">Check the processing status of a POST or PATCH request</a>
     */
    public OfferProcessingStatusResponse getOfferProcessingStatus(String accessToken, String offerId, String operationId) {
        return getAllegro(String.format("/sale/product-offers/%s/operations/%s", offerId, operationId), accessToken, null, OfferProcessingStatusResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOffersUnfilledParametersUsingGET_1">Get offers with missing parameters</a>
     */
    public OffersUnfilledParametersResponse getOffersUnfilledParameters(String accessToken, OffersUnfilledParametersQueryParams queryParams) {
        return getAllegro("/sale/offers/unfilled-parameters", accessToken, queryParams, OffersUnfilledParametersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferTranslationUsingGET">Get offer translations</a>
     */
    public OfferTranslationResponse getOfferTranslation(String accessToken, String offerId, @Nullable String language) {
        return getAllegro(String.format("/sale/offers/%s/translations", offerId), accessToken, new LanguageQueryParam(language), OfferTranslationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateOfferTranslationUsingPATCH">Update offer translation</a>
     */
    public void updateOfferTranslation(String accessToken, String offerId, String language, UpdateOfferTranslationPayload payload) {
        exchangeAllegro(String.format("/sale/offers/%s/translations/%s", offerId, language), HttpMethod.PATCH, accessToken, null, payload, OfferTranslationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteManualTranslationUsingDELETE">Delete offer translation</a>
     */
    public void deleteManualTranslation(String accessToken, String offerId, String language, @Nullable String element) {
        exchangeAllegro(String.format("/sale/offers/%s/translations/%s", offerId, language), HttpMethod.DELETE, accessToken, new ElementQueryParam(element), null, OfferTranslationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoriesUsingGET">Get IDs of Allegro categories</a>
     */
    public CategoryResponse getCategories(String accessToken, @Nullable CategoryQueryParam queryParam) {
        return getAllegro("/sale/categories", accessToken, queryParam, CategoryResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoryUsingGET_1">Get a category by ID</a>
     */
    public Category getCategory(String accessToken, String categoryId) {
        return getAllegro(String.format("/sale/categories/%s", categoryId), accessToken, null, Category.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getFlatParametersUsingGET_2">Get parameters supported by a category</a>
     */
    public CategoryParametersResponse getCategoryParameters(String accessToken, String categoryId) {
        return getAllegro(String.format("/sale/categories/%s/parameters", categoryId), accessToken, null, CategoryParametersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoryParametersScheduledChangesUsingGET_1">Get planned changes in category parameters</a>
     */
    public ScheduledChangesResponse getCategoryScheduledChanges(String accessToken, CategoryScheduledChangesQueryParams queryParams) {
        return getAllegro("/sale/category-parameters-scheduled-changes", accessToken, queryParams, ScheduledChangesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getCategoryEventsUsingGET_1">Get changes in categories</a>
     */
    public CategoryEventsResponse getCategoryEvents(String accessToken, CategoryEventsQueryParams queryParams) {
        return getAllegro("/sale/category-events", accessToken, queryParams, CategoryEventsResponse.class);
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/categorySuggestionUsingGET">Get categories suggestions</a>
     */
    public MatchingCategoriesResponse categorySuggestion(String accessToken, String name) {
        return getAllegro("/sale/matching-categories", accessToken, new NameQueryParam(name), MatchingCategoriesResponse.class);
    }

}
