package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:37
 */
@Getter
@Setter
public class ShipNodesUpdatePayload {


    /**
     * shipNodeHeader
     */
    @JsonProperty("shipNodeHeader")
    private ShipNodeHeader shipNodeHeader;
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private ShipNodePayload shipNode;
}
