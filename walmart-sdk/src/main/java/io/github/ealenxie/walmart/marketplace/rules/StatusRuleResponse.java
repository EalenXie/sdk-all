package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:33
 */
@NoArgsConstructor
@Data
public class StatusRuleResponse {

    /**
     * rules
     */
    @JsonProperty("rules")
    private List<RulePayload> rules;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
