package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/22 16:56
 * @version 1.0
 */
@Getter
@Setter
public class BatchInfo {
    /**
     * 产品sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 产品代码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;
    /**
     * 产品数量
     */
    @JsonProperty("sku_quantity")
    private Integer skuQuantity;
    /**
     * 产品库存批次号
     */
    @JsonProperty("inventory_code")
    private String inventoryCode;
    /**
     * 库存类型,0:标准 1:不良品,2暂存
     */
    @JsonProperty("ib_type")
    private Integer ibType;
    /**
     * 上架时间
     */
    @JsonProperty("warehouse_shelf_time")
    private String warehouseShelfTime;
}
