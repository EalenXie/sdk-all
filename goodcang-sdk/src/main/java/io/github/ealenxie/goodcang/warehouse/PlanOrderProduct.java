package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 17:12
 */
@Getter
@Setter
public class PlanOrderProduct {
    /**
     * 合规负责人编码
     */
    @JsonProperty("euro_terms_code")
    private String euroTermsCode;
    /**
     * 商品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * FBA商品编码
     */
    @JsonProperty("fnsku")
    private String fnsku;
    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 换标总数量
     */
    @JsonProperty("change_label_qty")
    private Integer changeLabelQty;
}
