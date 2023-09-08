package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/5 16:34
 **/
@Getter
@Setter
public class PredictionBsrItem {
    /**
     * asin
     */
    private String bsr;
    /**
     * 预测日销量
     */
    private Integer estDailySales;
    /**
     * 预测30天销量
     */
    private Integer estMonthSales;
}

