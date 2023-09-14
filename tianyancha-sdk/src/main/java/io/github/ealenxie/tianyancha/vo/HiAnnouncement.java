package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/14 9:58
 */
@Getter
@Setter
public class HiAnnouncement {
    /**
     * 开庭日期(时间)
     */
    @JsonProperty("startDate")
    private String startDate;
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
     * 承办部门
     */
    @JsonProperty("contractors")
    private String contractors;
    /**
     * 地区
     */
    @JsonProperty("area")
    private String area;
    /**
     * 案由
     */
    @JsonProperty("caseReason")
    private String caseReason;
    /**
     * 法院
     */
    @JsonProperty("court")
    private String court;
    /**
     * 当事人
     */
    @JsonProperty("litigant")
    private String litigant;
    /**
     * ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 审判长/主审人
     */
    @JsonProperty("judge")
    private String judge;
    /**
     * 案号
     */
    @JsonProperty("caseNo")
    private String caseNo;
    /**
     * 被告/被上诉人
     */
    @JsonProperty("defendant")
    private List<NameIdType> defendant;

}
