package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 13:51
 */
@NoArgsConstructor
@Data
public class OfferTranslation {
    /**
     * description
     */
    @JsonProperty("description")
    private TranslationDescription description;
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
    /**
     * title
     */
    @JsonProperty("title")
    private Title title;
}
