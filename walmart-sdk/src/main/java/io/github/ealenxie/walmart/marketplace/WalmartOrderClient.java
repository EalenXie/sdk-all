package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.walmart.marketplace.orders.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestOperations;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
     * <p>标记发货</p>
     */
    public String shipment(String accessToken, String purchaseOrderId, ShipmentPayload payload) {
        return post(String.format("/v3/orders/%s/shipping", purchaseOrderId), accessToken, payload, String.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     * <p>获取订单</p>
     */
    public WalmartOrdersResp orders(String accessToken, OrdersQueryParams queryParams) {
        return get("/v3/orders", accessToken, queryParams, WalmartOrdersResp.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders">All orders</a>
     * <p>获取订单</p>
     */
    public WalmartOrders orders(String accessToken, String nextCursor) {
        return get(String.format("/v3/orders%s", nextCursor), accessToken, null, WalmartOrders.class);
    }


    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder">An order</a>
     * <p>根据订单号获取订单详情</p>
     */
    public WalmartOrder order(String accessToken, String purchaseOrderId) {
        return get(String.format("/v3/orders/%s", purchaseOrderId), accessToken, null, WalmartOrder.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders">All released orders</a>
     * <p>获取所有已下达的订单</p>
     */
    public WalmartOrders releasedOrders(String accessToken) {
        return get("/v3/orders/released", accessToken, null, WalmartOrders.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines">Refund Order Lines</a>
     * <p>退款</p>
     */
    public WalmartOrder refund(String accessToken, String purchaseOrderId, RefundPayload payload) {
        return post(String.format("/v3/orders/%s/refund", purchaseOrderId), accessToken, payload, WalmartOrder.class);
    }


    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders">Acknowledge Orders</a>
     * <p>确认订单</p>
     */
    public String acknowledge(String accessToken, String purchaseOrderId) {
        return post(String.format("/v3/orders/%s/acknowledge", purchaseOrderId), accessToken, null, String.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines">Cancel Order Lines</a>
     * <p>取消订单</p>
     */
    public WalmartOrder cancel(String accessToken, String purchaseOrderId, CancelPayload payload) {
        return post(String.format("/v3/orders/%s/cancel", purchaseOrderId), accessToken, payload, WalmartOrder.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports#operation/getAvailableV1ReconReportDates">获取对账报告日期</a>
     */
    public ReportDateResponse getReportDate(String accessToken) {
        Map<String, String> map = new HashMap<>();
        map.put("reportVersion", "v1");
        return get("/v3/report/reconreport/availableReconFiles", accessToken, map, ReportDateResponse.class);
    }

    /**
     * <a href="https://developer.walmart.com/api/us/mp/reports#operation/getReconReportV1">下载结算报告(ZIP)</a>
     */
    public byte[] downloadReport(String accessToken, ReportQueryParams queryParams) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_OCTET_STREAM));
        return exchange("/v3/report/reconreport/reconFile", HttpMethod.GET, queryParams, new HttpEntity<>(null, headers), byte[].class);
    }

}
