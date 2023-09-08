package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/5 11:14
 **/
@Getter
@Setter
public class KeywordResearch implements Serializable {
    /**
     * 市场标志
     */
    private String marketplace;
    /**
     * 关键字
     */
    private String keywords;
    /**
     * 搜索量
     */
    private Integer searches;
    /**
     * 月购买量
     */
    private Integer purchases;
    /**
     * 增长率
     */
    private BigDecimal growth;
    /**
     * 月购买率
     */
    private BigDecimal purchaseRate;
    /**
     * 商品数
     */
    private Integer products;
    /**
     * 供需比
     */
    private BigDecimal supplyDemandRatio;
    /**
     * 类目
     */
    private List<SearchDepartment> searchDepartments;
    /**
     * 筛选日期,默认最近30天，最早查询时间为2020年1月份
     */
    private String month;
    /**
     * 是否属于补充关键词（无当前月搜索量）
     */
    private String supplement;
    /**
     * 关键词同比增长
     */
    private Integer searchMonthlyCv;
    /**
     * 关键词同比增长率
     */
    private BigDecimal searchMonthlyCr;
    /**
     * 关键词近3个月增长值
     */
    private Integer searchNearlyCv;
    /**
     * 关键词近3个月增长率
     */
    private BigDecimal searchNearlyCr;
    /**
     * 货币
     */
    private String currency;
    /**
     * 平均价格
     */
    private BigDecimal avgPrice;
    /**
     * 平均评分数
     */
    private Integer avgRatings;
    /**
     * 平均评论数
     */
    private BigDecimal avgRating;
    /**
     * 关键词关联asin
     */
    private List<RelationAsin> relationAsinList;
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
     * 点击垄断率
     */
    private BigDecimal araClickRate;
    /**
     * 点击前三ASIN
     */
    private List<AraAsin> araAsinList;
    /**
     * 货流值
     */
    private BigDecimal goodsValue;
    /**
     * 市场周期
     */
    private String marketPeriod;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 是否存在品牌词
     */
    private Boolean hasBrandWord;
    /**
     * 关键词中文翻译
     */
    private String keywordCn;
}

