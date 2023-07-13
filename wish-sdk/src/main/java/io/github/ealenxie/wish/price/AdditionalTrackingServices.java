package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:24
 * @version 1.0
 */
@Getter
@Setter
public class AdditionalTrackingServices {
    /**
     * serviceType
     */
    @JsonProperty("service_type")
    private String serviceType;
    /**
     * addOnPrice
     */
    @JsonProperty("add_on_price")
    private Money addOnPrice;
}
