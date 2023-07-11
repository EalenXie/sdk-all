package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:52
 */
@Getter
@Setter
public class CancelFulfillmentPayload {
    /**
     * sellerOrderId
     */
    @JsonProperty("sellerOrderId")
    private String sellerOrderId;
    /**
     * orderItems
     */
    @JsonProperty("orderItems")
    private List<CancelFulfillmentOrderItem> orderItems;
}
