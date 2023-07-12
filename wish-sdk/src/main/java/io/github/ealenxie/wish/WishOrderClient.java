package io.github.ealenxie.wish;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.wish.brands.Brand;
import io.github.ealenxie.wish.brands.BrandsQueryParams;
import io.github.ealenxie.wish.bulkproducts.ProductBulk;
import io.github.ealenxie.wish.bulkproducts.ProductUpdatePayload;
import io.github.ealenxie.wish.currencies.Currency;
import io.github.ealenxie.wish.dto.*;
import io.github.ealenxie.wish.euproductcompliance.*;
import io.github.ealenxie.wish.vo.NamePayload;
import io.github.ealenxie.wish.vo.WishDownloadJob;
import io.github.ealenxie.wish.vo.WishOrder;
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

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listBrands">Get a list of brands from a particular ID range</a>
     * <p>Wish上可用的品牌列表，可用于标记产品。</p>
     *
     * @param accessToken 令牌
     */
    public WishData<List<Brand>> listBrands(String accessToken, BrandsQueryParams queryParams) {
        return get("/api/v3/brands", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<Brand>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProducts">Get products</a>
     * <p>Get products asynchronously.</p>
     *
     * @param accessToken 令牌
     */
    public WishData<ProductBulk> getProducts(String accessToken) {
        return post("/api/v3/brands/products/bulk_get", accessToken, null, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getUpdateProductsStatus">Get the update products job status</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ProductBulk> getUpdateProductsStatus(String accessToken, String id) {
        return get(String.format("/api/v3/brands/products/bulk_update/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateProducts">Update products</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ProductBulk> updateProducts(String accessToken, List<ProductUpdatePayload> payload) {
        return post("/api/v3/products/bulk_update", accessToken, payload, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGetProductsStatus">Get the get products job status</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ProductBulk> getGetProductsStatus(String accessToken, String id) {
        return get(String.format("/api/v3/products/bulk_get/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<ProductBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCurrencies">Get supported currency list</a>
     *
     * @param accessToken 令牌
     */
    public WishData<List<Currency>> getCurrencies(String accessToken) {
        return get("/api/v3/currencies", accessToken, null, new ParameterizedTypeReference<WishData<List<Currency>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUResponsiblePerson">Update an EU Responsible Person</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ResponsiblePersonPayload> updateEUResponsiblePerson(String accessToken, String id, ResponsiblePersonRequestPayload payload) {
        return exchange(String.format(EU_PRODUCT_COMPLIANCE_RESPONSIBLE_PERSON_URL, id), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<ResponsiblePersonPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUResponsiblePerson">Get an EU Responsible Person</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ResponsiblePersonPayload> getEUResponsiblePerson(String accessToken, String id) {
        return get(String.format(EU_PRODUCT_COMPLIANCE_RESPONSIBLE_PERSON_URL, id), accessToken, null, new ParameterizedTypeReference<WishData<ResponsiblePersonPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteEUResponsiblePerson">Delete an EU Responsible Person</a>
     *
     * @param accessToken 令牌
     */
    public void deleteEUResponsiblePerson(String accessToken, String id) {
        exchange(String.format(EU_PRODUCT_COMPLIANCE_RESPONSIBLE_PERSON_URL, id), HttpMethod.DELETE, accessToken, null, null, Object.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/BulkUpdateProducts">Bulk Update EU Product Compliance Status</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ProductsBulkUpdateResponse> bulkUpdateProducts(String accessToken, ProductsBulkUpdateQueryParams queryParams) {
        return exchange("/api/v3/eu_product_compliance/products/bulk_update", HttpMethod.POST, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<ProductsBulkUpdateResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetBulkUpdateStatus">Get Bulk Update Job Status</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ProductsBulkUpdateResponse> getBulkUpdateStatus(String accessToken, String id) {
        return get(String.format("/api/v3/eu_product_compliance/products/bulk_update/%s", id), accessToken, null, new ParameterizedTypeReference<WishData<ProductsBulkUpdateResponse>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUProductComplianceStatus">Update EU Product Compliance Status</a>
     *
     * @param accessToken 令牌
     */
    public WishData<List<ComplianceStatusUpdateResponse>> updateEUProductComplianceStatus(String accessToken, List<ComplianceStatusUpdatePayload> payload) {
        return exchange("/api/v3/eu_product_compliance/products", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<List<ComplianceStatusUpdateResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUProductComplianceStatus">Get EU Product Compliance Status</a>
     *
     * @param accessToken 令牌
     */
    public WishData<List<ComplianceStatusUpdateResponse>> getEUProductComplianceStatus(String accessToken, ComplianceStatusQueryParams queryParams) {
        return get("/api/v3/eu_product_compliance/products", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ComplianceStatusUpdateResponse>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/createEUResponsiblePerson">Update an EU Responsible Person</a>
     *
     * @param accessToken 令牌
     */
    public WishData<ResponsiblePersonPayload> createEUResponsiblePerson(String accessToken, ResponsiblePersonRequestPayload payload) {
        return exchange("/api/v3/eu_product_compliance/responsible_person", HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<ResponsiblePersonPayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/listEUResponsiblePerson">List EU Responsible Persons</a>
     *
     * @param accessToken 令牌
     */
    public WishData<List<ResponsiblePersonPayload>> listEUResponsiblePerson(String accessToken, ResponsiblePersonQueryParams queryParams) {
        return get("/api/v3/eu_product_compliance/responsible_person", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<ResponsiblePersonPayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder">Get an order</a>
     * <p>获取订单详情</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     */
    public WishData<WishOrder> getOrder(String accessToken, String orderId) {
        return get(String.format("/api/v3/orders/%s", orderId), accessToken, null, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders">List orders</a>
     * <p>获取订单列表</p>
     *
     * @param queryParams 订单请求参数
     * @param accessToken 令牌
     */
    public WishData<List<WishOrder>> getOrders(String accessToken, OrdersQueryParams queryParams) {
        return get("/api/v3/orders", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<WishOrder>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers">Get accepted shipping carriers</a>
     * <p>获取货运公司</p>
     *
     * @param queryParams 请求参数
     * @param accessToken 令牌
     */
    public WishData<List<NamePayload>> shippingCarriers(String accessToken, ShippingCarriersQueryParams queryParams) {
        return get("/api/v3/shipping_carriers", accessToken, queryParams, new ParameterizedTypeReference<WishData<List<NamePayload>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders">Batch download orders</a>
     * <p>批量获取订单下载</p>
     *
     * @param queryParams 请求参数
     * @param accessToken 令牌
     */
    public WishData<WishDownloadJob> batchDownloadOrders(String accessToken, OrdersQueryParams queryParams) {
        return exchange("/api/v3/bulk_get", HttpMethod.POST, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<WishDownloadJob>>() {
        });
    }

    /**
     * 接口文档 <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getOrderDownloadJob">Get batch download job status</a>
     *
     * <p>获取订单下载</p>
     *
     * @param accessToken 令牌
     */
    public WishData<WishDownloadJob> batchDownloadJobStatus(String accessToken, String jobId) {
        return get(String.format("/api/v3/bulk_get/%s", jobId), accessToken, null, new ParameterizedTypeReference<WishData<WishDownloadJob>>() {
        });
    }

    /**
     * 接口文档  <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder">Ship or update tracking</a>
     * <p> 发货或更新跟踪订单。 此操作为异步操作</p>
     *
     * @param orderId     订单id
     * @param queryParams 请求参数
     * @param accessToken 令牌
     */
    public WishData<WishOrder> shipOrder(String accessToken, String orderId, TrackingQueryParams queryParams) {
        return exchange(String.format("/api/v3/orders/%s/tracking", orderId), HttpMethod.PUT, accessToken, queryParams, null, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons">Get valid refund reasons</a>
     * <p>获取退货原因</p>
     *
     * @param orderId     订单id
     * @param accessToken 令牌
     */
    public WishData<List<String>> refundReasons(String accessToken, String orderId) {
        return get(String.format("/api/v3/orders/%s/refund_reasons", orderId), accessToken, null, new ParameterizedTypeReference<WishData<List<String>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/RefundOrder">Refund/Cancel an order</a>
     * <p>取消订单</p>
     *
     * @param accessToken 令牌
     * @param orderId     订单id
     * @param payload     请求参数
     */
    public WishData<WishOrder> refund(String accessToken, String orderId, RefundPayload payload) {
        return exchange(String.format("/api/v3/orders/%s/refund", orderId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder">Update an LTL order</a>
     * <p>更新订单</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     */
    public WishData<WishOrder> updateLTLOrder(String accessToken, String orderId, UpdateLtlPayload payload) {
        return exchange(String.format("/api/v3/orders/%s", orderId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress">Modify shipping address</a>
     * <p>修改物流地址</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     */
    public WishData<WishOrder> modifyAddress(String accessToken, String orderId, ModifyAddressPayload payload) {
        return exchange(String.format("/api/v3/orders/%s/address", orderId), HttpMethod.PUT, accessToken, null, payload, new ParameterizedTypeReference<WishData<WishOrder>>() {
        });
    }
}
