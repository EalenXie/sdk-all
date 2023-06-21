package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inventory {
    /**
     * 客户操作账号
     */
    @JsonProperty("customer_code")
    private String customerCode;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 数字条码
     */
    @JsonProperty("sku_id")
    private String skuId;
    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * SKU库存批次号
     */
    @JsonProperty("batch_no")
    private String batchNo;
    /**
     * 仓库可用库存
     */
    @JsonProperty("available_stock")
    private Integer availableStock;
    /**
     * 仓库待出库存
     */
    @JsonProperty("pending_stock")
    private Integer pendingStock;
    /**
     * 在途库存
     */
    @JsonProperty("onway_stock")
    private Integer onWayStock;
    /**
     * 库存质量
     */
    @JsonProperty("stock_quality")
    private String stockQuality;
}
