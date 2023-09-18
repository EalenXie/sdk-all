package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/18 16:24
 */
@Getter
@Setter
public class ConsumptionRestriction {
    /**
     * 案号
     */
    @JsonProperty("caseCode")
    private String caseCode;

    /**
     * 企业信息简称
     */
    @JsonProperty("qyinfoAlias")
    private String qyinfoAlias;

    /**
     * pdf文件地址
     */
    @JsonProperty("filePath")
    private String filePath;

    /**
     * 企业信息
     */
    @JsonProperty("qyinfo")
    private String qyinfo;

    /**
     * 立案时间
     */
    @JsonProperty("caseCreateTime")
    private Long caseCreateTime;

    /**
     * 别名
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 对应表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 限制消费者名称
     */
    @JsonProperty("xname")
    private String xname;

    /**
     * 企业id
     */
    @JsonProperty("cid")
    private Long cid;

    /**
     * 限制消费者id
     */
    @JsonProperty("hcgid")
    private String hcgid;

    /**
     * 申请人信息
     */
    @JsonProperty("applicant")
    private String applicant;

    /**
     * 申请人id
     */
    @JsonProperty("applicantCid")
    private String applicantCid;

    /**
     * 发布日期
     */
    @JsonProperty("publishDate")
    private Long publishDate;
}
