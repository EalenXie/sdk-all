package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.fulfillment.dto.DeclareCountry;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月27日 0027 10 16
 */
@Getter
@Setter
public class Sku {
    /**
     * SKU ID ,数字条码，系统自动生成。如：9020003123
     */
    @JsonProperty("sku_id")
    private String skuId;

    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * 商品条码（UPC、EAN、JAN…）
     */
    @JsonProperty("product_code")
    private String productCode;

    /**
     * 申报产品代码
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;

    /**
     * SKU名称
     */
    @JsonProperty("sku_name")
    private String skuName;

    /**
     * 商品的规格型号说明；例如：红色、50cm*65cm*50cm
     */
    @JsonProperty("specification")
    private String specification;

    /**
     * 计量单位 (请参考基础数据-计量单位)
     */
    @JsonProperty("uom")
    private String uom;

    /**
     * 商品包装，商品包装的属性。 如 : H (硬包装)；S (软包装）
     */
    @JsonProperty("wrapping")
    private String wrapping;

    /**
     * 商品外观,如果包装形态是硬包装，需要选择包装的外观。 如 : SS (正方体)；RS (长方体)；CS (圆锥体)；TS (三角形)；LS (L形)；OS (其它)；DS (圆柱体)；
     */
    @JsonProperty("appearance")
    private String appearance;

    /**
     * 商品特性。   如: 01: 带插座； 02 (带液体)； 03 (带光盘)； 04 (易碎品)； 05 (带粉末)； 06 (膏状)； 07 (贵重货品)； 08 (恒温保存)； 09 (危险货品)
     */
    @JsonProperty("characteristic")
    private List<String> characteristic;

    /**
     * 单个产品(加包装)的重量(单位: g 克)，如15。
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 长或直径 (单位: cm 厘米) 根据外观来决定代表 长 还是 直径，精确到3位小数，如15.335。
     */
    @JsonProperty("length")
    private String length;

    /**
     * 宽 (单位: cm 厘米)，精确到3位小数，如15.335。
     */
    @JsonProperty("width")
    private String width;

    /**
     * 高 (单位: cm 厘米)，精确到3位小数，如15.335。
     */
    @JsonProperty("height")
    private String height;

    /**
     * 自带物流包装。 如 : Y（是）;N （否）
     */
    @JsonProperty("logistics_package")
    private String logisticsPackage;

    /**
     * 包装材质。 如 :WO (木质);PA (纸质);PL (塑料);ME (金属);OT (其他)
     */
    @JsonProperty("package_material")
    private String packageMaterial;

    /**
     * SN码规则编码。 如 : 01 (15位数字);02 (18位数字);03 (12位字符)
     */
    @JsonProperty("sn_rule_code")
    private String snRuleCode;

    /**
     * 是否有效期管理。 如 : Y（是）;N （否）。注：选择Y后，必须在入库预报进行商品有效期的设置
     */
    @JsonProperty("expired_date")
    private String expiredDate;

    /**
     * 销售链接，商品对外销售的链接
     */
    @JsonProperty("sales_link")
    private String salesLink;

    /**
     * 是否批次管理。如 : Y（是）;N （否）。必须在入库预报进行批次的设置
     */
    @JsonProperty("include_batch")
    private String includeBatch;

    /**
     * 是否带电。如 : Y（是）;N （否）。 注：如果选择带电，电池类型、电池配置、电池功率、电池功率、电池数量、电池资料为TRUE项
     */
    @JsonProperty("include_battery")
    private String includeBattery;

    /**
     * 电池配置。 如 : EB (配套);PB (纯电);IB (内置);NB (其他)
     */
    @JsonProperty("battery_config")
    private String batteryConfig;

    /**
     * 电池类型。 如: LI (锂电池);NI (镍氢电池);DR (干电池);BU (纽扣电池);OT (其他）
     */
    @JsonProperty("battery_type")
    private String batteryType;

    /**
     * 电池功率，商品带有电池的功率
     */
    @JsonProperty("battery_power")
    private String batteryPower;

    /**
     * 电池数量，商品带有电池的数量，数字类型，如15。
     */
    @JsonProperty("battery_number")
    private String batteryNumber;

    /**
     * 电池资料，商品电池的资料URL信息
     */
    @JsonProperty("battery_resource")
    private String batteryResource;

    /**
     * 4PX图片地址.(绝对地址,格式:http://host/image_path); url所对应的图片必须要属于当前用户。
     */
    @JsonProperty("picture_url")
    private List<String> pictureUrl;

    /**
     * 商品备注
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 客户操作账号，如存在子账号则返回不同的4PX客户助记码
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * SKU状态：X 已作废， S 已发布 ，N 草稿
     */
    @JsonProperty("sku_status")
    private String skuStatus;

    /**
     * SKU商品信息中的中文名称
     */
    @JsonProperty("chinese_name")
    private String chineseName;

    /**
     * 商品信息有无品牌，有返回 Y 无返回 N
     */
    @JsonProperty("is_brand")
    private String isBrand;

    /**
     * 品牌名称
     */
    @JsonProperty("brand_name")
    private String brandName;

    /**
     * 原产国
     */
    @JsonProperty("origin_country")
    private String originCountry;

    /**
     * SKU申报信息
     */
    @JsonProperty("declare_country_list")
    private List<DeclareCountry> declareCountryList;
}
