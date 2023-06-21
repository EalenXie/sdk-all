package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 13:57
 */
@Setter
@Getter
public class CreditOrderDetail {
    /**
     * 订单金额
     */
    private Long payAmount;
    /**
     * 支付时间
     */
    private String createTime;
    /**
     * 状态
     */
    private String status;
    /**
     * 最晚还款时间
     */
    private String gracePeriodEndTime;
    /**
     * 状态描述
     */
    private String statusStr;
    /**
     * 应还金额
     */
    private Long restRepayAmount;
}
