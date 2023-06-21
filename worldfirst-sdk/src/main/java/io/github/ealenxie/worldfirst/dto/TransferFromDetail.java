package io.github.ealenxie.worldfirst.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/5 9:19
 */
@Getter
@Setter
public class TransferFromDetail {
    /**
     * 转账付款的方法
     */
    @JsonProperty("transferFromMethod")
    private PaymentMethod transferFromMethod;
    /**
     * 支付方需要支付的金额 （计算费用前金额）。
     * 如果此字段赋值为 null，则响应体中 transferToDetail.transferToAmount 的赋值也为 null。
     */
    @JsonProperty("transferFromAmount")
    private Amount transferFromAmount;
    /**
     * 付款方币种，和金额不能同时指定。
     * 符合ISO-4217规范的三字母货币代码。
     */
    private String transferFromCurrency;
    /**
     * （注意: 仅response响应体有此字段）
     * 转账限额信息。当 transferToDetail.transferToAmount.currency = CNY 时，此字段为必填。
     */
    private TransferLimitInfo transferLimitInfo;

    /**
     * （注意: 仅response响应体有此字段）
     * 转账付款金额（计算费用后金额），响应阶段返回
     */
    @JsonProperty("actualTranferFromAmount")
    private Amount actualTranferFromAmount;
    /**
     * （注意: 仅response响应体有此字段）
     * 付款方产生的费用金额，响应阶段返回
     */
    @JsonProperty("feeAmount")
    private Amount feeAmount;

    /**
     * 转账汇率
     */
    @JsonProperty("transferQuote")
    private Quote transferQuote;
}
