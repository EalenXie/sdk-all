package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@NoArgsConstructor
@Data
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
