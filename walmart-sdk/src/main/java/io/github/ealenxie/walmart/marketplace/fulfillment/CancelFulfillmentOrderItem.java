package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:52
 */
@Getter
@Setter
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
