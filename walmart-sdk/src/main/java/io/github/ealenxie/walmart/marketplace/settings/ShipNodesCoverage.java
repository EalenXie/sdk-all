package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 14:30
 */
@NoArgsConstructor
@Data
public class ShipNodesCoverage {
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
    /**
     * coverageArea
     */
    @JsonProperty("coverageArea")
    private List<String> coverageArea;
}
