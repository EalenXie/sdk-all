package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 9:53
 */
@Getter
@Setter
public class CurrencySettingsResponse {

    /**
     * productBoostCurrency
     */
    @JsonProperty("product_boost_currency")
    private String productBoostCurrency;
    /**
     * localizedCurrency
     */
    @JsonProperty("localized_currency")
    private String localizedCurrency;
}
