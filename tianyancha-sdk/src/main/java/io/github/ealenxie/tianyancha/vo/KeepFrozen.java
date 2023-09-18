package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KeepFrozen {
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
     * id号
     */
    @JsonProperty("assigneeCid")
    private Long assigneeCid;

    /**
     * 被执行人
     */
    @JsonProperty("executedPerson")
    private String executedPerson;

    /**
     * 续行冻结期限至
     */
    @JsonProperty("toDate")
    private Long toDate;

    /**
     * 执行裁定书文号
     */
    @JsonProperty("executeOrderNum")
    private String executeOrderNum;

    /**
     * 被执行人持有股权数额
     */
    @JsonProperty("equityAmountOther")
    private String equityAmountOther;

    /**
     * 续行冻结期限
     */
    @JsonProperty("period")
    private String period;

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
     * 续行冻结期限自
     */
    @JsonProperty("fromDate")
    private Long fromDate;

    /**
     * 执行通知书文号
     */
    @JsonProperty("executeNoticeNum")
    private String executeNoticeNum;

    /**
     * 执行人公司id
     */
    @JsonProperty("executedPersonCid")
    private Long executedPersonCid;

    /**
     * 执行人类型，2-人，1-公司
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