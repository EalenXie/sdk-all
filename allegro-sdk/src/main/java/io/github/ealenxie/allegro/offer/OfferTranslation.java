package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 13:51
 */
@Getter
@Setter
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
