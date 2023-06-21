package io.github.ealenxie.fruugo.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/10 12:27
 */
@Getter
@Setter
public class ShippingAddress {
    /**
     * 名
     */
    private String firstName;
    /**
     * 姓
     */
    private String lastName;
    /**
     * 街道地址
     */
    private String streetAddress;
    /**
     * 城市
     */
    private String city;
    /**
     * 省
     */
    private String province;
    /**
     * 邮政编码
     */
    private String postalCode;
    /**
     * 国家代码
     */
    private String countryCode;
    /**
     * 电话号码
     */
    private String phoneNumber;
    /**
     * 邮箱地址
     */
    private String emailAddress;
}
