package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 9:40
 * @version 1.0
 */
@Getter
@Setter
public class Visibility {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
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
