package io.github.ealenxie.wish.fbs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/12 15:12
 */
@NoArgsConstructor
@Data
public class FbsRecommendation {

    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * variationId
     */
    @JsonProperty("variation_id")
    private String variationId;
    /**
     * gmv
     */
    @JsonProperty("gmv")
    private Integer gmv;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * variationSku
     */
    @JsonProperty("variation_sku")
    private String variationSku;
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
