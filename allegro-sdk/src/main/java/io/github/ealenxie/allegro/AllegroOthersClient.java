package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.offer.MarketplaceIdQueryParams;
import io.github.ealenxie.allegro.others.Thread;
import io.github.ealenxie.allegro.others.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;
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
        return get("/sale/user-ratings", accessToken, queryParams, UserRatingsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/answerUserRatingUsingPUT">Answer for user's rating</a>
     */
    public Answer answerUserRating(String accessToken, String ratingId, String message) {
        return exchange(String.format("/sale/user-ratings/%s/answer", ratingId), HttpMethod.PUT, accessToken, null, new MessagePayload(message), Answer.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/userRatingRemovalUsingPUT">Request removal of user's rating</a>
     */
    public Removal userRatingRemoval(String accessToken, String ratingId, UserRatingRemovalPayload payload) {
        return exchange(String.format("/sale/user-ratings/%s/removal", ratingId), HttpMethod.PUT, accessToken, null, payload, Removal.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/meGET">Get basic information about user</a>
     */
    public MeResponse me(String accessToken) {
        return get("/me", accessToken, null, MeResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfAdditionalEmailsUsingGET">Get user's additional emails</a>
     */
    public AdditionalEmailsResponse getListOfAdditionalEmails(String accessToken) {
        return get("/account/additional-emails", accessToken, null, AdditionalEmailsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/addAdditionalEmailUsingPOST">Add a new additional email address to user's account</a>
     */
    public AdditionalEmail addAdditionalEmail(String accessToken, String email) {
        return post("/account/additional-emails", accessToken, new EmailPayload(email), AdditionalEmail.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdditionalEmailUsingGET">Get information about a particular additional email</a>
     */
    public AdditionalEmail getAdditionalEmail(String accessToken, String emailId) {
        return get(String.format("/account/additional-emails/%s", emailId), accessToken, null, AdditionalEmail.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteAdditionalEmailUsingDELETE">Delete an additional email address</a>
     */
    public void deleteAdditionalEmail(String accessToken, String emailId) {
        exchange(String.format("/account/additional-emails/%s", emailId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getSellerSmartClassificationGET">Get Smart! seller classification report</a>
     */
    public ClassificationResponse getSellerSmartClassification(String accessToken, String marketplaceId) {
        return get("/sale/smart", accessToken, new MarketplaceIdQueryParams(marketplaceId), ClassificationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/marketplacesGET">Get details for all marketplaces in allegro</a>
     */
    public MarketplacesResponse marketplaces(String accessToken) {
        return get("/marketplaces", accessToken, null, MarketplacesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/listThreadsGET">List user threads</a>
     */
    public ThreadsResponse listThreads(String accessToken, Integer limit, Integer offset) {
        return get("/messaging/threads", accessToken, new PageQueryParams(limit, offset), ThreadsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getThreadGET">Get user thread</a>
     */
    public Thread getThread(String accessToken, String threadId) {
        return get(String.format("/messaging/threads/%s", threadId), accessToken, null, Thread.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/changeReadFlagOnThreadPUT">Mark a particular thread as read</a>
     */
    public Thread changeReadFlagOnThread(String accessToken, String threadId, Boolean read) {
        return exchange(String.format("/messaging/threads/%s/read", threadId), HttpMethod.PUT, accessToken, null, new ReadPayload(read), Thread.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/newMessagePOST">Write a new message</a>
     */
    public NewMessageResponse newMessage(String accessToken, NewMessagePayload payload) {
        return post("/messaging/messages", accessToken, payload, NewMessageResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/listMessagesGET">List messages in thread</a>
     */
    public MessagesResponse listMessages(String accessToken, String threadId, ListMessageQueryParams params) {
        return get(String.format("/messaging/threads/%s/messages", threadId), accessToken, params, MessagesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/newMessageInThreadPOST">Write a new message in thread</a>
     */
    public NewMessageResponse newMessageInThread(String accessToken, String threadId, NewMessageThreadPayload payload) {
        return post(String.format("/messaging/threads/%s/messages", threadId), accessToken, payload, NewMessageResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getMessageGET">Get single message</a>
     */
    public NewMessageResponse getMessage(String accessToken, String messageId) {
        return get(String.format("/messaging/messages/%s", messageId), accessToken, null, NewMessageResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteMessageDELETE">Delete single message</a>
     */
    public void deleteMessage(String accessToken, String messageId) {
        exchange(String.format("/messaging/messages/%s", messageId), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/newAttachmentDeclarationPOST">Add attachment declaration</a>
     */
    public IdPayload newAttachmentDeclaration(String accessToken, NewAttachmentPayload payload) {
        return post("/messaging/message-attachments", accessToken, payload, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadAttachmentPUT">Upload attachment binary data</a>
     */
    public IdPayload uploadAttachment(String accessToken, String attachmentId, byte[] file) {
        return exchange(String.format("/messaging/message-attachments/%s", attachmentId), HttpMethod.PUT, accessToken, null, file, IdPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/downloadAttachmentGET">Download attachment</a>
     */
    public byte[] downloadAttachment(String accessToken, String attachmentId) {
        return get(String.format("/messaging/message-attachments/%s", attachmentId), accessToken, null, byte[].class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/placeBid">Place a bid in an auction</a>
     */
    public PlaceBidResponse placeBid(String accessToken, String offerId, AmountPayload payload) {
        return exchange(String.format("/bidding/offers/%s/bid", offerId), HttpMethod.PUT, accessToken, null, payload, PlaceBidResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBid">Get current user's bid information</a>
     */
    public PlaceBidResponse getBid(String accessToken, String offerId) {
        return get(String.format("/bidding/offers/%s/bid", offerId), accessToken, null, PlaceBidResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/searchFundraisingCampaigns">Search fundraising campaigns</a>
     */
    public CampaignsResponse searchFundraisingCampaigns(String accessToken, Integer limit, String phrase) {
        return get("/charity/fundraising-campaigns", accessToken, new CampaignsQueryParams(limit, phrase), CampaignsResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getUserSummaryUsingGET">Get any user's ratings summary</a>
     */
    public UserSummaryResponse getUserSummary(String accessToken, String userId) {
        return get(String.format("/users/%s/ratings-summary", userId), accessToken, null, UserSummaryResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListing">Search offers</a>
     */
    public OffersResponse getListing(String accessToken, OffersQueryParams queryParams) {
        return get("/offers/listing", accessToken, queryParams, OffersResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingEntries">获取账单条目列表</a>
     */
    public BillingEntriesResponse getBillingEntries(String accessToken, BillingQueryParams queryParams) {
        return get("/billing/billing-entries", accessToken, queryParams, BillingEntriesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getBillingTypes">获取费用类型</a>
     */
    public List<BillingTypePayload> getBillingTypes(String accessToken, @Nullable String acceptLanguage) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.set("Accept-Language", ObjectUtils.isEmpty(acceptLanguage) ? "en-US" : acceptLanguage);
        return exchange("/billing/billing-types", HttpMethod.GET, null, new HttpEntity<>(null, headers), new ParameterizedTypeReference<List<BillingTypePayload>>() {
        });
    }
}
