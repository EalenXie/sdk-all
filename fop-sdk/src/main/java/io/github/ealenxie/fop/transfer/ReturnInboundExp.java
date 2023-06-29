package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:09
 */
@Getter
@Setter
public class ReturnInboundExp {
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
     * 电话
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 公司
     */
    @JsonProperty("company")
    private String company;

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
     * 产品代码
     */
    @JsonProperty("productCode")
    private String productCode;
}
