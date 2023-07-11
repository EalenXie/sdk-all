package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 14:16
 */
@Getter
@Setter
public class ShippingConfigurationsResponse {
    /**
     * partner
     */
    @JsonProperty("partner")
    private ShippingPartner partner;
    /**
     * configurations
     */
    @JsonProperty("configurations")
    private List<ShippingConfiguration> configurations;
}
