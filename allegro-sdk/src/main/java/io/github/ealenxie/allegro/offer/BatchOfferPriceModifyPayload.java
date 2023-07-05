package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 10:26
 */
@NoArgsConstructor
@Data
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
