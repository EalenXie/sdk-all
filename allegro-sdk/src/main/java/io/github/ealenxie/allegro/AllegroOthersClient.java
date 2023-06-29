package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.others.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 12:36
 */
public class AllegroOthersClient extends AllegroClient {
    protected AllegroOthersClient(ObjectMapper mapper) {
        super(mapper);
    }

    protected AllegroOthersClient(RestOperations restOperations, ObjectMapper mapper) {
        super(restOperations, mapper);
    }


    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getUserRatingsUsingGET">Get the user's ratings</a>
     */
    public UserRatingsResponse getUserRatings(String accessToken, UserRatingsQueryParams queryParams) {
        return getAllegro("/sale/user-ratings", accessToken, queryParams, UserRatingsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/answerUserRatingUsingPUT">Answer for user's rating</a>
     */
    public Answer answerUserRating(String accessToken, String ratingId, String message) {
        return exchangeAllegro(String.format("/sale/user-ratings/%s/answer", ratingId), HttpMethod.PUT, accessToken, null, new MessagePayload(message), Answer.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/userRatingRemovalUsingPUT">Request removal of user's rating</a>
     */
    public Removal userRatingRemoval(String accessToken, String ratingId, UserRatingRemovalPayload payload) {
        return exchangeAllegro(String.format("/sale/user-ratings/%s/removal", ratingId), HttpMethod.PUT, accessToken, null, payload, Removal.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/meGET">Get basic information about user</a>
     */
    public MeResponse me(String accessToken) {
        return getAllegro("/me", accessToken, null, MeResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfAdditionalEmailsUsingGET">Get user's additional emails</a>
     */
    public AdditionalEmailResponse getListOfAdditionalEmails(String accessToken) {
        return getAllegro("/account/additional-emails", accessToken, null, AdditionalEmailResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/addAdditionalEmailUsingPOST">Add a new additional email address to user's account</a>
     */
    public AdditionalEmail addAdditionalEmail(String accessToken, String email) {
        return postAllegro("/account/additional-emails", accessToken, new EmailPayload(email), AdditionalEmail.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdditionalEmailUsingGET">Get information about a particular additional email</a>
     */
    public AdditionalEmail getAdditionalEmail(String accessToken, String emailId) {
        return getAllegro(String.format("/account/additional-emails/%s", emailId), accessToken, null, AdditionalEmail.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteAdditionalEmailUsingDELETE">Delete an additional email address</a>
     */
    public void deleteAdditionalEmail(String accessToken, String emailId) {
        exchangeAllegro(String.format("/account/additional-emails/%s", emailId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getSellerSmartClassificationGET">Get Smart! seller classification report</a>
     */
    public ClassificationResponse getSellerSmartClassification(String accessToken, String marketplaceId) {
        return getAllegro("/sale/smart", accessToken, new SmartClassificationQueryParams(marketplaceId), ClassificationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingEntries">获取账单条目列表</a>
     */
    public BillingEntriesResponse getBillingEntries(String accessToken, BillingQueryParams queryParams) {
        return getAllegro("/billing/billing-entries", accessToken, queryParams, BillingEntriesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingTypes">获取费用类型</a>
     */
    public List<BillingTypePayload> getBillingTypes(String accessToken, BillingTypeQueryParams queryParams) {
        return getAllegro("/billing/billing-types", accessToken, queryParams, new ParameterizedTypeReference<List<BillingTypePayload>>() {
        });
    }
}
