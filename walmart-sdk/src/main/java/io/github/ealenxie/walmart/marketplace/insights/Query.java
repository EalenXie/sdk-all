package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:18
 */
@Getter
@Setter
public class Query {
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
}
