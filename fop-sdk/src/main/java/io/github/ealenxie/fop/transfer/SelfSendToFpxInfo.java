package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class SelfSendToFpxInfo {
    /**
     * 预约送仓最早时间
     * <p>
     * *注：时间传入必须是时间戳
     */
    @JsonProperty("bookingEarliestTime")
    private String bookingEarliestTime;

    /**
     * 预约送仓最晚时间
     * <p>
     * *注：时间传入必须是时间戳
     */
    @JsonProperty("bookingLatestTime")
    private String bookingLatestTime;
}
