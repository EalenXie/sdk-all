package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 12:17
 */
@Getter
@Setter
public class CostFlow {
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
     * 费用代码中文名称
     */
    @JsonProperty("types_of_fee_name_cn")
    private String typesOfFeeNameCn;
    /**
     * 费用代码英文名称
     */
    @JsonProperty("types_of_fee_name_en")
    private String typesOfFeeNameEn;
    /**
     * 流水类型
     */
    @JsonProperty("flow_type")
    private String flowType;
    /**
     * 流水类型文本
     */
    @JsonProperty("flow_type_text")
    private String flowTypeText;
    /**
     * 发生金额
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 当前账户币种余额
     */
    @JsonProperty("currency_balance")
    private String currencyBalance;
    /**
     * 汇率
     */
    @JsonProperty("exchange_rate")
    private String exchangeRate;
    /**
     * 费用类型编码
     */
    @JsonProperty("types_of_fee_text")
    private String typesOfFeeText;
    /**
     * 出账状态
     */
    @JsonProperty("charge_type")
    private String chargeType;
    /**
     * 出账状态
     */
    @JsonProperty("charge_type_text")
    private String chargeTypeText;
    /**
     * 发生时间
     */
    @JsonProperty("add_time")
    private String addTime;
}
