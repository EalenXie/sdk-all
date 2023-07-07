package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:08
 */
@Getter
@Setter
public class RecommendationsFilterPayload {
    /**
     * recommendationType
     */
    @JsonProperty("recommendationType")
    private String recommendationType;
    /**
     * meta
     */
    @JsonProperty("meta")
    private Meta meta;
    /**
     * filterCriteria
     */
    @JsonProperty("filterCriteria")
    private FilterCriteria filterCriteria;
}
