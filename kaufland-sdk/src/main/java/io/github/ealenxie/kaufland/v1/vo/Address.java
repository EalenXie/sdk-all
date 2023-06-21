package io.github.ealenxie.kaufland.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/12 15:00
 */
@Getter
@Setter
public class Address {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("street")
    private String street;
    @JsonProperty("house_number")
    private String houseNumber;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("country")
    private String country;
    @JsonProperty("additional_field")
    private String additionalField;
}
