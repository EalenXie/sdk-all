package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:37
 */
@NoArgsConstructor
@Data
public class OfferSelection {
    /**
     * offers
     */
    @JsonProperty("offers")
    private List<FetchOrderOffer> offers;
}
