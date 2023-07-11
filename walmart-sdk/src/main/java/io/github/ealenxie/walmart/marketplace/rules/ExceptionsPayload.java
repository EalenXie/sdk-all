package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 9:52
 */
@NoArgsConstructor
@Data
public class ExceptionsPayload {


    /**
     * ruleHeader
     */
    @JsonProperty("ruleHeader")
    private RuleHeader ruleHeader;
    /**
     * rules
     */
    @JsonProperty("rules")
    private RuleSkus rules;
}
