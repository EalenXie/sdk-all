package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:11
 */
@NoArgsConstructor
@Data
public class RuleActivatePayload {
    /**
     * ruleHeader
     */
    @JsonProperty("ruleHeader")
    private RuleHeader ruleHeader;
    /**
     * rules
     */
    @JsonProperty("rules")
    private List<ActivateRule> rules;
}
