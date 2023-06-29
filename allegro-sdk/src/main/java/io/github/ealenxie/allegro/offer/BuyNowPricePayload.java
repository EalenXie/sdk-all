package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 16:36
 */
@NoArgsConstructor
@Data
public class BuyNowPricePayload {

    /**
     * buyNowPrice
     */
    @JsonProperty("buyNowPrice")
    private Money buyNowPrice;
}
