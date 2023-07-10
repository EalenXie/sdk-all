package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:40
 */
@NoArgsConstructor
@Data
public class OrderPromiseOptionsResponse {
    /**
     * offers
     */
    @JsonProperty("offers")
    private List<PromiseOptionOffer> offers;
    /**
     * destinations
     */
    @JsonProperty("destinations")
    private List<Destination> destinations;
    /**
     * fulfillmentPlans
     */
    @JsonProperty("fulfillmentPlans")
    private List<FulfillmentPlan> fulfillmentPlans;
    /**
     * prepurchaseHandle
     */
    @JsonProperty("prepurchaseHandle")
    private String prepurchaseHandle;
}
