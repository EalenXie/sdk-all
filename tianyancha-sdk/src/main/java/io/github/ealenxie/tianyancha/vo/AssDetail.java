package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssDetail {
    /**
     * 对应表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 股权数额
     */
    @JsonProperty("equityAmount")
    private String equityAmount;

    /**
     * 类型|状态
     */
    @JsonProperty("typeState")
    private String typeState;

    /**
     * 被执行人id
     */
    @JsonProperty("executedPersonHid")
    private String executedPersonHid;

    /**
     * 执行法院
     */
    @JsonProperty("executiveCourt")
    private String executiveCourt;

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
     * 股权被执行的企业
     */
    @JsonProperty("stockExecutedCompany")
    private String stockExecutedCompany;

    /**
     * 股权被执行的企业id
     */
    @JsonProperty("stockExecutedCid")
    private Long stockExecutedCid;
}