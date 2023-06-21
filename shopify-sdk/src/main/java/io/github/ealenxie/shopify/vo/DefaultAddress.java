package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DefaultAddress {

    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;
    /**
     * 顾客id
     **/
    @JsonProperty("customer_id")
    private Long customerId;
    /**
     * 名
     **/
    @JsonProperty("first_name")
    private String firstName;
    /**
     * 姓
     **/
    @JsonProperty("last_name")
    private String lastName;
    /**
     * 公司
     **/
    @JsonProperty("company")
    private String company;
    /**
     * 地址1
     **/
    @JsonProperty("address1")
    private String address1;
    /**
     * 地址2
     **/
    @JsonProperty("address2")
    private String address2;
    /**
     * 城市
     **/
    @JsonProperty("city")
    private String city;
    /**
     * 省
     **/
    @JsonProperty("province")
    private String province;
    /**
     * 国家
     **/
    @JsonProperty("country")
    private String country;
    /**
     * 邮编
     **/
    @JsonProperty("zip")
    private String zip;
    /**
     * 电话
     **/
    @JsonProperty("phone")
    private String phone;
    /**
     * 名字
     **/
    @JsonProperty("name")
    private String name;
    /**
     * 省市编码
     **/
    @JsonProperty("province_code")
    private String provinceCode;
    /**
     * 国家编码
     **/
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 国家名
     **/
    @JsonProperty("country_name")
    private String countryName;
    /**
     * 是否默认
     **/
    @JsonProperty("default")
    private Boolean defaultData;

}
