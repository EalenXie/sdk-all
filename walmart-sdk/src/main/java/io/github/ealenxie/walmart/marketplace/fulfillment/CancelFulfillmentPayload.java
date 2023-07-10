package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:52
 */
@NoArgsConstructor
@Data
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
