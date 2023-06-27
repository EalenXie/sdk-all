package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:11
 */
@Getter
@Setter
public class CreateOrderInbound {
    /**
     * 4PX跟踪号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * 实重，单位g(正整数)
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 入库时间(东8)
     */
    @JsonProperty("inbound_time")
    private Long inboundTime;

    /**
     * 入库地点
     */
    @JsonProperty("inbound_location")
    private String inboundLocation;
}
