package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 15:16
 * @version 1.0
 */
@Getter
@Setter
public class CalculateFeePayload {

    /**
     * offer
     */
    @JsonProperty("offer")
    private AllegroOffer offer;
    /**
     * classifiedsPackages
     */
    @JsonProperty("classifiedsPackages")
    private ClassifiedsPackages classifiedsPackages;
    /**
     * marketplaceId
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
}
