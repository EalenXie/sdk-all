package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/18 14:39
 */
@Getter
@Setter
public class JrCourtRegister {
    /**
     * 当事人
     */
    @JsonProperty("litigant")
    private String litigant;

    /**
     * 立案时间（时间戳）
     */
    @JsonProperty("filingDate")
    private Long filingDate;

    /**
     * 当事人ID
     */
    @JsonProperty("litigantGids")
    private String litigantGids;

    /**
     * 案件状态
     */
    @JsonProperty("caseStatus")
    private String caseStatus;

    /**
     * 来源
     */
    @JsonProperty("source")
    private String source;

    /**
     * 案件详情
     */
    @JsonProperty("content")
    private String content;

    /**
     * 案件类型
     */
    @JsonProperty("caseType")
    private String caseType;

    /**
     * 源链接
     */
    @JsonProperty("sourceUrl")
    private String sourceUrl;

    /**
     * 被告人/被告/被上诉人/被申请人
     */
    @JsonProperty("defendant")
    private String defendant;

    /**
     * 承办法官
     */
    @JsonProperty("juge")
    private String juge;

    /**
     * 开始时间（时间戳）
     */
    @JsonProperty("startTime")
    private Long startTime;

    /**
     * ID
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 承办部门
     */
    @JsonProperty("department")
    private String department;

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
     * 法官助理
     */
    @JsonProperty("assistant")
    private String assistant;

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
     * 案由
     */
    @JsonProperty("caseReason")
    private String caseReason;

    /**
     * 结案时间（时间戳）
     */
    @JsonProperty("closeDate")
    private Long closeDate;

    /**
     * 第三人
     */
    @JsonProperty("third")
    private String third;

    /**
     * 创建时间（时间戳）
     */
    @JsonProperty("createTime")
    private Long createTime;

    /**
     * 公司ID
     */
    @JsonProperty("cid")
    private Long cid;
}
