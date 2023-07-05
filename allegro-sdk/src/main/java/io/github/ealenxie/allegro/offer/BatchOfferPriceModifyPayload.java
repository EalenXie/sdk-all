package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 10:26
 */
@Getter
@Setter
public class BatchOfferPriceModifyPayload {


    /**
     * modification
     */
    @JsonProperty("modification")
    private BatchOfferPriceModify modification;
    /**
     * offerCriteria
     */
    @JsonProperty("offerCriteria")
    private List<OfferCriteria> offerCriteria;
}
