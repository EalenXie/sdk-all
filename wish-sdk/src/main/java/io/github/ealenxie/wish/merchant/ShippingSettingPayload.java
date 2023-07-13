package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 10:08
 */
@NoArgsConstructor
@Data
public class ShippingSettingPayload {

    /**
     * enabled
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * countryCode
     */
    @JsonProperty("country_code")
    private String countryCode;
}
