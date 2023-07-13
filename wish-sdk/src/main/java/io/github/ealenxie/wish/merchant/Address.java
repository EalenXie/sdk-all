package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 9:56
 */
@Getter
@Setter
public class Address {
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * shipToName
     */
    @JsonProperty("ship_to_name")
    private String shipToName;
    /**
     * streetAddress2
     */
    @JsonProperty("street_address2")
    private String streetAddress2;
    /**
     * streetAddress1
     */
    @JsonProperty("street_address1")
    private String streetAddress1;
    /**
     * zipcode
     */
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * countryCode
     */
    @JsonProperty("country_code")
    private String countryCode;
}
