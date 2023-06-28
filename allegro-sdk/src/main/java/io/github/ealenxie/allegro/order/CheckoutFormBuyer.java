package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class CheckoutFormBuyer {
    /**
     * 买家id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 电子邮件
     */
    @JsonProperty("email")
    private String email;
    /**
     * 账号id
     */
    @JsonProperty("login")
    private String login;
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
     * 公司名称
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 是否访客账号
     */
    @JsonProperty("guest")
    private Boolean guest;
    /**
     * 买家身份证号
     */
    @JsonProperty("personalIdentity")
    private String personalIdentity;
    /**
     * 电话号码
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 买家地址
     */
    @JsonProperty("address")
    private BuyerAddress address;
}
