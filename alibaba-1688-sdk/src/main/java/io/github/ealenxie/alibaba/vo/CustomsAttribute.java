package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 14:07
 */
@Setter
@Getter
public class CustomsAttribute {
    /**
     * sku标识
     */
    private String sku;
    /**
     * 中文名称
     */
    private String cName;
    /**
     * 英文名称
     */
    private String enName;
    /**
     * 申报价值
     */
    private Double amount;
    /**
     * 数量
     */
    private Double quantity;
    /**
     * 重量（kg）
     */
    private Double weight;
    /**
     * 报关币种
     */
    private String currency;
}
