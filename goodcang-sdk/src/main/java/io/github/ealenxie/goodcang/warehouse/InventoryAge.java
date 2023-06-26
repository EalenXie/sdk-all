package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryAge {

    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 在库库存
     */
    @JsonProperty("iba_quantity")
    private String ibaQuantity;
    /**
     * 上架时间
     */
    @JsonProperty("iba_fifo_time")
    private String ibaFifoTime;
    /**
     * 预警库龄
     */
    @JsonProperty("iba_warning_age")
    private String ibaWarningAge;
    /**
     * 预警库龄
     */
    @JsonProperty("product_title")
    private String productTitle;
    /**
     * 商品英文名称
     */
    @JsonProperty("product_title_en")
    private String productTitleEn;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouse_desc")
    private String warehouseDesc;
    /**
     * 库龄
     */
    @JsonProperty("warehouse_age")
    private Integer warehouseAge;
    /**
     * 过期日期
     */
    @JsonProperty("expiration_date")
    private String expirationDate;
}
