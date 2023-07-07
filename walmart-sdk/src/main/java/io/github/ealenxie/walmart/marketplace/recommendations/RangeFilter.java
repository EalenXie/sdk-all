package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 11:23
 */
@Getter
@Setter
public class RangeFilter {
    /**
     * parameter
     */
    @JsonProperty("parameter")
    private String parameter;
    /**
     * from
     */
    @JsonProperty("from")
    private String from;
    /**
     * to
     */
    @JsonProperty("to")
    private String to;
}
