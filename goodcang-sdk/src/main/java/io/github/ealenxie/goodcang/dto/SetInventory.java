package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetInventory {
    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("fifo_time")
    private String fifoTime;
    @JsonProperty("warning_age")
    private String warningAge;
}
