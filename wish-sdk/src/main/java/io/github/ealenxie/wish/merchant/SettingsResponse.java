package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 10:00
 */
@Getter
@Setter
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
