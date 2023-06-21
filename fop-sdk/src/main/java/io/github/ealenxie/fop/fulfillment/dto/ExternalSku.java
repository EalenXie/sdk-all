package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 14:43
 */
@Getter
@Setter
public class ExternalSku {
    @JsonProperty("sku_code")
    private String skuCode;
    @JsonProperty("parcel_no")
    private String parcelNo;
    @JsonProperty("declare_name")
    private String declareName;
    @JsonProperty("hs_code")
    private String hsCode;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("length")
    private String length;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("declare_price")
    private String declarePrice;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("include_battery")
    private String includeBattery;
    @JsonProperty("battery_config")
    private String batteryConfig;
    @JsonProperty("origin_country")
    private String originCountry;
    @JsonProperty("qty")
    private String qty;
    @JsonProperty("declare_product_unit")
    private String declareProductUnit;
    @JsonProperty("material")
    private String material;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("sku_extend_field")
    private String skuExtendField;
}
