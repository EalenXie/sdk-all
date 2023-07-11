package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:14
 */
@NoArgsConstructor
@Data
public class RulesPayload {
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
    /**
     * actions
     */
    @JsonProperty("actions")
    private List<RuleAction> actions;
}
