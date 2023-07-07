package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 11:33
 */
@Getter
@Setter
public class RecommendationsAllPayload {

    /**
     * recommendationType
     */
    @JsonProperty("recommendationType")
    private String recommendationType;
    /**
     * meta
     */
    @JsonProperty("meta")
    private LimitPayload meta;
}
