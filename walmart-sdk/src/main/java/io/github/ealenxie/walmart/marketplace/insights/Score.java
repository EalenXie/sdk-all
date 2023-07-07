package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:53
 */
@Getter
@Setter
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
