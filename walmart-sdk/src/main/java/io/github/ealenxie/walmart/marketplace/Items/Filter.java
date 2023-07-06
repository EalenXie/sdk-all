package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 15:07
 * @version 1.0
 */
@Getter
@Setter
public class Filter {
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * op
     */
    @JsonProperty("op")
    private String op;
    /**
     * values
     */
    @JsonProperty("values")
    private List<String> values;
}
