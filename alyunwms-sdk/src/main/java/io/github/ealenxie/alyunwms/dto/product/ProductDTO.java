package io.github.ealenxie.alyunwms.dto.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/2/10 14:39
 **/
@Getter
@Setter
public class ProductDTO {
    /**
     * sku
     */
    @JsonProperty("product_sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productSku;
    /**
     * 自定义编码
     */
    @JsonProperty("reference_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String referenceNo;
    /**
     * 产品标题
     */
    @JsonProperty("product_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productTitle;
    /**
     * 产品英文标题
     */
    @JsonProperty("product_title_en")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productTitleEn;
    /**
     * 重量，单位KG
     */
    @JsonProperty("product_weight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal productWeight;
    /**
     * 净重，单位KG
     */
    @JsonProperty("product_net_weight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal productNetWeight;
    /**
     * 长，单位CM
     */
    @JsonProperty("product_length")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal productLength;
    /**
     * 宽，单位CM
     */
    @JsonProperty("product_width")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal productWidth;
    /**
     * 高，单位CM
     */
    @JsonProperty("product_height")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal productHeight;
    /**
     * 是否含电池，0不含，1含电池
     */
    @JsonProperty("contain_battery")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer containBattery;
    /**
     * 带电类型 非必填
     * PI970 DHL no more than 2 batteries、
     * PI970 DHL more than 2 batteries、
     * PI967 more than 2 batteries or 4 cells、PI966、PI967
     */
    @JsonProperty("battery_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String batteryType;
    /**
     * 申报价值，币种为USD
     */
    @JsonProperty("product_declared_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal productDeclaredValue;
    /**
     * 申报名称 (英文)
     */
    @JsonProperty("product_declared_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productDeclaredName;
    /**
     * 申报名称 (中文)
     */
    @JsonProperty("product_declared_name_zh")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productDeclaredNameZh;
    /**
     * 海关编码
     */
    @JsonProperty("hs_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String hsCode;
    /**
     * 品类语言，
     * zh中文，en英文，默认为en
     */
    @JsonProperty("cat_lang")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String catLang;
    /**
     * 库存预警
     */
    @JsonProperty("warning_qty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer warningQty;
    /**
     * 预警天数
     */
    @JsonProperty("warning_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer warningDays;
    /**
     * 产品品牌
     */
    @JsonProperty("product_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productBrand;
    /**
     * 产品型号
     */
    @JsonProperty("product_model")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productModel;
    /**
     * 产品原产地
     */
    @JsonProperty("product_origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productOrigin;
    /**
     * 产品材质
     */
    @JsonProperty("product_material")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productMaterial;
    /**
     * 产品用途[EN]
     */
    @JsonProperty("product_use_en")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productUseEn;
    /**
     * 产品材质[EN]
     */
    @JsonProperty("product_material_en")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productMaterialEn;
    /**
     * 产品信息链接
     */
    @JsonProperty("product_desc_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productDescUrl;
    /**
     * 一级品类
     */
    @JsonProperty("cat_id_level0")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer catIdLevelOne;
    /**
     * 二级品类
     */
    @JsonProperty("cat_id_level1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer catIdLevelTwo;
    /**
     * 三级品类
     */
    @JsonProperty("cat_id_level2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer catIdLevelThree;
    /**
     * 不传或者传0，
     * 创建草稿产品，
     * 传1，创建正式产品默认为0，产品审核通过之后，不可编辑
     */
    @JsonProperty("verify")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer verify;
    /**
     * 产品图片base64
     */
    @JsonProperty("customerImg")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String customerImg;
    /**
     * 产品颜色
     */
    @JsonProperty("product_color")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productColor;
    /**
     * 是否共享（0:不共享，1:共享，不填默认传0）
     */
    @JsonProperty("shared_product")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer sharedProduct;
    /**
     * 共享单价（AUD）
     */
    @JsonProperty("Shared_unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sharedUnitPrice;
    /**
     * 产品描述
     */
    @JsonProperty("Product_Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productDescription;
    /**
     * 是否一箱多件
     * 否 1 是 2 未定义 0
     */
    @JsonProperty("is_box_more_sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isBoxMoreSku;
    /**
     * 易碎属性，0无易碎，1易碎品
     */
    @JsonProperty("fragile_property")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer fragileProperty;
    /**
     * 产品尺码类型
     */
    @JsonProperty("product_size_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productSizeType;

}

