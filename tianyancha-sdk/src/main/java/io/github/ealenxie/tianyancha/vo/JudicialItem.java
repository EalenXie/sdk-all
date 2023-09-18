package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/18 14:50
 */
@Getter
@Setter
public class JudicialItem {
    /**
     * 对应表ID
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
     * 被执行人HID
     */
    @JsonProperty("executedPersonHid")
    private Long executedPersonHid;

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
     * 执行人公司ID
     */
    @JsonProperty("executedPersonCid")
    private Long executedPersonCid;

    /**
     * 司法协助基本信息ID
     */
    @JsonProperty("assId")
    private String assId;

    /**
     * 执行人类型 (0-无法人, 1-企业, 2-人)
     */
    @JsonProperty("executedPersonType")
    private String executedPersonType;

    /**
     * 公示日期 (时间戳)
     */
    @JsonProperty("publicityDate")
    private Long publicityDate;

    /**
     * 股权被执行的企业
     */
    @JsonProperty("stockExecutedCompany")
    private String stockExecutedCompany;

    /**
     * 股权被执行的企业ID
     */
    @JsonProperty("stockExecutedCid")
    private Long stockExecutedCid;
}
