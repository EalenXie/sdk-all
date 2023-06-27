package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 14:37
 */
@Getter
@Setter
public class CreateOrderOutbound {
    /**
     * 4PX跟踪号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * 服务商跟踪号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

    /**
     * 出库操作时间
     */
    @JsonProperty("outbound_time")
    private Long outboundTime;

    /**
     * 出库地点
     */
    @JsonProperty("outbound_location")
    private String outboundLocation;
}
