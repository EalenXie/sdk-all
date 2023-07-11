package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@Getter
@Setter
public class FulfillmentGroup {
    /**
     * fulfillmentOptions
     */
    @JsonProperty("fulfillmentOptions")
    private List<FulfillmentOption> fulfillmentOptions;
}
