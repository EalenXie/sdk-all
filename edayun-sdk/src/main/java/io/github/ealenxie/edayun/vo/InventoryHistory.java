package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryHistory {
    /**
     * 流水号
     */
    @JsonProperty("changeid")
    private String changeid;
    /**
     * 单据的类型
     */
    @JsonProperty("recordType")
    private String recordType;
    /**
     * 产品sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * 产品名称
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * 产品对应的单号
     */
    @JsonProperty("billNum")
    private String billNum;
    /**
     * 产品的数量，对仓库而言：有出库的记录，数量为负数；有入库记录，数量为正数
     */
    @JsonProperty("qty")
    private Integer qty;
    /**
     * 单据的创建时间
     */
    @JsonProperty("changeDate")
    private String changeDate;
    /**
     * 产生库存流水对应的仓库
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;
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
     * 实际仓库
     */
    @JsonProperty("totalInventory")
    private String totalInventory;
    /**
     * 有效期
     */
    @JsonProperty("expiration_date")
    private String expirationDate;
    /**
     * 预留字段
     */
    @JsonProperty("userDef1 ")
    private String userDef1;
}
