package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FrozenRemoveInfo {
    /**
     * 被执行人
     */
    @JsonProperty("executedPerson")
    private String executedPerson;

    /**
     * 被执行人证照种类
     */
    @JsonProperty("licenseType")
    private String licenseType;

    /**
     * 执行通知书文号
     */
    @JsonProperty("executeNoticeNum")
    private String executeNoticeNum;

    /**
     * 执行事项
     */
    @JsonProperty("implementationMatters")
    private String implementationMatters;

    /**
     * 公示日期
     */
    @JsonProperty("publicityDate")
    private String publicityDate;

    /**
     * 执行裁定书文号
     */
    @JsonProperty("executeOrderNum")
    private String executeOrderNum;

    /**
     * 被执行人证照号码
     */
    @JsonProperty("licenseNum")
    private String licenseNum;

    /**
     * 被执行人持有股权、其他投资权益的数额
     */
    @JsonProperty("equityAmountOther")
    private String equityAmountOther;

    /**
     * 执行法院
     */
    @JsonProperty("executiveCourt")
    private String executiveCourt;

    /**
     * 解除冻结日期
     */
    @JsonProperty("frozenRemoveDate")
    private String frozenRemoveDate;
}