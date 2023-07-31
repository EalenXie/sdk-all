package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
class KtAnnouncement {
    /**
     * 承办部门
     */
    @JsonProperty("contractors")
    private String contractors;

    /**
     * 原告/上诉人
     */
    @JsonProperty("plaintiff")
    private List<NameIdType> plaintiff;

    /**
     * 法庭
     */
    @JsonProperty("courtroom")
    private String courtroom;

    /**
     * 当事人
     */
    @JsonProperty("litigant")
    private String litigant;

    /**
     * 被告/被上诉人
     */
    @JsonProperty("defendant")
    private List<NameIdType> defendant;

    /**
     * id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 审判长/主审人
     */
    @JsonProperty("judge")
    private String judge;

    /**
     * 法院
     */
    @JsonProperty("court")
    private String court;

    /**
     * 案号
     */
    @JsonProperty("caseNo")
    private String caseNo;

    /**
     * 开庭日期(时间)
     */
    @JsonProperty("startDate")
    private String startDate;

    /**
     * 案由
     */
    @JsonProperty("caseReason")
    private String caseReason;


}
