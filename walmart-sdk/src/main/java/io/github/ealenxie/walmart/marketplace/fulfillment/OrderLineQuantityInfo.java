package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@NoArgsConstructor
@Data
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
