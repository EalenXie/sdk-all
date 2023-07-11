package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:17
 */
@Getter
@Setter
public class RulePayload {
    /**
     * conditions
     */
    @JsonProperty("conditions")
    private List<Condition> conditions;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * priority
     */
    @JsonProperty("priority")
    private String priority;
    /**
     * ruleAction
     */
    @JsonProperty("ruleAction")
    private RuleAction ruleAction;
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
