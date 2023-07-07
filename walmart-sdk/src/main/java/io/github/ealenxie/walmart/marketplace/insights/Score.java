package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 14:53
 */
@NoArgsConstructor
@Data
public class Score {
    /**
     * offerScore
     */
    @JsonProperty("offerScore")
    private Integer offerScore;
    /**
     * ratingReviewScore
     */
    @JsonProperty("ratingReviewScore")
    private Double ratingReviewScore;
    /**
     * contentScore
     */
    @JsonProperty("contentScore")
    private Double contentScore;
}
