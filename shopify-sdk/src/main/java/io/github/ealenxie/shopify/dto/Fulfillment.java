package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/09/27 14:29
 */
@Getter
@Setter
public class Fulfillment {
    /**
     * 通知message
     */
    private String message;
    /**
     * 是否通知客户
     */
    @JsonProperty("notify_customer")
    private Boolean notifyCustomer;
    /**
     * 物流信息
     */
    @JsonProperty("tracking_info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TrackingInfo trackingInfo;
    /**
     * 发货订单
     */
    @JsonProperty("line_items_by_fulfillment_order")
    private List<LineItemsByFulfillmentOrder> lineItemsByFulfillmentOrder;
}
