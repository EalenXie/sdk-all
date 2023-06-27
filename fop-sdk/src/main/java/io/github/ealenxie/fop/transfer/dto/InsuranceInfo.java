package io.github.ealenxie.fop.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:18
 * <p>
 * 投保信息
 */
@Getter
@Setter
public class InsuranceInfo {
    /**
     * 保险类型（4PX保价：XY；第三方保险：XP）
     */
    @JsonProperty("insureType")
    private String insureType;

    /**
     * 保险价值
     */
    @JsonProperty("insureValue")
    private Integer insureValue;

    /**
     * 币别（按照ISO标准，目前只支持USD）
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 投保人/公司
     */
    @JsonProperty("insurePerson")
    private String insurePerson;

    /**
     * 投保人证件类型
     */
    @JsonProperty("certificateType")
    private String certificateType;

    /**
     * 投保人证件号码
     */
    @JsonProperty("certificateNo")
    private String certificateNo;

    /**
     * 类别代码
     */
    @JsonProperty("categoryCode")
    private String categoryCode;

    /**
     * 保险产品名称
     */
    @JsonProperty("insureProductName")
    private String insureProductName;

    /**
     * 数量
     */
    @JsonProperty("packageQty")
    private String packageQty;
}
