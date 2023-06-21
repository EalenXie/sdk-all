package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:54
 */
@Getter
@Setter
public class CreateOrderAirline {


    @JsonProperty("4px_tracking_no")
    private String fpxTrackingNo;
    @JsonProperty("hand_airline_time")
    private Long handAirlineTime;
    @JsonProperty("hand_airline_location")
    private String handAirlineLocation;
}
