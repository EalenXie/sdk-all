package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 15:23
 * @version 1.0
 */
@Getter
@Setter
public class ShippingRatesConstraints {
    /**
     * allowed
     */
    @JsonProperty("allowed")
    private Boolean allowed;
    /**
     * maxQuantityPerPackage
     */
    @JsonProperty("maxQuantityPerPackage")
    private MaxQuantityPerPackage maxQuantityPerPackage;
    /**
     * maxPackageWeight
     */
    @JsonProperty("maxPackageWeight")
    private PackageWeight maxPackageWeight;
    /**
     * firstItemRate
     */
    @JsonProperty("firstItemRate")
    private ItemRate firstItemRate;
    /**
     * nextItemRate
     */
    @JsonProperty("nextItemRate")
    private ItemRate nextItemRate;
    /**
     * shippingTime
     */
    @JsonProperty("shippingTime")
    private Shipping shippingTime;
}
