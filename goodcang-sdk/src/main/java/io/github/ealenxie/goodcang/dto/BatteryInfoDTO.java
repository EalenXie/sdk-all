package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class BatteryInfoDTO {
    @JsonProperty("battery_model")
    private String batteryModel;
    @JsonProperty("un_code")
    private String unCode;
    @JsonProperty("battery_power_range")
    private String batteryPowerRange;
    @JsonProperty("battery_power")
    private String batteryPower;
    @JsonProperty("msds_file_url")
    private String msdsFileUrl;
}
