package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShareholderChangeInfo {
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
     * 受让人证照号码
     */
    @JsonProperty("assigneeLicenseNum")
    private String assigneeLicenseNum;

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
     * 受让人证照种类
     */
    @JsonProperty("assigneeLicenseType")
    private String assigneeLicenseType;

    /**
     * 协助执行日期
     */
    @JsonProperty("executionDate")
    private String executionDate;

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
     * 被执行人持有股权数额
     */
    @JsonProperty("equityAmountOther")
    private String equityAmountOther;

    /**
     * 受让人
     */
    @JsonProperty("assignee")
    private String assignee;

    /**
     * 执行法院
     */
    @JsonProperty("executiveCourt")
    private String executiveCourt;
}