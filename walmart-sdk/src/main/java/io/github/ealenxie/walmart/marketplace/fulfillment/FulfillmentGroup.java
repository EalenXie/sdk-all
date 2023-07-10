package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@NoArgsConstructor
@Data
public class FulfillmentGroup {
    /**
     * fulfillmentOptions
     */
    @JsonProperty("fulfillmentOptions")
    private List<FulfillmentOption> fulfillmentOptions;
}
