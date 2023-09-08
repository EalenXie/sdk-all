package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/1 15:47
 **/
@Getter
@Setter
public class KeywordQueryParams extends PageParams{
    /**
     * 市场
     */
    private String marketplace;
    /**
     * 历史日期，yyyyMM格式，最近30天不传或传空字符串
     */
    private String historyDate;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 批量查询关键词
     */
    private List<String> keywordList;
    /**
     * 最小搜索量
     */
    private Integer minSearch;
    /**
     * 最大搜索量
     */
    private Integer maxSearch;
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
     * 最小SPR
     */
    private Integer minSPR;

    /**
     * 最大SPR
     */
    private Integer maxSPR;
    /**
     * 最小标题密度
     */
    private Integer minTitleDensity;
    /**
     * 最大标题密度
     */
    private Integer maxTitleDensity;
    /**
     * 最小相关度
     */
    private BigDecimal minRelevancy;
    /**
     * 最大相关度
     */
    private BigDecimal maxRelevancy;
    /**
     * 最小搜索排名
     */
    private Integer minSearchRank;
    /**
     * 最大搜索排名
     */
    private Integer maxSearchRank;
    /**
     * 最小商品数
     */
    private Integer minProducts;
    /**
     * 最大商品数
     */
    private Integer maxProducts;
    /**
     * 最小供需比
     */
    private BigDecimal minSupplyDemandRatio;
    /**
     * 最大供需比
     */
    private BigDecimal maxSupplyDemandRatio;
    /**
     * 最小广告竞品数
     */
    private Integer minAdProducts;
    /**
     * 最大广告竞品数
     */
    private Integer maxAdProducts;
    /**
     * 最小单词个数
     */
    private Integer minWordCount;
    /**
     * 最大单词个数
     */
    private Integer maxWordCount;
    /**
     * 最小点击集中度
     */
    private BigDecimal minMonopolyClickRate;
    /**
     * 最大点击集中度
     */
    private BigDecimal maxMonopolyClickRate;
    /**
     * 最小ppc竞价
     */
    private BigDecimal minBid;
    /**
     * 最大ppc竞价
     */
    private BigDecimal maxBid;
    /**
     * 最小均价
     */
    private BigDecimal minPrice;
    /**
     * 最大均价
     */
    private BigDecimal maxPrice;
    /**
     * 最小评分数
     */
    private Integer minRatings;
    /**
     * 最大评分数
     */
    private Integer maxRatings;
    /**
     * 最小评分值
     */
    private BigDecimal minRating;
    /**
     * 最大评分值
     */
    private BigDecimal maxRating;
    /**
     * 亚马逊推荐词
     */
    private Boolean amazonChoice;
    /**
     * 过滤词根 0包含所有 1只包含词根
     */
    private Integer filterRootWord;
    /**
     * 包含的词
     */
    private List<String> includeKeywords;
    /**
     * 排除的词
     */
    private List<String> excludeKeywords;

    /**
     * 排序
     */
    private OrderParams order;
}

