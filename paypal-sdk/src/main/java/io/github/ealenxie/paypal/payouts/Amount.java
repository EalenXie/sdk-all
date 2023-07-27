package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lanzhi
 * Created on 2023/7/26 16:04
 **/
public class Amount {
    /**
     * For the required number of decimal places for a currency code,
     * see Currency codes - ISO 4217.
     */
    @JsonProperty("value")
    private String value;
    /**
     * The three-character ISO-4217 currency code.
     */
    @JsonProperty("currency")
    private String currency;
}

