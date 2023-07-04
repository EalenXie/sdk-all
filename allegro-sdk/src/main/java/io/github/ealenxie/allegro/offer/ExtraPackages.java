package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 15:17
 * @version 1.0
 */
@Getter
@Setter
public class ExtraPackages {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * republish
     */
    @JsonProperty("republish")
    private Boolean republish;
}
