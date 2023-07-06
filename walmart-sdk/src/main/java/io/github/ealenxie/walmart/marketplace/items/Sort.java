package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 15:07
 * @version 1.0
 */
@Getter
@Setter
public class Sort {
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * order
     */
    @JsonProperty("order")
    private String order;
}
