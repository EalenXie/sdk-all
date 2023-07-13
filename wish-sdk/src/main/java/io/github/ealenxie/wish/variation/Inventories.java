package io.github.ealenxie.wish.variation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 13:42
 * @version 1.0
 */
@Getter
@Setter
public class Inventories {
    /**
     * inventory
     */
    @JsonProperty("inventory")
    private Integer inventory;
    /**
     * warehouseId
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
}
