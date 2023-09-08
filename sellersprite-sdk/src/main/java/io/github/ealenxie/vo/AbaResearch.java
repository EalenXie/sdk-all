package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/5 15:05
 **/
@Getter
@Setter
public class AbaResearch {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 关键词中文翻译
     */
    private String keywordCn;
    /**
     * 关键词日文翻译
     */
    private String keywordJp;
    /**
     * 查询类目，见关键词选品类目接口，传递code
     */
    private List<String> departments;
    /**
     * 搜索排名
     */
    private Integer searchRank;
    /**
     * 搜索增长量
     */
    private Integer searchRankCv;
    /**
     * 搜索量增长率
     */
    private BigDecimal searchRankCr;
    /**
     * 周搜索量
     */
    private Integer searches;
    /**
     * 排名增长量
     */
    private Integer searchRankGrowthValue;
    /**
     * 排名增长量
     */
    private BigDecimal searchRankGrowthRate;
    /**
     * ara转化率
     */
    private BigDecimal cvsShareRate;
    /**
     * 第一页GK标题精确包含数
     */
    private Integer titleDensityExact;
    /**
     * 精确 CPR（8天内确保关键词上首页的销量数）
     */
    private Integer cprExact;
    /**
     * 上周的排名
     */
    private Integer w1SearchRank;
    /**
     * 上周的排名变化值
     */
    private Integer w1RankGrowthValue;
    /**
     * 上周的排名变化率
     */
    private BigDecimal w1RankGrowthRate;
    /**
     * 4周前的排名
     */
    private Integer w4SearchRank;
    /**
     * 4周前的排名变化值
     */
    private Integer w4RankGrowthValue;
    /**
     * 4周前的排名变化率
     */
    private BigDecimal w4RankGrowthRate;
    /**
     * 12周前的排名
     */
    private Integer w12SearchRank;
    /**
     * 12周前的排名变化值
     */
    private Integer w12RankGrowthValue;
    /**
     * 12周前的排名变化率
     */
    private BigDecimal w12RankGrowthRate;
    /**
     * 点击前三品牌
     */
    private List<String> top3Brands;
    /**
     * 最小PPC价格
     */
    private BigDecimal bidMin;
    /**
     * 最大PPC价格
     */
    private BigDecimal bidMax;
    /**
     * PPC价格
     */
    private BigDecimal bid;
    /**
     * 前三点击asin
     */
    private List<TopThreeAsin> top3AsinDtoList;
    /**
     * 前三点击比
     */
    private BigDecimal sumClickRate;
    /**
     * 转化总比
     */
    private BigDecimal sumConversionRate;

}

