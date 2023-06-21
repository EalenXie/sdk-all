package io.github.ealenxie.edayun.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 易达云（EDA）创建订单出参
 */
@Getter
@Setter
public class CreateOrderVO {
    /**
     * EDA订单号
     */
    private String businessNum;
    /**
     * 平台订单号
     */
    private String poNumber;
}
