package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 9:50
 * @version 1.0
 */
@Getter
@Setter
public class OriginAddress {
    /**
     * city
     */
    @JsonProperty("city")
    private String city;
    /**
     * country
     */
    @JsonProperty("country")
    private String country;
    /**
     * streetAddress3
     */
    @JsonProperty("street_address3")
    private String streetAddress3;
    /**
     * zipcode
     */
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * streetAddress1
     */
    @JsonProperty("street_address1")
    private String streetAddress1;
    /**
     * streetAddress2
     */
    @JsonProperty("street_address2")
    private String streetAddress2;
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
