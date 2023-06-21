package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/1 10:59
 * <a href="https://developer.ebay.com/api-docs/sell/finances/resources/seller_funds_summary/methods/getSellerFundsSummary">文档说明</a>
 */
@Getter
@Setter
public class FundsSummaryVO {
    /**
     * 总金额
     * 等于以下之和：processingFunds+availableFunds+fundsOnHold
     */
    @JsonProperty("totalFunds")
    private TotalFunds totalFunds;
    /**
     * 此字段表示可用于付款的订单资金总额，但尚未开始处理卖方付款。
     */
    @JsonProperty("processingFunds")
    private TotalFunds processingFunds;

    @JsonProperty("availableFunds")
    private TotalFunds availableFunds;

    @JsonProperty("fundsOnHold")
    private TotalFunds fundsOnHold;
}
