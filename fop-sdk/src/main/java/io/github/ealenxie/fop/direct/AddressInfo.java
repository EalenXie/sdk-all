package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class AddressInfo {
    /**
     * 名字
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * 姓
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * 公司
     */
    @JsonProperty("company")
    private String company;

    /**
     * 电话
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
    @JsonProperty("post_code")
    private String postCode;

    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;

    /**
     * 州
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
     * 街道
     */
    @JsonProperty("street")
    private String street;

    /**
     * 门牌号
     */
    @JsonProperty("house_number")
    private String houseNumber;

    /**
     * 证书信息
     */
    @JsonProperty("certificate_info")
    private CertificateInfo certificateInfo;
}
