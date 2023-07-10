package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 13:52
 */
@NoArgsConstructor
@Data
public class CancelFulfillmentOrderItem {
    /**
     * sellerLineId
     */
    @JsonProperty("sellerLineId")
    private String sellerLineId;
    /**
     * qty
     */
    @JsonProperty("qty")
    private Qty qty;
}
