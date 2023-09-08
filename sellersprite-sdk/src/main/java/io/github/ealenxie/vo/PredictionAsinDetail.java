package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/9/5 16:01
 **/
@Getter
@Setter
public class PredictionAsinDetail {
    /**
     * asin
     */
    private String asin;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 上架时间，时间戳格式
     */
    private Long availableDate;
    /**
     * 上架时间，时间戳格式
     */
    private String category;
    /**
     * 类目id
     */
    private String categoryId;
    /**
     * 图片 URL
     */
    private String imageUrl;
    /**
     * 评分数
     */
    private Integer ratings;
    /**
     * 评分
     */
    private BigDecimal rating;
}

