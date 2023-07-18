package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 16:09
 * @version 1.0
 */
@Getter
@Setter
public class PricingSchemes {
    /**
     * billingCycleSequence
     */
    @JsonProperty("billing_cycle_sequence")
    private Integer billingCycleSequence;
    /**
     * pricingScheme
     */
    @JsonProperty("pricing_scheme")
    private PricingScheme pricingScheme;
}
