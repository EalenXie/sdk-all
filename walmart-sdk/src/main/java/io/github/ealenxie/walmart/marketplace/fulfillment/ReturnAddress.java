package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:06
 */
@NoArgsConstructor
@Data
public class ReturnAddress {
    /**
     * addressLine1
     */
    @JsonProperty("addressLine1")
    private String addressLine1;
    /**
     * addressLine2
     */
    @JsonProperty("addressLine2")
    private String addressLine2;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * stateCode
     */
    @JsonProperty("stateCode")
    private String stateCode;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * postalCode
     */
    @JsonProperty("postalCode")
    private String postalCode;
}
