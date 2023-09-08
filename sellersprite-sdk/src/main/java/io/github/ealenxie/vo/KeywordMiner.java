package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/1 17:03
 **/
@Getter
@Setter
public class KeywordMiner implements Serializable {
    /**
     * 市场
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
     * 类目
     */
    private List<Department> departments;
    /**
     * 搜索月份
     */
    private String month;
    /**
     * 是否属于补充关键词（无当前月搜索量）
     */
    private String supplement;
    /**
     * 搜索量
     */
    private Integer searches;
    /**
     * 月购买量
     */
    private Integer purchases;
    /**
     * 月购买率
     */
    private BigDecimal purchaseRate;
    /**
     * 点击垄断率
     */
    private BigDecimal monopolyClickRate;
    /**
     * 商品数
     */
    private Integer products;
    /**
     * 广告竞品数
     */
    private Integer adProducts;
    /**
     * 供需比
     */
    private BigDecimal supplyDemandRatio;
    /**
     * 平均价格
     */
    private BigDecimal avgPrice;
    /**
     * 平均评分数
     */
    private Integer avgRatings;
    /**
     * 平均评分值
     */
    private BigDecimal avgRating;
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
     * 转化共享率
     */
    private BigDecimal cvsShareRate;
    /**
     * 单词个数
     */
    private Integer wordCount;
    /**
     * 标题密度
     */
    private Integer titleDensity;
    /**
     * SPR
     */
    private BigDecimal spr;
    /**
     * 相关度
     */
    private Integer relevancy;
    /**
     * 亚马逊推荐词 true是的 false不是
     */
    private Boolean amazonChoice;
    /**
     * 搜索排名
     */
    private Integer searchRank;
}

