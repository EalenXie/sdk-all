package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 10:00
 */
@NoArgsConstructor
@Data
public class SettingsResponse {

    /**
     * unificationInitiative
     */
    @JsonProperty("unification_initiative")
    private StatusPayload unificationInitiative;
    /**
     * fashionExperience
     */
    @JsonProperty("fashion_experience")
    private StatusPayload fashionExperience;
    /**
     * automatedListingReviewExperience
     */
    @JsonProperty("automated_listing_review_experience")
    private StatusPayload automatedListingReviewExperience;
}
