package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 11:29
 * @version 1.0
 */
@Getter
@Setter
public class InventoryQueryParams {
    /**
     * sku
     */
    @JsonProperty("sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sku;
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipNode;
}
