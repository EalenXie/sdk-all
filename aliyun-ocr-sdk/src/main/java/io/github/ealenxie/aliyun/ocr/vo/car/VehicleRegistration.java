package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 15:58
 */
@Getter
@Setter
public class VehicleRegistration {

    /**
     * 条形编号
     */
    @JsonProperty("barCode")
    private String barCode;
    /**
     * 机动车所有人/身份证明名称/号码
     */
    @JsonProperty("vehicleOwnerInfo")
    private String vehicleOwnerInfo;
    /**
     * 登记机关
     */
    @JsonProperty("registrationAuthority")
    private String registrationAuthority;
    /**
     * 登记日期
     */
    @JsonProperty("registrationDate")
    private String registrationDate;
    /**
     * 机动车登记编号
     */
    @JsonProperty("registrationNumber")
    private String registrationNumber;
    /**
     * 车辆类型
     */
    @JsonProperty("vehicleType")
    private String vehicleType;
    /**
     * 车辆品牌
     */
    @JsonProperty("vehicleBrand")
    private String vehicleBrand;
    /**
     * 车辆型号
     */
    @JsonProperty("vehicleModel")
    private String vehicleModel;
    /**
     * 车身颜色
     */
    @JsonProperty("vehicleColor")
    private String vehicleColor;
    /**
     * 车辆识别代号/车架号
     */
    @JsonProperty("vinCode")
    private String vinCode;
    /**
     * 国产/进口
     */
    @JsonProperty("isDomestic")
    private String isDomestic;
    /**
     * 发动机号
     */
    @JsonProperty("engineNumber")
    private String engineNumber;
    /**
     * 发动机型号
     */
    @JsonProperty("engineType")
    private String engineType;
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
     * 制造厂名称
     */
    @JsonProperty("manufactureName")
    private String manufactureName;
    /**
     * 转向形式
     */
    @JsonProperty("steeringForm")
    private String steeringForm;
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
     * 钢板弹簧数
     */
    @JsonProperty("springNumber")
    private String springNumber;
    /**
     * 轴距
     */
    @JsonProperty("wheelbase")
    private String wheelbase;
    /**
     * 轴数
     */
    @JsonProperty("axleNumber")
    private String axleNumber;
    /**
     * 外轮廓尺寸
     */
    @JsonProperty("overallDimension")
    private String overallDimension;
    /**
     * 货箱内部尺寸
     */
    @JsonProperty("containerDimension")
    private String containerDimension;
    /**
     * 总质量
     */
    @JsonProperty("totalWeight")
    private String totalWeight;
    /**
     * 核定载质量
     */
    @JsonProperty("permittedWeight")
    private String permittedWeight;
    /**
     * 驾驶室载客
     */
    @JsonProperty("passengerCapacity")
    private String passengerCapacity;
    /**
     * 准牵引总质量
     */
    @JsonProperty("tractionWeight")
    private String tractionWeight;
    /**
     * 驾驶室载客
     */
    @JsonProperty("cabPassengerCapacity")
    private String cabPassengerCapacity;
    /**
     * 使用性质
     */
    @JsonProperty("useNature")
    private String useNature;
    /**
     * 车辆获得方式
     */
    @JsonProperty("acquisitionMethod")
    private String acquisitionMethod;
    /**
     * 车辆出厂日期
     */
    @JsonProperty("manufactureDate")
    private String manufactureDate;
    /**
     * 发证机关
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 发证日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
}
