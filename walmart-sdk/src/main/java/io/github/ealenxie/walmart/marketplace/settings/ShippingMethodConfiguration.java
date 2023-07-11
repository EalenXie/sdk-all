package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 11:19
 */
@Getter
@Setter
public class ShippingMethodConfiguration {
    /**
     * regions
     */
    @JsonProperty("regions")
    private List<Region> regions;
    /**
     * addressTypes
     */
    @JsonProperty("addressTypes")
    private List<String> addressTypes;
    /**
     * transitTime
     */
    @JsonProperty("transitTime")
    private Integer transitTime;
    /**
     * tieredShippingCharges
     */
    @JsonProperty("tieredShippingCharges")
    private List<TieredShippingCharge> tieredShippingCharges;
}
