package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/4/20 16:49
 * @version 1.0
 */
@Getter
@Setter
public class PackageInfo {
    /**
     * 包裹长
     */
    @JsonProperty("length")
    private BigDecimal length;
    /**
     * 包裹宽
     */
    @JsonProperty("width")
    private BigDecimal width;
    /**
     * 包裹高
     */
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * 包裹重
     */
    @JsonProperty("height")
    private BigDecimal height;
    /**
     * 包裹体积
     */
    @JsonProperty("CBM")
    private BigDecimal cbm;
}
