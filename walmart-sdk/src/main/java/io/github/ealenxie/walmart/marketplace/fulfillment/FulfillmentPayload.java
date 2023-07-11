package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@Getter
@Setter
public class FulfillmentPayload {
    /**
     * orderChannelId
     */
    @JsonProperty("orderChannelId")
    private String orderChannelId;
    /**
     * sellerOrderId
     */
    @JsonProperty("sellerOrderId")
    private String sellerOrderId;
    /**
     * orderPlacedTime
     */
    @JsonProperty("orderPlacedTime")
    private String orderPlacedTime;
    /**
     * needsConfirmation
     */
    @JsonProperty("needsConfirmation")
    private Boolean needsConfirmation;
    /**
     * partialFulfillments
     */
    @JsonProperty("partialFulfillments")
    private Boolean partialFulfillments;
    /**
     * customer
     */
    @JsonProperty("customer")
    private Customer customer;
    /**
     * orderItems
     */
    @JsonProperty("orderItems")
    private List<FulfillmentOrderItem> orderItems;
}
