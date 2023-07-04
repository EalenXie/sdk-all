package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 14:39
 * @version 1.0
 */
@Getter
@Setter
public class Receiver {
    /**
     * 收件人公司
     */
    @JsonProperty("buyerCompany")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String buyerCompany;
    /**
     * 收件人VAT/EORI
     */
    @JsonProperty("receiverVatEori")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverVatEori;
    /**
     * 收件人名字
     */
    @JsonProperty("receiverName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiverName;
    /**
     * 收件人电话
     */
    @JsonProperty("phoneNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNo;
    /**
     * 收件人邮箱
     */
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    /**
     * 收件人邮编
     */
    @JsonProperty("postCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String postCode;
    /**
     * 收件人国家
     */
    @JsonProperty("countryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String countryCode;
    /**
     * 收件州/省
     */
    @JsonProperty("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String state;
    /**
     * 收件人城市
     */
    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String city;
    /**
     * 收件人地址1
     */
    @JsonProperty("addressLine1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String addressLine1;
    /**
     * 收件人地址2
     */
    @JsonProperty("addressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String addressLine2;
    /**
     * 收件人门牌号
     * DHL必填
     */
    @JsonProperty("houseNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String houseNo;
}
