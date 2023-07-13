package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:14
 * @version 1.0
 */
@Getter
@Setter
public class UnitValuePayload {
    /**
     * value
     */
    @JsonProperty("value")
    private Integer value;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
}
