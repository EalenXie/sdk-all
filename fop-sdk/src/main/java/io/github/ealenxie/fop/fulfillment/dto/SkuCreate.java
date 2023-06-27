package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/14 13:35
 */

@Getter
@Setter
public class SkuCreate {

    /**
     * 商品条码（UPC、EAN、JAN…）
     */
    @JsonProperty("product_code")
    private String productCode;

    /**
     * 商品的规格型号说明；
     * <p>
     * 例如：红色、50cm*65cm*50cm
     */
    @JsonProperty("specification")
    private String specification;

    /**
     * 商品外观。
     * <p>
     * <p>
     * 可选值 :
     * <p>
     * SS (正方体)；RS (长方体)；CS (圆锥体)；TS (三角形)；LS (L形)；OS (其它)；DS (圆柱体)。
     * <p>
     * *注：如果包装形态是硬包装，则appearance （商品外观）必填。
     */
    @JsonProperty("appearance")
    private String appearance;

    /**
     * 商品特性。
     * <p>
     * <p>
     * 支持多选。
     * <p>
     * 多选值 :
     * <p>
     * 01: 带插座； 02 (带液体)； 03 (带光盘)； 04 (易碎品)； 05 (带粉末)； 06 (膏状)； 07 (贵重货品)； 08 (恒温保存)； 09 (危险货品)
     */
    @JsonProperty("characteristic")
    private List<String> characteristic;

    /**
     * SN码规则编码。
     * <p>
     * <p>
     * 可选值 : 01 (15位数字)；02 (18位数字)；03 (12位字符)。
     * <p>
     * 如果SKU无SN码管理则为空。
     */
    @JsonProperty("sn_rule_code")
    private String snRuleCode;

    /**
     * 是否有效期管理。
     * <p>
     * <p>
     * 可选值 : Y（是）；N （否）。
     * <p>
     * *注：选择Y后，必须在入库预报进行商品有效期的设置
     */
    @JsonProperty("expired_date")
    private String expiredDate;

    /**
     * 销售链接，商品对外销售的链接
     */
    @JsonProperty("sales_link")
    private String salesLink;

    /**
     * 是否批次管理。
     * <p>
     * <p>
     * 可选值 : Y（是）;N （否）。
     * <p>
     * *注：选择Y后，必须在入库预报进行批次的设置
     */
    @JsonProperty("include_batch")
    private String includeBatch;

    /**
     * 是否带电。
     * <p>
     * <p>
     * 可选值 :  Y（是）;N （否）。
     * <p>
     * * 注：如果选择Y（是）带电，电池类型、电池配置、电池功率、电池功率、电池数量、电池资料为必填项
     */
    @JsonProperty("include_battery")
    private String includeBattery;

    /**
     * 电池配置。
     * <p>
     * <p>
     * 可选值 : EB (配套)；PB (纯电)；IB (内置)；NB (其他)
     */
    @JsonProperty("battery_config")
    private String batteryConfig;

    /**
     * 电池类型。
     * <p>
     * <p>
     * 可选值 : LI (锂电池)；NI (镍氢电池)；DR (干电池)；BU (纽扣电池)；OT (其他）
     */
    @JsonProperty("battery_type")
    private String batteryType;

    /**
     * 电池功率，商品带有电池的功率
     */
    @JsonProperty("battery_power")
    private String batteryPower;

    /**
     * 电池数量，商品带有电池的数量，如2
     */
    @JsonProperty("battery_number")
    private Integer batteryNumber;

    /**
     * 电池资料，商品电池的资料URL信息。上传文件资料限定格式，
     * <p>
     * <p>
     * 可选值：rar和zip。
     */
    @JsonProperty("battery_resource")
    private String batteryResource;

    /**
     * 商品备注
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 自动审核标识(默认：Y自动审核)。
     * <p>
     * <p>
     * 可选值 : Y (自动审核)；N(不审核)；
     */
    @JsonProperty("release_flag")
    private String releaseFlag;

    /**
     * 客户操作账号。
     * <p>
     * <p>
     * 如果客户存在操作账号管理，则SKU创建成功后，返回SKU_ID为空，如果客户不存在操作账号管理，则返回SKU_ID信息。
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * 申报产品代码
     * <p>
     * <p>
     * 创建SKU货品时，可以填写已经创建的申报产品代码，系统会把当前SKU自动关联申报产品。创建申报产品
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;

    /**
     * SKU编码(只允许字母、数字，-，_，#，*，/，&，+，?，.，(，)，@)
     * <p>
     * <p>
     * 注：同一客户SKU编码信息不能重复，SKU编码长度必须大于3个字符，字母只支持大写保存。
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * SKU名称(只允许字母、数字；字母支持大小写)，SKU名称长度必须大于3个字符。
     */
    @JsonProperty("sku_name")
    private String skuName;

    /**
     * 计量单位
     */
    @JsonProperty("uom")
    private String uom;

    /**
     * 商品包装，商品包装的属性；
     * <p>
     * <p>
     * 可选值 : H (硬包装)；S (软包装）。
     * <p>
     * *注：如果包装形态是硬包装，则appearance （商品外观）必填。
     */
    @JsonProperty("wrapping")
    private String wrapping;

    /**
     * 单个产品(加包装)的重量(单位: g 克)。
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 质量单位
     */
    @JsonProperty("weight_unit")
    private String weightUnit;

    /**
     * 长或直径 (单位: cm 厘米) 根据外观来决定代表 长 还是 直径，精确到3位小数。
     */
    @JsonProperty("length")
    private String length;

    /**
     * 宽 (单位: cm 厘米)，精确到3位小数。
     */
    @JsonProperty("width")
    private String width;

    /**
     * 高 (单位: cm 厘米)，精确到3位小数。
     */
    @JsonProperty("height")
    private String height;

    /**
     * 自带物流包装。
     * <p>
     * <p>
     * 可选值 : Y（是）；N （否）
     */
    @JsonProperty("logistics_package")
    private String logisticsPackage;

    /**
     * 包装材质。
     * <p>
     * <p>
     * 可选值 :WO (木质)；PA (纸质)；PL (塑料)；ME (金属)；OT (其他)
     */
    @JsonProperty("package_material")
    private String packageMaterial;

    /**
     * 图片地址.(绝对地址,格式:http://host/image_path);
     * <p>
     * <p>
     * url所对应的图片必须要属于当前用户。
     * <p>
     * *注：SKU图片上传数量必须大于2张。图片路径必须有效，如图片路径有问题导致下载失败会影响入库下单审核失败。
     */
    @JsonProperty("picture_url")
    private List<String> pictureUrl;
}
