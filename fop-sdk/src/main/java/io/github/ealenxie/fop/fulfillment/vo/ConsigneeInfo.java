package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsigneeInfo {
    /**
     * 收件人国家二字代码 必填
     */
    @JsonProperty("country")
    private String country;
    /**
     * 收件人省 条件必填
     */
    @JsonProperty("state")
    private String state;
    /**
     * 收件人城市 条件必填
     */
    @JsonProperty("city")
    private String city;
    /**
     * 收件人所在区/县
     */
    @JsonProperty("district")
    private String district;
    /**
     * 收件人邮编 条件必填
     */
    @JsonProperty("post_code")
    private String postCode;
    /**
     * 收件人地址 必填
     */
    @JsonProperty("street")
    private String street;
    /**
     * 收件人的门牌号
     */
    @JsonProperty("house_number")
    private String houseNumber;
    /**
     * 收件人公司名
     */
    @JsonProperty("company")
    private String company;
    /**
     * 收件人姓
     */
    @JsonProperty("last_name")
    private String lastName;
    /**
     * 收件人名 必填
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * 收件人电话 必填
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 收件人邮箱
     */
    @JsonProperty("email")
    private String email;
}
