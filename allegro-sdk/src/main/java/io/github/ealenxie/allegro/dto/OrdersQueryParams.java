package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/2/21 16:05
 */
@Getter
@Setter
public class OrdersQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;

    /**
     * 订单状态
     * BOUGHT: 购买时不填写结帐单
     * FILLED_IN: 结帐表格已填写，但付款尚未完成，因此数据仍可能更改
     * READY_FOR_PROCESSING: 付款完成
     * CANCELLED: 买家取消购买
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;

    /**
     * 卖家状态 NEW、PROCESSING、READY_FOR_SHIPMENT、READY_FOR_PICKUP、SENT、PICKED_UP、CANCELLED、SUSPENDED
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fulfillment.status")
    private String fulfillmentStatus;

    /**
     * NONE：所有订单项都没有指定跟踪号
     * SOME：某些订单项指定了跟踪号
     * ALL：所有订单项都指定了跟踪号。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fulfillment.shipmentSummary.lineItemsSent")
    private String lineItemsSent;

    /**
     * 订单项购买日期，结帐表格的日期时间范围的上限
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("lineItems.boughtAt.lte")
    private String boughtAtLte;

    /**
     * 2011-12-03T10:15:30.133Z
     * 订单项购买日期，结帐表格的日期时间范围的下限
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("lineItems.boughtAt.gte")
    private String boughtAtGte;

    /**
     * 付款id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment.id")
    private String paymentId;

    /**
     * 附加费id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("surcharges.id")
    private String surchargesId;

    /**
     * 交付方式id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("delivery.method.id")
    private String deliveryMethodId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("buyer.login")
    private String buyerLogin;

    /**
     * 最后修改日期,结帐表格的日期时间范围的上限
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("updatedAt.lte")
    private String updatedAtLte;

    /**
     * 2011-12-03T10:15:30.133Z
     * 最后修改日期,结帐表格的日期时间范围的下限
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("updatedAt.gte")
    private String updatedAtGte;
    /**
     * "lineItems.boughtAt" "-lineItems.boughtAt" "updatedAt" "-updatedAt"
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sort;

}
