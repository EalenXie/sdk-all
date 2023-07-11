package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 13:45
 */
@Setter
@Getter
public class ShipNodesCreatePayload {
    /**
     * shipNodeHeader
     */
    @JsonProperty("shipNodeHeader")
    private ShipNodeHeader shipNodeHeader;
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private List<ShipNodeCreatePayload> shipNode;
}
