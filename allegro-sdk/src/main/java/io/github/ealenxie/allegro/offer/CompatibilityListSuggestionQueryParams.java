package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 12:57
 */
@Getter
@Setter
public class CompatibilityListSuggestionQueryParams {

    @JsonProperty("offer.id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String offerId;
    @JsonProperty("product.id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String productId;
    @JsonProperty("language")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String language;
}
