package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/31 14:19
 */
@Getter
@Setter
public class MarketplaceFees {
    /**
     * 费用类型
     */
    @JsonProperty("feeType")
    private String feeType;
    /**
     * 费用金额
     */
    @JsonProperty("amount")
    private Amount amount;
    /**
     * 费用说明
     */
    @JsonProperty("feeMemo")
    private String feeMemo;
    /**
     * 向卖方收取的特定区域费用的信息
     */
    @JsonProperty("feeJurisdiction")
    private FeeJurisdiction feeJurisdiction;
}
