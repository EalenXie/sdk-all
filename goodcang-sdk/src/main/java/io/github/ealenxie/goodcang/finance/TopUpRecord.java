package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 12:23
 */
@Getter
@Setter
public class TopUpRecord {


    /**
     * 单号
     */
    @JsonProperty("order_number")
    private String orderNumber;
    /**
     * 交易流水号
     */
    @JsonProperty("reference_number")
    private String referenceNumber;
    /**
     * 账户编码
     */
    @JsonProperty("account_code")
    private String accountCode;
    /**
     * 签约主体名称
     */
    @JsonProperty("sign_body_name")
    private String signBodyName;
    /**
     * 服务主体名称
     */
    @JsonProperty("service_body_name")
    private String serviceBodyName;
    /**
     * 签约业务类型
     */
    @JsonProperty("sign_business_type_text")
    private String signBusinessTypeText;
    /**
     * 付款人
     */
    @JsonProperty("drawee")
    private String drawee;
    /**
     * 交易方式文本
     */
    @JsonProperty("transaction_type_text")
    private String transactionTypeText;
    /**
     * 付款银行
     */
    @JsonProperty("bank_name")
    private String bankName;
    /**
     * 付款银行账号
     */
    @JsonProperty("drawee_account")
    private String draweeAccount;
    /**
     * 审核状态
     */
    @JsonProperty("transaction_status_text")
    private String transactionStatusText;
    /**
     * 登记金额
     */
    @JsonProperty("register_amount")
    private String registerAmount;
    /**
     * 到账金额
     */
    @JsonProperty("arrival_amount")
    private String arrivalAmount;
    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 转汇汇率
     */
    @JsonProperty("exchange")
    private String exchange;
    /**
     * 充值币种
     */
    @JsonProperty("recharge_code")
    private String rechargeCode;
    /**
     * 实收金额
     */
    @JsonProperty("actual_amount")
    private String actualAmount;
    /**
     * 充值时间
     */
    @JsonProperty("add_time")
    private String addTime;
    /**
     * 到账时间
     */
    @JsonProperty("update_time")
    private String updateTime;
}
