package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.walmart.marketplace.orders.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2022/3/16 14:02
 * <a href="https://developer.walmart.com/api/us/mp/orders">walmart 商户平台</a>
 */
public class WalmartOrderClient extends WalmartClient {


    public WalmartOrderClient(String clientId, String clientSecret) {
        super(clientId, clientSecret);
    }

    public WalmartOrderClient(String clientId, String clientSecret, RestOperations restOperations) {
        super(clientId, clientSecret, new ObjectMapper(), restOperations);
    }

    public WalmartOrderClient(String clientId, String clientSecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(clientId, clientSecret, objectMapper, restOperations);
    }

    public WalmartOrderClient(String clientId, String clientSecret, ObjectMapper objectMapper) {
        super(clientId, clientSecret, objectMapper);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates">Ship Order Lines</a>
     */
    public OrderResponse shipOrderLines(String accessToken, String purchaseOrderId, OrderShipmentPayload payload) {
        return post(String.format("/v3/orders/%s/shipping", purchaseOrderId), accessToken, payload, OrderResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines">Refund Order Lines</a>
     */
    public RefundResponse refundOrderLines(String accessToken, String purchaseOrderId, OrderRefundPayload payload) {
        return post(String.format("/v3/orders/%s/refund", purchaseOrderId), accessToken, payload, RefundResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines">Cancel Order Lines</a>
     */
    public OrderResponse cancelOrderLines(String accessToken, String purchaseOrderId, CancelPayload payload) {
        return post(String.format("/v3/orders/%s/cancel", purchaseOrderId), accessToken, payload, OrderResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders">Acknowledge Orders</a>
     */
    public AcknowledgeOrdersResponse acknowledgeOrders(String accessToken, String purchaseOrderId) {
        return post(String.format("/v3/orders/%s/acknowledge", purchaseOrderId), accessToken, null, AcknowledgeOrdersResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     */
    public ListElementResponse<OrdersResponse> getAllOrders(String accessToken, OrdersQueryParams queryParams) {
        return get("/v3/orders", accessToken, queryParams, new ParameterizedTypeReference<ListElementResponse<OrdersResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     */
    public ListElementResponse<OrdersResponse> getAllOrders(String accessToken, String nextCursor) {
        return get(String.format("/v3/orders%s", nextCursor), accessToken, null, new ParameterizedTypeReference<ListElementResponse<OrdersResponse>>() {
        });
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder">An order</a>
     */
    public Order getAnOrder(String accessToken, String purchaseOrderId) {
        return get(String.format("/v3/orders/%s", purchaseOrderId), accessToken, null, Order.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders">All released orders</a>
     * <p>获取所有已下达的订单</p>
     */
    public ListElementResponse<OrdersResponse> getAllReleasedOrders(String accessToken) {
        return get("/v3/orders/released", accessToken, null, new ParameterizedTypeReference<ListElementResponse<OrdersResponse>>() {
        });
    }

}
