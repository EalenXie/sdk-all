package io.github.ealenxie.wish;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.wish.dto.*;
import io.github.ealenxie.wish.vo.*;
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


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#tag/Brands">Get a list of brands from a particular ID range</a>
     * <p>Wish上可用的品牌列表，可用于标记产品。</p>
     *
     * @param accessToken 令牌
     */
    public WishResponse<List<Brand>> brands(String accessToken, BrandsQueryParams queryParams) {
        return getWish("/api/v3/brands", accessToken, queryParams, new ParameterizedTypeReference<WishResponse<List<Brand>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProducts">Get products</a>
     * <p>Get products asynchronously.</p>
     *
     * @param accessToken 令牌
     */
    public WishResponse<ProductsBulk> getProductsJobs(String accessToken) {
        return postWish("/api/v3/brands/products/bulk_get", accessToken, null, new ParameterizedTypeReference<WishResponse<ProductsBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getUpdateProductsStatus">Get the update products job status</a>
     *
     * @param accessToken 令牌
     */
    public WishResponse<ProductsBulk> getProductsJob(String accessToken, String productJobId) {
        return getWish(String.format("/api/v3/brands/products/bulk_update/%s", productJobId), accessToken, null, new ParameterizedTypeReference<WishResponse<ProductsBulk>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder">Get an order</a>
     * <p>获取订单详情</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     */
    public WishResponse<WishOrder> getOrder(String accessToken, String orderId) {
        return getWish(String.format("/api/v3/orders/%s", orderId), accessToken, null, new ParameterizedTypeReference<WishResponse<WishOrder>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders">List orders</a>
     * <p>获取订单列表</p>
     *
     * @param queryParams 订单请求参数
     * @param accessToken 令牌
     */
    public WishResponse<List<WishOrder>> getOrders(String accessToken, OrdersQueryParams queryParams) {
        return getWish("/api/v3/orders", accessToken, queryParams, new ParameterizedTypeReference<WishResponse<List<WishOrder>>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers">Get accepted shipping carriers</a>
     * <p>获取货运公司</p>
     *
     * @param queryParams 请求参数
     * @param accessToken 令牌
     */
    public List<NamePayload> shippingCarriers(String accessToken, ShippingCarriersQueryParams queryParams) {
        return getWish("/api/v3/shipping_carriers", accessToken, queryParams, new ParameterizedTypeReference<List<NamePayload>>() {
        });
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders">Batch download orders</a>
     * <p>批量获取订单下载</p>
     *
     * @param queryParams 请求参数
     * @param accessToken 令牌
     */
    public WishDownloadJob batchDownloadOrders(String accessToken, OrdersQueryParams queryParams) {
        return exchangeWish("/api/v3/bulk_get", HttpMethod.POST, accessToken, queryParams, null, WishDownloadJob.class);
    }

    /**
     * 接口文档 <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getOrderDownloadJob">Get batch download job status</a>
     *
     * <p>获取订单下载</p>
     *
     * @param accessToken 令牌
     */
    public WishDownloadJob batchDownloadJobStatus(String accessToken, String jobId) {
        return getWish(String.format("/api/v3/bulk_get/%s", jobId), accessToken, null, WishDownloadJob.class);
    }

    /**
     * 接口文档  <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder">Ship or update tracking</a>
     * <p> 发货或更新跟踪订单。 此操作为异步操作</p>
     *
     * @param orderId     订单id
     * @param queryParams 请求参数
     * @param accessToken 令牌
     */
    public WishOrder shipOrder(String accessToken, String orderId, TrackingQueryParams queryParams) {
        return exchangeWish(String.format("/api/v3/orders/%s/tracking", orderId), HttpMethod.PUT, accessToken, queryParams, null, WishOrder.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons">Get valid refund reasons</a>
     * <p>获取退货原因</p>
     *
     * @param orderId     订单id
     * @param accessToken 令牌
     */
    public List<String> refundReasons(String accessToken, String orderId) {
        return getWish(String.format("/api/v3/orders/%s/refund_reasons", orderId), accessToken, null, new ParameterizedTypeReference<List<String>>() {
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
    public WishOrder refund(String accessToken, String orderId, RefundPayload payload) {
        return exchangeWish(String.format("/api/v3/orders/%s/refund", orderId), HttpMethod.PUT, accessToken, null, payload, WishOrder.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder">Update an LTL order</a>
     * <p>更新订单</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     */
    public WishOrder updateLTLOrder(String accessToken, String orderId, UpdateLtlPayload payload) {
        return exchangeWish(String.format("/api/v3/orders/%s", orderId), HttpMethod.PUT, accessToken, null, payload, WishOrder.class);
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress">Modify shipping address</a>
     * <p>修改物流地址</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     */
    public WishOrder modifyAddress(String accessToken, String orderId, ModifyAddressPayload payload) {
        return exchangeWish(String.format("/api/v3/orders/%s/address", orderId), HttpMethod.PUT, accessToken, null, payload, WishOrder.class);
    }
}
