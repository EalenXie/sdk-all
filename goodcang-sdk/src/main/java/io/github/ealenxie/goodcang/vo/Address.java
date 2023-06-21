package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/9 11:36
 */
@Getter
@Setter
public class Address {
    @JsonProperty("state")
    private String state;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("contacter")
    private String contacter;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("street_address1")
    private String streetAddress1;
    @JsonProperty("street_address2")
    private String streetAddress2;
    @JsonProperty("street_number")
    private String streetNumber;
}
