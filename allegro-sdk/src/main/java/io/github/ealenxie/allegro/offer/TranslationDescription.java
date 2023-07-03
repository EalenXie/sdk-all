package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 13:51
 */
@Getter
@Setter
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
