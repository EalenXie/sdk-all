package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class Address {

    /**
     * 名
     **/
    @JsonProperty("first_name")
    private String firstName;
    /**
     * 收件地址1
     **/
    @JsonProperty("address1")
    private String address1;
    /**
     * 电话
     **/
    @JsonProperty("phone")
    private String phone;
    /**
     * 城市
     **/
    @JsonProperty("city")
    private String city;
    /**
     * 邮编
     **/
    @JsonProperty("zip")
    private String zip;
    /**
     * 省、州或县
     **/
    @JsonProperty("province")
    private String province;
    /**
     * 国家
     **/
    @JsonProperty("country")
    private String country;
    /**
     * 姓
     **/
    @JsonProperty("last_name")
    private String lastName;
    /**
     * 收件地址2
     **/
    @JsonProperty("address2")
    private String address2;
    /**
     * 公司
     **/
    @JsonProperty("company")
    private String company;
    /**
     * 纬度
     **/
    @JsonProperty("latitude")
    private BigDecimal latitude;
    /**
     * 经度
     **/
    @JsonProperty("longitude")
    private BigDecimal longitude;
    /**
     * 名字
     **/
    @JsonProperty("name")
    private String name;
    /**
     * 国家编码
     **/
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 省缩写
     **/
    @JsonProperty("province_code")
    private String provinceCode;

}
