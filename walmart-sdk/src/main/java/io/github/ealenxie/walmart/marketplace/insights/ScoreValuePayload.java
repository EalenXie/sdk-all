package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class ScoreValuePayload {
    /**
     * impact
     */
    @JsonProperty("impact")
    private String impact;
    /**
     * scoreType
     */
    @JsonProperty("scoreType")
    private String scoreType;
    /**
     * scoreValue
     */
    @JsonProperty("scoreValue")
    private Integer scoreValue;
}
