package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionInfo {
    /**
     * 对方的PayPal账户ID
     */
    @JsonProperty("paypal_account_id")
    private String paypalAccountId;

    /**
     * PayPal 生成的交易 ID
     */
    @JsonProperty("transaction_id")
    private String transactionId;

    /**
     * 原单订单交易号
     */
    @JsonProperty("paypal_reference_id")
    private String paypalReferenceId;

    @JsonProperty("paypal_reference_id_type")
    private String paypalReferenceIdType;

    /**
     * 五位数的交易事件代码，根据资金流动和借记或贷记对交易类型进行分类
     * <a href="https://developer.paypal.com/docs/transaction-search/transaction-event-codes/">https://developer.paypal.com/docs/transaction-search/transaction-event-codes/</a>
     * {@link TransactionEventCode}
     */
    @JsonProperty("transaction_event_code")
    private String transactionEventCode;

    /**
     * 在 PayPal 系统中开始处理交易的日期和时间，以付款这一方的帐户时区表示
     */
    @JsonProperty("transaction_initiation_date")
    private String transactionInitiationDate;

    /**
     * 上次更改交易的日期和时间，以付款这边账户的时区表示。
     */
    @JsonProperty("transaction_updated_date")
    private String transactionUpdatedDate;


    /**
     * 通过 PayPal 在发送方和接收方之间转移的全包交易总额。
     */
    @JsonProperty("transaction_amount")
    private Money transactionAmount;

    /**
     * PayPal 交易手续费
     */
    @JsonProperty("fee_amount")
    private Money feeAmount;

    /**
     * 折扣金额
     */
    @JsonProperty("discount_amount")
    private Money discountAmount;

    /**
     * 一笔保险费。保证产品的质量或交付。
     */
    @JsonProperty("insurance_amount")
    private Money insuranceAmount;

    /**
     * 销售税额
     */
    @JsonProperty("sales_tax_amount")
    private Money salesTaxAmount;

    /**
     * PayPal 或商家报告的交易运费。
     */
    @JsonProperty("shipping_amount")
    private Money shippingAmount;

    /**
     * 运费折扣金额
     */
    @JsonProperty("shipping_discount_amount")
    private Money shippingDiscountAmount;


    @JsonProperty("shipping_tax_amount")
    private Money shippingTaxAmount;


    @JsonProperty("other_amount")
    private Money otherAmount;

    @JsonProperty("tip_amount")
    private Money tipAmount;

    /**
     * 交易状态的代码
     * D	PayPal 或商家规则拒绝交易。
     * P	交易待定。交易已创建，但在状态更改为 之前等待另一个支付流程完成，例如 ACH 交易S。
     * S	交易成功完成，没有拒绝并且在任何未决状态之后。
     * V	成功的交易被完全撤销，资金被退还给原始发件人。
     */
    @JsonProperty("transaction_status")
    private String transactionStatus;

    /**
     * 付款的主体。付款人将此值传递给收款人。付款人通过他或她发送数据的接口来控制这些数据。
     */
    @JsonProperty("transaction_subject")
    private String transactionSubject;

    /**
     * 付款人传递给收款人的特殊说明。可能包含特殊的客户要求，例如运输说明。
     */
    @JsonProperty("transaction_note")
    private String transactionNote;


    @JsonProperty("payment_tracking_id")
    private String paymentTrackingId;

    /**
     * 银行参考 ID。 银行为 ACH(自动清算) 交易提供此值。
     */
    @JsonProperty("bank_reference_id")
    private String bankReferenceId;


    @JsonProperty("ending_balance")
    private Money endingBalance;

    @JsonProperty("available_balance")
    private Money availableBalance;

    /**
     * 商家随交易发送的发票 ID。
     * 注意：如果发票 ID 与请款请求一起发送，则会报告该值。否则，上报授权交易的发票编号。
     */
    @JsonProperty("invoice_id")
    private String invoiceId;

    /**
     * 商家提供的自定义文本。
     * 注意：通常，此字段包含使用 MassPay 类型交易进行的付款的唯一 ID。
     */
    @JsonProperty("custom_field")
    private String customField;

    /**
     * 交易是否有资格获得保护
     * 01. 有资格的。
     * 02. 不容忽视
     * 03. 部分合格。
     */
    @JsonProperty("protection_eligibility")
    private String protectionEligibility;


    @JsonProperty("credit_term")
    private String creditTerm;

    @JsonProperty("credit_transactional_fee")
    private Money creditTransactionalFee;

    @JsonProperty("credit_promotional_fee")
    private Money creditPromotionalFee;

    @JsonProperty("annual_percentage_rate")
    private String annualPercentageRate;

    @JsonProperty("payment_method_type")
    private String paymentMethodType;

    /**
     * 用于为支付提供资金的金融工具类型的高级分类（收款机构(对方机构)）
     */
    @JsonProperty("instrument_type")
    private String instrumentType;

    @JsonProperty("instrument_sub_type")
    private String instrumentSubType;

}
