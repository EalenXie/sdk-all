package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/4/21 15:51
 * @version 1.0
 */
@Getter
@Setter
public class Parcel {
    /**
     * 体积
     */
    @JsonProperty("volume")
    private BigDecimal volume;
    /**
     * 长，CM
     */
    @JsonProperty("length")
    private BigDecimal length;
    /**
     * 宽
     */
    @JsonProperty("width")
    private BigDecimal width;
    /**
     * 重量，KG
     */
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * 高
     */
    @JsonProperty("height")
    private BigDecimal height;
}
