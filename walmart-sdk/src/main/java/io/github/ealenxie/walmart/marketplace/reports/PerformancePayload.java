package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 10:27
 */
@NoArgsConstructor
@Data
public class PerformancePayload {
    /**
     * $7day
     */
    @JsonProperty("7DAY")
    private DayReportPayload day7;
    /**
     * $14day
     */
    @JsonProperty("14DAY")
    private DayReportPayload day14;
    /**
     * $30day
     */
    @JsonProperty("30DAY")
    private DayReportPayload day30;
    /**
     * $60day
     */
    @JsonProperty("60DAY")
    private DayReportPayload day60;
    /**
     * $90day
     */
    @JsonProperty("90DAY")
    private DayReportPayload day90;
}
