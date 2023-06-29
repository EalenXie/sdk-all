package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class SelfSendTo4pxInfo {
    /**
     * 预约送仓最早时间
     * <p>
     * *注：时间格式的传入值需要转换为long类型格式。
     */
    @JsonProperty("booking_earliest_time")
    private String bookingEarliestTime;

    /**
     * 预约送仓最晚时间
     * <p>
     * *注：时间格式的传入值需要转换为long类型格式。
     */
    @JsonProperty("booking_latest_time")
    private String bookingLatestTime;
}
