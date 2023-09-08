package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/8/31 17:10
 **/
@Getter
@Setter
public class ProductQueryParams extends PageParams{

    /**
     * 市场标志
     */
    private String marketplace;

    /**
     * 筛选日期,默认最近30天，最早查询时间为2020年1月份
     */
    private String month;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 排除关键字
     */
    private String excludeKeywords;

    /**
     * 最低价格
     */
    private BigDecimal minPrice;

    /**
     * 最高价格
     */
    private BigDecimal maxPrice;

    /**
     * 最低评分值
     */
    private BigDecimal minRating;

    /**
     * 最高评分值
     */
    private BigDecimal maxRating;

    /**
     * 最低评分数
     */
    private Integer minRatings;

    /**
     * 最高评分数
     */
    private Integer maxRatings;

    /**
     * 最低月新增评分数
     */
    private Integer minRatingsCv;

    /**
     * 最高月新增评分数
     */
    private Integer maxRatingsCv;

    /**
     * 最小卖家数量
     */
    private Integer minSellers;

    /**
     * 最大卖家数量
     */
    private Integer maxSellers;

    /**
     * 大类BSR最低排名
     */
    private Integer minBsr;

    /**
     * 大类BSR最高排名
     */
    private Integer maxBsr;

    /**
     * BSR最低增长数
     */
    private Integer minBsrCv;

    /**
     * BSR最高增长数
     */
    private Integer maxBsrCv;

    /**
     * BSR最低增长率
     */
    private BigDecimal minBsrCr;

    /**
     * BSR最高增长率
     */
    private BigDecimal maxBsrCr;

    /**
     * 最低月销量
     */
    private Integer minUnits;

    /**
     * 最高月销量
     */
    private Integer maxUnits;

    /**
     * 最低月销售额
     */
    private BigDecimal minRevenue;

    /**
     * 最高月销售额
     */
    private BigDecimal maxRevenue;

    /**
     * 月销售额最低增长率
     */
    private BigDecimal minRevenueCr;

    /**
     * 月销售额最高增长率
     */
    private BigDecimal maxRevenueCr;

    /**
     * 月销量最低增长率
     */
    private BigDecimal minUnitsCr;

    /**
     * 月销量最高增长率
     */
    private BigDecimal maxUnitsCr;

    /**
     * 类目选择
     */
    private String nodeIdPath;

    /**
     * true为类目精确查询
     * false为查询当前及子类目
     */
    private Boolean nodeIdPathEqual;

    /**
     * 上架月份
     */
    private Integer availableMonth;

    /**
     * 尺寸类型集合,逗号分隔
     */
    private String dimensionType;

    /**
     *  FBA最低运费
     */
    private BigDecimal minFba;

    /**
     * FBA最高运费
     */
    private BigDecimal maxFba;

    /**
     * 最低lqs
     */
    private BigDecimal minLqs;

    /**
     * 最高lqs
     */
    private BigDecimal maxLqs;

    /**
     * 卖家所属地
     */
    private String sellerNation;

    /**
     * 热销标识 Best Seller Y or N
     */
    private String badgeBS;

    /**
     * 热销标识 Amazon's Choice Y or N
     */
    private String badgeAC;

    /**
     * 配置方式 AMZ FBA FBM
     */
    private String fulfillment;

    /**
     * 是否查询变体 asinY:否 N:是，默认 Y
     */
    private String variation;

    /**
     * 排序
     */
    private OrderParams order;
}

