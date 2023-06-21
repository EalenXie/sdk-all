package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetProductInventory {


    @JsonProperty("product_sku_arr")
    private List<String> productSkuArr;
    @JsonProperty("product_sku")
    private String productSku;
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    @JsonProperty("warehouse_code_arr")
    private List<String> warehouseCodeArr;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonProperty("page")
    private Integer page;
}
