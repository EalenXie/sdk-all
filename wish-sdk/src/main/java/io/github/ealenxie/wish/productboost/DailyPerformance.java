package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 15:26
 */
@Getter
@Setter
public class DailyPerformance {
    /**
     * date
     */
    @JsonProperty("date")
    private String date;
    /**
     * stats
     */
    @JsonProperty("stats")
    private List<Stats> stats;
}
