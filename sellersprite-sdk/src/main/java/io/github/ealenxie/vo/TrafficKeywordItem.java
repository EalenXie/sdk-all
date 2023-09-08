package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/4 9:58
 **/
@Getter
@Setter
public class TrafficKeywordItem implements Serializable {

    /**
     * 关键字
     */
    private String keywords;
    /**
     * 关键词中文翻译
     */
    private String keywordCn;
    /**
     * 搜索量
     */
    private Integer searches;
    /**
     * 商品数
     */
    private Integer products;
    /**
     * 购买量
     */
    private Integer purchases;
    /**
     * 购买率
     */
    private BigDecimal purchaseRate;
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
     * 曝光位置
     */
    private List<String> badges;
    /**
     * 自然排名
     */
    private RankPosition rankPosition;
    /**
     * 广告排名
     */
    private AdPosition adPosition;
    /**
     * 周搜索量排名
     */
    private Integer searchesRank;
    /**
     * 周搜索量排名时间范围
     */
    private Long searchesRankTimeFrom;
    /**
     * 周搜索量排名时间范围
     */
    private Long searchesRankTimeTo;
    /**
     * 最近1天广告竞品数
     */
    private Integer latest1daysAds;
    /**
     * 最近7天广告竞品数
     */
    private Integer latest7daysAds;
    /**
     * 最近30天广告竞品数
     */
    private Integer latest30daysAds;
    /**
     * 供需比
     */
    private BigDecimal supplyDemandRatio;
    /**
     * 流量占比
     */
    private BigDecimal trafficPercentage;
    /**
     * 流量占比类型
     */
    private String trafficKeywordType;
    /**
     * 转换效果类型
     */
    private BigDecimal conversionKeywordType;
    /**
     * 预估周搜索量
     */
    private Integer calculatedWeeklySearches;
    /**
     * 更新时间
     */
    private Long updatedTime;
}

