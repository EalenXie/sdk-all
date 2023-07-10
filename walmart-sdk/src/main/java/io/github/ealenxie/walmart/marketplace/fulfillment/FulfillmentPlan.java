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
public class FulfillmentPlan {
    /**
     * fulfillmentModules
     */
    @JsonProperty("fulfillmentModules")
    private List<FulfillmentModule> fulfillmentModules;
}
