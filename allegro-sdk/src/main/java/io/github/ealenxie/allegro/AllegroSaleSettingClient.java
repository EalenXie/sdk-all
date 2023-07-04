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
    public static final String SALE_SHIPPING_RATES = "/sale/shipping-rates";
    public static final String SALE_OFFER_ADDITIONAL_SERVICES_GROUPS = "/sale/offer-additional-services/groups";
    public static final String SALE_SIZE_TABLES = "/sale/size-tables";
    public static final String POINTS_OF_SERVICE = "/points-of-service";

    public static final String FORMAT = "%s/%s";

    protected AllegroSaleSettingClient(ObjectMapper mapper) {
        super(mapper);
    }

    protected AllegroSaleSettingClient(RestOperations restOperations, ObjectMapper mapper) {
        super(restOperations, mapper);
    }

    /*------------------------------------ After sale services -----------------------------------------------------*/

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
        return getAllegro(IMPLIED_WARRANTIES, accessToken, queryParams, ImpliedWarrantiesResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceImpliedWarrantyUsingPOST">Create new user's implied warranty</a>
     */
    public ImpliedWarrantyResponse createImpliedWarranties(String accessToken, ImpliedWarrantyPayload payload) {
        return postAllegro(IMPLIED_WARRANTIES, accessToken, payload, ImpliedWarrantyResponse.class);
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
    public WarrantiesResponse getWarranties(String accessToken, PageQueryParams queryParams) {
        return getAllegro(WARRANTIES, accessToken, queryParams, WarrantiesResponse.class);
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

    /*------------------------------------ Delivery -----------------------------------------------------*/

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfShippingRatestUsingGET">Get the user's shipping rates</a>
     */
    public ShippingRateResponse getSaleShippingRates(String accessToken) {
        return getAllegro(SALE_SHIPPING_RATES, accessToken, null, ShippingRateResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createShippingRatesSetUsingPOST">Create a new shipping rates set</a>
     */
    public ShippingRatePayload createShippingRates(String accessToken, ShippingRatePayload payload) {
        return postAllegro(SALE_SHIPPING_RATES, accessToken, payload, ShippingRatePayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getShippingRatesSetUsingGET">Get the details of a shipping rates set</a>
     */
    public ShippingRatePayload getShippingRateById(String accessToken, String id) {
        return getAllegro(String.format(FORMAT, SALE_SHIPPING_RATES, id), accessToken, null, ShippingRatePayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/modifyShippingRatesSetUsingPUT">Edit a user's shipping rates set</a>
     */
    public ShippingRatePayload updateShippingRates(String accessToken, String id, ShippingRatePayload payload) {
        return exchangeAllegro(String.format(FORMAT, SALE_SHIPPING_RATES, id), HttpMethod.PUT, accessToken, null, payload, ShippingRatePayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getSaleDeliverySettings">Get the user's delivery settings</a>
     */
    public SaleDeliveryPayload getSaleDeliverySettings(String accessToken, MarketplaceIdQueryParams queryParams) {
        return getAllegro("/sale/delivery-settings", accessToken, queryParams, SaleDeliveryPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/putSaleDeliverySettings">Modify the user's delivery settings</a>
     */
    public SaleDeliveryPayload updateSaleDeliverySettings(String accessToken, SaleDeliveryPayload payload) {
        return exchangeAllegro("/sale/delivery-settings", HttpMethod.PUT, accessToken, null, payload, SaleDeliveryPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfDeliveryMethodsUsingGET">Get the list of delivery methods</a>
     */
    public DeliverMethodResponse getDeliveryMethods(String accessToken, MarketplaceQueryParams queryParams) {
        return getAllegro("/sale/delivery-methods", accessToken, queryParams, DeliverMethodResponse.class);
    }

    /*------------------------------------ Additional services -----------------------------------------------------*/

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createAdditionalServicesGroupUsingPOST">Create additional services group</a>
     */
    public AdditionalServiceGroup createAdditionalServiceGroups(String accessToken, AdditionalServicePayload payload) {
        return postAllegro(SALE_OFFER_ADDITIONAL_SERVICES_GROUPS, accessToken, payload, AdditionalServiceGroup.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfAdditionalServicesGroupsUsingGET"Get the user's additional services groups</a>
     */
    public AdditionalServiceResponse getAdditionalServiceGroups(String accessToken, PageQueryParams queryParams) {
        return getAllegro(SALE_OFFER_ADDITIONAL_SERVICES_GROUPS, accessToken, queryParams, AdditionalServiceResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getListOfAdditionalServicesDefinitionsCategoriesUsingGET">Get the additional services definitions by categories</a>
     */
    public CategoryResponse getCategories(String accessToken) {
        return getAllegro("/sale/offer-additional-services/categories", accessToken, null, CategoryResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdditionalServicesGroupUsingGET">Get the details of an additional services group</a>
     */
    public AdditionalServiceGroup getAdditionalServiceGroupById(String accessToken, String groupId) {
        return getAllegro(String.format(FORMAT, SALE_OFFER_ADDITIONAL_SERVICES_GROUPS, groupId), accessToken, null, AdditionalServiceGroup.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/modifyAdditionalServicesGroupUsingPUT">Modify an additional services group</a>
     */
    public AdditionalServiceGroup updateAdditionalServiceGroups(String accessToken, String groupId, AdditionalServicePayload payload) {
        return exchangeAllegro(String.format(FORMAT, SALE_OFFER_ADDITIONAL_SERVICES_GROUPS, groupId), HttpMethod.PUT, accessToken, null, payload, AdditionalServiceGroup.class);
    }

    /*------------------------------------ Additional services translations -----------------------------------------------------*/

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getAdditionalServiceGroupTranslations">Get translations for specified group</a>
     */
    public TranslationResponse getTranslations(String accessToken, String groupId, LanguageQueryParams queryParams) {
        return getAllegro(String.format("/sale/offer-additional-services/groups/%s/translations", groupId), accessToken, queryParams, TranslationResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/updateAdditionalServiceGroupTranslation">Create/Update translations for specified group and language</a>
     */
    public Translations createOrUpdateTranslations(String accessToken, String groupId, String language, AdditionalServices payload) {
        return exchangeAllegro(String.format("/sale/offer-additional-services/groups/%s/translations/%s", groupId, language), HttpMethod.PATCH, accessToken, null, payload, Translations.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deleteAdditionalServiceGroupTranslation">Delete a translation for a specified group and language</a>
     */
    public void deleteTransaction(String accessToken, String groupId, String language) {
        exchangeAllegro(String.format("/sale/offer-additional-services/groups/%s/translations/%s", groupId, language), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /*------------------------------------ Size tables -----------------------------------------------------*/

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getTableUsingGET">Get a size table</a>
     */
    public TablePayload getTableUsing(String accessToken, String tableId) {
        return getAllegro(String.format(FORMAT, SALE_SIZE_TABLES, tableId), accessToken, null, TablePayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/modifyTableUsingPUT">Update a size table</a>
     */
    public TablePayload modifyTableUsing(String accessToken, String tableId, TablePayload payload) {
        return exchangeAllegro(String.format(FORMAT, SALE_SIZE_TABLES, tableId), HttpMethod.PUT, accessToken, null, payload, TablePayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getTablesUsingGET">Update a size table</a>
     */
    public TableResponse getTablesUsing(String accessToken, String tableId, TablePayload payload) {
        return getAllegro(String.format(FORMAT, SALE_SIZE_TABLES, tableId), accessToken, null, TableResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createTableUsingPOST">Create a size table</a>
     */
    public TableResponse createTablesUsing(String accessToken, TablePayload payload) {
        return postAllegro(SALE_SIZE_TABLES, accessToken, payload, TableResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getTablesTemplatesUsingGET">Get the size tables templates</a>
     */
    public TemplatePayload getTablesTemplatesUsing(String accessToken) {
        return getAllegro("/sale/size-tables-templates", accessToken, null, TemplatePayload.class);
    }

    /*------------------------------------ Points of service -----------------------------------------------------*/

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/createPOSUsingPOST">Create a point of service</a>
     */
    public PointPayload createPoint(String accessToken, PointPayload payload) {
        return postAllegro(POINTS_OF_SERVICE, accessToken, payload, PointPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPOSListUsingGET">Get the user's points of service</a>
     */
    public PointResponse getPoints(String accessToken, SellerQueryParams queryParams) {
        return getAllegro(POINTS_OF_SERVICE, accessToken, queryParams, PointResponse.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/getPOSDataUsingGET">Get the details of a point of service</a>
     */
    public PointPayload getPointById(String accessToken, String id) {
        return getAllegro(String.format(FORMAT, POINTS_OF_SERVICE, id), accessToken, null, PointPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/modifyPOSUsingPUT">Modify a point of service</a>
     */
    public PointPayload modifyPoint(String accessToken, String id, PointPayload payload) {
        return exchangeAllegro(String.format(FORMAT, POINTS_OF_SERVICE, id), HttpMethod.PUT, accessToken, null, payload, PointPayload.class);
    }

    /**
     * <a href="https://developer.allegro.pl/documentation/#operation/deletePOSUsingDELETE">Delete a point of service</a>
     */
    public DeletePointResponse deletePointById(String accessToken, String id) {
        return exchangeAllegro(String.format(FORMAT, POINTS_OF_SERVICE, id), HttpMethod.DELETE, accessToken, null, null, DeletePointResponse.class);
    }
}
