package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 15:03
 * @version 1.0
 */

@Getter
@Setter
public class BillingCycles {
    /**
     * tenureType
     */
    @JsonProperty("tenure_type")
    private String tenureType;
    /**
     * sequence
     */
    @JsonProperty("sequence")
    private Integer sequence;
    /**
     * frequency
     */
    @JsonProperty("frequency")
    private Frequency frequency;
    /**
     * totalCycles
     */
    @JsonProperty("total_cycles")
    private Integer totalCycles;
    /**
     * pricingScheme
     */
    @JsonProperty("pricing_scheme")
    private FixedPriceMoney pricingScheme;
}
