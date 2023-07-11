package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 14:36
 */
@Getter
@Setter
public class ShipNodeBody {

    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
    /**
     * shipNodeName
     */
    @JsonProperty("shipNodeName")
    private String shipNodeName;
}
