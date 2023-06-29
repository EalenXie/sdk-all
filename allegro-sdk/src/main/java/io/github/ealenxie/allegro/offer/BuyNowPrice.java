package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 16:37
 */
@NoArgsConstructor
@Data
public class BuyNowPrice {
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
