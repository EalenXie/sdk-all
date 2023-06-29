package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 14:43
 */
@Getter
@Setter
public class ExternalSku {
    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * 关联包裹号
     */
    @JsonProperty("parcel_no")
    private String parcelNo;

    /**
     * 货品申报名称
     */
    @JsonProperty("declare_name")
    private String declareName;

    /**
     * 海关编码
     */
    @JsonProperty("hs_code")
    private String hsCode;

    /**
     * 货品单位重量，单位KG
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 长，单位CM
     */
    @JsonProperty("length")
    private String length;

    /**
     * 宽，单位CM
     */
    @JsonProperty("width")
    private String width;

    /**
     * 高，单位CM
     */
    @JsonProperty("height")
    private String height;

    /**
     * 申报金额
     */
    @JsonProperty("declare_price")
    private String declarePrice;

    /**
     * 申报币种
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 是否带电
     */
    @JsonProperty("include_battery")
    private String includeBattery;

    /**
     * 电池类型
     */
    @JsonProperty("battery_config")
    private String batteryConfig;

    /**
     * 原产国
     */
    @JsonProperty("origin_country")
    private String originCountry;

    /**
     * SKU数量
     */
    @JsonProperty("qty")
    private String qty;

    /**
     * 申报单位
     */
    @JsonProperty("declare_product_unit")
    private String declareProductUnit;

    /**
     * SKU材质
     */
    @JsonProperty("material")
    private String material;

    /**
     * SKU用途
     */
    @JsonProperty("purpose")
    private String purpose;

    /**
     * 品牌
     */
    @JsonProperty("brand")
    private String brand;

    /**
     * 扩展字段
     */
    @JsonProperty("sku_extend_field")
    private String skuExtendField;
}
