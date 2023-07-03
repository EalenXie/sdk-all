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
public class ItemRate {
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
     * currency
     */
    @JsonProperty("currency")
    private String currency;
}
