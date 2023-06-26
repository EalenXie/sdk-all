package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductInventory {

    /**
     * 商品编码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 在途数量
     */
    @JsonProperty("onway")
    private Integer onway;
    /**
     * 待上架数量
     */
    @JsonProperty("pending")
    private Integer pending;
    /**
     * 可售数量
     */
    @JsonProperty("sellable")
    private Integer sellable;
    /**
     * 不合格数量
     */
    @JsonProperty("unsellable")
    private Integer unsellable;
    /**
     * 待出库数量
     */
    @JsonProperty("reserved")
    private Integer reserved;
    /**
     * 备货数量
     */
    @JsonProperty("stocking")
    private Integer stocking;
    /**
     * 缺货数量
     */
    @JsonProperty("pi_no_stock")
    private Integer piNoStock;
    /**
     * 冻结数量
     */
    @JsonProperty("pi_freeze")
    private Integer piFreeze;
    /**
     * 仓库描述
     */
    @JsonProperty("warehouse_desc")
    private String warehouseDesc;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 仓库代码
     */
    @JsonProperty("shipped")
    private Integer shipped;
    /**
     * 商品冻结状态
     */
    @JsonProperty("product_freeze_status")
    private Integer productFreezeStatus;
    /**
     * 商品冻结状态名称
     */
    @JsonProperty("product_freeze_status_text")
    private Integer productFreezeStatusText;
}
