package io.github.ealenxie.edayun.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 计费项详情
 */
@Getter
@Setter
public class ShippingCostDetail {
    /**
     * 费用类型
     */
    private String tradeType;
    /**
     * 币种 e.g. USD
     */
    private String currency;
    /**
     * 费用
     */
    private BigDecimal freightFee;
}
