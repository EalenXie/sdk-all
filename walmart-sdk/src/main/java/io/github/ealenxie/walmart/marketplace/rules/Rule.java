package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:22
 */
@Getter
@Setter
public class Rule {
    /**
     * conditions
     */
    @JsonProperty("conditions")
    private List<Condition> conditions;
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
     * skuProcessingStatus
     */
    @JsonProperty("skuProcessingStatus")
    private String skuProcessingStatus;
    /**
     * ruleAction
     */
    @JsonProperty("ruleAction")
    private RuleAction ruleAction;
}
