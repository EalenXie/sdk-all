package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author lanzhi
 * return {@link}
 * Created on 2023/9/5 13:18
 **/
@Getter
@Setter
public class RelationAsin implements Serializable {
    /**
     * asin
     */
    private String asin;
    /**
     * 图片 URL
     */
    private String imageUrl;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 评分数
     */
    private Integer ratings;
    /**
     * 评分
     */
    private BigDecimal rating;
}

