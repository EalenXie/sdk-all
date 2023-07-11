package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 10:15
 * @version 1.0
 */
@Getter
@Setter
public class CurrencyAmountUnit {
    /**
     * currencyAmount
     */
    @JsonProperty("currencyAmount")
    private Double currencyAmount;
    /**
     * currencyUnit
     */
    @JsonProperty("currencyUnit")
    private String currencyUnit;
}
