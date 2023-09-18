package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Frozen {
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
     * 冻结期限至
     */
    @JsonProperty("toDate")
    private Long toDate;

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
     * 冻结期限
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
     * 冻结期限自
     */
    @JsonProperty("fromDate")
    private Long fromDate;

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
     * 冻结公示日期
     */
    @JsonProperty("publicityAate")
    private Long publicityAate;
}