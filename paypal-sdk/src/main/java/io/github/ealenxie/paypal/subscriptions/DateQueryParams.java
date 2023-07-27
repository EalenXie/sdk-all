package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 15:33
 * @version 1.0
 */
@Getter
@Setter
public class DateQueryParams {

    /**
     * startTime
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * endTime
     */
    @JsonProperty("end_time")
    private String endTime;
}
