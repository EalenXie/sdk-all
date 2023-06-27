package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 17:35
 */
@Getter
@Setter
public class PlanOrderSku {
    /**
     * FBA商品编码
     */
    @JsonProperty("fnsku")
    private String fnsku;
    /**
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 商品名称
     */
    @JsonProperty("product_sku_name")
    private String productSkuName;
    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
