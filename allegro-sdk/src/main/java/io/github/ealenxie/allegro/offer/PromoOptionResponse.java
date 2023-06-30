package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 15:14
 */
@NoArgsConstructor
@Data
public class PromoOptionResponse {

    /**
     * offerId
     */
    @JsonProperty("offerId")
    private String offerId;
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * basePackage
     */
    @JsonProperty("basePackage")
    private PromotionValidPackage basePackage;
    /**
     * extraPackages
     */
    @JsonProperty("extraPackages")
    private List<PromotionValidPackage> extraPackages;
    /**
     * pendingChanges
     */
    @JsonProperty("pendingChanges")
    private PendingChanges pendingChanges;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private List<PromoOptionsAdditionalMarketplaces> additionalMarketplaces;
}
