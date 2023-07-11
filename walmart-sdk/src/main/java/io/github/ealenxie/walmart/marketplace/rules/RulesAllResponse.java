package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:21
 */
@NoArgsConstructor
@Data
public class RulesAllResponse {

    /**
     * rules
     */
    @JsonProperty("rules")
    private List<Rule> rules;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
