package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 9:19
 * @version 1.0
 */
@Getter
@Setter
public class OfferRateResponse {

    /**
     * averageScore
     */
    @JsonProperty("averageScore")
    private String averageScore;
    /**
     * scoreDistribution
     */
    @JsonProperty("scoreDistribution")
    private List<ScoreDistribution> scoreDistribution;
    /**
     * totalResponses
     */
    @JsonProperty("totalResponses")
    private Integer totalResponses;
    /**
     * sizeFeedback
     */
    @JsonProperty("sizeFeedback")
    private List<ScoreDistribution> sizeFeedback;
}
