package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:37
 */
@Getter
@Setter
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
