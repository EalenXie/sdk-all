package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 13:51
 */
@NoArgsConstructor
@Data
public class Title {
    /**
     * translation
     */
    @JsonProperty("translation")
    private String translation;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
