package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 13:26
 */
@Getter
@Setter
public class VerifyAddressInfoResponse {

    /**
     * 收件人名
     */
    @JsonProperty("oab_firstname")
    private String oabFirstname;
    /**
     * 公司名称
     */
    @JsonProperty("oab_company")
    private String oabCompany;
    /**
     * 公司地址1
     */
    @JsonProperty("oab_street_address1")
    private String oabStreetAddress1;
    /**
     * 州
     */
    @JsonProperty("oab_state")
    private String oabState;
    /**
     * 城市
     */
    @JsonProperty("oab_city")
    private String oabCity;
    /**
     * 邮编
     */
    @JsonProperty("oab_postcode")
    private String oabPostcode;
    /**
     * 国家/地区简称
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 联系电话
     */
    @JsonProperty("oab_phone")
    private String oabPhone;
    /**
     * 联系电话
     */
    @JsonProperty("oab_street_address2")
    private String oabStreetAddress2;
    /**
     * 是否住宅
     */
    @JsonProperty("is_residential")
    private Integer isResidential;


}
