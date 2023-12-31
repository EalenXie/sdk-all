package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:28
 */
@Getter
@Setter
public class RecommendationsRejectIdentifierPayload {
    /**
     * recommendationType
     */
    @JsonProperty("recommendationType")
    private String recommendationType;
    /**
     * itemRecommendationUniqueIds
     */
    @JsonProperty("itemRecommendationUniqueIds")
    private List<String> itemRecommendationUniqueIds;
    /**
     * rejectionCodes
     */
    @JsonProperty("rejectionCodes")
    private List<String> rejectionCodes;
}
