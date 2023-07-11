package io.github.ealenxie.walmart.marketplace.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.items.SkuPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/10 14:57
 * @version 1.0
 */
@Getter
@Setter
public class PromotionalPricePayload {
    /**
     * itemIdentifier
     */
    @JsonProperty("itemIdentifier")
    private SkuPayload itemIdentifier;
    /**
     * pricingList
     */
    @JsonProperty("pricingList")
    private PricingPayload pricingList;
}
