package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 10:40
 */
@NoArgsConstructor
@Data
public class UpdatedShipmentQtyItem {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * updatedShipmentQty
     */
    @JsonProperty("updatedShipmentQty")
    private Integer updatedShipmentQty;
}
