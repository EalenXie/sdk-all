package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 13:51
 */
@Getter
@Setter
public class OfferTranslationResponse {

    /**
     * translations
     */
    @JsonProperty("translations")
    private List<OfferTranslation> translations;
}
