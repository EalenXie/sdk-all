package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 13:37
 */
@NoArgsConstructor
@Data
public class Destination {
    /**
     * address
     */
    @JsonProperty("address")
    private DestinationAddress address;
    /**
     * fulfillmentType
     */
    @JsonProperty("fulfillmentType")
    private String fulfillmentType;
    /**
     * destinationId
     */
    @JsonProperty("destinationId")
    private String destinationId;
}
