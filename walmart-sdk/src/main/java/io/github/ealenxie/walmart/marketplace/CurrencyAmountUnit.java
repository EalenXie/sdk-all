package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

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
    private BigDecimal currencyAmount;
    /**
     * currencyUnit
     */
    @JsonProperty("currencyUnit")
    private String currencyUnit;
}
