package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:38
 */
@Getter
@Setter
public class ClaimInternalInfo {
    /**
     * 商品编码(sku)
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 换标编码
     */
    @JsonProperty("replace_product_sku")
    private String replaceProductSku;
}
