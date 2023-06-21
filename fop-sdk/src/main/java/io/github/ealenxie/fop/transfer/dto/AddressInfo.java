package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class AddressInfo {
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("company")
    private String company;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("phone2")
    private String phone2;
    @JsonProperty("email")
    private String email;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("state")
    private String state;
    @JsonProperty("city")
    private String city;
    @JsonProperty("district")
    private String district;
    @JsonProperty("street")
    private String street;
    @JsonProperty("houseNumber")
    private String houseNumber;
}
