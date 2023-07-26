package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 15:03
 * @version 1.0
 */
@Getter
@Setter
public class FixedPriceMoney {
    /**
     * fixedPrice
     */
    @JsonProperty("fixed_price")
    private Money fixedPrice;
}
