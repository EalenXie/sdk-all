package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/5 10:29
 **/
@Getter
@Setter
public class KeywordResearchQueryParams extends PageParams {

    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 筛选日期,默认最近30天，最早查询时间为2020年1月份
     */
    private String month;
    /**
     * 查询类目，见关键词选品类目接口，传递code
     */
    private List<String> departments;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 排除关键字
     */
    private String excludeKeywords;
    /**
     * 最小搜索量
     */
    private Integer minSearches;
    /**
     * 最大搜索量
     */
    private Integer maxSearches;
    /**
     * 最小月搜索量增长率
     */
    private BigDecimal minSearchesCr;
    /**
     * 最大月搜索量增长率
     */
    private BigDecimal maxSearchesCr;
    /**
     * 最小商品数
     */
    private Integer minProducts;
    /**
     * 最大商品数
     */
    private Integer maxProducts;
    /**
     * 最小购买量
     */
    private Integer minPurchases;
    /**
     * 最大购买量
     */
    private Integer maxPurchases;
    /**
     * 最小购买率
     */
    private BigDecimal minPurchasesRate;
    /**
     * 最大购买率
     */
    private BigDecimal maxPurchasesRate;
    /**
     * 新细分市场
     */
    private Boolean withYearlyGrowth;
    /**
     * 最小月搜索量同比增长值
     */
    private Integer minSearchMonthCv;
    /**
     * 最大月搜索量同比增长值3
     */
    private Integer maxSearchMonthCv;
    /**
     * 最小月搜索量同比增长率
     */
    private BigDecimal minSearchMonthCr;
    /**
     * 最大月搜索量同比增长率
     */
    private BigDecimal maxSearchMonthCr;
    /**
     * 最小月搜索量近3个月增长值
     */
    private Integer minSearchNearlyCv;
    /**
     * 最大月搜索量近3个月增长值
     */
    private Integer maxSearchNearlyCv;
    /**
     * 最小月搜索量近3个月增长率
     */
    private BigDecimal minSearchNearlyCr;
    /**
     * 最大月搜索量近3个月增长率
     */
    private BigDecimal maxSearchNearlyCr;
    /**
     * 市场周期
     */
    private String marketPeriod;
    /**
     * 最小均价
     */
    private BigDecimal minAvgPrice;
    /**
     * 最大均价
     */
    private BigDecimal maxAvgPrice;
    /**
     * 最低评分数
     */
    private Integer minRatings;

    /**
     * 最高评分数
     */
    private Integer maxRatings;
    /**
     * 最低评分值
     */
    private BigDecimal minRating;

    /**
     * 最高评分值
     */
    private BigDecimal maxRating;
    /**
     * 最小ppc竞价
     */
    private BigDecimal minBid;
    /**
     * 最大ppc竞价
     */
    private BigDecimal maxBid;
    /**
     * 最小点击集中度
     */
    private BigDecimal minAraClickRate;
    /**
     * 最大点击集中度
     */
    private BigDecimal maxAraClickRate;
    /**
     * 最小货流值
     */
    private BigDecimal minGoodsValue;
    /**
     * 最大货流值
     */
    private BigDecimal maxGoodsValue;
    /**
     * 最小供需比
     */
    private BigDecimal minSupplyDemandRatio;
    /**
     * 最大供需比
     */
    private BigDecimal maxSupplyDemandRatio;
    /**
     * 最小单词个数
     */
    private Integer minWordCount;

    /**
     * 最大单词个数
     */
    private Integer maxWordCount;
    /**
     * 排序
     */
    private OrderParams order;
}

