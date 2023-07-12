package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.CurrencyAmountUnit;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@Getter
@Setter
public class TaxDetails {
    /**
     * taxPerLine
     */
    @JsonProperty("taxPerLine")
    private CurrencyAmountUnit taxPerLine;
}
