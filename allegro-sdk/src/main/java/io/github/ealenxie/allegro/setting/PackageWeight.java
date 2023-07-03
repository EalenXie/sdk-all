package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 15:23
 * @version 1.0
 */
@Getter
@Setter
public class PackageWeight {
    /**
     * supported
     */
    @JsonProperty("supported")
    private Boolean supported;
    /**
     * min
     */
    @JsonProperty("min")
    private String min;
    /**
     * max
     */
    @JsonProperty("max")
    private String max;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
}
