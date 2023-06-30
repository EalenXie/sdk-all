package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 15:20
 */
@NoArgsConstructor
@Data
public class PromoOptionsAdditionalMarketplacesPayload {
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * modifications
     */
    @JsonProperty("modifications")
    private List<PromoOptionModify> modifications;
}
