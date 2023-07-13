package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@NoArgsConstructor
@Data
public class ProductUpdateRequest {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * productDict
     */
    @JsonProperty("product_dict")
    private ProductDict productDict;
    /**
     * blockingReason
     */
    @JsonProperty("blocking_reason")
    private String blockingReason;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
