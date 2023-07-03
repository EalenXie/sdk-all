package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 14:01
 */
@Getter
@Setter
public class UpdateOfferTranslationPayload {

    /**
     * description
     */
    @JsonProperty("description")
    private DescriptionPayload description;
    /**
     * title
     */
    @JsonProperty("title")
    private Title title;
}
