package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class GmvAmount {
    /**
     * amount
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * currency
     */
    @JsonProperty("currency")
    private String currency;
}
