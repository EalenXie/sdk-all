package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:54
 */
@Getter
@Setter
public class CreateOrderAirline {

    /**
     * 4PX跟踪号
     */
    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;

    /**
     * 推送交航时间
     */
    @JsonProperty("hand_airline_time")
    private Long handAirlineTime;

    /**
     * 交航地点
     */
    @JsonProperty("hand_airline_location")
    private String handAirlineLocation;
}
