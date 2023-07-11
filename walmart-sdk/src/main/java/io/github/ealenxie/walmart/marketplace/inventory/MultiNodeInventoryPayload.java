package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/11 13:43
 * @version 1.0
 */
@Getter
@Setter
public class MultiNodeInventoryPayload {

    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * nodes
     */
    @JsonProperty("nodes")
    private List<InventoryNode> nodes;
}
