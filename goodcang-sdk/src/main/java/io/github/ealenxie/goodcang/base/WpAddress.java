package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/9 11:36
 */
@Getter
@Setter
public class WpAddress {
    /**
     * 州 省份
     */
    @JsonProperty("state")
    private String state;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 邮编
     */
    @JsonProperty("postcode")
    private String postcode;
    /**
     * 联系人
     */
    @JsonProperty("contacter")
    private String contacter;
    /**
     * 电话
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 地址1
     */
    @JsonProperty("street_address1")
    private String streetAddress1;
    /**
     * 地址2
     */
    @JsonProperty("street_address2")
    private String streetAddress2;
    /**
     * 门牌号
     */
    @JsonProperty("street_number")
    private String streetNumber;
}
