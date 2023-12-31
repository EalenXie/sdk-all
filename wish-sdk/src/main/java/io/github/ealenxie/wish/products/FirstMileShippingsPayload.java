package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 17:11
 */
@Getter
@Setter
public class FirstMileShippingsPayload {
    /**
     * effectiveFirstMileShipping
     */
    @JsonProperty("effective_first_mile_shipping")
    private Money effectiveFirstMileShipping;
    /**
     * enabled
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * warehouseId
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
}
