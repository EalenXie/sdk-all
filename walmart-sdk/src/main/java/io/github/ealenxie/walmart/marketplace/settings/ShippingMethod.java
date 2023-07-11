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
public class ShippingMethod {
    /**
     * shipMethod
     */
    @JsonProperty("shipMethod")
    private String shipMethod;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * configurations
     */
    @JsonProperty("configurations")
    private List<ShippingMethodConfiguration> configurations;
}
