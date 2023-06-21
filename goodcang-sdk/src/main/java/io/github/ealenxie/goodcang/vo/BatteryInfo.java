package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/5/23 17:09
 */
@Getter
@Setter
public class BatteryInfo {
    /**
     * 电池型号 物属性为：超标纯电池、超标含电池 时必填
     */
    @JsonProperty("battery_model")
    private String batteryModel;
    /**
     * UN编码 货物属性为：超标纯电池、超标含电池 时必填
     */
    @JsonProperty("un_code")
    private String unCode;
    /**
     * 电池功率范围（WH） 货物属性为：超标纯电池、超标含电池 时必填
     */
    @JsonProperty("battery_power_range")
    private Integer batteryPowerRange;
    /**
     * 电池功率（WH） 货物属性为：超标存电池、超标存电池 时可填
     */
    @JsonProperty("battery_power")
    private Integer batteryPower;
    /**
     * MSDS报告证书链接 货物属性为：超标纯电池、超标含电池 时必填
     */
    @JsonProperty("msds_file_url")
    private String msdsFileUrl;
}
