package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShippingAddress {
    /**
     * 收件地址
     */
    @JsonProperty("Name")
    private String name;
    /**
     * 街道信息
     */
    @JsonProperty("AddressLine1")
    private String addressLine1;
    /**
     * 额外的街道地址信息
     */
    @JsonProperty("AddressLine2")
    private String addressLine2;
    /**
     * 额外的街道地址信息
     */
    @JsonProperty("AddressLine3")
    private String addressLine3;
    /**
     * 城市
     */
    @JsonProperty("City")
    private String city;
    /**
     * 国家
     */
    @JsonProperty("County")
    private String county;
    /**
     * 地区
     */
    @JsonProperty("District")
    private String district;
    /**
     * 州或地区
     */
    @JsonProperty("StateOrRegion")
    private String stateOrRegion;
    /**
     * 市政当局
     */
    @JsonProperty("Municipality")
    private String municipality;
    /**
     * 邮政编码
     */
    @JsonProperty("PostalCode")
    private String postalCode;
    /**
     * 国家代码
     */
    @JsonProperty("CountryCode")
    private String countryCode;
    /**
     * 电话号码
     */
    @JsonProperty("Phone")
    private String phone;
    /**
     * 送货地址类型
     * Residential：居住地址
     * Commercial：办公地址
     */
    @JsonProperty("AddressType")
    private String addressType;
}