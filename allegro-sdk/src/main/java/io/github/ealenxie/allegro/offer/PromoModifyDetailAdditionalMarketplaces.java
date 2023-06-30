package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/30 16:17
 */
@NoArgsConstructor
@Data
public class PromoModifyDetailAdditionalMarketplaces {
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
