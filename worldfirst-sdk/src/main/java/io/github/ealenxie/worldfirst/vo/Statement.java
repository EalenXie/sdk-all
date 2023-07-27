package io.github.ealenxie.worldfirst.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.worldfirst.dto.Amount;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/6/5 14:26
 */
@Getter
@Setter
public class Statement {
    /**
     * 转账的创建时间
     * 更多信息：
     * 此字段采用ISO 8601 标准时间戳。如：2018-09-03T00:00:00+08:00，或2019-01-01T01:01:01Z（UTC时间）
     */
    @JsonProperty("transactionTime")
    private String transactionTime;
    /**
     * 该字段表示客户拥有的不同余额类型。
     * <p>
     * <p>
     * 说明：客户在不同业务场景下，可使用不同的余额类型对资金余额做分隔管理，作用是为了风险管控。
     * <p>
     * <p>
     * 可取值：此字段的可取值随着客户类型不同而有所差异：
     * <p>
     * <p>
     * 仅对 CN HK EC (E-commerce) 客户，此字段的可取值为：
     * NORMAL_BALANCE: 普通余额类型（即电商余额类型)。客户以此管理来自电商平台充值的资金。
     * SAME_NAME_TOP_UP_BALANCE : 同名充值余额类型。客户以此来管理本人给自己充值的资金。
     * 对于其他客户，此字段的可取值仅为NORMAL_BALANCE，代表普通余额类型（即电商余额类型)。
     */
    @JsonProperty("balanceTypes")
    private List<String> balanceTypes;

    /**
     * 转账类型，取值范围：
     * <p>
     * TRANSFER
     * WITHDRAWAL
     * CONVERSION
     * CHARGE
     * COLLECTION
     * DEDUCTION
     * FUND_COLLECTION
     */
    @JsonProperty("transactionType")
    private String transactionType;

    /**
     * 转账金额
     *
     * <p>
     * 此金额在出账时为负数，入账时为正数。
     */
    @JsonProperty("transactionAmount")
    private Amount transactionAmount;

    /**
     * 费用金额
     * <p>
     * 此字段在transactionType为以下取值时，有可能透出：
     * <p>
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUN
     * DDEDUCTION
     * FUND_COLLECTION
     */
    @JsonProperty("feeAmount")
    private Amount feeAmount;
    /**
     * 原始转账金额
     */
    @JsonProperty("originalTransactionAmount")
    private Amount originalTransactionAmount;
    /**
     * 转账后的实时账户余额
     */
    @JsonProperty("accountBalance")
    private Amount accountBalance;
    /**
     * 由万里汇定义、每笔转账的唯一ID
     * <p>
     * 此字段在transactionType为以下取值时，有可能透出：
     * <p>
     * TRANSFER
     * TRANSFER_REFUND
     * WITHDRAWAL
     * WITHDRAWAL_REFUND
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     * CHARGE_REFUND
     * DEDUCTION
     * FUND_COLLECTION
     * 更多信息：
     * <p>
     * 字段最大长度：64
     */
    @JsonProperty("transactionId")
    private String transactionId;
    /**
     * 由集成商定义、每笔转账的唯一ID
     *
     * <p>
     * 字段最大长度：256
     */
    @JsonProperty("extTransactionId")
    private String extTransactionId;
    /**
     * 转账状态。取值范围：
     * <p>
     * INIT：已创建
     * PROCESSING：处理中
     * PENDING：挂起
     * SUCCESS：成功
     * FAIL：失败
     */
    @JsonProperty("transactionStatus")
    private String transactionStatus;

    /**
     * 转账的外汇汇率信息。当transactionType有以下取值时，此字段为选填：
     * <p>
     * TRANSFER
     * WITHDRAWAL
     * CONVERSION
     * CONVERSION_DEAL
     * CHARGE
     */
    @JsonProperty("foreignExchangeQuote")
    private InquiryStatementListQuote foreignExchangeQuote;
    /**
     * 退款的外汇汇率信息。当transactionType有以下取值时，此字段为选填：
     * <p>
     * TRANSFER_REFUND
     * WITHDRAWAL_REFUND
     * CHARGE_REFUND
     */
    @JsonProperty("refundForeignExchangeQuote")
    private InquiryStatementListQuote refundForeignExchangeQuote;
    /**
     * 转账的资金细节
     */
    @JsonProperty("fundMoveDetail")
    private FundMoveDetail fundMoveDetail;
    /**
     * WF门户的 付/提现/兑操作产生的账单，万里汇会返回此字段
     */
    @JsonProperty("operatorInfo")
    private OperatorInfo operatorInfo;
}
