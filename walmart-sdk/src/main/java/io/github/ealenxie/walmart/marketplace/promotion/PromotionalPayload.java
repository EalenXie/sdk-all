package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/10 14:18
 * @version 1.0
 */
@Getter
@Setter
public class PromotionalPayload {

    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * pricing
     */
    @JsonProperty("pricing")
    private List<PromotionalPricing> pricing;
}
