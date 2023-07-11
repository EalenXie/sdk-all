package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 13:59
 */
@Getter
@Setter
public class Configuration {
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
     * perShippingCharge
     */
    @JsonProperty("perShippingCharge")
    private PerShippingCharge perShippingCharge;
    /**
     * tieredShippingCharges
     */
    @JsonProperty("tieredShippingCharges")
    private List<TieredShippingCharge> tieredShippingCharges;
}
