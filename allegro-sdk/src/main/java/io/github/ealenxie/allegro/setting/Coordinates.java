package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 10:32
 * @version 1.0
 */
@Getter
@Setter
public class Coordinates {
    /**
     * lat
     */
    @JsonProperty("lat")
    private Integer lat;
    /**
     * lon
     */
    @JsonProperty("lon")
    private Integer lon;
}
