package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 16:14
 * @version 1.0
 */
@Getter
@Setter
public class DiscountData {
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * discountPercentage
     */
    @JsonProperty("discount_percentage")
    private Integer discountPercentage;
    /**
     * maxQuantity
     */
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    /**
     * variationId
     */
    @JsonProperty("variation_id")
    private String variationId;
}
