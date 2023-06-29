package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 10:13
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
