package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@Getter
@Setter
public class OrderPayload {
    /**
     * purchaseOrderId
     */
    @JsonProperty("purchaseOrderId")
    private String purchaseOrderId;
    /**
     * customerOrderId
     */
    @JsonProperty("customerOrderId")
    private String customerOrderId;
    /**
     * sellerOrderId
     */
    @JsonProperty("sellerOrderId")
    private String sellerOrderId;
    /**
     * customerEmailId
     */
    @JsonProperty("customerEmailId")
    private String customerEmailId;
    /**
     * orderDate
     */
    @JsonProperty("orderDate")
    private Long orderDate;
    /**
     * shippingInfo
     */
    @JsonProperty("shippingInfo")
    private ShippingInfo shippingInfo;
    /**
     * orderLines
     */
    @JsonProperty("orderLines")
    private OrderLines orderLines;
}
