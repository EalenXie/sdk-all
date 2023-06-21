package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/2 14:52
 */
@Getter
@Setter
public class WarehouseSkuVO {
    @JsonProperty("warehouse_sku")
    private String warehouseSku;
    @JsonProperty("warehouse_sku_qty")
    private String warehouseSkuQty;
}
