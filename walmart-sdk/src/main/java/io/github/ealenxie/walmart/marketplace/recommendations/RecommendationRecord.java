package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:35
 */
@NoArgsConstructor
@Data
public class RecommendationRecord {
    /**
     * itemRecommendationUniqueId
     */
    @JsonProperty("itemRecommendationUniqueId")
    private String itemRecommendationUniqueId;
    /**
     * itemDetails
     */
    @JsonProperty("itemDetails")
    private ItemDetails itemDetails;
}
