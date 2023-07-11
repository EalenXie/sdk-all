package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 14:11
 */
@Getter
@Setter
public class ThirdPartyShipNodesPayload {

    /**
     * shipNodeHeader
     */
    @JsonProperty("shipNodeHeader")
    private ShipNodeHeader shipNodeHeader;
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private List<ShipNodeStatus> shipNode;
}
