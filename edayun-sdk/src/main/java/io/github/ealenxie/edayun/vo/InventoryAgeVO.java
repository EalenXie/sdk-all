package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryAgeVO {


    /**
     * 产品ID
     */
    @JsonProperty("productId")
    private Integer productId;

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
     * 仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 上架时间
     */
    @JsonProperty("shelvesTime")
    private Long shelvesTime;
    /**
     * 上架时间（字符串）
     */
    @JsonProperty("shelvesTimeString")
    private String shelvesTimeString;
    /**
     * 库存
     */
    @JsonProperty("inventoryQuantity")
    private Integer inventoryQuantity;
    /**
     * 库龄
     */
    @JsonProperty("inventoryAge")
    private Integer inventoryAge;
    /**
     * 客户编码
     */
    @JsonProperty("customerCode")
    private String customerCode;
    /**
     * 产品中文名
     */
    @JsonProperty("productNameZh")
    private String productNameZh;
}
