package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 14:08
 */
@Setter
@Getter
public class PurchaseQuote {
    /**
     * 供应单项的名称
     */
    private String productQuoteName;
    /**
     * 价格，单位：元
     */
    private BigDecimal price;
    /**
     * 购买数量
     */
    private Double count;
}
