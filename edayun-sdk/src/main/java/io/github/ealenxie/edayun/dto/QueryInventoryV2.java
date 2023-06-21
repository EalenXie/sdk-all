package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryInventoryV2 {


    /**
     * 客户需要查询库存的商品SKU，会查询此SKU在所有仓库的库存信息。
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 客户需要查询的仓库ID，可根据listPublicWarehouseInfo方法获取所有仓库ID
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;
    /**
     * 表示从第几条记录开始查询，默认 offset=0表示从第一条记录开始（一次最多返回50条记录）
     */
    @JsonProperty("offset")
    private Integer offset;
}
