package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:48
 * @version 1.0
 */
@Getter
@Setter
public class ParcelPayload {
    /**
     * 包裹重量
     * 单位：KG
     */
    @JsonProperty("weight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String weight;
    /**
     * 长
     * 单位：cm
     */
    @JsonProperty("length")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String length;
    /**
     * 宽
     * 单位：cm
     */
    @JsonProperty("width")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String width;
    /**
     * 高
     * 单位：cm
     */
    @JsonProperty("height")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String height;
}
