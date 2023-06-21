package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@Getter
@Setter
public class Transaction {
    /**
     * 交易号
     */
    @JsonProperty("transactionId")
    private String transactionId;

    /**
     * 交易时间
     */
    @JsonProperty("transactionDate")
    private String transactionDate;


    /**
     * 订单编号
     */
    @JsonProperty("orderId")
    private String orderId;

    /**
     * 发款编号
     */
    @JsonProperty("payoutId")
    private String payoutId;
    /**
     *
     */
    @JsonProperty("salesRecordReference")
    private String salesRecordReference;
    /**
     * 交易类型
     * 枚举：SALE、REFUND、CREDIT、DISPUTE、SHIPPING_LABEL、TRANSFER、NON_SALE_CHARGE、ADJUSTMENT、WITHDRAWAL、LOAN_REPAYMENT
     */
    @JsonProperty("transactionType")
    private String transactionType;

    /**
     * 货币交易的美元值和货币类型
     */
    @JsonProperty("amount")
    private Amount amount;
    /**
     * 枚举：CREDIT、DEBIT
     */
    @JsonProperty("bookingEntry")
    private String bookingEntry;

    /**
     * 交易状态
     * 枚举：FUNDS_ON_HOLD、FUNDS_PROCESSING、FUNDS_AVAILABLE_FOR_PAYOUT、PAYOUT、COMPLETED、FAILED
     */
    @JsonProperty("transactionStatus")
    private String transactionStatus;
    @JsonProperty("paymentsEntity")
    private String paymentsEntity;
    /**
     * 交易费用的参考信息
     */
    @JsonProperty("references")
    private List<References> references;
    /**
     * 费用类型
     */
    @JsonProperty("feeType")
    private String feeType;
    /**
     * 购买人信息
     */
    @JsonProperty("buyer")
    private Buyer buyer;
    /**
     * 此金额是在销售费用从与订单相关的卖方支出中扣除之前的订单总额。要确定将通过卖方支付支付的订单的实际金额，
     * 请从basePayoutAmount中扣除totalFeeAmount。
     */
    @JsonProperty("totalFeeBasisAmount")
    private Amount totalFeeBasisAmount;
    /**
     * 订单支付的销售费用总额
     */
    @JsonProperty("totalFeeAmount")
    private Amount totalFeeAmount;
    /**
     * 销售税金额
     */
    @JsonProperty("eBayCollectedTaxAmount")
    private Amount eBayCollectedTaxAmount;
    /**
     * 向卖方收取的特定区域费用的信息
     */
    @JsonProperty("feeJurisdiction")
    private FeeJurisdiction feeJurisdiction;
    /**
     * 订单中的每个行项支付的费用中扣除的费用
     */
    @JsonProperty("orderLineItems")
    private List<OrderLineItems> orderLineItems;
}
