package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FrozenKeepInfo {
    /**
     * 被执行人
     */
    @JsonProperty("executedPerson")
    private String executedPerson;

    /**
     * 续行冻结期限自
     */
    @JsonProperty("fromDate")
    private String fromDate;

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
     * 续行冻结期限至
     */
    @JsonProperty("toDate")
    private String toDate;

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
}