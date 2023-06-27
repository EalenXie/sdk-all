package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 19:47
 * <p>
 * 收件人信息
 */
@Getter
@Setter
public class RecipientInfo {

    /**
     * 地区代号
     */
    @JsonProperty("areaCode")
    private String areaCode;

    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 区号
     */
    @JsonProperty("cityCode")
    private String cityCode;

    /**
     * 公司
     */
    @JsonProperty("company")
    private String company;

    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;

    /**
     * 国家代号
     */
    @JsonProperty("countryCode")
    private String countryCode;

    /**
     * 定义的用户代码
     */
    @JsonProperty("definedUserCode")
    private String definedUserCode;

    /**
     * 区、县
     */
    @JsonProperty("district")
    private String district;

    /**
     * 区县代号
     */
    @JsonProperty("districtCode")
    private String districtCode;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 名/姓名
     */
    @JsonProperty("firstName")
    private String firstName;

    /**
     * 门牌号
     */
    @JsonProperty("houseNumber")
    private String houseNumber;

    /**
     * 姓
     */
    @JsonProperty("lastName")
    private String lastName;

    /**
     * 电话
     * <p>
     * *必填,有手机填手机，无手机填写电话，无需填写国家代码
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 电话2
     */
    @JsonProperty("phone2")
    private String phone2;

    /**
     * 邮编
     */
    @JsonProperty("postCode")
    private String postCode;

    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 州/省
     */
    @JsonProperty("state")
    private String state;

    /**
     * 州/省 代号
     */
    @JsonProperty("stateCode")
    private String stateCode;

    /**
     * 街道/详细地址
     */
    @JsonProperty("street")
    private String street;

    /**
     * 证件信息，根据海关要求变化
     */
    @JsonProperty("certificateInfo")
    private CertificateInfo certificateInfo;
}
