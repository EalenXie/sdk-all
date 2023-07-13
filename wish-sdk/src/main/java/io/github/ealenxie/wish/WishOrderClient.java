package io.github.ealenxie.wish;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.wish.brands.Brand;
import io.github.ealenxie.wish.brands.BrandsQueryParams;
import io.github.ealenxie.wish.bulkproducts.ProductBulk;
import io.github.ealenxie.wish.bulkproducts.ProductUpdatePayload;
import io.github.ealenxie.wish.currencies.Currency;
import io.github.ealenxie.wish.euproductcompliance.*;
import io.github.ealenxie.wish.fbs.FbsRecommendation;
import io.github.ealenxie.wish.fbs.FbsRecommendationsQueryParams;
import io.github.ealenxie.wish.fbs.FbsVariation;
import io.github.ealenxie.wish.franceerpcompliance.*;
import io.github.ealenxie.wish.germanyerpcompliance.*;
import io.github.ealenxie.wish.merchant.*;
import io.github.ealenxie.wish.orders.*;
import io.github.ealenxie.wish.payments.EarlyPayment;
import io.github.ealenxie.wish.payments.PaymentInvoicesQueryParams;
import io.github.ealenxie.wish.payments.PaymentInvoicesResponse;
import io.github.ealenxie.wish.penalties.CountPayload;
import io.github.ealenxie.wish.penalties.PenaltiesCountQueryParams;
import io.github.ealenxie.wish.penalties.PenaltiesQueryParams;
import io.github.ealenxie.wish.penalties.Penalty;
import io.github.ealenxie.wish.price.*;
import io.github.ealenxie.wish.promotionplatform.*;
import io.github.ealenxie.wish.productboost.*;
import io.github.ealenxie.wish.products.*;
import io.github.ealenxie.wish.rating.ProductRatePayload;
import io.github.ealenxie.wish.rating.RateQueryParams;
import io.github.ealenxie.wish.taxonomy.AttributeResponse;
import io.github.ealenxie.wish.taxonomy.CategoryIdPayload;
import io.github.ealenxie.wish.taxonomy.CategoryPayload;
import io.github.ealenxie.wish.tickets.MessagePayload;
import io.github.ealenxie.wish.tickets.ReplyTicketResponse;
import io.github.ealenxie.wish.tickets.TicketPayload;
import io.github.ealenxie.wish.tickets.TicketQueryParams;
import io.github.ealenxie.wish.variation.ColorQueryParams;
import io.github.ealenxie.wish.variation.VariationPayload;
import io.github.ealenxie.wish.variation.VariationResponse;
import io.github.ealenxie.wish.webhook.CreateSubscriptionQueryParams;
import io.github.ealenxie.wish.webhook.SubscriptionPayload;
import io.github.ealenxie.wish.webhook.SubscriptionResponse;
import io.github.ealenxie.wish.webhook.TopicPayload;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/23 9:51
 * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#tag/Orders">wish 商户平台</a>
 */
public class WishOrderClient extends WishClient {

    public WishOrderClient() {
        this(new RestTemplate());
    }

    public WishOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public WishOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(objectMapper, restOperations);
    }

    private static final String EU_PRODUCT_COMPLIANCE_RESPONSIBLE_PERSON_URL = "/api/v3/eu_product_compliance/responsible_person/%s";
    private static final String FRANCE_EPR_COMPLIANCE_UNIQUE_ID_NUMBER_URL = "/api/v3/france_epr_compliance/unique_identification_number/%s";
    private static final String GERMANY_EPR_COMPLIANCE_EPR_REGISTRATION_NUMBER_URL = "/api/v3/germany_epr_compliance/epr_registration_number/%s";
    private static final String WEBHOOK_SUBSCRIPTIONS_URL = "/api/v3/webhook/subscriptions/%s";
    private static final String PRODUCTS_URL = "/api/v3/products/%s";


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listBrands">Get a list of brands from a particular ID range</a>
     */
    public WishData<List<Brand>> listBrands(String accessToken, BrandsQueryParams queryParams) {
        return get("/api/v3/brands", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<Brand>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProducts">Get products</a>
     */
    public WishData<ProductBulk> getProducts(String accessToken) {
        return post("/api/v3/brands/products/bulk_get", accessToken, null, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getUpdateProductsStatus">Get the update products job status</a>
     */
    public WishData<ProductBulk> getUpdateProductsStatus(String accessToken, String id) {
        return get(String.format("/api/v3/brands/products/bulk_update/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateProducts">Update products</a>
     */
    public WishData<ProductBulk> updateProducts(String accessToken, List<ProductUpdatePayload> payload) {
        return post("/api/v3/products/bulk_update", accessToken, payload, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGetProductsStatus">Get the get products job status</a>
     */
    public WishData<ProductBulk> getGetProductsStatus(String accessToken, String id) {
        return get(String.format("/api/v3/products/bulk_get/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCurrencies">Get supported currency list</a>
     */
    public WishData<List<Currency>> getCurrencies(String accessToken) {
        return get("/api/v3/currencies", accessToken, null, new ParameterizedTypeReference<WishData<List<Currency>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUResponsiblePerson">Update an EU Responsible Person</a>
     */
    public WishData<ResponsiblePersonPayload> updateEuResponsiblePerson(String accessToken, String id, ResponsiblePersonRequestPayload payload) {
        return exchange(String.format(EU_PRODUCT_COMPLIANCE_RESPONSIBLE_PERSON_URL, id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<ResponsiblePersonPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUResponsiblePerson">Get an EU Responsible Person</a>
     */
    public WishData<ResponsiblePersonPayload> getEuResponsiblePerson(String accessToken, String id) {
        return get(String.format(EU_PRODUCT_COMPLIANCE_RESPONSIBLE_PERSON_URL, id), accessToken, null, new ParameterizedTypeReference<WishData<ResponsiblePersonPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteEUResponsiblePerson">Delete an EU Responsible Person</a>
     */
    public void deleteEuResponsiblePerson(String accessToken, String id) {
        exchange(String.format(EU_PRODUCT_COMPLIANCE_RESPONSIBLE_PERSON_URL, id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/BulkUpdateProducts">Bulk Update EU Product Compliance Status</a>
     */
    public WishData<ProductsBulkUpdateResponse> bulkUpdateProducts(String accessToken, ProductsBulkUpdateQueryParams queryParams) {
        return exchange("/api/v3/eu_product_compliance/products/bulk_update", HttpMethod.POST, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<ProductsBulkUpdateResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetBulkUpdateStatus">Get Bulk Update Job Status</a>
     */
    public WishData<ProductsBulkUpdateResponse> getBulkUpdateStatus(String accessToken, String id) {
        return get(String.format("/api/v3/eu_product_compliance/products/bulk_update/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<ProductsBulkUpdateResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUProductComplianceStatus">Update EU Product Compliance Status</a>
     */
    public WishData<List<ComplianceStatusEuResponse>> updateEuComplianceStatus(String accessToken, List<ComplianceStatusEuUpdatePayload> payload) {
        return exchange("/api/v3/eu_product_compliance/products", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<List<ComplianceStatusEuResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUProductComplianceStatus">Get EU Product Compliance Status</a>
     */
    public WishData<List<ComplianceStatusEuResponse>> getEuComplianceStatus(String accessToken, ComplianceStatusEuQueryParams queryParams) {
        return get("/api/v3/eu_product_compliance/products", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ComplianceStatusEuResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createEUResponsiblePerson">Update an EU Responsible Person</a>
     */
    public WishData<ResponsiblePersonPayload> createEuResponsiblePerson(String accessToken, ResponsiblePersonRequestPayload payload) {
        return exchange("/api/v3/eu_product_compliance/responsible_person", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<ResponsiblePersonPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listEUResponsiblePerson">List EU Responsible Persons</a>
     */
    public WishData<List<ResponsiblePersonPayload>> listEuResponsiblePerson(String accessToken, ResponsiblePersonQueryParams queryParams) {
        return get("/api/v3/eu_product_compliance/responsible_person", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ResponsiblePersonPayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsVariation">Get FBS related data for a variation</a>
     */
    public WishData<FbsVariation> fbsVariation(String accessToken, String id) {
        return get(String.format("/api/v3/fbs/variations/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<FbsVariation>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsRecommendations">Get FBS inbound shipping recommendations</a>
     */
    public WishData<List<FbsRecommendation>> fbsRecommendations(String accessToken, FbsRecommendationsQueryParams queryParams) {
        return get("/api/v3/fbs/recommendations", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<FbsRecommendation>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateFranceEPRProductComplianceStatus">Bulk update France EPR Product Compliance Status</a>
     */
    public WishData<List<ComplianceStatusFraResponse>> updateFraComplianceStatus(String accessToken, List<ComplianceStatusFraUpdatePayload> payload) {
        return exchange("/api/v3/france_epr_compliance/compliance_status", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<List<ComplianceStatusFraResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getFranceEPRProductComplianceStatus">Get France EPR Product Compliance Status</a>
     */
    public WishData<List<ComplianceStatusFraResponse>> getFraComplianceStatus(String accessToken, ComplianceStatusFraQueryParams queryParams) {
        return get("/api/v3/france_epr_compliance/compliance_status", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ComplianceStatusFraResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createFranceProductUniqueIdentificationNumber">Create a France Product Unique Identification Number</a>
     */
    public WishData<UniqueIdNumberFraResponse> createFraUniqueIdNumber(String accessToken, UniqueIdNumberFraCreatePayload payload) {
        return post("/api/v3/france_epr_compliance/unique_identification_number", accessToken, payload, new ParameterizedTypeReference<WishData<UniqueIdNumberFraResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listFranceProductUniqueIdentificationNumber">List France Product Unique Identification Numbers</a>
     */
    public WishData<List<UniqueIdNumberFraResponse>> listFraUniqueIdNumber(String accessToken) {
        return get("/api/v3/france_epr_compliance/unique_identification_number", accessToken, null, new ParameterizedTypeReference<WishData<List<UniqueIdNumberFraResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateFranceProductUniqueIdentificationNumber">Update a France Product Unique Identification Number</a>
     */
    public WishData<UniqueIdNumberFraResponse> updateFraUniqueIdNumber(String accessToken, String id, UniqueIdNumberFraUpdatePayload payload) {
        return exchange(String.format(FRANCE_EPR_COMPLIANCE_UNIQUE_ID_NUMBER_URL, id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<UniqueIdNumberFraResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getFranceProductUniqueIdentificationNumber">Get a France Product Unique Identification Number</a>
     */
    public WishData<UniqueIdNumberFraResponse> getFraUniqueIdNumber(String accessToken, String id) {
        return get(String.format(FRANCE_EPR_COMPLIANCE_UNIQUE_ID_NUMBER_URL, id), accessToken, null, new ParameterizedTypeReference<WishData<UniqueIdNumberFraResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteFranceProductUniqueIdentificationNumber">Delete a France Product Unique Identification Number</a>
     */
    public void deleteFraUniqueIdNumber(String accessToken, String id) {
        exchange(String.format(FRANCE_EPR_COMPLIANCE_UNIQUE_ID_NUMBER_URL, id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createGermanyProductEprRegistrationNumber">Create a Germany Product EPR Registration Number</a>
     */
    public WishData<RegistrationNumberGerResponse> createGerRegistrationNumber(String accessToken, RegistrationNumberGerCreatePayload payload) {
        return post("/api/v3/germany_epr_compliance/epr_registration_number", accessToken, payload, new ParameterizedTypeReference<WishData<RegistrationNumberGerResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listGermanyProductEprRegistrationNumbers">List Germany EPR Registration Numbers</a>
     */
    public WishData<List<RegistrationNumberGerResponse>> listGerRegistrationNumbers(String accessToken) {
        return get("/api/v3/germany_epr_compliance/epr_registration_number", accessToken, null, new ParameterizedTypeReference<WishData<List<RegistrationNumberGerResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateGermanyEPRProductComplianceStatus">Bulk update Germany EPR Product Compliance Status</a>
     */
    public WishData<List<ComplianceStatusGerResponse>> updateGerComplianceStatus(String accessToken, List<ComplianceStatusGerUpdatePayload> payload) {
        return post("/api/v3/germany_epr_compliance/compliance_status", accessToken, payload, new ParameterizedTypeReference<WishData<List<ComplianceStatusGerResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGermanyEPRProductComplianceStatus">Get Germany EPR Product Compliance Status</a>
     */
    public WishData<List<ComplianceStatusGerResponse>> getGerComplianceStatus(String accessToken, ComplianceStatusGerQueryParams queryParams) {
        return get("/api/v3/germany_epr_compliance/compliance_status", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ComplianceStatusGerResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateGermanyProductEprRegistrationNumber">Update a Germany Product EPR Registration Number</a>
     */
    public WishData<RegistrationNumberGerResponse> updateGerRegistrationNumber(String accessToken, String id, RegistrationNumberGerUpdatePayload payload) {
        return exchange(String.format(GERMANY_EPR_COMPLIANCE_EPR_REGISTRATION_NUMBER_URL, id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<RegistrationNumberGerResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGermanyProductEprRegistrationNumber">Get a Germany Product EPR Registration Number</a>
     */
    public WishData<RegistrationNumberGerResponse> getGerRegistrationNumber(String accessToken, String id) {
        return get(String.format(GERMANY_EPR_COMPLIANCE_EPR_REGISTRATION_NUMBER_URL, id), accessToken, null, new ParameterizedTypeReference<WishData<RegistrationNumberGerResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteGermanyProductEprRegistrationNumber">Delete a Germany Product EPR Registration Number</a>
     */
    public void deleteGerRegistrationNumber(String accessToken, String id) {
        exchange(String.format(GERMANY_EPR_COMPLIANCE_EPR_REGISTRATION_NUMBER_URL, id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCurrencySettings">Get merchant currency settings</a>
     */
    public WishData<CurrencySettingsResponse> getCurrencySettings(String accessToken) {
        return get("/api/v3/merchant/currency_settings", accessToken, null, new ParameterizedTypeReference<WishData<CurrencySettingsResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateWarehouse">Update warehouse information</a>
     */
    public WishData<WarehouseResponse> updateWarehouse(String accessToken, String id, WarehouseUpdatePayload payload) {

        return post(String.format("/api/v3/merchant/warehouses/%s", id), accessToken, payload, new ParameterizedTypeReference<WishData<WarehouseResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getSettings">Get merchant settings</a>
     */
    public WishData<SettingsResponse> getSettings(String accessToken) {
        return get("/api/v3/merchant/settings", accessToken, null, new ParameterizedTypeReference<WishData<SettingsResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createWarehouse">Create a warehouse</a>
     */
    public WishData<WarehouseResponse> createWarehouse(String accessToken, WarehousePayload payload) {
        return post("/api/v3/merchant/warehouses", accessToken, payload, new ParameterizedTypeReference<WishData<WarehouseResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listWarehouses">Create a warehouse</a>
     */
    public WishData<List<WarehouseResponse>> listWarehouses(String accessToken) {
        return get("/api/v3/merchant/warehouses", accessToken, null, new ParameterizedTypeReference<WishData<List<WarehouseResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateShippingSettings">Update shipping settings</a>
     */
    public WishData<List<ShippingSettingPayload>> shippingSettings(String accessToken, List<ShippingSettingPayload> payload) {
        return exchange("/api/v3/merchant/shipping_settings", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<List<ShippingSettingPayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listShippingSettings">Get shipping settings</a>
     */
    public WishData<List<ShippingSettingPayload>> listShippingSettings(String accessToken) {
        return get("/api/v3/merchant/shipping_settings", accessToken, null, new ParameterizedTypeReference<WishData<List<ShippingSettingPayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getMerchantAccountDetail">Get merchant account details</a>
     */
    public WishData<MerchantAccountDetail> getMerchantAccountDetail(String accessToken) {
        return get("/api/v3/merchant/account_details", accessToken, null, new ParameterizedTypeReference<WishData<MerchantAccountDetail>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers">Get accepted shipping carriers</a>
     */
    public WishData<List<NamePayload>> shippingCarriers(String accessToken, ShippingCarriersQueryParams queryParams) {
        return get("/api/v3/shipping_carriers", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<NamePayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders">Batch download orders</a>
     */
    public WishData<WishDownloadJob> downloadOrders(String accessToken, OrdersQueryParams queryParams) {
        return exchange("/api/v3/bulk_get", HttpMethod.POST, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<WishDownloadJob>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getOrderDownloadJob">Get batch download job status</a>
     */
    public WishData<WishDownloadJob> getOrderDownloadJob(String accessToken, String jobId) {
        return get(String.format("/api/v3/bulk_get/%s", jobId), accessToken, null, new ParameterizedTypeReference<WishData<WishDownloadJob>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders">List orders</a>
     */
    public WishData<List<WishOrder>> getMultipleOrders(String accessToken, OrdersQueryParams queryParams) {
        return get("/api/v3/orders", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<WishOrder>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder">Ship or update tracking</a>
     */
    public WishData<WishOrder> shipOrder(String accessToken, String orderId, TrackingQueryParams queryParams) {
        return exchange(String.format("/api/v3/orders/%s/tracking", orderId), HttpMethod.PUT, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons">Get valid refund reasons</a>
     */
    public WishData<List<String>> refundReasons(String accessToken, String orderId) {
        return get(String.format("/api/v3/orders/%s/refund_reasons", orderId), accessToken, null, new ParameterizedTypeReference<WishData<List<String>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/RefundOrder">Refund/Cancel an order</a>
     */
    public WishData<WishOrder> refund(String accessToken, String orderId, RefundPayload payload) {
        return exchange(String.format("/api/v3/orders/%s/refund", orderId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder">Update an LTL order</a>
     */
    public WishData<WishOrder> updateOrder(String accessToken, String orderId, UpdateLtlPayload payload) {
        return exchange(String.format("/api/v3/orders/%s", orderId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder">Get an order</a>
     */
    public WishData<WishOrder> getOrder(String accessToken, String orderId) {
        return get(String.format("/api/v3/orders/%s", orderId), accessToken, null, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress">Modify shipping address</a>
     */
    public WishData<WishOrder> modifyAddress(String accessToken, String orderId, ModifyAddressPayload payload) {
        return exchange(String.format("/api/v3/orders/%s/address", orderId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadPaymentInvoices">Batch download invoices</a>
     */
    public WishData<PaymentInvoicesResponse> downloadPaymentInvoices(String accessToken, PaymentInvoicesQueryParams queryParams) {
        return exchange("/api/v3/payments/invoices/bulk_get", HttpMethod.POST, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<PaymentInvoicesResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPaymentInvoicesDownloadJob">Get batch invoice download job status</a>
     */
    public WishData<PaymentInvoicesResponse> getPaymentInvoices(String accessToken, String id) {
        return get(String.format("/api/v3/payments/invoices/bulk_get/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<PaymentInvoicesResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEarlyPayment">Get merchant early payment info</a>
     */
    public WishData<EarlyPayment> getEarlyPayment(String accessToken) {
        return get("/api/v3/payments/early_payment", accessToken, null, new ParameterizedTypeReference<WishData<EarlyPayment>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetPenalty">Get a penalty by ID</a>
     */
    public WishData<Penalty> getPenalty(String accessToken, String id) {
        return get(String.format("/api/v3/penalties/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<Penalty>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/CountPenalties">Count number of penalties</a>
     */
    public WishData<CountPayload> penaltiesCount(String accessToken, PenaltiesCountQueryParams queryParams) {
        return get("/api/v3/penalties/count", accessToken, queryParams, new ParameterizedTypeReference<WishData<CountPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ListPenalties">Retrieve a list of penalties</a>
     */
    public WishData<List<Penalty>> listPenalties(String accessToken, PenaltiesQueryParams queryParams) {
        return get("/api/v3/penalties", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<Penalty>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getKeywords">Get information for the given keywords or keywords that match the query</a>
     */
    public WishData<List<KeywordPayload>> getKeywords(String accessToken, KeywordsQueryParams queryParams) {
        return get("/api/v3/product_boost/keywords", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<KeywordPayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createCampaign">Get information for the given keywords or keywords that match the query</a>
     */
    public WishData<CampaignResponse> createCampaign(String accessToken, CampaignCreatePayload payload) {
        return post("/api/v3/product_boost/campaigns", accessToken, payload, new ParameterizedTypeReference<WishData<CampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listCampaigns">List ProductBoost campaigns</a>
     */
    public WishData<List<CampaignResponse>> listCampaigns(String accessToken, CampaignsQueryParams queryParams) {
        return get("/api/v3/product_boost/campaigns", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<CampaignResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ListProductFeedback">List products' feedback in a ProductBoost campaign</a>
     */
    public WishData<List<ProductFeedback>> listProductFeedback(String accessToken, String id, ProductFeedbackQueryParams queryParams) {
        return get(String.format("/api/v3/product_boost/campaigns/%s/product_feedback", id), accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ProductFeedback>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getBudget">Get the ProductBoost budget breakdown</a>
     */
    public WishData<Budget> getBudget(String accessToken, BudgetQueryParams queryParams) {
        return get("/api/v3/product_boost/budget", accessToken, queryParams, new ParameterizedTypeReference<WishData<Budget>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateCampaign">Update a ProductBoost campaign</a>
     */
    public WishData<CampaignResponse> updateCampaign(String accessToken, String id, CampaignUpdatePayload payload) {
        return exchange(String.format("/api/v3/product_boost/campaigns/%s", id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<CampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCampaign">Get a single ProductBoost campaign</a>
     */
    public WishData<CampaignResponse> getCampaign(String accessToken, String id) {
        return get(String.format("/api/v3/product_boost/campaigns/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<CampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listCampaignMetrics">Obtain campaign metrics</a>
     */
    public WishData<CampaignMetrics> listCampaignMetrics(String accessToken, String id, CampaignMetricsQueryParams queryParams) {
        return get(String.format("/api/v3/product_boost/campaigns/%s/metrics", id), accessToken, queryParams, new ParameterizedTypeReference<WishData<CampaignMetrics>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listBalanceUpdates">List ProductBoost account balance updates</a>
     */
    public WishData<List<BalanceUpdate>> listBalanceUpdates(String accessToken, BalanceUpdatesQueryParams queryParams) {
        return get("/api/v3/product_boost/balance_updates", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<BalanceUpdate>>>() {
        });
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPromotionsEligibleProducts">Get eligible products</a>
     */
    public WishData<EligibleProductPayload> getPromotionsEligibleProducts(String accessToken, EligibleProductQueryParams queryParams) {
        return get("/api/v3/promotions/eligible_products", accessToken, queryParams, new ParameterizedTypeReference<WishData<EligibleProductPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/cancelPromotionsCampaign">Cancel a promotion campaign</a>
     */
    public WishData<PromotionCampaignResponse> cancelPromotionsCampaign(String accessToken, String id, CancelPromotionPayload payload) {
        return exchange(String.format("/api/v3/promotions/campaigns/%s/cancel", id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<PromotionCampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createPromotionsCampaign">Create a promotion campaign</a>
     */
    public WishData<PromotionCampaignResponse> createPromotionsCampaign(String accessToken, CreatePromotionCampaignPayload payload) {
        return post("/api/v3/promotions/campaigns", accessToken, payload, new ParameterizedTypeReference<WishData<PromotionCampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listPromotionsCampaigns">List promotion campaigns</a>
     */
    public WishData<PromotionCampaignResponse> getPromotionsCampaigns(String accessToken, PromotionCampaignQueryParams queryParams) {
        return get("/api/v3/promotions/campaigns", accessToken, queryParams, new ParameterizedTypeReference<WishData<PromotionCampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updatePromotionsCampaign">Update a promotion campaign</a>
     */
    public WishData<PromotionCampaignResponse> updatePromotionsCampaign(String accessToken, String id, UpdatePromotionCampaignPayload payload) {
        return exchange(String.format("/api/v3/promotions/campaigns/%s", id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<PromotionCampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPromotionsCampaign">Get a single promotion campaign</a>
     */
    public WishData<PromotionCampaignResponse> getPromotionsCampaign(String accessToken, String id, RateQueryParams queryParams) {
        return get(String.format("/api/v3/promotions/campaigns/%s", id), accessToken, queryParams, new ParameterizedTypeReference<WishData<PromotionCampaignResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/FetchProductRatings">Get eligible products count</a>
     */
    public WishData<EligibleProductCountPayload> getPromotionsEligibleProductsCount(String accessToken, RateQueryParams queryParams) {
        return get("/api/v3/promotions/eligible_products/count", accessToken, queryParams, new ParameterizedTypeReference<WishData<EligibleProductCountPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listProductUpdateRequests">List product create or update requests</a>
     */
    public WishData<List<ProductUpdateRequest>> listProductUpdateRequests(String accessToken, ProductUpdateRequestsQueryParams queryParams) {
        return get("/api/v3/products/requests", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ProductUpdateRequest>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/enableDisableCalculatedShipping">Enable/disable Calculated Shipping for the product</a>
     */
    public WishData<EnablePayload> calculatedShipping(String accessToken, String id, ProductUpdateRequestsQueryParams queryParams) {
        return get(String.format("/api/v3/products/%s/calculated_shipping", id), accessToken, queryParams, new ParameterizedTypeReference<WishData<EnablePayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProductUpdateRequest">Get a product create or update request</a>
     */
    public WishData<ProductUpdateRequest> getProductUpdateRequest(String accessToken, String id) {
        return get(String.format("/api/v3/products/requests/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<ProductUpdateRequest>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteProductUpdateRequest">Delete a product create or update request</a>
     */
    public void deleteProductUpdateRequest(String accessToken, String id) {
        exchange(String.format("/api/v3/products/requests/%s", id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createProduct">Get a product create or update request</a>
     */
    public WishData<ProductResponse> createProduct(String accessToken, ProductCreatePayload payload) {
        return post("/api/v3/products", accessToken, payload, new ParameterizedTypeReference<WishData<ProductResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listProductsSync">List products</a>
     */
    public WishData<List<ProductSyncPayload>> listProductsSync(String accessToken, ProductsSyncQueryParams queryParams) {
        return get("/api/v3/products", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ProductSyncPayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateProduct">Update a product</a>
     */
    public WishData<ProductPayload> updateProduct(String accessToken, String id, ProductUpdatePayload payload) {
        return exchange(String.format(PRODUCTS_URL, id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<ProductPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProduct">Get a product</a>
     */
    public WishData<ProductPayload> getProduct(String accessToken, String id) {
        return get(String.format(PRODUCTS_URL, id), accessToken, null, new ParameterizedTypeReference<WishData<ProductPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteProduct">Delete a product</a>
     */
    public void deleteProduct(String accessToken, String id) {
        exchange(String.format(PRODUCTS_URL, id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/FetchProductRatings">Fetch product ratings</a>
     */
    public WishData<List<ProductRatePayload>> getProductRatings(String accessToken, RateQueryParams queryParams) {
        return get("/api/v3/ratings/products", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ProductRatePayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCategoryByID">Get a category</a>
     */
    public WishData<CategoryPayload> getCategory(String accessToken, String id) {
        return get(String.format("/api/v3/products/categories/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<CategoryPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCategoryAttributes">Get attributes</a>
     */
    public WishData<AttributeResponse> getCategoryAttributes(String accessToken, CategoryIdPayload queryParams) {
        return get("/api/v3/products/attributes", accessToken, queryParams, new ParameterizedTypeReference<WishData<AttributeResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCategories">Get root category</a>
     */
    public WishData<CategoryPayload> getCategories(String accessToken) {
        return get("/api/v3/products/categories", accessToken, null, new ParameterizedTypeReference<WishData<CategoryPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateTicket">Update a ticket</a>
     */
    public WishData<TicketPayload> updateTicket(String accessToken, String id, String state) {
        return exchange(String.format("/api/v3/tickets/%s", id), HttpMethod.PUT, accessToken, null, new StatePayload(state), new ParameterizedTypeReference<WishData<TicketPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getTicket">Get a ticket</a>
     */
    public WishData<TicketPayload> getTicket(String accessToken, String id) {
        return get(String.format("/api/v3/tickets/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<TicketPayload>>() {
        });
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/replyTicket">Reply to a ticket</a>
     */
    public WishData<ReplyTicketResponse> replyTicket(String accessToken, String id, MessagePayload payload) {
        return post(String.format("/api/v3/tickets/%s/replies", id), accessToken, payload, new ParameterizedTypeReference<WishData<ReplyTicketResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listTickets">Get a list of Unification Initiative countries</a>
     */
    public WishData<List<TicketPayload>> getTickets(String accessToken, TicketQueryParams queryParams) {
        return get("/api/v3/tickets", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<TicketPayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#tag/Unification-Initiative">Get a list of Unification Initiative countries</a>
     */
    public WishData<List<String>> getUnificationInitiative(String accessToken) {
        return get("/api/v3/unification_initiative/countries", accessToken, null, new ParameterizedTypeReference<WishData<List<String>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createVariation">Create a variation</a>
     */
    public WishData<VariationResponse> createVariation(String accessToken, String id, VariationPayload payload) {
        return post(String.format("/api/v3/products/%s/variations", id), accessToken, payload, new ParameterizedTypeReference<WishData<VariationResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getColors">Get a list of accepted colors</a>
     */
    public WishData<List<IdNamePayload>> getColors(String accessToken, ColorQueryParams queryParams) {
        return get("/api/v3/products/variations/colors", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<IdNamePayload>>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/createSubscription">Create a Subscription</a>
     *
     * @param accessToken 令牌
     * @param queryParams 请求参数
     */
    public WishData<SubscriptionResponse> createSubscription(String accessToken, CreateSubscriptionQueryParams queryParams) {
        return exchange("/api/v3/webhook/subscriptions", HttpMethod.POST, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<SubscriptionResponse>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/listSubscriptions">List Subscriptions</a>
     *
     * @param accessToken 令牌
     */
    public WishData<List<SubscriptionResponse>> getSubscriptions(String accessToken) {
        return get("/api/v3/webhook/subscriptions", accessToken, null, new ParameterizedTypeReference<WishData<List<SubscriptionResponse>>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/updateSubscription">Update a Subscription</a>
     *
     * @param accessToken 令牌
     * @param queryParams 请求参数
     */
    public WishData<SubscriptionResponse> updateSubscription(String accessToken, String id, SubscriptionPayload queryParams) {
        return exchange(String.format(WEBHOOK_SUBSCRIPTIONS_URL, id), HttpMethod.PUT, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<SubscriptionResponse>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/getSubscription">Get a Subscription</a>
     *
     * @param accessToken 令牌
     * @param id          id
     */
    public WishData<SubscriptionResponse> getSubscription(String accessToken, String id) {
        return get(String.format(WEBHOOK_SUBSCRIPTIONS_URL, id), accessToken, null, new ParameterizedTypeReference<WishData<SubscriptionResponse>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/deleteSubscription">Delete a Subscription</a>
     *
     * @param accessToken 令牌
     * @param id          id
     */
    public void deleteSubscription(String accessToken, String id) {
        exchange(String.format(WEBHOOK_SUBSCRIPTIONS_URL, id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/getTopics">List Topics</a>
     *
     * @param accessToken 令牌
     */
    public WishData<List<TopicPayload>> getTopics(String accessToken) {
        return get("/api/v3/webhook/topics", accessToken, null, new ParameterizedTypeReference<WishData<List<TopicPayload>>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsCreateShipment">Create a Wish Parcel shipment</a>
     *
     * @param accessToken 令牌
     * @param payload     请求参数
     */
    public WishData<ShipmentPayload> createShipment(String accessToken, CreateShipmentPayload payload) {
        return post("/api/v3/wish_parcel/shipments", accessToken, payload, new ParameterizedTypeReference<WishData<ShipmentPayload>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsListShipments">List Wish Parcel shipments</a>
     *
     * @param accessToken 令牌
     * @param queryParams 请求参数
     */
    public WishData<List<ShipmentPayload>> getShipments(String accessToken, ShipmentQueryParams queryParams) {
        return get("/api/v3/wish_parcel/shipments", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ShipmentPayload>>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsModifyShipment">Modify a paid Wish Parcel shipment</a>
     *
     * @param accessToken 令牌
     * @param id          shipmentId
     * @param payload     请求参数
     */
    public WishData<ShipmentPayload> modifyShipment(String accessToken, String id, ModifyShipmentPayload payload) {
        return exchange(String.format("/api/v3/wish_parcel/shipments/%s", id), HttpMethod.PATCH, accessToken, null, payload, new ParameterizedTypeReference<WishData<ShipmentPayload>>() {
        });
    }

    /**
     * <a href="https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsShippingOptions">Get Wish Parcel shipping options</a>
     *
     * @param accessToken 令牌
     * @param queryParams 请求参数
     */
    public WishData<List<ShippingOptionPayload>> getShippingOptions(String accessToken, ShippingOptionQueryParams queryParams) {
        return get("/api/v3/wish_parcel/shipping_options", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ShippingOptionPayload>>>() {
        });
    }
}
