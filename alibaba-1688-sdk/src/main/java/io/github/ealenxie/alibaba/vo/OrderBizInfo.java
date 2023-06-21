package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 13:57
 */
@Setter
@Getter
public class OrderBizInfo {
    /**
     * 是否采源宝订单
     */
    private Boolean odsCyd;
    /**
     * 诚e赊支付详情，只有使用诚e赊付款时返回
     */
    private CreditOrderDetail creditOrderDetail;
    /**
     * 预订单信息
     */
    private PreOrderInfo preOrderInfo;
    /**
     * 账期交易订单的到账时间
     */
    private String accountPeriodTime;
    /**
     * 为true，表示下单时选择了诚e赊交易方式。注意不等同于“诚e赊支付”，支付时有可能是支付宝付款，具体支付方式查询tradeTerms.payWay
     */
    private Boolean creditOrder;
}
