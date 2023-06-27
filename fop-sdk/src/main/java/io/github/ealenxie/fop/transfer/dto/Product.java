package io.github.ealenxie.fop.transfer.dto;

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
    /**
     * SKU(如果已在4PX注册的SKU，只需要填写该项即可）
     */
    @JsonProperty("skuCode")
    private String skuCode;

    /**
     * 商品标准条码（UPC、EAN、JAN…）
     */
    @JsonProperty("standardProductBarcode")
    private String standardProductBarcode;

    /**
     * 申报品类CODE（4PX品类基础数据）
     */
    @JsonProperty("declareProductCode")
    private String declareProductCode;

    /**
     * 申报商品名称描述（本地语言）
     */
    @JsonProperty("declareProductNameLocal")
    private String declareProductNameLocal;

    /**
     * 申报商品名称描述英文
     */
    @JsonProperty("declareProductNameEn")
    private String declareProductNameEn;

    /**
     * 用途
     */
    @JsonProperty("uses")
    private String uses;

    /**
     * 规格（化妆品必须提供数字型）
     */
    @JsonProperty("specification")
    private String specification;

    /**
     * 成分
     */
    @JsonProperty("component")
    private String component;

    /**
     * 单件商品净重（默认以g为单位）
     */
    @JsonProperty("unitNetWeight")
    private Integer unitNetWeight;

    /**
     * 单件商品毛重（默认以g为单位）
     */
    @JsonProperty("unitGrossWeight")
    private Integer unitGrossWeight;

    /**
     * 材质
     */
    @JsonProperty("material")
    private String material;

    /**
     * 申报数量(int)
     */
    @JsonProperty("declareProductCodeQty")
    private Integer declareProductCodeQty;

    /**
     * 单位（默认值：PCS）
     */
    @JsonProperty("unitDeclareProduct")
    private String unitDeclareProduct;

    /**
     * 原产地（ISO标准2字码）
     */
    @JsonProperty("originCountry")
    private String originCountry;

    /**
     * 出口国
     */
    @JsonProperty("countryExport")
    private String countryExport;

    /**
     * 进口国
     */
    @JsonProperty("countryImport")
    private String countryImport;

    /**
     * 出口国海关编码
     */
    @JsonProperty("hscodeExport")
    private String hscodeExport;

    /**
     * 进口国海关编码
     */
    @JsonProperty("hscodeImport")
    private String hscodeImport;

    /**
     * 出口国申报单价
     * <p>
     * 按对应币别的法定单位，最多4位小数点，多余的小数位会直接去除掉，只保留四位小数
     */
    @JsonProperty("declareUnitPriceExport")
    private Integer declareUnitPriceExport;

    /**
     * 出口国币种（按照ISO标准，目前只支持USD）
     */
    @JsonProperty("currencyExport")
    private String currencyExport;

    /**
     * 进口国申报单价
     * <p>
     * 按对应币别的法定单位，最多4位小数点，多余的小数位会直接去除掉，只保留四位小数
     */
    @JsonProperty("declareUnitPriceImport")
    private Double declareUnitPriceImport;

    /**
     * 进口国币种（按照ISO标准，目前只支持USD）
     */
    @JsonProperty("currencyImport")
    private String currencyImport;

    /**
     * 出口国品牌（无品牌填"NONE"）
     */
    @JsonProperty("brandExport")
    private String brandExport;

    /**
     * 进口国品牌（无品牌填"NONE"）
     */
    @JsonProperty("brandImport")
    private String brandImport;

    /**
     * 商品销售URL
     */
    @JsonProperty("salesUrl")
    private String salesUrl;

    /**
     * 图片url链接
     */
    @JsonProperty("imageUrl")
    private String imageUrl;

    /**
     * 商品编号
     */
    @JsonProperty("goodsNo")
    private String goodsNo;

    /**
     * 商品名称
     */
    @JsonProperty("goosdName")
    private String goosdName;

    /**
     * 商品款式
     */
    @JsonProperty("style")
    private String style;

    /**
     * 商品颜色
     */
    @JsonProperty("color")
    private String color;

    /**
     * 配件列表
     */
    @JsonProperty("partList")
    private List<Part> partList;
}
