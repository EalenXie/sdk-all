package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 15:20
 */
@Getter
@Setter
public class PromoOptionPayload {

    /**
     * modifications
     */
    @JsonProperty("modifications")
    private List<PromoOptionModify> modifications;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private List<PromoOptionsAdditionalMarketplacesPayload> additionalMarketplaces;
}
