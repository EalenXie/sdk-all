package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:19
 */
@Getter
@Setter
public class TieredShippingCharge {
    /**
     * minLimit
     */
    @JsonProperty("minLimit")
    private Integer minLimit;
    /**
     * maxLimit
     */
    @JsonProperty("maxLimit")
    private Integer maxLimit;
    /**
     * shipCharge
     */
    @JsonProperty("shipCharge")
    private Money shipCharge;
}
