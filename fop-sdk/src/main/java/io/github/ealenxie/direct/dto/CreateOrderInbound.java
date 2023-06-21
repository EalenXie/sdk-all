package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:11
 */
@Getter
@Setter
public class CreateOrderInbound {

    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("inbound_time")
    private Long inboundTime;
    @JsonProperty("inbound_location")
    private String inboundLocation;
}
