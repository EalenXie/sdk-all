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
public class Override {
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
