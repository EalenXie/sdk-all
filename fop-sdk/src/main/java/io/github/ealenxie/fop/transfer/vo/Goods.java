package io.github.ealenxie.fop.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:36
 */
@Getter
@Setter
public class Goods {
    /**
     * 品类代码
     */
    @JsonProperty("categoryCode")
    private String categoryCode;

    /**
     * 品类名称
     */
    @JsonProperty("categoryName")
    private String categoryName;

    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 申报数量
     */
    @JsonProperty("declareQuality")
    private Integer declareQuality;

    /**
     * 商品名称
     */
    @JsonProperty("goodsName")
    private String goodsName;

    /**
     * 商品代码
     */
    @JsonProperty("goodsNo")
    private String goodsNo;

    /**
     * 单价
     */
    @JsonProperty("unitPrice")
    private Double unitPrice;
}
