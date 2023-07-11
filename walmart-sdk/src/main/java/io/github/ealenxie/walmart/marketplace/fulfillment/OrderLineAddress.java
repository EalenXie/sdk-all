package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@Getter
@Setter
public class OrderLineAddress {
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
     * addressType
     */
    @JsonProperty("addressType")
    private String addressType;
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
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
    /**
     * stateOrProvinceName
     */
    @JsonProperty("stateOrProvinceName")
    private String stateOrProvinceName;
    /**
     * stateOrProvinceCode
     */
    @JsonProperty("stateOrProvinceCode")
    private String stateOrProvinceCode;
}
