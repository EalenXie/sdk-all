package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetInventory {
    /**
     * 产品SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 上架时间
     */
    @JsonProperty("fifo_time")
    private String fifoTime;
    /**
     * 预警库龄
     */
    @JsonProperty("warning_age")
    private String warningAge;
}
