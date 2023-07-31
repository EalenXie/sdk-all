package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 18:00
 */
@Getter
@Setter
public class Lawsuit {
    /**
     * 日期 发布时间
     */
    @JsonProperty("submittime")
    private String submitTime;

    /**
     * 案由
     */
    @JsonProperty("casereason")
    private String caseReason;

    /**
     * 代理人
     */
    @JsonProperty("agent")
    private String agent;

    /**
     * 被告
     */
    @JsonProperty("defendants")
    private String defendants;

    /**
     * 摘要
     */
    @JsonProperty("abstracts")
    private String abstracts;

    /**
     * 天眼查显示url
     */
    @JsonProperty("lawsuitUrl")
    private String lawsuitUrl;

    /**
     * 法院
     */
    @JsonProperty("court")
    private String court;

    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;

    /**
     * 唯一标识
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * 案号
     */
    @JsonProperty("caseno")
    private String caseNo;

    /**
     * 原文链接地址
     */
    @JsonProperty("url")
    private String url;

    /**
     * 文书类型
     */
    @JsonProperty("doctype")
    private String docType;

    /**
     * 裁判日期
     */
    @JsonProperty("judgetime")
    private String judgeTime;

    /**
     * 第三人
     */
    @JsonProperty("thirdParties")
    private String thirdParties;

    /**
     * 当事人
     */
    @JsonProperty("parties")
    private String parties;

    /**
     * 案件类型
     */
    @JsonProperty("casetype")
    private String caseType;

    /**
     * 对应表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 原告
     */
    @JsonProperty("plaintiffs")
    private String plaintiffs;
}
