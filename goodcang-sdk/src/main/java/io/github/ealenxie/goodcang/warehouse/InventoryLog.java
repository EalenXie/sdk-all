package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryLog {

    /**
     * 操作单号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 参考号
     */
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 操作类型
     */
    @JsonProperty("application_code")
    private String applicationCode;
    /**
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
    /**
     * 变动类型
     */
    @JsonProperty("inventory_change_type")
    private String inventoryChangeType;
    /**
     * 变动类型
     */
    @JsonProperty("ibl_change_quantity")
    private String iblChangeQuantity;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 备注
     */
    @JsonProperty("ibl_add_time")
    private String iblAddTime;
}
