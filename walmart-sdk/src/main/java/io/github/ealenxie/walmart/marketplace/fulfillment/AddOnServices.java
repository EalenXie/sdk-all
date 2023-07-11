package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 14:23
 */
@Getter
@Setter
public class AddOnServices {
    /**
     * serviceType
     */
    @JsonProperty("serviceType")
    private String serviceType;
}
