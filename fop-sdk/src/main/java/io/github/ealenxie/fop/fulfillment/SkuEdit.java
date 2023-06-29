package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 14:00
 */
@Getter
@Setter
public class SkuEdit {

    /**
     * SKU编码(只允许字母、数字，-，_，#，*，/，&，+，?，.，(，)，@) 注：同一客户SKU编码信息不能重复，SKU编码长度必须大于3个字符，字母只支持大写保存。
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * SKU名称(只允许字母；字母支持大小写)，SKU名称长度必须大于3个字符。
     */
    @JsonProperty("sku_name")
    private String skuName;
    /**
     * sku中文名(填写中文名称)，SKU名称长度必须大于3个字符。
     */
    @JsonProperty("chinese_name")
    private String chineseName;
    /**
     * 销售链接，商品对外销售的链接,当销售链接如果为空时，则出口申报品名，客户出口海关编码，出口申报价，币种，进口申报品名，客户进口海关编码必填
     */
    @JsonProperty("sales_link")
    private String salesLink;
    /**
     * 单个产品(加包装)的重量(单位: g )。只能填整数
     */
    private String weight;
    /**
     * 长或直径 (单位: cm 厘米) 根据外观来决定代表 长 还是 直径，精确到3位小数。
     */
    private String length;
    /**
     * 宽 (单位: cm 厘米)，精确到3位小数。
     */
    private String width;
    /**
     * 高 (单位: cm 厘米)，精确到3位小数
     */
    private String height;
    /**
     * 新增参数）是否有品牌
     */
    @JsonProperty("is_brand")
    private String isBrand;
    /**
     * （新增参数）品牌名称
     */
    @JsonProperty("brand_name")
    private String brandName;
    /**
     * （新增参数）申报产品原产地。国家二字码，详细参考国际二字码。如：CN（中国）
     */
    @JsonProperty("origin_country")
    private String originCountry;
    /**
     * 计量单位 (请参考公共服务基础数据-计量单位)
     */
    private String uom;
    /**
     * 箱内单品的SKU编码
     */
    @JsonProperty("single_sku_code")
    private String singleSkuCode;
    /**
     * 箱内单品SKU对应数量
     */
    private String pcs;
    /**
     * 自带物流包装。 可选值 : Y（是）；N （否）
     */
    @JsonProperty("logistics_package")
    private String logisticsPackage;
    /**
     * 商品的规格型号说明；例如：红色、50cm*65cm*50cm
     */
    private String specification;


    /**
     * 是否带电。可选值 :  Y（是）;N （否）。  * 注：如果选择Y（是）带电，电池资料为必填项
     */
    @JsonProperty("include_battery")
    private String includeBattery;
    /**
     * 电池资料，商品电池的资料URL信息。上传文件资料限定格式，可选值：rar和zip。
     */
    @JsonProperty("battery_resource")
    private String batteryResource;
    /**
     * 是否有效期管理。 可选值 : Y（是）；N （否）。*注：选择Y后，必须在入库预报进行商品有效期的设置
     */
    @JsonProperty("expired_date")
    private String expiredDate;

    /**
     * 是否批次管理。可选值 : Y（是）;N （否）。*注：选择Y后，必须在入库预报进行批次的设置
     */
    @JsonProperty("include_batch")
    private String includeBatch;
    /**
     * SN码规则编码。 可选值 : 01 (15位数字)；02 (18位数字)；03 (12位字符)。如果SKU无SN码管理则为空。
     */
    @JsonProperty("sn_rule_code")
    private String snRuleCode;
    /**
     * 图片地址.(绝对地址,格式:<a href="http://host/image_path">http://host/image_path</a>); url所对应的图片必须要属于当前用户。*注：SKU图片上传数量必须大于2张。图片路径必须有效，如图片路径有问题导致下载失败会影响入库下单审核失败。
     */
    @JsonProperty("picture_url")
    private List<String> pictureUrl;
    /**
     * 新增参数 申报国家列表
     */
    @JsonProperty("declare_country_list")
    private List<DeclareCountry> declareCountryList;


}
