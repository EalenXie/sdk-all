package io.github.ealenxie.fop.pds.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 15:47
 * <p>
 * 货物列表
 */
@Getter
@Setter
public class ParcelProduct {

    /**
     * SKU（客户自定义SKUcode）（数字或字母或空格）
     */
    @JsonProperty("skuCode")
    private String skuCode;

    /**
     * 商品标准条码（UPC、EAN、JAN…）
     */
    @JsonProperty("standardProductBarcode")
    private String standardProductBarcode;

    /**
     * 商品名称
     */
    @JsonProperty("productName")
    private String productName;

    /**
     * 商品描述
     */
    @JsonProperty("productDescription")
    private String productDescription;

    /**
     * 商品单价（按对应币别的法定单位，最多4位小数点）
     */
    @JsonProperty("productUnitPrice")
    private Integer productUnitPrice;

    /**
     * 币别
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 数量（单位为pcs）
     */
    @JsonProperty("qty")
    private Integer qty;
}
