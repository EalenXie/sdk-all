package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:17
 */
@NoArgsConstructor
@Data
public class Amount {
    /**
     * currencyCode
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
    /**
     * breakdown
     */
    @JsonProperty("breakdown")
    private Breakdown breakdown;
}
