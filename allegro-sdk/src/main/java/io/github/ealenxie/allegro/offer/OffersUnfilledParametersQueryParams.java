package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 11:11
 */
@Getter
@Setter
public class OffersUnfilledParametersQueryParams extends PageQueryParams {

    @JsonProperty("offer.id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String offerId;

    @JsonProperty("parameterType")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String parameterType;
}
