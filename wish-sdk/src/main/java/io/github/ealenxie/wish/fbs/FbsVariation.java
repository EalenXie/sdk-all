package io.github.ealenxie.wish.fbs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 15:10
 */
@Getter
@Setter
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
