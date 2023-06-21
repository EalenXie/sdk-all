package io.github.ealenxie.winit.oswh.outbound.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

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
    private Double length;
    /**
     * 包裹宽
     */
    @JsonProperty("width")
    private Double width;
    /**
     * 包裹高
     */
    @JsonProperty("weight")
    private Double weight;
    /**
     * 包裹重
     */
    @JsonProperty("height")
    private Double height;
    /**
     * 包裹体积
     */
    @JsonProperty("CBM")
    private Double cbm;
}
