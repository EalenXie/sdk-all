package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:47
 */
@Getter
@Setter
public class RecipientInfo {

    @JsonProperty("areaCode")
    private String areaCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("cityCode")
    private String cityCode;
    @JsonProperty("company")
    private String company;
    @JsonProperty("country")
    private String country;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("definedUserCode")
    private String definedUserCode;
    @JsonProperty("district")
    private String district;
    @JsonProperty("districtCode")
    private String districtCode;
    @JsonProperty("email")
    private String email;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("houseNumber")
    private String houseNumber;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("phone2")
    private String phone2;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("state")
    private String state;
    @JsonProperty("stateCode")
    private String stateCode;
    @JsonProperty("street")
    private String street;
    @JsonProperty("certificateInfo")
    private CertificateInfo certificateInfo;
}
