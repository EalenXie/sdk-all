package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:21
 */
@NoArgsConstructor
@Data
public class CategorizationRecord {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * numberOfItemRecommendations
     */
    @JsonProperty("numberOfItemRecommendations")
    private Integer numberOfItemRecommendations;
}
