package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:14
 */
@NoArgsConstructor
@Data
public class ShipmentItem {
    /**
     * vendorSku
     */
    @JsonProperty("vendorSku")
    private String vendorSku;
    /**
     * itemQty
     */
    @JsonProperty("itemQty")
    private Integer itemQty;
}
