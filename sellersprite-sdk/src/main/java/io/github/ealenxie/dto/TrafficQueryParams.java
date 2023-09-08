package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/4 9:35
 **/
@Getter
@Setter
public class TrafficQueryParams extends PageParams {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * asin
     */
    private String asin;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 筛选日期,默认最近30天，最早查询时间为2020年1月份
     */
    private String month;
    /**
     * 流量词类型
     */
    private List<String> badges;
    /**
     * 流量占比类型
     */
    private List<String> trafficKeywordTypes;
    /**
     * 流量转化类型
     */
    private List<String> conversionKeywordTypes;
    /**
     * 排序
     */
    private OrderParams order;
}

