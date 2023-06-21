package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:15
 */
@Getter
@Setter
public class ParcelListConfirmInfo {
    @JsonProperty("confirm_battery_type")
    private String confirmBatteryType;
    @JsonProperty("confirm_charge_weight")
    private Integer confirmChargeWeight;
    @JsonProperty("confirm_high")
    private String confirmHigh;
    @JsonProperty("confirm_include_battery")
    private String confirmIncludeBattery;
    @JsonProperty("confirm_length")
    private String confirmLength;
    @JsonProperty("confirm_volume_weight")
    private Integer confirmVolumeWeight;
    @JsonProperty("confirm_weight")
    private String confirmWeight;
    @JsonProperty("confirm_width")
    private String confirmWidth;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("parcel_total_value_confirm")
    private String parcelTotalValueConfirm;
}
