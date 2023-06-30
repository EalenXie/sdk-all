package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.offer.*;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * @author EalenXie created on 2023/6/29 15:27
 */
public class AllegroOfferClient extends AllegroClient {


    private static final String SALE_OFFERS = "/sale/offers";

    private static final String SALE_OFFER = SALE_OFFERS + "/%s";

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
    public ParticularOfferResponse getOffer(String accessToken, String offerId) {
        return getAllegro(String.format(SALE_OFFER, offerId), accessToken, null, ParticularOfferResponse.class);
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
    public TaskCountResponse changePublicationStatus(String accessToken, String commandId, ChangePublicationStatusPayload payload) {
        return exchangeAllegro(String.format("/sale/offer-publication-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicationReportUsingGET">Publish command summary</a>
     */
    public TaskCountResponse getPublicationReport(String accessToken, String commandId) {
        return getAllegro(String.format("/sale/offer-publication-commands/%s", commandId), accessToken, null, TaskCountResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicationTasksUsingGET">Publish command detailed report</a>
     */
    public PublicationTasksResponse getPublicationTasks(String accessToken, String commandId) {
        return getAllegro(String.format("/sale/offer-publication-commands/%s/tasks", commandId), accessToken, null, PublicationTasksResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAvailableOfferPromotionPackages">Get all available offer promotion packages</a>
     */
    public OfferPromotionPackagesResponse getAvailableOfferPromotionPackages(String accessToken) {
        return getAllegro("/sale/offer-promotion-packages", accessToken, null, OfferPromotionPackagesResponse.class);
    }
}
