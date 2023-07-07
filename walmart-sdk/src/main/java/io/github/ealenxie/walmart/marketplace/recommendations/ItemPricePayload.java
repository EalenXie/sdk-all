package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:35
 */
@NoArgsConstructor
@Data
public class ItemPricePayload {
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * url
     */
    @JsonProperty("url")
    private String url;
    /**
     * itemPrice
     */
    @JsonProperty("itemPrice")
    private Money itemPrice;
    /**
     * shippingPrice
     */
    @JsonProperty("shippingPrice")
    private Money shippingPrice;
}
