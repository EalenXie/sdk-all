package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 17:46
 */
@Getter
@Setter
public class PickupAddress {
    @JsonProperty("contactPerson")
    private String contactPerson;
    @JsonProperty("contactTel")
    private String contactTel;
    @JsonProperty("contactCountry")
    private String contactCountry;
    @JsonProperty("contactProvince")
    private String contactProvince;
    @JsonProperty("contactCity")
    private String contactCity;
    @JsonProperty("contactDistrict")
    private String contactDistrict;
    @JsonProperty("streetAddress")
    private String streetAddress;
    @JsonProperty("contactPostcode")
    private String contactPostcode;
}
