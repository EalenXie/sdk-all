package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class SelfSendTo4pxInfo {
    @JsonProperty("booking_earliest_time")
    private String bookingEarliestTime;
    @JsonProperty("booking_latest_time")
    private String bookingLatestTime;
}
