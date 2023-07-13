package io.github.ealenxie.wish.rating;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 15:22
 * @version 1.0
 */
@Getter
@Setter
public class ProductRatePayload {

    /**
     * comment
     */
    @JsonProperty("comment")
    private String comment;
    /**
     * rating
     */
    @JsonProperty("rating")
    private Integer rating;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * orderId
     */
    @JsonProperty("order_id")
    private String orderId;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * variationId
     */
    @JsonProperty("variation_id")
    private String variationId;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
