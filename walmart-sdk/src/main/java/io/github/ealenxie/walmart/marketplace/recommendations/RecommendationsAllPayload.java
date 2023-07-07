package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:33
 */
@NoArgsConstructor
@Data
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
