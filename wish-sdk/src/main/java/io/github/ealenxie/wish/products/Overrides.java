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
public class Overrides {
    /**
     * isEnabled
     */
    @JsonProperty("is_enabled")
    private Boolean isEnabled;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * destination
     */
    @JsonProperty("destination")
    private String destination;
    /**
     * maxDeliveryDays
     */
    @JsonProperty("max_delivery_days")
    private Integer maxDeliveryDays;
    /**
     * additionalPrice
     */
    @JsonProperty("additional_price")
    private Money additionalPrice;
}
