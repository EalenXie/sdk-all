package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 15:59
 */
@NoArgsConstructor
@Data
public class PromoModifyPayload {

    /**
     * offerCriteria
     */
    @JsonProperty("offerCriteria")
    private List<OfferCriteria> offerCriteria;
    /**
     * modification
     */
    @JsonProperty("modification")
    private PromoModify modification;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private List<PromoModifyAdditionalMarketplaces> additionalMarketplaces;
}
