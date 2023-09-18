package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourtRegister {
    /**
     * 地区
     */
    @JsonProperty("area")
    private String area;

    /**
     * 公诉人/原告/上诉人/申请人
     */
    @JsonProperty("plaintiff")
    private String plaintiff;

    /**
     * 当事人id
     */
    @JsonProperty("litigantGids")
    private String litigantGids;

    /**
     * 当事人
     */
    @JsonProperty("litigant")
    private String litigant;

    /**
     * 立案时间
     */
    @JsonProperty("filingDate")
    private String filingDate;

    /**
     * 案件状态
     */
    @JsonProperty("caseStatus")
    private String caseStatus;

    /**
     * 法官
     */
    @JsonProperty("assistant")
    private String assistant;

    /**
     * 来源
     */
    @JsonProperty("source")
    private String source;

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
     * 案件详情
     */
    @JsonProperty("content")
    private String content;

    /**
     * 案由
     */
    @JsonProperty("caseReason")
    private String caseReason;

    /**
     * 案件类型
     */
    @JsonProperty("caseType")
    private String caseType;

    /**
     * 结案时间
     */
    @JsonProperty("closeDate")
    private String closeDate;

    /**
     * 源链接
     */
    @JsonProperty("sourceUrl")
    private String sourceUrl;

    /**
     * 第三人
     */
    @JsonProperty("third")
    private String third;

    /**
     * 被告人/被告/被上诉人/被申请人
     */
    @JsonProperty("defendant")
    private String defendant;

    /**
     * 创建时间
     */
    @JsonProperty("createTime")
    private String createTime;

    /**
     * 法官助理
     */
    @JsonProperty("juge")
    private String juge;

    /**
     * 开始时间
     */
    @JsonProperty("startTime")
    private String startTime;

    /**
     * 承办部门
     */
    @JsonProperty("department")
    private String department;


}
