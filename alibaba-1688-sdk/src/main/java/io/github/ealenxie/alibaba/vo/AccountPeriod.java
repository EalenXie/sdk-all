package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;


/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 9:29
 */
@Setter
@Getter
public class AccountPeriod {
    /**
     * 账期的类型,1：一个月指定日期结算一次，3：两个月指定日期结算一次，6：三个月指定日期结算一次，5：按收货时间和账期日期结算
     */
    private Integer tapType;
    /**
     * 根据账期类型不同而不同，按月结算类型此值代表具体某日，按收货时间结算时此值代表结算时间周期
     */
    private Integer tapDate;
    /**
     * 逾期次数
     */
    private Integer tapOverdue;

}
