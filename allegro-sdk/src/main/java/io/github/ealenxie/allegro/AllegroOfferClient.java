package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.offer.*;
import org.springframework.web.client.RestOperations;

/**
 * @author EalenXie created on 2023/6/29 15:27
 */
public class AllegroOfferClient extends AllegroClient {
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
        return getAllegro("/sale/offers", accessToken, queryParams, OffersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferUsingGET">Get all fields of the particular offer</a>
     *
     * @deprecated deprecated by Allegro
     */
    @Deprecated
    public ParticularOfferResponse getOffer(String accessToken, String offerId) {
        return getAllegro(String.format("/sale/offers/%s", offerId), accessToken, null, ParticularOfferResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getOfferSmartClassificationGET">Get Smart! classification report of the particular offer</a>
     */
    public SmartOfferResponse getSmartOffer(String accessToken, String offerId, String marketplaceId) {
        return getAllegro(String.format("/sale/offers/%s/smart", offerId), accessToken, new MarketplaceIdQueryParams(marketplaceId), SmartOfferResponse.class);
    }

}
