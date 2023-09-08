package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/9/5 15:41
 **/
@Getter
@Setter
public class TopThreeAsin {
    /**
     * asin
     */
    private String asin;
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
    private BigDecimal conversionRate;
}

