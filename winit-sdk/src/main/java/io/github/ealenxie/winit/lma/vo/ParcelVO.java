package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:51
 * @version 1.0
 */
@Getter
@Setter
public class ParcelVO {
    /**
     * 体积
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * 长，CM
     */
    @JsonProperty("length")
    private Double length;
    /**
     * 宽
     */
    @JsonProperty("width")
    private Double width;
    /**
     * 重量，KG
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * 高
     */
    @JsonProperty("height")
    private Double height;
}
