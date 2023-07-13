package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 9:53
 */
@NoArgsConstructor
@Data
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
