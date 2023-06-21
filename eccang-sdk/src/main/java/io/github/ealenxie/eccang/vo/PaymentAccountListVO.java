package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/26 9:20
 */
@Getter
@Setter
public class PaymentAccountListVO {
    /**
     * 文档未写的字段
     */
    @JsonProperty("spmId")
    private String spmId;
    /**
     * 文档未写的字段
     */
    @JsonProperty("bankId")
    private String bankId;
    /**
     * 文档未写的字段
     */
    @JsonProperty("bankName")
    private String bankName;
    /**
     * 银行名称（支付方式为现金，值为空）
     */
    @JsonProperty("platformName")
    private String platformName;
    /**
     * 支付平台：1paypal、2财付通、3支付宝、4快钱、5网银、6微信、7诚e赊（支付方式为现金，值为空）
     */
    @JsonProperty("platformType")
    private String platformType;

    /**
     * 账户
     */
    @JsonProperty("pmAccount")
    private String pmAccount;

    /**
     * 开户人
     */
    @JsonProperty("pmName")
    private String pmName;


    /**
     * 支付方式，1现金、2在线，3银行账号
     */
    @JsonProperty("paymentMethod")
    private Integer paymentMethod;

    /**
     * 收款人
     */
    @JsonProperty("pmLead")
    private String pmLead;

    /**
     * 收款公司
     */
    @JsonProperty("pmCompany")
    private String pmCompany;

    /**
     * 状态：0:停用、1:可用
     */
    @JsonProperty("pmStatus")
    private Integer pmStatus;

}
