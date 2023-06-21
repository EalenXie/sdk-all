package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 14:06
 */
@Getter
@Setter
public class OrderRateInfo {
    /**
     * 买家评价状态(4:已评论,5:未评论,6;不需要评论)
     */
    private Integer buyerRateStatus;
    /**
     * 卖家评价状态(4:已评论,5:未评论,6;不需要评论)
     */
    private Integer sellerRateStatus;
    /**
     * 卖家給买家的评价
     */
    private List<RateDetail> buyerRateList;
    /**
     * 买家給卖家的评价
     */
    private List<RateDetail> sellerRateList;
}
