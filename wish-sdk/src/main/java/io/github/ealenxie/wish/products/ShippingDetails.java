package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@Getter
@Setter
public class ShippingDetails {
    /**
     * isEnabled
     */
    @JsonProperty("is_enabled")
    private Boolean isEnabled;
    /**
     * maxDeliveryDays
     */
    @JsonProperty("max_delivery_days")
    private Integer maxDeliveryDays;
    /**
     * overrides
     */
    @JsonProperty("overrides")
    private List<Overrides> overrides;
    /**
     * destination
     */
    @JsonProperty("destination")
    private String destination;
    /**
     * additionalPrice
     */
    @JsonProperty("additional_price")
    private Money additionalPrice;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
}
