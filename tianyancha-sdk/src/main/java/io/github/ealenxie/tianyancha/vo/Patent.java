package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 17:02
 */
@Getter
@Setter
public class Patent {
    /**
     * 代理人
     */
    @JsonProperty("agent")
    private String agent;
    /**
     * 申请号/专利号
     */
    @JsonProperty("patentNum")
    private String patentNum;
    /**
     * 名称
     */
    @JsonProperty("title")
    private String title;
    /**
     * uuid
     */
    @JsonProperty("uuid")
    private String uuid;
    /**
     * 申请日
     */
    @JsonProperty("applicationTime")
    private String applicationTime;
    /**
     * 专利状态
     */
    @JsonProperty("patentStatus")
    private String patentStatus;
    /**
     * 发明人
     */
    @JsonProperty("inventor")
    private String inventor;
    /**
     * id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 申请公布号
     */
    @JsonProperty("pubNumber")
    private String pubNumber;
    /**
     * 法律状态
     */
    @JsonProperty("lawStatus")
    private List<LawStatus> lawStatus;
    /**
     * 地址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 申请号
     */
    @JsonProperty("appNumber")
    private String appNumber;
    /**
     * 代理机构
     */
    @JsonProperty("agency")
    private String agency;
    /**
     * 摘要
     */
    @JsonProperty("abstracts")
    private String abstracts;
    /**
     * 无用
     */
    @JsonProperty("idPrivate")
    private String idPrivate;
    /**
     * 授权公告日
     */
    @JsonProperty("grantDate")
    private String grantDate;
    /**
     * 申请人
     */
    @JsonProperty("applicantName")
    private String applicantName;
    /**
     * 申请公布日
     */
    @JsonProperty("applicationPublishTime")
    private String applicationPublishTime;
    /**
     * 公开公告日
     */
    @JsonProperty("pubDate")
    private String pubDate;
    /**
     * 专利类型
     */
    @JsonProperty("patentType")
    private String patentType;
    /**
     * 图片url
     */
    @JsonProperty("imgUrl")
    private String imgUrl;
    /**
     * 主分类号
     */
    @JsonProperty("mainCatNum")
    private String mainCatNum;
    /**
     * 专利
     */
    @JsonProperty("patentName")
    private String patentName;
    /**
     * 邮编
     */
    @JsonProperty("postCode")
    private String postCode;
    /**
     * 授权公告号
     */
    @JsonProperty("grantNumber")
    private Object grantNumber;
    /**
     * 全部分类号
     */
    @JsonProperty("allCatNum")
    private String allCatNum;
    /**
     * 申请公布号
     */
    @JsonProperty("applicationPublishNum")
    private String applicationPublishNum;
    /**
     * 优先权信息
     */
    @JsonProperty("priorityInfo")
    private List<PriorityInfo> priorityInfo;
}
