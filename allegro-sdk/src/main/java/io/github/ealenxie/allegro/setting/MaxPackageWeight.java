package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 14:25
 * @version 1.0
 */
@Getter
@Setter
public class MaxPackageWeight {
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
}
