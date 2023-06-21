package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 16:07
 */
@Getter
@Setter
public class VehicleCertification {
    /**
     * 合格证编号
     */
    @JsonProperty("certificateNumber")
    private String certificateNumber;
    /**
     * 发证日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 车辆制造企业名称
     */
    @JsonProperty("manufactureName")
    private String manufactureName;
    /**
     * 车辆品牌
     */
    @JsonProperty("vehicleBrand")
    private String vehicleBrand;
    /**
     * 车辆名称
     */
    @JsonProperty("vehicleName")
    private String vehicleName;
    /**
     * 车辆型号
     */
    @JsonProperty("vehicleModel")
    private String vehicleModel;
    /**
     * 车辆识别代号/车架号
     */
    @JsonProperty("vinCode")
    private String vinCode;
    /**
     * 车身颜色
     */
    @JsonProperty("vehicleColor")
    private String vehicleColor;
    /**
     * 底盘型号
     */
    @JsonProperty("chassisModel")
    private String chassisModel;
    /**
     * 底盘ID
     */
    @JsonProperty("chassisId")
    private String chassisId;
    /**
     * 底盘合格证编号
     */
    @JsonProperty("chassisCertificateNumber")
    private String chassisCertificateNumber;
    /**
     * 发动机型号
     */
    @JsonProperty("engineModel")
    private String engineModel;
    /**
     * 发动机号
     */
    @JsonProperty("engineNumber")
    private String engineNumber;
    /**
     * 燃料种类
     */
    @JsonProperty("fuelType")
    private String fuelType;
    /**
     * 排量
     */
    @JsonProperty("displacement")
    private String displacement;
    /**
     * 功率
     */
    @JsonProperty("power")
    private String power;
    /**
     * 排放标准
     */
    @JsonProperty("emissionStandard")
    private String emissionStandard;
    /**
     * 油耗
     */
    @JsonProperty("fuelConsumption")
    private String fuelConsumption;
    /**
     * 外廓尺寸
     */
    @JsonProperty("overallDimension")
    private String overallDimension;
    /**
     * 货箱内部尺寸
     */
    @JsonProperty("containerDimension")
    private String containerDimension;
    /**
     * 钢板弹簧数
     */
    @JsonProperty("springNumber")
    private String springNumber;
    /**
     * 轮胎数
     */
    @JsonProperty("tireNumber")
    private String tireNumber;
    /**
     * 轮胎规格
     */
    @JsonProperty("tireSize")
    private String tireSize;
    /**
     * 轮距前
     */
    @JsonProperty("frontWheelTrack")
    private String frontWheelTrack;
    /**
     * 轮距后
     */
    @JsonProperty("rearWheelTrack")
    private String rearWheelTrack;
    /**
     * 轴距
     */
    @JsonProperty("wheelbase")
    private String wheelbase;
    /**
     * 轴荷
     */
    @JsonProperty("axleLoad")
    private String axleLoad;
    /**
     * 轴数
     */
    @JsonProperty("axleNumber")
    private String axleNumber;
    /**
     * 转向形式
     */
    @JsonProperty("steeringForm")
    private String steeringForm;
    /**
     * 总质量
     */
    @JsonProperty("totalWeight")
    private String totalWeight;
    /**
     * 装备质量
     */
    @JsonProperty("equipmentWeight")
    private String equipmentWeight;
    /**
     * 额定载质量
     */
    @JsonProperty("maximumLadenMass")
    private String maximumLadenMass;
    /**
     * 载质量利用系数
     */
    @JsonProperty("massUtilizationCoefficient")
    private String massUtilizationCoefficient;
    /**
     * 准牵引总质量
     */
    @JsonProperty("tractionWeight")
    private String tractionWeight;
    /**
     * 半挂车鞍座最大允许总质量
     */
    @JsonProperty("MaximumLoadMass")
    private String maximumLoadMass;
    /**
     * 驾驶室准驾人数
     */
    @JsonProperty("cabPassengerCapacity")
    private String cabPassengerCapacity;
    /**
     * 额定载客
     */
    @JsonProperty("passengerCapacity")
    private String passengerCapacity;
    /**
     * 最高设计车速
     */
    @JsonProperty("maxDesignSpeed")
    private String maxDesignSpeed;
    /**
     * 车辆制造日期
     */
    @JsonProperty("manufactureDate")
    private String manufactureDate;
    /**
     * 备注
     */
    @JsonProperty("remarks")
    private String remarks;
}
