package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 10:40
 */
@Getter
@Setter
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
