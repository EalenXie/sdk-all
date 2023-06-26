package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 9:50
 */
@Getter
@Setter
public class ShiperAddress {
    /**
     * 联系人
     */
    @JsonProperty("sa_contacter")
    private String saContacter;
    /**
     * 联系电话（手机号）
     */
    @JsonProperty("sa_contact_phone")
    private String saContactPhone;
    /**
     * 发件国家/地区简称
     */
    @JsonProperty("sa_country_code")
    private String saCountryCode;
    /**
     * 省/州
     */
    @JsonProperty("sa_state")
    private String saState;
    /**
     * 城市
     */
    @JsonProperty("sa_city")
    private String saCity;
    /**
     * 区
     */
    @JsonProperty("sa_region")
    private String saRegion;
    /**
     * 地址1
     */
    @JsonProperty("sa_address1")
    private String saAddress1;
    /**
     * 地址2
     */
    @JsonProperty("sa_address2")
    private String saAddress2;
}
