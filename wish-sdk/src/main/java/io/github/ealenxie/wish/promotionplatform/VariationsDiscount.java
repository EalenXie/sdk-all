package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 15:41
 * @version 1.0
 */
@Getter
@Setter
public class VariationsDiscount {
    /**
     * scheduledStartTime
     */
    @JsonProperty("scheduled_start_time")
    private String scheduledStartTime;
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
     * scheduledEndTime
     */
    @JsonProperty("scheduled_end_time")
    private String scheduledEndTime;
    /**
     * variationId
     */
    @JsonProperty("variation_id")
    private String variationId;
}
