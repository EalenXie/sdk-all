package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 单条流水数据
 */
@Getter
@Setter
public class InventoryFlow {
    /**
     * 库存流水ID
     */
    @JsonProperty("inventory_flow_id")
    private String inventoryFlowId;
    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 业务类型
     */
    @JsonProperty("business_type")
    private String businessType;
    /**
     * 委托单号
     */
    @JsonProperty("business_ref_no")
    private String businessRefNo;
    /**
     * 批次号
     */
    @JsonProperty("batch_no")
    private String batchNo;
    /**
     * 出入库数量
     */
    @JsonProperty("io_qty")
    private String ioQty;
    /**
     * 结余库存
     */
    @JsonProperty("balance_stock")
    private String balanceStock;
    /**
     * 库存质量
     */
    @JsonProperty("stock_quality")
    private String stockQuality;
    /**
     * 出入库时间
     */
    @JsonProperty("create_time")
    private Long createTime;
    /**
     * 出入库标识
     */
    @JsonProperty("journal_type")
    private Long journalType;
}
