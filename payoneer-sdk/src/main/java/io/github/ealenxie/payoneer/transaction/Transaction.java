package io.github.ealenxie.payoneer.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/31 13:25
 */
@Getter
@Setter
public class Transaction {
    /**
     * 对应交易流水号
     */
    @JsonProperty("id")
    private String id;
    /**
     * 付款类别 ID
     * 1 Incoming Payments 收款
     * 2 Refunds 退款
     * 3 Withdrawal To Bank 提现到银行
     * 4 Card Transactions 卡交易
     * 5 Outgoing Payments 付款
     * 6 Fees 规费
     */
    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("category_name")
    private String categoryName;
    /**
     * 描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 交易时间  transaction date
     */
    @JsonProperty("date")
    private String date;
    /**
     * 实收/付金额  根据实收/付金额正负判断，正为入账、负为出账
     */
    @JsonProperty("amount")
    private Double amount;
    /**
     * 出/入账币种
     */
    @JsonProperty("amount_currency")
    private String amountCurrency;
    @JsonProperty("balance_id")
    private String balanceId;
    @JsonProperty("balance_name")
    private String balanceName;
    @JsonProperty("running_balance")
    private Double runningBalance;
    @JsonProperty("balance_currency")
    private String balanceCurrency;
    /**
     * 支付状态
     * 1 Pending 处理中
     * 2 Completed 已完成
     * 3 Canceled 已取消
     * 4 Failed 已失败
     */
    @JsonProperty("status_id")
    private Integer statusId;
    @JsonProperty("status_name")
    private String statusName;
    /**
     * 匹配平台  源
     */
    @JsonProperty("source")
    private String source;
    @JsonProperty("target")
    private String target;
    @JsonProperty("details")
    private TransactionDetails details;
}
