package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 14:25
 */
@Getter
@Setter
public class Restrictions {
    /**
     * min
     */
    @JsonProperty("min")
    private Integer min;
    /**
     * max
     */
    @JsonProperty("max")
    private Integer max;
    /**
     * range
     */
    @JsonProperty("range")
    private Boolean range;
}
