package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryAge {
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("iba_quantity")
    private String ibaQuantity;
    @JsonProperty("iba_fifo_time")
    private String ibaFifoTime;
    @JsonProperty("iba_warning_age")
    private String ibaWarningAge;
    @JsonProperty("product_title")
    private String productTitle;
    @JsonProperty("product_title_en")
    private String productTitleEn;
    @JsonProperty("warehouse_desc")
    private String warehouseDesc;
    @JsonProperty("warehouse_age")
    private String warehouseAge;
    @JsonProperty("expiration_date")
    private String expirationDate;
}
