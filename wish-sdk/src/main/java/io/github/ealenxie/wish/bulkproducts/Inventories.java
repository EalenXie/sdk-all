package io.github.ealenxie.wish.bulkproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 13:17
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
