package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryLog {
    @JsonProperty("reference_no")
    private String referenceNo;
    @JsonProperty("ref_no")
    private String refNo;
    @JsonProperty("application_code")
    private String applicationCode;
    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("warehouse_name")
    private String warehouseName;
    @JsonProperty("inventory_change_type")
    private String inventoryChangeType;
    @JsonProperty("ibl_change_quantity")
    private String iblChangeQuantity;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("ibl_add_time")
    private String iblAddTime;
}
