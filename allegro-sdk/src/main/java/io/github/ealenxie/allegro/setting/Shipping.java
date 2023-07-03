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
public class Shipping {
    /**
     * defaultX
     */
    @JsonProperty("default")
    private ShippingTime defaultX;
    /**
     * customizable
     */
    @JsonProperty("customizable")
    private Boolean customizable;
}
