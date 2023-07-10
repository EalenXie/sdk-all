package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:23
 */
@NoArgsConstructor
@Data
public class AddOnServices {
    /**
     * serviceType
     */
    @JsonProperty("serviceType")
    private String serviceType;
}
