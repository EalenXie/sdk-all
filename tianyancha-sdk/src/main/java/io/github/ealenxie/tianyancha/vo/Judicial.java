package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Judicial {
    /**
     * 表id
     */
    @JsonProperty("assId")
    private Long assId;

    /**
     * 被执行人
     */
    @JsonProperty("executedPerson")
    private String executedPerson;

    /**
     * 执行通知书文号
     */
    @JsonProperty("executeNoticeNum")
    private String executeNoticeNum;

    /**
     * 冻结失效信息
     */
    @JsonProperty("companyJudicialAssistanceFrozenInvalidationInfo")
    private FrozenInvalidationInfo frozenInvalidationInfo;

    /**
     * 股权数额
     */
    @JsonProperty("equityAmount")
    private String equityAmount;

    /**
     * 冻结续行信息
     */
    @JsonProperty("companyJudicialAssistanceFrozenKeepInfo")
    private FrozenKeepInfo frozenKeepInfo;

    /**
     * 解除冻结信息
     */
    @JsonProperty("companyJudicialAssistanceFrozenRemInfo")
    private FrozenRemoveInfo frozenRemoveInfo;

    /**
     * 类型
     */
    @JsonProperty("typeState")
    private String typeState;

    /**
     * 执行法院
     */
    @JsonProperty("executiveCourt")
    private String executiveCourt;

    /**
     * 冻结信息
     */
    @JsonProperty("companyJudicialAssistanceFrozenInfo")
    private FrozenInfo frozenInfo;

    /**
     * 股权变更信息
     */
    @JsonProperty("companyJudicialShareholderChangeInfo")
    private ShareholderChangeInfo shareholderChangeInfo;
}
