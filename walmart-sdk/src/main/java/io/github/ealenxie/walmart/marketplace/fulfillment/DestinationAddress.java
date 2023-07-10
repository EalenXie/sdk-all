package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 13:37
 */
@NoArgsConstructor
@Data
public class DestinationAddress {
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * addressType
     */
    @JsonProperty("addressType")
    private String addressType;
    /**
     * postalCode
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * addressLineOne
     */
    @JsonProperty("addressLineOne")
    private String addressLineOne;
    /**
     * addressLineTwo
     */
    @JsonProperty("addressLineTwo")
    private String addressLineTwo;
    /**
     * isPOBox
     */
    @JsonProperty("isPOBox")
    private Boolean isPOBox;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * stateCode
     */
    @JsonProperty("stateCode")
    private String stateCode;


}
