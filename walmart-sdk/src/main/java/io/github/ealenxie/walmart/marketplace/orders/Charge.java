package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@Getter
@Setter
public class Charge {
    /**
     * chargeType
     */
    @JsonProperty("chargeType")
    private String chargeType;
    /**
     * chargeName
     */
    @JsonProperty("chargeName")
    private String chargeName;
    /**
     * chargeAmount
     */
    @JsonProperty("chargeAmount")
    private Money chargeAmount;
    /**
     * tax
     */
    @JsonProperty("tax")
    private Tax tax;
}
