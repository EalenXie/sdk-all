package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryEx {


    /**
     * 用户查询库存的商品SKU
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 每个仓库中产品可售库存
     */
    @JsonProperty("qty")
    private Integer qty;
    /**
     * 仓库ID
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 实际库存
     */
    @JsonProperty("totalInventory")
    private Integer totalInventory;
    /**
     * 待出库存
     */
    @JsonProperty("forOutboundInventory")
    private Integer forOutboundInventory;
    /**
     * 批号
     */
    @JsonProperty("lot")
    private String lot;
    /**
     * 库存状态，1正品、2次品
     */
    @JsonProperty("inventory_sts")
    private Integer inventorySts;
    /**
     * 有效期
     */
    @JsonProperty("expiration_date")
    private String expirationDate;
    /**
     * 预留字段
     */
    @JsonProperty("userDef1")
    private String userDef1;
}
