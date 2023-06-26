package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:17
 */
@Getter
@Setter
public class ClaimOrderProduct {
    /**
     * 原商品编码
     */
    @JsonProperty("old_product_sku")
    private String oldProductSku;
    /**
     * 更换的商品编码
     */
    @JsonProperty("new_product_sku")
    private String newProductSku;
    /**
     * 数量
     */
    @JsonProperty("num")
    private Integer num;
}
