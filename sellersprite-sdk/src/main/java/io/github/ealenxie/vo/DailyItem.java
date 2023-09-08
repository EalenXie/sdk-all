package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/9/5 16:15
 **/
@Getter
@Setter
public class DailyItem {
    /**
     * 日期
     */
    private String date;
    /**
     * BSR 排名
     */
    private Integer bsr;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 销售额
     */
    private BigDecimal amount;
    /**
     * 单价
     */
    private BigDecimal price;
}

