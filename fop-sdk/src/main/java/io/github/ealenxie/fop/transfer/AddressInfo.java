package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class AddressInfo {
    /**
     * 名/姓名
     */
    @JsonProperty("firstName")
    private String firstName;

    /**
     * 姓
     */
    @JsonProperty("lastName")
    private String lastName;

    /**
     * 公司名
     */
    @JsonProperty("company")
    private String company;

    /**
     * 电话（必填）
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 电话2
     */
    @JsonProperty("phone2")
    private String phone2;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 邮编
     */
    @JsonProperty("postCode")
    private String postCode;

    /**
     * 国家
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
     * 区、县
     */
    @JsonProperty("district")
    private String district;

    /**
     * 街道/详细地址
     */
    @JsonProperty("street")
    private String street;

    /**
     * 门牌号
     */
    @JsonProperty("houseNumber")
    private String houseNumber;
}
