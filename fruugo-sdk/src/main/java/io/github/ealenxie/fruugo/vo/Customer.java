package io.github.ealenxie.fruugo.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/10 12:27
 */
@Getter
@Setter
public class Customer {
    /**
     * 不含增值锐价格（以客户货币计算的单件商品）
     */
    private String customerItemPriceExcVat;
    /**
     * 增值锐价格（以客户货币计算的单件商品）
     */
    private String customerItemVat;
    /**
     * 不含增值税的总价（以客户货币计算的单件商品）
     */
    private String totalCustomerPriceExcVat;
    /**
     * 增值税总额（以客户货币计算的单件商品）
     */
    private String totalCustomerVat;
    /**
     * 客户货币
     */
    private String customerCurrency;
}
