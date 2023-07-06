package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@NoArgsConstructor
@Data
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
