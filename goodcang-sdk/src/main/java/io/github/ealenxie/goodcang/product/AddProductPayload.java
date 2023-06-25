package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/14 10:33
 */

@Getter
@Setter
public class AddProductPayload {
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 客户参考代码
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 商品名称
     */
    @JsonProperty("product_name_cn")
    private String productNameCn;
    /**
     * 商品英文名称
     */
    @JsonProperty("product_name_en")
    private String productNameEn;
    /**
     * 商品预报重量
     */
    @JsonProperty("product_weight")
    private String productWeight;
    /**
     * 商品预报长
     */
    @JsonProperty("product_length")
    private String productLength;
    /**
     * 商品预报宽
     */
    @JsonProperty("product_width")
    private String productWidth;
    /**
     * 商品预报高
     */
    @JsonProperty("product_height")
    private String productHeight;
    /**
     * 货物属性
     */
    @JsonProperty("contain_battery")
    private String containBattery;
    /**
     * 包裹类型
     */
    @JsonProperty("type_of_goods")
    private String typeOfGoods;
    /**
     * 品类语言
     */
    @JsonProperty("cat_lang")
    private String catLang;
    /**
     * 三级品类
     */
    @JsonProperty("cat_id_level2")
    private String catIdLevel2;
    /**
     * 是否自动提交审核
     */
    @JsonProperty("verify")
    private String verify;
    /**
     * 中文申报品名
     */
    @JsonProperty("product_declared_name_cn")
    private String productDeclaredNameCn;
    /**
     * 英文申报名称
     */
    @JsonProperty("product_declared_name")
    private String productDeclaredName;
    /**
     * 材质
     */
    @JsonProperty("product_material")
    private String productMaterial;
    /**
     * 用途
     */
    @JsonProperty("product_function")
    private String productFunction;
    /**
     * 有无品牌
     */
    @JsonProperty("branded")
    private String branded;
    /**
     * 商品品牌
     */
    @JsonProperty("product_brand")
    private String productBrand;
    /**
     * 商品型号
     */
    @JsonProperty("product_model")
    private String productModel;
    /**
     * 单位
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * 商品链接
     */
    @JsonProperty("product_link")
    private String productLink;
    /**
     * 商品图片链接
     */
    @JsonProperty("image_link")
    private List<String> imageLink;
    /**
     * 出口国关税信息维护
     */
    @JsonProperty("export_country")
    private List<DeclaredCountry> exportCountry;
    /**
     * 进口国清关信息维护
     */
    @JsonProperty("import_country")
    private List<DeclaredCountry> importCountry;
    /**
     * 商品证书
     */
    @JsonProperty("certificate_url_list")
    private List<String> certificateUrlList;
    /**
     * 第三方条码
     */
    @JsonProperty("thirdparty_sku_mapping")
    private List<String> thirdpartySkuMapping;
    /**
     * 退件授权
     */
    @JsonProperty("return_auth")
    private String returnAuth;
    /**
     * 退件授权
     */
    @JsonProperty("return_replacement_sku")
    private String returnReplacementSku;
    /**
     * 是否进行批次管理
     */
    @JsonProperty("batch_management_enabled")
    private String batchManagementEnabled;
    /**
     * 批次信息
     */
    @JsonProperty("batch_info")
    private BatchInfo batchInfo;
    /**
     * SKU包装属性
     */
    @JsonProperty("sku_wrapper_type")
    private Integer skuWrapperType;
    /**
     * 采集序列号信息
     */
    @JsonProperty("sn_info")
    private SnInfo snInfo;
    /**
     * 电池信息
     */
    @JsonProperty("battery_info")
    private BatteryInfo batteryInfo;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
}
