package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 10:53
 */
@Getter
@Setter
public class Query {
    /**
     * field
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("field")
    private String field;
    /**
     * value
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("value")
    private String value;
}
