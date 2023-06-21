package io.github.ealenxie.manomano.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/8/16 9:45
 */
@Getter
@Setter
public class ShippingAddress {
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("company")
    private String company;
    @JsonProperty("address_1")
    private String address1;
    @JsonProperty("address_2")
    private String address2;
    @JsonProperty("address_3")
    private String address3;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_iso")
    private String countryIso;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("region_1")
    private String region1;
    @JsonProperty("region_2")
    private String region2;
    @JsonProperty("region_3")
    private String region3;
}
