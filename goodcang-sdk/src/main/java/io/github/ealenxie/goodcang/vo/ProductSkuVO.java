package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/5/23 17:09
 */
@Getter
@Setter
public class ProductSkuVO {


    /**
     * SKU
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 客户参考代码
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 产品状态
     */
    @JsonProperty("product_status")
    private String productStatus;
    /**
     * 中文名称
     */
    @JsonProperty("product_title_cn")
    private String productTitleCn;
    /**
     * 英文名称
     */
    @JsonProperty("product_title_en")
    private String productTitleEn;
    /**
     * 重量
     */
    @JsonProperty("product_weight")
    private Integer productWeight;
    /**
     * 长 单位CM
     */
    @JsonProperty("product_length")
    private Integer productLength;
    /**
     * 宽 单位CM
     */
    @JsonProperty("product_width")
    private Integer productWidth;
    /**
     * 高 单位CM
     */
    @JsonProperty("product_height")
    private Integer productHeight;
    /**
     * 实收重量 单位KG
     */
    @JsonProperty("Product_real_weight")
    private Integer productRealWeight;
    /**
     * 实收长
     */
    @JsonProperty("Product_real_length")
    private Integer productRealLength;
    /**
     * 实收宽
     */
    @JsonProperty("Product_real_width")
    private Integer productRealWidth;
    /**
     * 实收高
     */
    @JsonProperty("Product_real_height")
    private Integer productRealHeight;
    /**
     * 货物属性
     */
    @JsonProperty("contain_battery")
    private Integer containBattery;
    /**
     * 商品包裹类型
     */
    @JsonProperty("type_of_goods")
    private Integer typeOfGoods;
    /**
     * 一级品类
     */
    @JsonProperty("cat_id_level0")
    private Integer catIdLevel0;
    /**
     * 二级品类
     */
    @JsonProperty("cat_id_level1")
    private Integer catIdLevel1;
    /**
     * 二级品类
     */
    @JsonProperty("cat_id_level2")
    private Integer catIdLevel2;
    /**
     * 品类语言 默认为zh
     */
    @JsonProperty("cat_lang")
    private String catLang;
    /**
     * 是否品牌
     */
    @JsonProperty("branded")
    private Integer branded;
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
     * 商品链接
     */
    @JsonProperty("product_link")
    private String productLink;
    /**
     * 成交单位
     * 个/只/件/支/枝/把
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * 商品图片链接
     */
    @JsonProperty("image_link")
    private List<String> imageLink;
    /**
     * 商品关税信息
     */
    @JsonProperty("tax_info")
    private List<TaxInfo> taxInfo;
    /**
     * 出口国关税信息
     */
    @JsonProperty("export_country")
    private List<ExportCountry> exportCountry;
    /**
     * 进口国清关信息
     */
    @JsonProperty("import_country")
    private List<ExportCountry> importCountry;
    /**
     * 是否异形商品
     */
    @JsonProperty("IsIrregular")
    private Integer isIrregular;
    /**
     * 进口国备注
     */
    @JsonProperty("import_country_remark")
    private String importCountryRemark;
    /**
     * 查验审核备注
     */
    @JsonProperty("check_remark")
    private String checkRemark;
    /**
     * 货型 示例 : M
     */
    @JsonProperty("cargo_type")
    private String cargoType;
    /**
     * 添加时间
     */
    @JsonProperty("product_add_time")
    private String productAddTime;
    /**
     * 异动时间
     */
    @JsonProperty("product_modify_time")
    private String productModifyTime;
    /**
     * 映射编码列表
     */
    @JsonProperty("thirdparty_sku_mapping")
    private List<String> thirdpartySkuMapping;
    /**
     * 出库是否采集序列号
     * 指仓库出库扫描时是否需采集商品序列号（SN码）信息。<br>如需要采集，请务必在序列号管理中提前维护商品的序列号信息
     * 默认值 : false
     */
    @JsonProperty("is_collect_serial_number")
    private Boolean isCollectSerialNumber;
    /**
     * 入库是否采集序列号
     * 指仓库入库扫描时是否需采集商品序列号（SN码）信息。<br>如需要采集，请务必在序列号管理中提前维护商品的序列号信息
     * 默认值 : false
     */
    @JsonProperty("is_inbound_collect_serial_number")
    private Boolean isInboundCollectSerialNumber;
    /**
     * SKU包装属性
     */
    @JsonProperty("sku_wrapper_type")
    private Integer skuWrapperType;
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
