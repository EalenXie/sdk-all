package io.github.ealenxie.walmart.marketplace.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 10:14
 */
@Getter
@Setter
public class TwoDayShippingRegions {
    /**
     * regionCode
     */
    @JsonProperty("regionCode")
    private String regionCode;
    /**
     * subRegions
     */
    @JsonProperty("subRegions")
    private List<SubRegions> subRegions;
}
