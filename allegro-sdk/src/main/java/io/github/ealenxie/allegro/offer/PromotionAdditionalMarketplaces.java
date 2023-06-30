package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 11:08
 */
@Getter
@Setter
public class PromotionAdditionalMarketplaces {
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * basePackages
     */
    @JsonProperty("basePackages")
    private List<PromotionPackage> basePackages;
    /**
     * extraPackages
     */
    @JsonProperty("extraPackages")
    private List<PromotionPackage> extraPackages;
}
