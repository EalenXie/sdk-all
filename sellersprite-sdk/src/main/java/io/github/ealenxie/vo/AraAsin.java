package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/9/5 13:21
 **/
@Getter
@Setter
public class AraAsin implements Serializable {
    /**
     * asin
     */
    private String asin;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 图片 URL
     */
    private String imageUrl;
    /**
     * 点击率
     */
    private BigDecimal clickRate;
    /**
     * 转化率
     */
    private BigDecimal conversionShareRate;
}

