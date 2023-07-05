package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.Money;
import io.github.ealenxie.allegro.offer.RangeValue;
import io.github.ealenxie.allegro.order.UnitPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 14:25
 * @version 1.0
 */
@Getter
@Setter
public class Rates {
    /**
     * deliveryMethod
     */
    @JsonProperty("deliveryMethod")
    private IdPayload deliveryMethod;
    /**
     * maxQuantityPerPackage
     */
    @JsonProperty("maxQuantityPerPackage")
    private Integer maxQuantityPerPackage;
    /**
     * maxPackageWeight
     */
    @JsonProperty("maxPackageWeight")
    private UnitPayload maxPackageWeight;
    /**
     * firstItemRate
     */
    @JsonProperty("firstItemRate")
    private Money firstItemRate;
    /**
     * nextItemRate
     */
    @JsonProperty("nextItemRate")
    private Money nextItemRate;
    /**
     * shippingTime
     */
    @JsonProperty("shippingTime")
    private RangeValue shippingTime;
}
