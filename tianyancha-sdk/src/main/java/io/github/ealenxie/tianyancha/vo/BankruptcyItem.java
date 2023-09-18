package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/18 15:52
 */
@Getter
@Setter
public class BankruptcyItem {
    /**
     * 公开时间，发布时间
     */
    @JsonProperty("submitTime")
    private String submitTime;

    /**
     * 被申请人
     */
    @JsonProperty("respondent")
    private String respondent;

    /**
     * 唯一标示
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * 案号
     */
    @JsonProperty("caseNo")
    private String caseNo;

    /**
     * 案件类型
     */
    @JsonProperty("caseType")
    private String caseType;

    /**
     * 申请人列表
     */
    @JsonProperty("applicant")
    private List<Applicant> applicant;
}
