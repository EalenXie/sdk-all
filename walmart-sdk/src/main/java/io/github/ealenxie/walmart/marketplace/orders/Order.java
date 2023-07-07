package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 13:43
 */
@Getter
@Setter
public class Order {
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
     * customerEmailId
     */
    @JsonProperty("customerEmailId")
    private String customerEmailId;
    /**
     * orderType
     */
    @JsonProperty("orderType")
    private String orderType;
    /**
     * originalCustomerOrderID
     */
    @JsonProperty("originalCustomerOrderID")
    private String originalCustomerOrderID;
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
