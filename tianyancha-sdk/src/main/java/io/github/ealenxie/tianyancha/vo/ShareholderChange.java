package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShareholderChange {
    /**
     * 被执行人证照号码
     */
    @JsonProperty("licenseNum")
    private String licenseNum;

    /**
     * 受让人证照号码
     */
    @JsonProperty("assigneeLicenseNum")
    private String assigneeLicenseNum;

    /**
     * id号
     */
    @JsonProperty("assigneeCid")
    private Long assigneeCid;

    /**
     * 协助执行日期
     */
    @JsonProperty("executionDate")
    private String executionDate;

    /**
     * 被执行人id
     */
    @JsonProperty("executedPersonHid")
    private Long executedPersonHid;

    /**
     * 受让人证照种类
     */
    @JsonProperty("assigneeLicenseType")
    private String assigneeLicenseType;

    /**
     * 被执行人
     */
    @JsonProperty("executedPerson")
    private String executedPerson;

    /**
     * 受让人
     */
    @JsonProperty("assignee")
    private String assignee;

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
     * 受让人类型(0 人，1公司)
     */
    @JsonProperty("assigneeType")
    private Integer assigneeType;

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
    private Integer executedPersonType;

    /**
     * 被执行人证照种类
     */
    @JsonProperty("licenseType")
    private String licenseType;
}
