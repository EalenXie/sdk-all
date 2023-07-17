package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:22
 */
@Getter
@Setter
public class PickupAddress {
    /**
     * addressCode
     */
    @JsonProperty("addressCode")
    private String addressCode;
    /**
     * zipCode
     */
    @JsonProperty("zipCode")
    private String zipCode;
    /**
     * address
     */
    @JsonProperty("address")
    private String address;
    /**
     * districtName
     */
    @JsonProperty("districtName")
    private String districtName;
    /**
     * contactPerson
     */
    @JsonProperty("contactPerson")
    private String contactPerson;
    /**
     * isDefault
     */
    @JsonProperty("isDefault")
    private String isDefault;
    /**
     * cityName
     */
    @JsonProperty("cityName")
    private String cityName;
    /**
     * stateName
     */
    @JsonProperty("stateName")
    private String stateName;
    /**
     * street
     */
    @JsonProperty("street")
    private String street;
    /**
     * houseNo
     */
    @JsonProperty("houseNo")
    private String houseNo;
    /**
     * addressline2
     */
    @JsonProperty("addressline2")
    private String addressline2;
    /**
     * addressline1
     */
    @JsonProperty("addressline1")
    private String addressline1;
    /**
     * countryName
     */
    @JsonProperty("countryName")
    private String countryName;
    /**
     * contactPhone
     */
    @JsonProperty("contactPhone")
    private String contactPhone;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
}
