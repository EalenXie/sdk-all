package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:18
 * @version 1.0
 */
@Getter
@Setter
public class PackageLabel {
    /**
     * 失败原因
     */
    @JsonProperty("msg")
    private String msg;
    /**
     * 运单号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * 包裹编号
     */
    @JsonProperty("packageNum")
    private String packageNum;
    /**
     * 抓取成功（Y），或者失败（N）
     */
    @JsonProperty("status")
    private String status;
}
