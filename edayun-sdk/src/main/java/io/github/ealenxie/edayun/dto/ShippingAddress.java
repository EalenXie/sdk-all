package io.github.ealenxie.edayun.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 收件人地址信息
 */
@Getter
@Setter
public class ShippingAddress {
    /**
     * 收件人姓名(必填)
     */
    private String name;
    /**
     * 收件人公司名
     */
    private String companyName;
    /**
     * 收件人联系电话
     */
    private String phone;
    /**
     * 收件人联系邮箱
     */
    private String email;
    /**
     * 收件人国家，使用2个字母简写(必填)
     */
    private String country;
    /**
     * 收件人省/州(必填)
     */
    private String provState;
    /**
     * 收件人城市(必填)
     */
    private String city;
    /**
     * 收件人街道地址1(必填)
     */
    private String addressLine1;
    /**
     * 收件人街道地址2
     */
    private String addressLine2;
    /**
     * 收件人地址邮编(必填)
     */
    private String postalCode;
    /**
     * 门牌号
     */
    private String doorNum;
}
