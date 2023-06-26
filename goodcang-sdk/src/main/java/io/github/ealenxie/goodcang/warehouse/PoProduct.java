package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/26 17:22
 */
@NoArgsConstructor
@Data
public class PoProduct {
    /**
     * 商品名称
     */
    @JsonProperty("product_name")
    private String productName;
    /**
     * 商品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
