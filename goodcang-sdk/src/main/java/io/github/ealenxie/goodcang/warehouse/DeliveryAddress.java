package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:14
 */
@Getter
@Setter
public class DeliveryAddress {
    /**
     * 收件人名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 收件人姓
     */
    @JsonProperty("last_name")
    private String lastName;
    /**
     * 收件人国家/地区
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 收件人省/洲
     */
    @JsonProperty("province")
    private String province;
    /**
     * 收件人城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 收件人地址1
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * 收件人地址2
     */
    @JsonProperty("address2")
    private String address2;
    /**
     * 公司名
     */
    @JsonProperty("company")
    private String company;
    /**
     * 门牌号
     */
    @JsonProperty("doorplate")
    private String doorplate;
    /**
     * 收件人邮编
     */
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * 收件人电话
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;
}
