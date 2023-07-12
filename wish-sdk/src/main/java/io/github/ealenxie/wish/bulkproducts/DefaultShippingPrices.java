package io.github.ealenxie.wish.bulkproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 13:17
 */
@Getter
@Setter
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
