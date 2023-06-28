package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class Product {
    /**
     * [@即将废弃]投保SKU（客户自定义SKUcode）（数字或字母或空格）
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * [@即将废弃]投保商品标准条码（UPC、EAN、JAN…）
     */
    @JsonProperty("standard_product_barcode")
    private String standardProductBarcode;

    /**
     * [@即将废弃]投保商品名称
     */
    @JsonProperty("product_name")
    private String productName;

    /**
     * [@即将废弃]投保商品描述
     */
    @JsonProperty("product_description")
    private String productDescription;

    /**
     * [@即将废弃]投保商品单价（按对应币别的法定单位，最多4位小数点）
     */
    @JsonProperty("product_unit_price")
    private Integer productUnitPrice;

    /**
     * [@即将废弃]投保商品单价币别（按照ISO标准三字码；支持的币种，根据物流产品+收件人国家配置；币种需和进出口国申报币种一致）
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * [@即将废弃]投保商品数量（单位为pcs）
     */
    @JsonProperty("qty")
    private Integer qty;
}
