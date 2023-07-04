package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:38
 */
@Getter
@Setter
public class PostalAddress {
    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;
    /**
     * 详细收货地址
     */
    @JsonProperty("address2")
    private String address2;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 收货地址
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * 地址类型
     */
    @JsonProperty("addressType")
    private String addressType;
    /**
     * 邮编
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * 收货人/收货地点名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 送货地址状态
     */
    @JsonProperty("state")
    private String state;
}
