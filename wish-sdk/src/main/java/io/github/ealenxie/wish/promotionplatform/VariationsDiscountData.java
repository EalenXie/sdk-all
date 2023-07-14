package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 16:14
 * @version 1.0
 */
@Getter
@Setter
public class VariationsDiscountData {
    /**
     * discountData
     */
    @JsonProperty("discount_data")
    private List<DiscountData> discountData;
    /**
     * defaultMaxQuantity
     */
    @JsonProperty("default_max_quantity")
    private Integer defaultMaxQuantity;
    /**
     * defaultDiscountPercentage
     */
    @JsonProperty("default_discount_percentage")
    private Integer defaultDiscountPercentage;
}
