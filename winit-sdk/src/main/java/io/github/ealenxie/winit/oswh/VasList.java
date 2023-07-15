package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 14:04
 */
@Getter
@Setter
public class VasList {
    /**
     * serviceCodeType
     */
    @JsonProperty("serviceCodeType")
    private String serviceCodeType;
    /**
     * serviceCode
     */
    @JsonProperty("serviceCode")
    private String serviceCode;
    /**
     * attrList
     */
    @JsonProperty("attrList")
    private List<VasAttr> attrList;
}
