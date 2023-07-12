package io.github.ealenxie.wish.fbs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/12 15:10
 */
@NoArgsConstructor
@Data
public class FbsVariation {

    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * pendingQuantity
     */
    @JsonProperty("pending_quantity")
    private Integer pendingQuantity;
    /**
     * activeQuantity
     */
    @JsonProperty("active_quantity")
    private Integer activeQuantity;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
