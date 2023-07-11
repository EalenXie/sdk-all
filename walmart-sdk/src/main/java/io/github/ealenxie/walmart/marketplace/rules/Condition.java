package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 10:17
 */
@NoArgsConstructor
@Data
public class Condition {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * operator
     */
    @JsonProperty("operator")
    private String operator;
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
}
