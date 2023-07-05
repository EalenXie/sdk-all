package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 10:05
 */
@Getter
@Setter
public class OfferModifyPublish {
    /**
     * duration
     */
    @JsonProperty("duration")
    private String duration;
    /**
     * durationUnlimited
     */
    @JsonProperty("durationUnlimited")
    private Boolean durationUnlimited;
    /**
     * marketplaces
     */
    @JsonProperty("marketplaces")
    private OfferModifyPublishMarketplaces marketplaces;
}
