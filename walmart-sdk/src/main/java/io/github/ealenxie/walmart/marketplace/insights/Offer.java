package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class Offer {
    /**
     * shippingSpeed
     */
    @JsonProperty("shippingSpeed")
    private ShippingSpeed shippingSpeed;
    /**
     * price
     */
    @JsonProperty("price")
    private OfferPrice price;
    /**
     * publishAndTransactable
     */
    @JsonProperty("publishAndTransactable")
    private PublishAndTransactable publishAndTransactable;
    /**
     * issueCount
     */
    @JsonProperty("issueCount")
    private Integer issueCount;
}
