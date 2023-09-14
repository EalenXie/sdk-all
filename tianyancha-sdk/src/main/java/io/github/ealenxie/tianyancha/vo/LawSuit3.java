package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/14 9:29
 */
@Getter
@Setter
public class LawSuit3 {
    /**
     * 对应表ID
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 案件金额
     */
    @JsonProperty("caseMoney")
    private String caseMoney;

    /**
     * 发布日期（时间戳）
     */
    @JsonProperty("submitTime")
    private Long submitTime;

    /**
     * 文书类型
     */
    @JsonProperty("docType")
    private String docType;

    /**
     * 天眼查URL（Web）
     */
    @JsonProperty("lawsuitUrl")
    private String lawsuitUrl;

    /**
     * 天眼查URL（H5）
     */
    @JsonProperty("lawsuitH5Url")
    private String lawsuitH5Url;

    /**
     * UUID
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * 案件名称
     */
    @JsonProperty("title")
    private String title;

    /**
     * 审理法院
     */
    @JsonProperty("court")
    private String court;

    /**
     * 裁判日期（日期）
     */
    @JsonProperty("judgeTime")
    private String judgeTime;

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
     * 案由
     */
    @JsonProperty("caseReason")
    private String caseReason;

    /**
     * 涉案方
     */
    @JsonProperty("casePersons")
    private List<CasePerson> casePersons;
}
