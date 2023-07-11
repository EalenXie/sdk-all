package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:37
 */
@NoArgsConstructor
@Data
public class CreateRules {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * priority
     */
    @JsonProperty("priority")
    private String priority;
    /**
     * conditions
     */
    @JsonProperty("conditions")
    private List<Condition> conditions;
}
