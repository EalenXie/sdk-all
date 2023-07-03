package io.github.ealenxie.allegro;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.allegro.setting.*;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * @author create by sch  2023/7/3 10:21
 * @version 1.0
 */
public class AllegroSaleSettingClient extends AllegroClient {

    public static final String POLICY = "/after-sales-service-conditions/return-policies";

    public static final String IMPLIED_WARRANTIES = "/after-sales-service-conditions/implied-warranties";

    public static final String WARRANTIES = "/after-sales-service-conditions/warranties";

    public static final String FORMAT = "%s/%s";

    protected AllegroSaleSettingClient(ObjectMapper mapper) {
        super(mapper);
    }

    protected AllegroSaleSettingClient(RestOperations restOperations, ObjectMapper mapper) {
        super(restOperations, mapper);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicSellerListingUsingGET_1">Get the user's return policies</a>
     */
    public PublicSellerUsingResponse getPolicies(String accessToken, PageQueryParams queryParams) {
        return getAllegro(POLICY, accessToken, queryParams, PublicSellerUsingResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceReturnPolicyUsingPOST">Create new user's return policy</a>
     */
    public PolicyPayload createPolicy(String accessToken, CreatePolicyPayload payload) {
        return postAllegro(POLICY, accessToken, payload, PolicyPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAfterSalesServiceReturnPolicyUsingGET">Get the user's return policy</a>
     */
    public PolicyPayload getPolicyById(String accessToken, String policyId) {
        return getAllegro(String.format(FORMAT, POLICY, policyId), accessToken, null, PolicyPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateAfterSalesServiceReturnPolicyUsingPUT">Change the user's return policy</a>
     */
    public PolicyPayload updatePolicy(String accessToken, PolicyPayload payload) {
        return exchangeAllegro(String.format(FORMAT, POLICY, payload.getId()), HttpMethod.PUT, accessToken, null, payload, PolicyPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicSellerListingUsingGET">Get the user's implied warranties</a>
     */
    public ImpliedWarrantiesResponse getImpliedWarranties(String accessToken, PageQueryParams queryParams) {
        return getAllegro("/after-sales-service-conditions/implied-warranties", accessToken, queryParams, ImpliedWarrantiesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceImpliedWarrantyUsingPOST">Create new user's implied warranty</a>
     */
    public ImpliedWarrantyResponse createImpliedWarranties(String accessToken, ImpliedWarrantyPayload payload) {
        return postAllegro("/after-sales-service-conditions/implied-warranties", accessToken, payload, ImpliedWarrantyResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAfterSalesServiceImpliedWarrantyUsingGET">Get the user's implied warranty</a>
     */
    public ImpliedWarrantyResponse getImpliedWarrantyById(String accessToken, String impliedWarrantyId) {
        return getAllegro(String.format(FORMAT, IMPLIED_WARRANTIES, impliedWarrantyId), accessToken, null, ImpliedWarrantyResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateAfterSalesServiceImpliedWarrantyUsingPUT">Change the user's implied warranty</a>
     */
    public ImpliedWarrantyResponse updateImpliedWarranty(String accessToken, String impliedWarrantyId, ImpliedWarrantyPayload payload) {
        return exchangeAllegro(String.format(FORMAT, IMPLIED_WARRANTIES, impliedWarrantyId), HttpMethod.PUT, accessToken, null, payload, ImpliedWarrantyResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPublicSellerListingUsingGET_2">Get the user's warranties</a>
     */
    public WarrantiesResponse getWarranties(String accessToken, String impliedWarrantyId) {
        return getAllegro(WARRANTIES, accessToken, null, WarrantiesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceWarrantyUsingPOST">Create new user's warranty</a>
     */
    public WarrantyResponse createWarranty(String accessToken, WarrantyPayload payload) {
        return postAllegro(WARRANTIES, accessToken, payload, WarrantyResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAfterSalesServiceWarrantyUsingGET">Get the user's warranty</a>
     */
    public WarrantyResponse getWarrantyById(String accessToken, String warrantyId) {
        return getAllegro(String.format(FORMAT, WARRANTIES, warrantyId), accessToken, null, WarrantyResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateAfterSalesServiceWarrantyUsingPUT">Change the user's warranty</a>
     */
    public WarrantyResponse updateWarranty(String accessToken, String warrantyId, WarrantyPayload payload) {
        return exchangeAllegro(String.format(FORMAT, WARRANTIES, warrantyId), HttpMethod.PUT, accessToken, null, payload, WarrantyResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceConditionsAttachmentUsingPOST">Create a warranty attachment metadata</a>
     */
    public Attachment createAttachment(String accessToken, CreateAttachmentPayload payload) {
        return postAllegro("/after-sales-service-conditions/attachments", accessToken, payload, Attachment.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/uploadAfterSalesServiceConditionsAttachmentUsingPUT">Upload an warranty attachment</a>
     */
    public Attachment getAttachment(String accessToken, String attachmentId) {
        return exchangeAllegro(String.format(FORMAT, WARRANTIES, attachmentId), HttpMethod.PUT, accessToken, null, null, Attachment.class);
    }
}
