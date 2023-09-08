package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/5 16:29
 **/
@Getter
@Setter
public class PredictionBsr {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * asin
     */
    private String bsr;
    /**
     * 类目名称
     */
    private String categoryLabel;
    /**
     * 预测日销量
     */
    private Integer estDailySales;
    /**
     * 预测30天销量
     */
    private Integer estMonthSales;
    /**
     * 明细
     */
    private List<PredictionBsrItem> itemList;
}

