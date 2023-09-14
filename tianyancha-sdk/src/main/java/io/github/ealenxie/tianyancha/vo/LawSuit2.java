package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/8/1 9:35
 */
@Getter
@Setter
public class LawSuit2 {

    /**
     * 相关公司id
     */
    @JsonProperty("splitGids")
    private String splitGids;

    /**
     * 原告
     */
    @JsonProperty("plaintiffs")
    private String plaintiffs;

    /**
     * 法院
     */
    @JsonProperty("court")
    private String court;

    /**
     * 案由
     */
    @JsonProperty("casereason")
    private String casereason;

    /**
     * 原文链接地址
     */
    @JsonProperty("url")
    private String url;

    /**
     * 案号
     */
    @JsonProperty("caseno")
    private String caseno;

    /**
     * 对应表id
     */
    @JsonProperty("id")
    private String id;

    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;

    /**
     * 摘要
     */
    @JsonProperty("abstracts")
    private String abstracts;

    /**
     * 发布时间（时间戳）
     */
    @JsonProperty("submittime")
    private String submittime;

    /**
     * 裁判日期
     */
    @JsonProperty("judgetime")
    private String judgetime;

    /**
     * 天眼查显示url
     */
    @JsonProperty("lawsuitUrl")
    private String lawsuitUrl;

    /**
     * 案件类型
     */
    @JsonProperty("casetype")
    private String casetype;

    /**
     * 文书类型
     */
    @JsonProperty("doctype")
    private String doctype;

    /**
     * 代理人
     */
    @JsonProperty("agent")
    private String agent;

    /**
     * uuid
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * 第三人
     */
    @JsonProperty("thirdParties")
    private String thirdParties;

    /**
     * 被告
     */
    @JsonProperty("defendants")
    private String defendants;

    /**
     * 当事人
     */
    @JsonProperty("parties")
    private String parties;
}
