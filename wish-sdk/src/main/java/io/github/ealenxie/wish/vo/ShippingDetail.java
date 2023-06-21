package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class ShippingDetail {
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("street_address3")
    private String streetAddress3;
    @JsonProperty("street_address2")
    private String streetAddress2;
    @JsonProperty("street_address1")
    private String streetAddress1;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("phone_number")
    private PhoneNumber phoneNumber;
    @JsonProperty("region")
    private String region;
    @JsonProperty("neighborhood")
    private String neighborhood;
    @JsonProperty("name")
    private String name;
}
