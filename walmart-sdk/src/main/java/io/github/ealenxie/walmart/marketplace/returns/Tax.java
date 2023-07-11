package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.CurrencyAmountUnit;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class Tax {
    /**
     * taxName
     */
    @JsonProperty("taxName")
    private String taxName;
    /**
     * excessTax
     */
    @JsonProperty("excessTax")
    private CurrencyAmountUnit excessTax;
    /**
     * taxPerUnit
     */
    @JsonProperty("taxPerUnit")
    private CurrencyAmountUnit taxPerUnit;
}
