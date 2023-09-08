package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/9/4 14:43
 **/
@Getter
@Setter
public class AsinDetail implements Serializable {
    /**
     * 市场
     */
    private String marketplace;
    /**
     * asin
     */
    private String asin;
    /**
     * asin url
     */
    private String asinUrl;
    /**
     * 上架时间，时间戳格式
     */
    private Long availableDate;
    /**
     * 标识
     */
    private Badge badge;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 品牌 URL
     */
    private String brandUrl;
    /**
     * BSRid
     */
    private String bsrId;
    /**
     * bsr 标签
     */
    private String bsrLabel;
    /**
     * bsr 排名
     */
    private Integer bsrRank;
    /**
     * 创建时间
     */
    private Long createdTime;
    /**
     * 尺寸
     */
    private String dimensions;
    /**
     * 第一次评论时间
     */
    private Long firstRatingDate;
    /**
     * 图片 URL
     */
    private String imageUrl;
    /**
     * lqs
     */
    private Integer lqs;
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
     * 父体
     */
    private String parent;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 问题数量
     */
    private Integer questions;
    /**
     * 评分
     */
    private BigDecimal rating;
    /**
     * 评分数
     */
    private Integer ratings;
    /**
     * BuyBox 卖家 id
     */
    private String sellerId;
    /**
     * BuyBox 卖家
     */
    private String sellerName;
    /**
     * 配置方式 AMZ FBA FBM
     */
    private String fulfillment;
    /**
     * 卖家数
     */
    private Integer sellers;
    /**
     * sku
     */
    private List<String> skuList;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 排名时间
     */
    private Long updatedTime;
    /**
     * 变体
     */
    private List<Variation> variationList;
    /**
     * 变体数
     */
    private Integer variations;
    /**
     * 重量
     */
    private String weight;
    /**
     * 重量
     */
    private String zoomImageUrl;
    /**
     * sku
     */
    private List<Subcategory> subcategories;
}

