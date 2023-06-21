package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 **/
@Getter
@Setter
public class ProductInfo {


    /**
     * SKU名称
     */
    @JsonProperty("productSku")
    private String productSku;

    /**
     * SKU中文名称
     */
    @JsonProperty("productName")
    private String productName;

    /**
     * SKU英文名称
     */
    @JsonProperty("productNameEn")
    private String productNameEn;

    /**
     * 销售链接
     */
    @JsonProperty("salesLink")
    private String salesLink;

    /**
     * 品牌
     */
    @JsonProperty("brandName")
    private String brandName;

    /**
     * 型号
     */
    @JsonProperty("modelName")
    private String modelName;

    /**
     * 电池类型
     */
    @JsonProperty("batteryType")
    private String batteryType;

    /**
     * 产品重量
     */
    @JsonProperty("cweightKg")
    private Double cWeightKg;

    /**
     * 产品长度
     */
    @JsonProperty("clengthCm")
    private Double cLengthCm;

    /**
     * 产品宽度
     */

    @JsonProperty("cwidthCm")
    private Double cWidthCm;

    /**
     * 产品高度
     */
    @JsonProperty("cheightCm")
    private Double cHeightCm;

    /**
     * 出口国,默认:CN
     */
    @JsonProperty("exportCountry")
    private String exportCountry;

    /**
     * 出口申报价格
     */
    @JsonProperty("exportPrice")
    private Double exportPrice;

    /**
     * 外部barcode1，用于传客户自己的条码
     */
    @JsonProperty("extraBarcode1")
    private String extraBarcode1;

    /**
     * 外部barcode2，用于传客户自己的条码
     */
    @JsonProperty("extraBarcode2")
    private String extraBarcode2;

    /**
     * 外部barcode3，用于传客户自己的条码
     */
    @JsonProperty("extraBarcode3")
    private String extraBarcode3;

    /**
     * 关键字
     */
    @JsonProperty("keywords")
    private String keywords;

    /**
     * 描述
     */
    @JsonProperty("descriptionInfo")
    private String descriptionInfo;

    /**
     * 规格
     */
    @JsonProperty("specification")
    private String specification;

    /**
     * 中文用途
     */
    @JsonProperty("usagesCN")
    private String usagesCN;

    /**
     * 英文用途
     */
    @JsonProperty("usagesEN")
    private String usagesEN;

    /**
     * 中文材质
     */
    @JsonProperty("materialCN")
    private String materialCN;

    /**
     * 英文材质
     */
    @JsonProperty("materialEN")
    private String materialEN;

    /**
     * 子产品列表
     */
    @JsonProperty("subProductInfoList")
    private List<SubProductInfo> subProductInfoList;


    /**
     * 进口国列表(必需填一个)
     */
    @JsonProperty("importCountryList")
    private List<ImportCountry> importCountryList;
}
