package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 14:04
 */
@NoArgsConstructor
@Data
public class VasAttr {
    /**
     * attrUnit
     */
    @JsonProperty("attrUnit")
    private String attrUnit;
    /**
     * minValue
     */
    @JsonProperty("minValue")
    private Integer minValue;
    /**
     * attrCode
     */
    @JsonProperty("attrCode")
    private String attrCode;
    /**
     * maxValue
     */
    @JsonProperty("maxValue")
    private Integer maxValue;
}
