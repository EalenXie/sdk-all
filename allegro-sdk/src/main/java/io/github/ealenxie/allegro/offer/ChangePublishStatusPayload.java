package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 9:50
 */
@Getter
@Setter
public class ChangePublishStatusPayload {
    /**
     * offerCriteria
     */
    @JsonProperty("offerCriteria")
    private List<OfferCriteria> offerCriteria;
    /**
     * publication
     */
    @JsonProperty("publication")
    private ChangePublish publication;
}
