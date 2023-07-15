package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/15 14:04
 */
@Getter
@Setter
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
