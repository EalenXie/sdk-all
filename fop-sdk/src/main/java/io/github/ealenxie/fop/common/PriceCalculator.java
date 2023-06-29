package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 0:02
 */
@Getter
@Setter
public class PriceCalculator {
    /**
     * 服务类别
     * <p>
     * 可选 DSS：直邮服务（暂不支持） FB4：订单履约 GRS：全球退件（暂不支持） TRS：转运服务（暂不支持）
     */
    @JsonProperty("service_code")
    private String serviceCode;

    /**
     * 计费时间
     * <p>
     * *注：时间格式：传入时间值需要转换为long类型格式
     */
    @JsonProperty("billing_time")
    private String billingTime;

    /**
     * 业务产品(业务所属产品)
     */
    @JsonProperty("product_codes")
    private List<String> productCodes;

    /**
     * 仓库代码（FB4：货物所在仓；DSS：货物交付仓，起运地）
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 货物的长 (单位: cm 厘米) ，精确到3位小数。
     */
    @JsonProperty("length")
    private String length;

    /**
     * 货物的宽 (单位: cm 厘米)，精确到3位小数。
     */
    @JsonProperty("width")
    private String width;

    /**
     * 货物的高 (单位: cm 厘米)，精确到3位小数。
     */
    @JsonProperty("height")
    private String height;

    /**
     * 货物的重量(单位: g 克)
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 货物单位
     */
    @JsonProperty("cargo_units")
    private List<CargoUnit> cargoUnits;

    /**
     * 目的地的地址：
     * <p>
     * 用于派送， 揽收，转运等与地址有关的费用匹配与计算。
     * <p>
     * 与地址无关的费用不必填。
     */
    @JsonProperty("destination")
    private Destination destination;
}
