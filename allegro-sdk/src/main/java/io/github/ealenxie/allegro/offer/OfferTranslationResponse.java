package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 13:51
 */
@NoArgsConstructor
@Data
public class OfferTranslationResponse {

    /**
     * translations
     */
    @JsonProperty("translations")
    private List<OfferTranslation> translations;
}
