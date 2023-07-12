package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 9:44
 */
@Getter
@Setter
public class RuleInactivatePayload {
    /**
     * ruleHeader
     */
    @JsonProperty("ruleHeader")
    private RuleHeader ruleHeader;
    /**
     * rules
     */
    @JsonProperty("rules")
    private List<RuleIdStatus> rules;
}
