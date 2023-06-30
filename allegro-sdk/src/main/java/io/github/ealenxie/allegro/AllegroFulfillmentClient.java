package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.fulfillment.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * @author create by sch  2023/6/30 14:41
 * @version 1.0
 */
public class AllegroFulfillmentClient extends AllegroClient {

    private static final String FULFILLMENT_ADVANCE_SHIP_NOTICES = "/fulfillment/advance-ship-notices";
    private static final String FORMAT = "%s/%s";

    protected AllegroFulfillmentClient(ObjectMapper mapper) {
        super(mapper);
    }

    protected AllegroFulfillmentClient(RestOperations restOperations, ObjectMapper mapper) {
        super(restOperations, mapper);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdvanceShipNotices">Get list of Advance Ship Notices</a>
     */
    public AdvanceShipNoticesResponse getAdvanceShipNotices(String accessToken, AdvanceShipNoticeQueryParam queryParams) {
        return getAllegro(FULFILLMENT_ADVANCE_SHIP_NOTICES, accessToken, queryParams, AdvanceShipNoticesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAdvanceShipNotice">Create an Advance Ship Notice</a>
     */
    public CreateAdvanceShipNoticeResponse createAdvanceShipNotice(String accessToken, CreateAdvanceShipNoticePayload payload) {
        return postAllegro(FULFILLMENT_ADVANCE_SHIP_NOTICES, accessToken, payload, CreateAdvanceShipNoticeResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdvanceShipNotice">Get single Advance Ship Notice</a>
     */
    public AdvanceShipNotices getAdvanceShipNotice(String accessToken, String id) {
        return getAllegro(String.format(FORMAT, FULFILLMENT_ADVANCE_SHIP_NOTICES, id), accessToken, null, AdvanceShipNotices.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateAdvanceShipNotice">Update Advance Ship Notice</a>
     */
    public AdvanceShipNotices updateAdvanceShipNotice(String accessToken, String id, UpdateAdvanceShipNoticePayload payload) {
        return exchangeAllegro(String.format(FORMAT, FULFILLMENT_ADVANCE_SHIP_NOTICES, id), HttpMethod.PUT, accessToken, null, payload, AdvanceShipNotices.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteAdvanceShipNotice">Delete Advance Ship Notice</a>
     */
    public void deleteAdvanceShipNotice(String accessToken, String id) {
        exchangeAllegro(String.format(FORMAT, FULFILLMENT_ADVANCE_SHIP_NOTICES, id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdvanceShipNoticeLabels">Get list of Advance Ship Notices</a>
     */
    public byte[] getAdvanceShipNoticeLabels(String accessToken, String id, String accept) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.set("accept", accept);
        HttpEntity<Void> httpEntity = new HttpEntity<>(null, headers);
        return exchangeAllegro(String.format("%s/%s/labels", FULFILLMENT_ADVANCE_SHIP_NOTICES, id), HttpMethod.GET, null, httpEntity, byte[].class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createLabelsCommand">Create labels</a>
     */
    public LabelResponse createLabelsCommand(String accessToken, String commandId, InputPayload<AdvanceShipNoticeIdPayload> payload) {
        return exchangeAllegro(String.format("/fulfillment/create-labels-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, LabelResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getLabelCommand">Get labels</a>
     */
    public LabelResponse getLabelCommand(String accessToken, String commandId) {
        return getAllegro(String.format("/fulfillment/create-labels-commands/%s", commandId), accessToken, null, LabelResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/submitCommand">Submit the Advance Ship Notice</a>
     */
    public LabelResponse submitCommand(String accessToken, String commandId, LabelPayload payload) {
        return exchangeAllegro(String.format("/fulfillment/submit-commands/%s", commandId), HttpMethod.PUT, accessToken, null, payload, LabelResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getSubmitCommand">Get submit status</a>
     */
    public LabelResponse getSubmitCommand(String accessToken, String commandId) {
        return getAllegro(String.format("/fulfillment/submit-commands/%s", commandId), accessToken, null, LabelResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdvanceShipNoticeReceivingState">Check current state and details of Advance Ship Notice receiving</a>
     */
    public AdvanceShipNoticeReceivingResponse getAdvanceShipNoticeReceivingState(String accessToken, String id) {
        return getAllegro(String.format("/fulfillment/advance-ship-notices/%s/receiving-state", id), accessToken, null, AdvanceShipNoticeReceivingResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAvailableProducts">Get list of available products</a>
     */
    public AdvanceShipNoticeReceivingResponse getAvailableProducts(String accessToken, PageQueryParams queryParam) {
        return getAllegro("/fulfillment/available-products", accessToken, queryParam, AdvanceShipNoticeReceivingResponse.class);
    }

}