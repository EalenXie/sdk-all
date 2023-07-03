package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 13:51
 */
@NoArgsConstructor
@Data
public class TranslationDescription {
    /**
     * translation
     */
    @JsonProperty("translation")
    private Translation translation;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
