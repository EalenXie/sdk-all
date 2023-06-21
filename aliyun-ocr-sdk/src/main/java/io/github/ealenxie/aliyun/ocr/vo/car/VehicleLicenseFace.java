package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/6 16:16
 */
@Getter
@Setter
public class VehicleLicenseFace {

    /**
     * 住址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 发动机号码
     */
    @JsonProperty("engineNumber")
    private String engineNumber;
    /**
     * 发证日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 发证日期
     */
    @JsonProperty("model")
    private String model;
    /**
     * 所有人
     */
    @JsonProperty("owner")
    private String owner;
    /**
     * 号牌号码
     */
    @JsonProperty("licensePlateNumber")
    private String licensePlateNumber;
    /**
     * 注册日期
     */
    @JsonProperty("registrationDate")
    private String registrationDate;
    /**
     * 使用性质
     */
    @JsonProperty("useNature")
    private String useNature;
    /**
     * 车辆类型
     */
    @JsonProperty("vehicleType")
    private String vehicleType;
    /**
     * 车辆识别代码
     */
    @JsonProperty("vinCode")
    private String vinCode;
    /**
     * 签发机关
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
}
