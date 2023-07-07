package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class RatingReviews {
    /**
     * maxRating
     */
    @JsonProperty("maxRating")
    private Integer maxRating;
    /**
     * ratingCount
     */
    @JsonProperty("ratingCount")
    private Integer ratingCount;
}
