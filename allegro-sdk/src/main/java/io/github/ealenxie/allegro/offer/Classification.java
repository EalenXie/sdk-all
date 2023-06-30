package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 16:14
 */
@Getter
@Setter
public class Classification {
    /**
     * fulfilled
     */
    @JsonProperty("fulfilled")
    private Boolean fulfilled;
    /**
     * lastChanged
     */
    @JsonProperty("lastChanged")
    private String lastChanged;
}
