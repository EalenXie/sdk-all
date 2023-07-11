package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 14:36
 */
@NoArgsConstructor
@Data
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
