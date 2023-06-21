package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class Product {
    @JsonProperty("skuCode")
    private String skuCode;
    @JsonProperty("standardProductBarcode")
    private String standardProductBarcode;
    @JsonProperty("declareProductCode")
    private String declareProductCode;
    @JsonProperty("declareProductNameLocal")
    private String declareProductNameLocal;
    @JsonProperty("declareProductNameEn")
    private String declareProductNameEn;
    @JsonProperty("uses")
    private String uses;
    @JsonProperty("specification")
    private String specification;
    @JsonProperty("component")
    private String component;
    @JsonProperty("unitNetWeight")
    private Integer unitNetWeight;
    @JsonProperty("unitGrossWeight")
    private Integer unitGrossWeight;
    @JsonProperty("material")
    private String material;
    @JsonProperty("declareProductCodeQty")
    private Integer declareProductCodeQty;
    @JsonProperty("unitDeclareProduct")
    private String unitDeclareProduct;
    @JsonProperty("originCountry")
    private String originCountry;
    @JsonProperty("countryExport")
    private String countryExport;
    @JsonProperty("countryImport")
    private String countryImport;
    @JsonProperty("hscodeExport")
    private String hscodeExport;
    @JsonProperty("hscodeImport")
    private String hscodeImport;
    @JsonProperty("declareUnitPriceExport")
    private Integer declareUnitPriceExport;
    @JsonProperty("currencyExport")
    private String currencyExport;
    @JsonProperty("declareUnitPriceImport")
    private Double declareUnitPriceImport;
    @JsonProperty("currencyImport")
    private String currencyImport;
    @JsonProperty("brandExport")
    private String brandExport;
    @JsonProperty("brandImport")
    private String brandImport;
    @JsonProperty("salesUrl")
    private String salesUrl;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("goodsNo")
    private String goodsNo;
    @JsonProperty("goosdName")
    private String goosdName;
    @JsonProperty("style")
    private String style;
    @JsonProperty("color")
    private String color;
    @JsonProperty("partList")
    private List<Part> partList;
}
