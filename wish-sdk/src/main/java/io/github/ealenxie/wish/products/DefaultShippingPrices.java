package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@NoArgsConstructor
@Data
public class DefaultShippingPrices {
    /**
     * defaultShippingPrice
     */
    @JsonProperty("default_shipping_price")
    private Money defaultShippingPrice;
    /**
     * warehouseId
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
}
