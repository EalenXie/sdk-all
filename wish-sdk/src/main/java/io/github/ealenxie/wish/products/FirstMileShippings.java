package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@Getter
@Setter
public class FirstMileShippings {
    /**
     * calculatedFirstMileShipping
     */
    @JsonProperty("calculated_first_mile_shipping")
    private Money calculatedFirstMileShipping;
    /**
     * effectiveDate
     */
    @JsonProperty("effective_date")
    private String effectiveDate;
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
