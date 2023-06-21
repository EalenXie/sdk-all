package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 出库单产品详情
 */
@Getter
@Setter
public class ProductItem {
    /**
     * 平台SKU
     */
    private String channelSku;
    /**
     * 产品SKU
     */
    private String sku;
    /**
     * 货品名称
     */
    private String title;
    /**
     * 批号
     */
    @JsonProperty("Lot")
    private String lot;
    /**
     * SKU数量
     */
    private Integer quantity;
    /**
     * 平台SKU单价
     */
    private Float unitPrice;
}
