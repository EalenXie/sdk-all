package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@Getter
@Setter
public class ScoreDetails {
    /**
     * offer
     */
    @JsonProperty("offer")
    private Offer offer;
    /**
     * contentAndDiscoverability
     */
    @JsonProperty("contentAndDiscoverability")
    private ContentAndDiscoverability contentAndDiscoverability;
    /**
     * ratingReviews
     */
    @JsonProperty("ratingReviews")
    private RatingReviews ratingReviews;
}
