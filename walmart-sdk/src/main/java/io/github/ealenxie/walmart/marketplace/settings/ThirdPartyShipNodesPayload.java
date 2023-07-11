package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 14:11
 */
@NoArgsConstructor
@Data
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
