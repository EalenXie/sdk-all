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
    @JsonProperty("parcel_no")
    private String parcelNo;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("length")
    private String length;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("parcel_extend_field")
    private String parcelExtendField;
    @JsonProperty("parcel_value")
    private String parcelValue;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("include_battery")
    private String includeBattery;
    @JsonProperty("battery_config")
    private String batteryConfig;
}
