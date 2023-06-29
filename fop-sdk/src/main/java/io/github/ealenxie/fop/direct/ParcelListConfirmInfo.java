package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:15
 */
@Getter
@Setter
public class ParcelListConfirmInfo {

    /**
     * 核实带电类型（内置电池966：1；配套电池967：2）
     */
    @JsonProperty("confirm_battery_type")
    private String confirmBatteryType;

    /**
     * 包裹计费重（默认g）
     */
    @JsonProperty("confirm_charge_weight")
    private Integer confirmChargeWeight;

    /**
     * 核实包裹高（cm，只有库内进行了测量，才有值）
     */
    @JsonProperty("confirm_high")
    private String confirmHigh;

    /**
     * 核实是否含电池（Y/N）
     */
    @JsonProperty("confirm_include_battery")
    private String confirmIncludeBattery;

    /**
     * 核实包裹长（cm，只有库内进行了测量，才有值）
     */
    @JsonProperty("confirm_length")
    private String confirmLength;

    /**
     * 包裹体积重（默认g）
     */
    @JsonProperty("confirm_volume_weight")
    private Integer confirmVolumeWeight;

    /**
     * 核实重量（默认g）
     */
    @JsonProperty("confirm_weight")
    private String confirmWeight;

    /**
     * 核实包裹宽（cm，只有库内进行了测量，才有值）
     */
    @JsonProperty("confirm_width")
    private String confirmWidth;

    /**
     * 币别（按照ISO标准，目前只支持USD）
     */
    @JsonProperty("currency_code")
    private String currencyCode;

    /**
     * 核实包裹价值
     */
    @JsonProperty("parcel_total_value_confirm")
    private String parcelTotalValueConfirm;
}
