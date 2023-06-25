package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 17:56
 */
@Getter
@Setter
public class TwcToWarehouse {
    /**
     * 中转仓代码
     */
    @JsonProperty("transit_warehouse_code")
    private String transitWarehouseCode;
    /**
     * 中转仓名称
     */
    @JsonProperty("transit_warehouse_name")
    private String transitWarehouseName;
    /**
     * 目的仓代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 目的仓名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
}
