package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 16:14
 */
@NoArgsConstructor
@Data
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
