package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 10:02
 */
@Getter
@Setter
public class BatchOfferModifyPayload {
    /**
     * modification
     */
    @JsonProperty("modification")
    private BatchOfferModify modification;
    /**
     * offerCriteria
     */
    @JsonProperty("offerCriteria")
    private List<OfferCriteria> offerCriteria;
}
