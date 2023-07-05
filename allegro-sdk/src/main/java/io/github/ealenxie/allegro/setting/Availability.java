package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.offer.Extensions;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 10:38
 * @version 1.0
 */
@Getter
@Setter
public class Availability {
    /**
     * range
     */
    @JsonProperty("range")
    private String range;
    /**
     * restrictionCause
     */
    @JsonProperty("restrictionCause")
    private Extensions restrictionCause;
}
