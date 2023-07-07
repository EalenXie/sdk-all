package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:53
 */
@Getter
@Setter
public class ListingQualityScorePayload {
    /**
     * score
     */
    @JsonProperty("score")
    private Score score;
    /**
     * postPurchaseQuality
     */
    @JsonProperty("postPurchaseQuality")
    private PostPurchaseQuality postPurchaseQuality;
    /**
     * overAllQuality
     */
    @JsonProperty("overAllQuality")
    private Double overAllQuality;
}
