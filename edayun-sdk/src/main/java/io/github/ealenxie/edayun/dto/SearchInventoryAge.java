package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchInventoryAge {


    /**
     * 产品barCode
     */
    @JsonProperty("barCode")
    private String barCode;
    /**
     * 客户需要查询库存的商品SKU
     */
    @JsonProperty("productSku")
    private String productSku;
    /**
     * 客户需要查询的仓库ID
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;
    /**
     * 仓库Code
     */
    @JsonProperty("warehouseCode")
    private Integer warehouseCode;
    /**
     * 业务单号
     */
    @JsonProperty("businessNum")
    private String businessNum;
    /**
     * 创建时间范围开始
     */
    @JsonProperty("inventoryAgeStart")
    private Long inventoryAgeStart;
    /**
     * 创建时间范围结束
     */
    @JsonProperty("inventoryAgeEnd")
    private Long inventoryAgeEnd;
    /**
     * 表示从第几条记录开始查询，默认 offset=0表示从第一条记录开始（一次最多返回100条记录）
     */
    @JsonProperty("offset")
    private Integer offset;
}
