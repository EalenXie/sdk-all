package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/18 16:08
 * @version 1.0
 */
@Getter
@Setter
public class UpdatePricingPayload {

    /**
     * pricingSchemes
     */
    @JsonProperty("pricing_schemes")
    private List<PricingSchemes> pricingSchemes;
}
