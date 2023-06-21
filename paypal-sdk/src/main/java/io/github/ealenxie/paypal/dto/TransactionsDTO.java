package io.github.ealenxie.paypal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionsDTO {

    /**
     * PayPal 交易 ID
     * 有效的交易 ID 长度为 17 个字符，除了订单编号，长度为 19 个字符。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("transaction_id")
    private String transactionId;

    /**
     * PayPal 交易类型
     * 请参阅事务事件代码
     * https://developer.paypal.com/docs/transaction-search/transaction-event-codes/
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("transaction_type")
    private String transactionType;

    /**
     * PayPal 交易状态
     * 状态码描述
     * D	PayPal 或商家规则拒绝交易。
     * P	交易待定。交易已创建，但在状态更改为 之前等待另一个支付流程完成，例如 ACH 交易S。
     * S	交易成功完成，没有拒绝并且在任何未决状态之后。
     * V	成功的交易被撤销，资金被退还给原始发件人。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("transaction_status")
    private String transactionStatus;

    /**
     * 总交易金额范围
     * 指定范围为<start-range> TO <end-range>，其中<start-range>是 PayPal 交易总额<end-range>的下限， 是交易总额的上限。指定较低面额的金额。
     * 例如，要搜索从 $5.00 到 $10.05 的交易，请指定[500 TO 1005]。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("transaction_amount")
    private String transactionAmount;

    /**
     * PayPal 交易货币
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("transaction_currency")
    private String transactionCurrency;

    /**
     * 开始时间
     * 采用Internet 日期和时间格式。需要秒数。小数秒是可选的。
     * 最小长度：20.
     * 最大长度：64.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * 结束时间
     * 采用Internet 日期和时间格式。需要秒数。小数秒是可选的。支持的最大范围为 31 天。
     * 最小长度：20.
     * 最大长度：64.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * 支付工具类型
     * 值是：
     * CREDITCARD. 返回具有相应值的直接信用卡交易。
     * DEBITCARD. 返回具有相应值的借记卡交易。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment_instrument_type")
    private String paymentInstrumentType;

    /**
     * 商店 ID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("store_id")
    private String storeId;

    /**
     * 终端 ID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("terminal_id")
    private String terminalId;

    /**
     * 指示响应中出现的字段
     * 有效字段为：
     * transaction_info. 交易信息。包括收款人的 PayPal 账户 ID、PayPal 生成的交易 ID、PayPal 生成的基本 ID、PayPal 参考 ID 类型、交易事件代码、交易发起和最后更新的日期和时间，交易金额，包括 PayPal 费用、任何折扣、保险、交易状态以及有关交易的其他信息。
     * payer_info. 付款人信息。包括 PayPal 客户帐户 ID 和付款人的电子邮件地址、主要电话号码、姓名、国家/地区代码、地址以及付款人是否经过验证。
     * shipping_info. 运输信息。包括收件人姓名、此订单的送货方式、此订单的送货地址以及与此订单关联的辅助地址。
     * auction_info. 拍卖信息。包括拍卖网站的名称、拍卖网站的 URL、在拍卖中进行购买的客户的 ID 以及拍卖结束的日期和时间。
     * cart_info. 购物车信息。包括一系列商品详细信息，商品金额或运费是否已含税，以及 PayPal 生成的发票的发票 ID。
     * incentive_info. 一系列激励细节对象。每个对象包括诸如特别优惠或优惠券之类的激励、激励金额以及标识商家忠诚度或激励计划的激励计划代码。
     * store_info. 店铺信息。包括商户ID和商户收银台终端ID。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fields")
    private String fields;

    /**
     * 响应是仅包括影响余额的交易还是所有交易。值是：
     * Y. 默认。响应仅包括余额交易。
     * N. 响应包括所有事务。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("balance_affecting_records_only")
    private String balanceAffectingRecordsOnly;

    /**
     * 分页大小
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("page_size")
    private String pageSize;

    /**
     * 页码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("page")
    private String page;
}
