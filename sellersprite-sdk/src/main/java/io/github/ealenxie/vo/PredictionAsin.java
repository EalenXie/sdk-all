package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/5 15:59
 **/
@Getter
@Setter
public class PredictionAsin {
    /**
     * asin明细
     */
    private PredictionAsinDetail asinDetail;
    /**
     * 日销量预测明细
     */
    private DailyItem dailyItemList;
    /**
     * 月销量预测明细
     */
    private MonthItem monthItemList;
}

