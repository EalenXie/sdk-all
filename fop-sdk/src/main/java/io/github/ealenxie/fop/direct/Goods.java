package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 14:51
 */
@Getter
@Setter
public class Goods {

    /**
     * 品类代码
     */
    @JsonProperty("declareProductCode")
    private String declareProductCode;

    /**
     * 商品名称中文
     */
    @JsonProperty("declareProductNameLocal")
    private String declareProductNameLocal;

    /**
     * 商品名称英文
     */
    @JsonProperty("declareProductNameEn")
    private String declareProductNameEn;

    /**
     * 出口申报单价（元）
     */
    @JsonProperty("declareUnitPriceExport")
    private Double declareUnitPriceExport;

    /**
     * 进口申报单价（元）
     */
    @JsonProperty("declareUnitPriceImport")
    private Double declareUnitPriceImport;

    /**
     * 出口申报币种
     */
    @JsonProperty("currencyExport")
    private String currencyExport;

    /**
     * 进口申报币种
     */
    @JsonProperty("currencyImport")
    private String currencyImport;

    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private Integer quantity;

    /**
     * 材质
     */
    @JsonProperty("material")
    private String material;

    /**
     * 用途
     */
    @JsonProperty("uses")
    private String uses;

    /**
     * 出口品牌
     */
    @JsonProperty("brandExport")
    private String brandExport;

    /**
     * 进口品牌
     */
    @JsonProperty("brandImport")
    private String brandImport;

    /**
     * 出口海关编码
     */
    @JsonProperty("hscodeExport")
    private String hscodeExport;

    /**
     * 进口海关编码
     */
    @JsonProperty("hscodeImport")
    private String hscodeImport;
}
