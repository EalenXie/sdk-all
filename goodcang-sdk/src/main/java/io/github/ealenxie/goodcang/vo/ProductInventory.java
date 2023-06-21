package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductInventory {
    @JsonProperty("product_barcode")
    private String productBarcode;
    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("onway")
    private Integer onway;
    @JsonProperty("pending")
    private Integer pending;
    @JsonProperty("sellable")
    private Integer sellable;
    @JsonProperty("unsellable")
    private Integer unsellable;
    @JsonProperty("reserved")
    private Integer reserved;
    @JsonProperty("stocking")
    private Integer stocking;
    @JsonProperty("pi_no_stock")
    private Integer piNoStock;
    @JsonProperty("pi_freeze")
    private Integer piFreeze;
    @JsonProperty("warehouse_desc")
    private String warehouseDesc;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("shipped")
    private Integer shipped;
}
