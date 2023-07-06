package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 15:07
 * @version 1.0
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
