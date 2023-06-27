package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 15:10
 */
@Getter
@Setter
public class PickupInfoVO {
    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 电话
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;

    /**
     * 省
     */
    @JsonProperty("province")
    private String province;

    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 区/显
     */
    @JsonProperty("district")
    private String district;

    /**
     * 街道
     */
    @JsonProperty("street")
    private String street;

    /**
     * 详细地址
     */
    @JsonProperty("detail_address")
    private String detailAddress;

    /**
     * 联系人邮编
     */
    @JsonProperty("zip_code")
    private String zipCode;

}
