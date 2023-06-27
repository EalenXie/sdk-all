package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetProductInventoryPayload extends PagePayload {
    /**
     * 商品sku组合
     */
    @JsonProperty("product_sku_arr")
    private List<String> productSkuArr;
    /**
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 多个仓库代码
     */
    @JsonProperty("warehouse_code_arr")
    private List<String> warehouseCodeArr;
}
