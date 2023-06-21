package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/6 16:16
 */
@Getter
@Setter
public class VehicleLicenseBack {

    /**
     * 号牌号码
     */
    @JsonProperty("licensePlateNumber")
    private String licensePlateNumber;
    /**
     * 检验记录
     */
    @JsonProperty("inspectionRecord")
    private String inspectionRecord;
    /**
     * 核定载人数
     */
    @JsonProperty("passengerCapacity")
    private String passengerCapacity;
    /**
     * 总质量
     */
    @JsonProperty("totalWeight")
    private String totalWeight;
    /**
     * 整备质量
     */
    @JsonProperty("curbWeight")
    private String curbWeight;

    /**
     * 和钉载质量
     */
    @JsonProperty("permittedWeight")
    private String permittedWeight;
    /**
     * 外廓尺寸
     */
    @JsonProperty("overallDimension")
    private String overallDimension;
    /**
     * 准牵引总质量
     */
    @JsonProperty("tractionWeight")
    private String tractionWeight;
    /**
     * 能源标志
     */
    @JsonProperty("energySign")
    private String energySign;
    /**
     * 档案编号
     */
    @JsonProperty("recordNumber")
    private String recordNumber;
    /**
     * 备注
     */
    @JsonProperty("remarks")
    private String remarks;
    /**
     * 条形码编号
     */
    @JsonProperty("barcodeNumber")
    private String barcodeNumber;

}
