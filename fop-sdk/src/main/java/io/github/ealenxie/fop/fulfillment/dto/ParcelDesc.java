package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 14:43
 */
@Getter
@Setter
public class ParcelDesc {

    /**
     * 关联包裹号
     */
    @JsonProperty("parcel_no")
    private String parcelNo;

    /**
     * 包裹重量,单位KG
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
     * 包裹扩充字段
     */
    @JsonProperty("parcel_extend_field")
    private String parcelExtendField;

    /**
     * 包裹申报价值，单位元
     */
    @JsonProperty("parcel_value")
    private String parcelValue;

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
}
