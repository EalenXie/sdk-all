package io.github.ealenxie.paypal.paymentexperience;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/29 11:37
 */
@NoArgsConstructor
@Data
public class InputFields {
    /**
     * noShipping
     */
    @JsonProperty("no_shipping")
    private Integer noShipping;
    /**
     * addressOverride
     */
    @JsonProperty("address_override")
    private Integer addressOverride;
}
