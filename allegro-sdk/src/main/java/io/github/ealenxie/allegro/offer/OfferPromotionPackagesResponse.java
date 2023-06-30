package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 11:07
 */
@Getter
@Setter
public class OfferPromotionPackagesResponse {

    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * basePackages
     */
    @JsonProperty("basePackages")
    private List<BasePackages> basePackages;
    /**
     * extraPackages
     */
    @JsonProperty("extraPackages")
    private List<BasePackages> extraPackages;
    /**
     * additionalMarketplaces
     */
    @JsonProperty("additionalMarketplaces")
    private List<OfferPromotionAdditionalMarketplaces> additionalMarketplaces;
}
