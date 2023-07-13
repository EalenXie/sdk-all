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
public class UnqualifiedProductVariations {
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
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
}
