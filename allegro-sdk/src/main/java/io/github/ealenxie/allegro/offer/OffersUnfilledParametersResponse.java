package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 11:12
 */
@Getter
@Setter
public class OffersUnfilledParametersResponse {

    /**
     * offers
     */
    @JsonProperty("offers")
    private List<UnfilledParameterOffer> offers;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
