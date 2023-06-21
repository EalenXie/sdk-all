package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:58
 * @version 1.0
 */
@Getter
@Setter
public class OrderInfoParcel {
    /**
     * 包裹号
     */
    @JsonProperty("parcelNo")
    private String parcelNo;
    /**
     * 最新轨迹信息
     */
    @JsonProperty("trackingMessage")
    private String trackingMessage;
    /**
     * 运单号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * 包裹状态
     */
    @JsonProperty("status")
    private String status;
}
