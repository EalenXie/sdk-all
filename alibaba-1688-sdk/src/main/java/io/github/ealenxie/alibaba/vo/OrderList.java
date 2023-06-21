package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 9:26
 */
@Setter
@Getter
public class OrderList {
    /**
     * postFee
     */
    private Integer postFee;
    /**
     * orderAmmount
     */
    private Integer orderAmmount;
    /**
     * discount
     */
    private Integer discount;
    /**
     * sumPaymentNoCarriageFromClient
     */
    private Integer sumPaymentNoCarriageFromClient;
    /**
     * mergePay
     */
    private Boolean mergePay;
    /**
     * orderId
     */
    private String orderId;
    /**
     * chooseFreeFreight
     */
    private Boolean chooseFreeFreight;
}
