package io.github.ealenxie.alyunwms.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/15 13:59
 * @version 1.0
 */
@Getter
@Setter
public class ProductSkuArr {
    /**
     * 产品形式 0：传SKU；1：产品代码
     */
    @JsonProperty("product_type")
    private String productType;
    /**
     * SKU 产品形式为0时为必填
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 产品代码 产品形式为1时为必填
     */
    @JsonProperty("product_barcode")
    private String productBarcode;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
