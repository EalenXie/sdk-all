package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class UserSummaryResponse {

    /**
     * averageRates
     */
    @JsonProperty("averageRates")
    private AverageRates averageRates;
    /**
     * notRecommended
     */
    @JsonProperty("notRecommended")
    private NotRecommended notRecommended;
    /**
     * recommended
     */
    @JsonProperty("recommended")
    private NotRecommended recommended;
    /**
     * recommendedPercentage
     */
    @JsonProperty("recommendedPercentage")
    private String recommendedPercentage;
}
