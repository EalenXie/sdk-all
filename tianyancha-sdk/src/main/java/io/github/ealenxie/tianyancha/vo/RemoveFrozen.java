package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemoveFrozen {
    /**
     * 被执行人证照号码
     */
    @JsonProperty("licenseNum")
    private String licenseNum;

    /**
     * 被执行人id
     */
    @JsonProperty("executedPersonHid")
    private Long executedPersonHid;

    /**
     * 被执行人
     */
    @JsonProperty("executedPerson")
    private String executedPerson;

    /**
     * 执行裁定书文号
     */
    @JsonProperty("executeOrderNum")
    private String executeOrderNum;

    /**
     * 被执行人持有股权、其它投资权益的数额
     */
    @JsonProperty("equityAmountOther")
    private String equityAmountOther;

    /**
     * 执行事项
     */
    @JsonProperty("implementationMatters")
    private String implementationMatters;

    /**
     * 执行法院
     */
    @JsonProperty("executiveCourt")
    private String executiveCourt;

    /**
     * 执行通知书文号
     */
    @JsonProperty("executeNoticeNum")
    private String executeNoticeNum;

    /**
     * 被执行人公司id
     */
    @JsonProperty("executedPersonCid")
    private Long executedPersonCid;

    /**
     * 解除冻结日期
     */
    @JsonProperty("frozenRemoveDate")
    private Long frozenRemoveDate;

    /**
     * 被执行人类型 1公司，2人
     */
    @JsonProperty("executedPersonType")
    private String executedPersonType;

    /**
     * 被执行人证照种类
     */
    @JsonProperty("licenseType")
    private String licenseType;

    /**
     * 公示日期
     */
    @JsonProperty("publicityAate")
    private Long publicityAate;
}