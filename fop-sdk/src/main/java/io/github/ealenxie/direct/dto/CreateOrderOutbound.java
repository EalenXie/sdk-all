package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 14:37
 */
@Getter
@Setter
public class CreateOrderOutbound {
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    @JsonProperty("tracking_number")
    private String trackingNumber;
    @JsonProperty("outbound_time")
    private Long outboundTime;
    @JsonProperty("outbound_location")
    private String outboundLocation;
}
