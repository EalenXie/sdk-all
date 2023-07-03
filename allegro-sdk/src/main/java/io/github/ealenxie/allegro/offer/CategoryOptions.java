package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 14:16
 */
@Getter
@Setter
public class CategoryOptions {
    /**
     * advertisement
     */
    @JsonProperty("advertisement")
    private Boolean advertisement;
    /**
     * advertisementPriceOptional
     */
    @JsonProperty("advertisementPriceOptional")
    private Boolean advertisementPriceOptional;
    /**
     * variantsByColorPatternAllowed
     */
    @JsonProperty("variantsByColorPatternAllowed")
    private Boolean variantsByColorPatternAllowed;
    /**
     * offersWithProductPublicationEnabled
     */
    @JsonProperty("offersWithProductPublicationEnabled")
    private Boolean offersWithProductPublicationEnabled;
    /**
     * productCreationEnabled
     */
    @JsonProperty("productCreationEnabled")
    private Boolean productCreationEnabled;
    /**
     * customParametersEnabled
     */
    @JsonProperty("customParametersEnabled")
    private Boolean customParametersEnabled;
    /**
     * sellerCanRequirePurchaseComments
     */
    @JsonProperty("sellerCanRequirePurchaseComments")
    private Boolean sellerCanRequirePurchaseComments;
}
