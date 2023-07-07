package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 10:38
 */
@NoArgsConstructor
@Data
public class BoxDimensions {
    /**
     * boxDimensionUnit
     */
    @JsonProperty("boxDimensionUnit")
    private String boxDimensionUnit;
    /**
     * boxWeightUnit
     */
    @JsonProperty("boxWeightUnit")
    private String boxWeightUnit;
    /**
     * boxWeight
     */
    @JsonProperty("boxWeight")
    private Integer boxWeight;
    /**
     * boxLength
     */
    @JsonProperty("boxLength")
    private Integer boxLength;
    /**
     * boxWidth
     */
    @JsonProperty("boxWidth")
    private Integer boxWidth;
    /**
     * boxHeight
     */
    @JsonProperty("boxHeight")
    private Integer boxHeight;
}
