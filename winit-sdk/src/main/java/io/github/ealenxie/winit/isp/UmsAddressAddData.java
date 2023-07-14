package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:27
 */
@Getter
@Setter
public class UmsAddressAddData {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * cityCode
     */
    @JsonProperty("cityCode")
    private String cityCode;
    /**
     * contactNumber
     */
    @JsonProperty("contactNumber")
    private String contactNumber;
    /**
     * contactPerson
     */
    @JsonProperty("contactPerson")
    private String contactPerson;
    /**
     * contactPersonEn
     */
    @JsonProperty("contactPersonEn")
    private String contactPersonEn;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * detailCn
     */
    @JsonProperty("detailCn")
    private String detailCn;
    /**
     * detailEn
     */
    @JsonProperty("detailEn")
    private String detailEn;
    /**
     * districtCode
     */
    @JsonProperty("districtCode")
    private String districtCode;
    /**
     * districtName
     */
    @JsonProperty("districtName")
    private String districtName;
    /**
     * doorplate
     */
    @JsonProperty("doorplate")
    private String doorplate;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * postCode
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
}
