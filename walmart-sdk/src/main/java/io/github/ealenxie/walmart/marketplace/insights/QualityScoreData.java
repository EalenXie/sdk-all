package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class QualityScoreData {
    /**
     * score
     */
    @JsonProperty("score")
    private BigDecimal score;
    /**
     * values
     */
    @JsonProperty("values")
    private List<ScoreValuePayload> values;
}
