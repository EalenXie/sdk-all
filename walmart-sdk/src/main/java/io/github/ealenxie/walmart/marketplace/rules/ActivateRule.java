package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 10:11
 */
@NoArgsConstructor
@Data
public class ActivateRule {
    /**
     * ruleId
     */
    @JsonProperty("ruleId")
    private String ruleId;
    /**
     * ruleStatus
     */
    @JsonProperty("ruleStatus")
    private String ruleStatus;
}
