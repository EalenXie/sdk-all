package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@Getter
@Setter
public class OrderLineQuantityInfo {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * statusDescription
     */
    @JsonProperty("statusDescription")
    private String statusDescription;
    /**
     * statusQuantity
     */
    @JsonProperty("statusQuantity")
    private Qty statusQuantity;
}
