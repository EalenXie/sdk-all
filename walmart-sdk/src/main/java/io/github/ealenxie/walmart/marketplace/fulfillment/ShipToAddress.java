package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 14:03
 */
@Getter
@Setter
public class ShipToAddress {
    /**
     * fcName
     */
    @JsonProperty("fcName")
    private String fcName;
    /**
     * addressLine1
     */
    @JsonProperty("addressLine1")
    private String addressLine1;
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
