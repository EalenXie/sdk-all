package io.github.ealenxie.ebay.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 10:50
 */
@Getter
@Setter
public class TransactionFilterDTO implements EbayFilterDTO {

    /**
     * 格式为 [2018-10-23T00:00:01.000Z..2018-11-09T00:00:01.000Z]
     */
    private String transactionDate;
    /**
     * 搜索特定类型的货币交易
     * 枚举值：SALE、REFUND、CREDIT、DISPUTE、NON_SALE_CHARGE、SHIPPING_LABEL、TRANSFER、ADJUSTMENT、WITHDRAWAL、LOAN_REPAYMENT
     */
    private String transactionType;
    /**
     * 筛选特定状态下的卖方付款
     * 枚举：PAYOUT、FUNDS_PROCESSING、FUNDS_AVAILABLE_FOR_PAYOUT、FUNDS_ON_HOLD、COMPLETED、FAILED
     */
    private String transactionStatus;
    /**
     * 买家的eBay用户ID
     */
    private String buyerUsername;
    /**
     * 货币交易中涉及的订单的唯一销售经理标识符
     */
    private String salesRecordReference;
    /**
     * 卖方付款的唯一标识符
     */
    private String payoutId;
    /**
     * 货币交易的唯一标识符
     */
    private String transactionId;
    /**
     * 销售订单的唯一标识符
     */
    private String orderId;

}
