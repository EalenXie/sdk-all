package io.github.ealenxie.alyunwms.vo.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/2/11 16:55
 **/
@Getter
@Setter
public class ProductVO {

    /**
     * 重量
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 自定义编码
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 产品状态 X:废弃 D:草稿 S:可用 P:审核中 R:审核不通过
     */
    @JsonProperty("product_status")
    private String productStatus;
    /**
     * 产品标题
     */
    @JsonProperty("product_title")
    private String productTitle;
    /**
     * 产品英文标题
     */
    @JsonProperty("product_title_en")
    private String productTitleEn;
    /**
     * 重量，单位KG
     */
    @JsonProperty("product_weight")
    private BigDecimal productWeight;
    /**
     * 长，单位CM
     */
    @JsonProperty("product_length")
    private BigDecimal productLength;
    /**
     * 宽，单位CM
     */
    @JsonProperty("product_width")
    private BigDecimal productWidth;
    /**
     * 高，单位CM
     */
    @JsonProperty("product_height")
    private BigDecimal productHeight;
    /**
     * 是否含电池，0不含，1含电池
     */
    @JsonProperty("contain_battery")
    private Integer containBattery;
    /**
     * 产品描述
     */
    @JsonProperty("product_desc")
    private String productDesc;
    /**
     * 申报价值，币种为USD
     */
    @JsonProperty("product_declared_value")
    private BigDecimal productDeclaredValue;
    /**
     * 申报名称 (英文)
     */
    @JsonProperty("product_declared_name")
    private String productDeclaredName;
    /**
     * 申报名称 (中文)
     */
    @JsonProperty("product_declared_name_zh")
    private String productDeclaredNameZh;
    /**
     * 品类语言，
     * zh中文，en英文，默认为en
     */
    @JsonProperty("cat_lang")
    private String catLang;
    /**
     * 产品品牌
     */
    @JsonProperty("product_brand")
    private String productBrand;
    /**
     * 产品型号
     */
    @JsonProperty("product_model")
    private String productModel;
    /**
     * 产品原产地
     */
    @JsonProperty("product_origin")
    private String productOrigin;
    /**
     * 产品材质
     */
    @JsonProperty("product_material")
    private String productMaterial;
    /**
     * 产品信息链接
     */
    @JsonProperty("product_desc_url")
    private String productDescUrl;
    /**
     * 一级品类
     */
    @JsonProperty("cat_id_level0")
    private Integer catIdLevelOne;
    /**
     * 二级品类
     */
    @JsonProperty("cat_id_level1")
    private Integer catIdLevelTwo;
    /**
     * 三级品类
     */
    @JsonProperty("cat_id_level2")
    private Integer catIdLevelThree;
    /**
     * 添加时间
     */
    @JsonProperty("product_add_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date productAddTime;
    /**
     * 修改时间
     */
    @JsonProperty("product_modify_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date productModifyTime;
    /**
     * 产品价格
     */
    @JsonProperty("product_cost")
    private BigDecimal productCost;
    /**
     * 海关编码
     */
    @JsonProperty("hs_code")
    private String hsCode;
    /**
     * 客户币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 客户代码
     */
    @JsonProperty("companyCode")
    private String companyCode;
    /**
     * 产品仓库属性
     */
    @JsonProperty("warehouse_attribute")
    private List<WarehouseAttributeVO> warehouseAttribute;
    /**
     * 产品审核不通过备注
     */
    @JsonProperty("note")
    private String note;
    /**
     * 产品颜色
     */
    @JsonProperty("product_color")
    private String productColor;
    /**
     * 易碎属性，0无易碎，1易碎品
     */
    @JsonProperty("fragile_property")
    private Integer fragileProperty;
    /**
     * 产品图片
     */
    @JsonProperty("product_img")
    private String productImg;
    /**
     * 产品尺码类型
     */
    @JsonProperty("product_size_type")
    private String productSizeType;
}

