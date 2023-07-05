package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 12:59
 */
@NoArgsConstructor
@Data
public class SuggestionItem {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * text
     */
    @JsonProperty("text")
    private String text;
}
