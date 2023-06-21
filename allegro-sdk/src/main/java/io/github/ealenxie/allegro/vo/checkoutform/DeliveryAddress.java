package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class DeliveryAddress {
    /**
     * 名
     */
    @JsonProperty("firstName")
    private String firstName;
    /**
     * 姓
     */
    @JsonProperty("lastName")
    private String lastName;
    /**
     * 街道
     */
    @JsonProperty("street")
    private String street;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 邮政编码
     */
    @JsonProperty("zipCode")
    private String zipCode;
    /**
     * 国家代码
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * 公司名称
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 电话号码
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 地址修改时间
     */
    @JsonProperty("modifiedAt")
    private String modifiedAt;
}
