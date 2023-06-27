package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 17:46
 */
@Getter
@Setter
public class PickupAddress {
    /**
     * 揽收联系人姓名
     */
    @JsonProperty("contactPerson")
    private String contactPerson;

    /**
     * 揽收联系人手机号
     */
    @JsonProperty("contactTel")
    private String contactTel;

    /**
     * 揽收联系人国家
     */
    @JsonProperty("contactCountry")
    private String contactCountry;

    /**
     * 揽收联系人省
     */
    @JsonProperty("contactProvince")
    private String contactProvince;

    /**
     * 揽收联系人市
     */
    @JsonProperty("contactCity")
    private String contactCity;

    /**
     * 揽收联系人区
     */
    @JsonProperty("contactDistrict")
    private String contactDistrict;

    /**
     * 揽收联系人详细地址
     */
    @JsonProperty("streetAddress")
    private String streetAddress;

    /**
     * 揽收联系人邮编
     */
    @JsonProperty("contactPostcode")
    private String contactPostcode;
}
