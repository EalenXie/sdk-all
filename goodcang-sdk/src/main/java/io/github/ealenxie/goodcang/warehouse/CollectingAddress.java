package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 9:50
 */
@Getter
@Setter
public class CollectingAddress {
    /**
     * 揽收联系人-名
     */
    @JsonProperty("ca_first_name")
    private String caFirstName;
    /**
     * 揽收联系人-姓
     */
    @JsonProperty("ca_last_name")
    private String caLastName;
    /**
     * 揽收联系人电话
     */
    @JsonProperty("ca_contact_phone")
    private String caContactPhone;
    /**
     * 揽收地址国家/地区
     */
    @JsonProperty("ca_country_code")
    private String caCountryCode;
    /**
     * 揽收地址州/省份
     */
    @JsonProperty("ca_state")
    private String caState;
    /**
     * 揽收地址城市
     */
    @JsonProperty("ca_city")
    private String caCity;
    /**
     * 揽收地址邮编
     */
    @JsonProperty("ca_zipcode")
    private String caZipcode;
    /**
     * 揽收地址1
     */
    @JsonProperty("ca_address1")
    private String caAddress1;
    /**
     * 揽收地址2
     */
    @JsonProperty("ca_address2")
    private String caAddress2;
}
