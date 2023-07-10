package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/10 14:57
 * @version 1.0
 */
@Getter
@Setter
public class PricingPayload {
    /**
     * pricing
     */
    @JsonProperty("pricing")
    private List<Pricing> pricing;
    /**
     * replaceAll
     */
    @JsonProperty("replaceAll")
    private Boolean replaceAll;
}
