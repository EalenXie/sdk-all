package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/18 15:57
 */
@Getter
@Setter
public class BankruptcyDetail {
    /**
     * 管理人主要负责人
     */
    @JsonProperty("managerPrincipal")
    private String managerPrincipal;

    /**
     * 被申请人
     */
    @JsonProperty("respondent")
    private String respondent;

    /**
     * 法院
     */
    @JsonProperty("court")
    private String court;

    /**
     * 唯一标识
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
     * 申请人对象列表
     */
    @JsonProperty("applicant")
    private List<Applicant> applicant;

    /**
     * 管理人机构
     */
    @JsonProperty("managerialAgency")
    private String managerialAgency;

    /**
     * 公开时间，发布时间
     */
    @JsonProperty("submitTime")
    private String submitTime;
}
