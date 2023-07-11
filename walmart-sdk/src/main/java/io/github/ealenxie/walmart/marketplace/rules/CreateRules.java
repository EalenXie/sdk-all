package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:37
 */
@Getter
@Setter
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
