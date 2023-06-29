package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 09 15
 */
@Getter
@Setter
public class InventoryDetail {

    /**
     * 库存详情导出的序号
     */
    @JsonProperty("serial_no")
    private String serialNo;

    /**
     * 客户代码,客户助记码。如：900278
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * 仓库代码。需要查询库存的仓库代码。（详细参考公共服务，获取仓库代码）
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 数字条码。4PX系统针对SKU生成的唯一条码。
     */
    @JsonProperty("sku_id")
    private String skuId;

    /**
     * SKU编码。如：TEST001
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * SKU库存批次号
     */
    @JsonProperty("batch_no")
    private String batchNo;

    /**
     * 库存质量
     */
    @JsonProperty("stock_quality")
    private String stockQuality;

    /**
     * 委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 仓库在库库存（仓库库存）
     */
    @JsonProperty("warehouse_stock")
    private String warehouseStock;

    /**
     * SKU上架时间。 *注：返回时间值格式为long类型，接收到值后需要对long类型值进行转换。
     */
    @JsonProperty("putaway_time")
    private Long putawayTime;

    /**
     * SKU库龄/在库时间（天）
     */
    @JsonProperty("inventory_age")
    private String inventoryAge;

    /**
     * 商品失效日期
     */
    @JsonProperty("expiry_date")
    private String expiryDate;

}
