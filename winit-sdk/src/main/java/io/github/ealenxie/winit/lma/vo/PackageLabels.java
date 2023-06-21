package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 16:49
 * @version 1.0
 */
@Getter
@Setter
public class PackageLabels {
    /**
     * 包裹编号
     */
    @JsonProperty("packageNum")
    private String packageNum;
    /**
     * 运单号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * 面单文件
     * Base64编码的PDF文件
     */
    @JsonProperty("label")
    private String label;
}
