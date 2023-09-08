package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/1 13:16
 **/
@Getter
@Setter
public class ProductCompetitor implements Serializable {

    /**
     * asin
     */
    private String asin;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 品牌 URL
     */
    private String brandUrl;
    /**
     * 图片 URL
     */
    private String imageUrl;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 父体
     */
    private String parent;
    /**
     * 节点 id
     */
    private Long nodeId;
    /**
     * 节点 id 路径字符串
     */
    private String nodeIdPath;
    /**
     * 类目
     */
    private String nodeLabelPath;
    /**
     * BSRid
     */
    private String bsrId;
    /**
     * BSR 排名
     */
    private Integer bsr;
    /**
     * BSR 增长率
     */
    private BigDecimal bsrCr;
    /**
     * BSR 增长数
     */
    private Integer bsrCv;
    /**
     * 月销量
     */
    private Integer units;
    /**
     * 月销量增长率
     */
    private BigDecimal unitsGr;
    /**
     * 月销售额
     */
    private BigDecimal revenue;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 利润率
     */
    private BigDecimal profit;
    /**
     * fba 运费
     */
    private BigDecimal fba;
    /**
     * 评分数
     */
    private Integer ratings;
    /**
     * 留评率
     */
    private BigDecimal ratingsRate;
    /**
     * 评分
     */
    private BigDecimal rating;
    /**
     * 月度增长数
     */
    private Integer ratingsCv;
    /**
     * 留评数：近 30天新增评论数
     */
    private Integer ratingDelta;
    /**
     * 上架时间，时间戳格式
     */
    private Long availableDate;
    /**
     * 配送方式
     */
    private String fulfillment;
    /**
     * 变体数
     */
    private Integer variations;
    /**
     * 卖家数
     */
    private Integer sellers;
    /**
     * BuyBox 卖家 id
     */
    private String sellerId;
    /**
     * BuyBox 卖家
     */
    private String sellerName;
    /**
     * BuyBox 卖家国籍
     */
    private String sellerNation;
    /**
     * 标识
     */
    private Badge badge;
    /**
     * 重量
     */
    private String weight;
    /**
     * 尺寸
     */
    private String dimension;
    /**
     * 尺寸类型
     */
    private String dimensionsType;
    /**
     * sku
     */
    private String sku;
    /**
     * sku
     */
    private List<Subcategory> subcategories;
}

