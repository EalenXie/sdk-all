package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:16
 */
@Getter
@Setter
public class UpdateShippingAreaToRuleResponse {

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
