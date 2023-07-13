package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@Getter
@Setter
public class WarehouseInventory {
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
