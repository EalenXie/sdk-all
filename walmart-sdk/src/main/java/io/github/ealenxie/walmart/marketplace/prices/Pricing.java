package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:18
 * @version 1.0
 */
@Getter
@Setter
public class Pricing {
    /**
     * currentPriceType
     */
    @JsonProperty("currentPriceType")
    private String currentPriceType;
    /**
     * currentPrice
     */
    @JsonProperty("currentPrice")
    private Money currentPrice;
}
