package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 13:59
 */
@Getter
@Setter
public class PerShippingCharge {
    /**
     * unitOfMeasure
     */
    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;
    /**
     * shippingAndHandling
     */
    @JsonProperty("shippingAndHandling")
    private Money shippingAndHandling;
    /**
     * chargePerWeight
     */
    @JsonProperty("chargePerWeight")
    private Money chargePerWeight;
}
