package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author jadechiang
 * @since 2022/12/15 13:59
 */
@Setter
@Getter
public class TradeTerm {
    /**
     * 支付状态。国际站：WAIT_PAY(未支付),PAYER_PAID(已完成支付),PART_SUCCESS(部分支付成功),PAY_SUCCESS(支付成功),CLOSED(风控关闭),CANCELLED(支付撤销),SUCCESS(成功),FAIL(失败)。
     * 1688:1(未付款);2(已付款);4(全额退款);6(卖家有收到钱，回款完成) ;7(未创建外部支付单);8 (付款前取消) ; 9(正在支付中);12(账期支付,待到账)
     */
    private String payStatus;
    /**
     * 完成阶段支付时间 20220509084926000+0800
     */
    private String payTime;
    /**
     * 支付方式。 国际站：ECL(融资支付),CC(信用卡),TT(线下TT),ACH(echecking支付)。 1688:1-支付宝,2-网商银行信任付,3-诚e赊,4-银行转账,5-赊销宝,6-电子承兑票据,7-账期支付,8-合并支付渠道,9-无打款,10-零售通赊购,13-支付平台,12-声明付款
     */
    private String payWay;
    /**
     * 付款额
     */
    private BigDecimal phasAmount;
    /**
     * 阶段单id
     */
    private Long phase;
    /**
     * 阶段条件，1688无此内容
     */
    private String phaseCondition;
    /**
     * 阶段时间，1688无此内容
     */
    private String phaseDate;
    /**
     * 是否银行卡支付
     */
    private Boolean cardPay;
    /**
     * 是否快捷支付
     */
    private Boolean expressPay;
    /**
     * 支付方式
     */
    private String payWayDesc;
}
