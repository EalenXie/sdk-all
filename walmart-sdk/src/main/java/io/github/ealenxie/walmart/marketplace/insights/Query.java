package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:18
 */
@NoArgsConstructor
@Data
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
