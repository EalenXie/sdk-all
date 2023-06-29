package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 14:43
 */
@Getter
@Setter
public class Shipper {
    /**
     * 国家;国家二字码，详细参考国际二字码
     */
    @JsonProperty("country")
    private String country;

    /**
     * 州/省
     */
    @JsonProperty("state")
    private String state;

    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 区/县
     */
    @JsonProperty("district")
    private String district;

    /**
     * 邮编
     */
    @JsonProperty("post_code")
    private String postCode;

    /**
     * 街道/详细地址
     */
    @JsonProperty("street")
    private String street;

    /**
     * 门牌号
     */
    @JsonProperty("house_number")
    private String houseNumber;

    /**
     * 公司名
     */
    @JsonProperty("company")
    private String company;

    /**
     * 姓
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * 名
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * 电话号码/手机号
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * IOSS
     */
    @JsonProperty("ioss_no")
    private String iossNo;

    /**
     * VAT
     */
    @JsonProperty("shipper_vat")
    private String shipperVat;

    /**
     * EORI
     */
    @JsonProperty("shipper_eori")
    private String shipperEori;
}
