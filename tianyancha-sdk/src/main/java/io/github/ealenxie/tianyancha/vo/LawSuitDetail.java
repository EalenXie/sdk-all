package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/14 9:42
 */
@Getter
@Setter
public class LawSuitDetail {
    /**
     * 裁判日期（日期）
     */
    @JsonProperty("judgeDate")
    private String judgeDate;

    /**
     * 本案裁判结果
     */
    @JsonProperty("judgeResult")
    private String judgeResult;

    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;

    /**
     * 案号
     */
    @JsonProperty("caseno")
    private String caseno;

    /**
     * UUID
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * 本院认为
     */
    @JsonProperty("courtConsider")
    private String courtConsider;

    /**
     * 相关公司
     */
    @JsonProperty("companies")
    private List<TitlePayload> companies;

    /**
     * 原告诉称
     */
    @JsonProperty("plaintiffRequest")
    private String plaintiffRequest;

    /**
     * 本院查明
     */
    @JsonProperty("courtInspect")
    private String courtInspect;

    /**
     * 审理经过
     */
    @JsonProperty("trialProcedure")
    private String trialProcedure;

    /**
     * 相关律所
     */
    @JsonProperty("lawFirms")
    private List<TitlePayload> lawFirms;

    /**
     * 一审原告诉称
     */
    @JsonProperty("plaintiffRequestOfFirst")
    private String plaintiffRequestOfFirst;

    /**
     * 一审被告辩称
     */
    @JsonProperty("defendantReplyOfFirst")
    private String defendantReplyOfFirst;

    /**
     * 审判人员
     */
    @JsonProperty("trialPerson")
    private String trialPerson;

    /**
     * 诉讼正文
     */
    @JsonProperty("plaintext")
    private String plaintext;

    /**
     * 当事人信息
     */
    @JsonProperty("appellor")
    private String appellor;

    /**
     * 法院
     */
    @JsonProperty("court")
    private String court;

    /**
     * 源路径
     */
    @JsonProperty("url")
    private String url;

    /**
     * 一审法院认为
     */
    @JsonProperty("courtConsiderOfFirst")
    private String courtConsiderOfFirst;

    /**
     * 文书类型
     */
    @JsonProperty("doctype")
    private String doctype;

    /**
     * 案件类型
     */
    @JsonProperty("casetype")
    private String casetype;

    /**
     * 上诉人诉称
     */
    @JsonProperty("appellantRequest")
    private String appellantRequest;

    /**
     * 被告辩称
     */
    @JsonProperty("defendantReply")
    private String defendantReply;

    /**
     * 一审法院查明
     */
    @JsonProperty("courtInspectOfFirst")
    private String courtInspectOfFirst;

    /**
     * 被上诉人辩称
     */
    @JsonProperty("appelleeArguing")
    private String appelleeArguing;
}
