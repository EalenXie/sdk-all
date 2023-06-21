package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryInventoryEx {
    /**
     * 客户需要查询库存的商品SKU，会查询此SKU在所有仓库的库存信息。
     * 如输入*，这表示返回所有SKU库存信息。
     * 没有入库记录的SKU，无库存信息返回。
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 客户需要查询的仓库ID，可根据listPublicWarehouseInfo方法获取所有仓库ID
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;
}
