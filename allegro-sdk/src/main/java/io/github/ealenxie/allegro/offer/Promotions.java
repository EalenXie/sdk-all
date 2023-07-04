package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 16:17
 * @version 1.0
 */
@Getter
@Setter
public class Promotions {
    /**
     * duration
     */
    @JsonProperty("duration")
    private String duration;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
