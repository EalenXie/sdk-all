package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 14:28
 */
@Getter
@Setter
public class Address {
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 公司名称
     */
    @JsonProperty("company")
    private String company;
    /**
     * 国家(地区)编码
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 门牌号
     */
    @JsonProperty("room_no")
    private String roomNo;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 分机号
     */
    @JsonProperty("ext")
    private String ext;
    /**
     * 电话
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 邮政编码
     */
    @JsonProperty("post_code")
    private String postCode;
    /**
     * 州/省
     */
    @JsonProperty("state")
    private String state;
    /**
     * 地址1
     */
    @JsonProperty("street1")
    private String street1;
    /**
     * 地址2
     */
    @JsonProperty("street2")
    private String street2;
    /**
     * 收货人名
     */
    @JsonProperty("consignee_name")
    private String consigneeName;
    /**
     * 收货人姓
     */
    @JsonProperty("last_name")
    private String lastName;
}
