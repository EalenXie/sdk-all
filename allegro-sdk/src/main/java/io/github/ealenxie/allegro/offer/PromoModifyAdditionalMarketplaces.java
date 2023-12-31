package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/30 16:00
 */
@Getter
@Setter
public class PromoModifyAdditionalMarketplaces {
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * modification
     */
    @JsonProperty("modification")
    private PromoModify modification;
}
