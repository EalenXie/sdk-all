package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:38
 */
@Getter
@Setter
public class ClaimProduct {
    /**
     * 参考商品编码
     */
    @JsonProperty("ref_product_sku")
    private String refProductSku;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
