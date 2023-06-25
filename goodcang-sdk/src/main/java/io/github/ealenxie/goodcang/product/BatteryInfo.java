package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class BatteryInfo {
    /**
     * 电池型号
     */
    @JsonProperty("battery_model")
    private String batteryModel;
    /**
     * UN编码
     */
    @JsonProperty("un_code")
    private String unCode;
    /**
     * 电池功率范围（WH）
     */
    @JsonProperty("battery_power_range")
    private Integer batteryPowerRange;
    /**
     * 电池功率（WH）
     */
    @JsonProperty("battery_power")
    private Integer batteryPower;
    /**
     * MSDS报告证书链接
     */
    @JsonProperty("msds_file_url")
    private String msdsFileUrl;
}
