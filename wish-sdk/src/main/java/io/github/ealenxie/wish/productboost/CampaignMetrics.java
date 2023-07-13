package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 15:25
 */
@NoArgsConstructor
@Data
public class CampaignMetrics {

    /**
     * dailyPerformances
     */
    @JsonProperty("daily_performances")
    private List<DailyPerformance> dailyPerformances;
}
