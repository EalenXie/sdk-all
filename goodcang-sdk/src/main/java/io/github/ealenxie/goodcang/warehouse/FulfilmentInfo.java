package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 14:28
 */
@Getter
@Setter
public class FulfilmentInfo {
    /**
     * 配送方式
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 年龄检测
     */
    @JsonProperty("age_detection")
    private String ageDetection;
    /**
     * 保额
     */
    @JsonProperty("insurance_value")
    private String insuranceValue;
    /**
     * 是否投保
     */
    @JsonProperty("is_insurance")
    private Integer isInsurance;
    /**
     * 是否签名服务
     */
    @JsonProperty("is_signature")
    private Integer isSignature;
    /**
     * 是否lift gate服务
     */
    @JsonProperty("is_lift_gate")
    private Integer isLiftGate;
}
