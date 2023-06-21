package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/6/14 15:15
 */
@Setter
@Getter
public class Result4 {
    /**
     * 企业简介
     */
    @JsonProperty("baseInfo")
    private String baseInfo;
    /**
     * 核准时间
     */
    @JsonProperty("approvalDate")
    private String approvalDate;
    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;
    /**
     * 企业联系方式列表
     */
    @JsonProperty("phoneList")
    private List<String> phoneList;
    /**
     * uuid
     */
    @JsonProperty("uuid")
    private String uuid;
    /**
     * 负责人名称
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;
    /**
     * 执业状态、状态
     */
    @JsonProperty("practiceState")
    private String practiceState;
    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;
    /**
     * 总所/分所
     */
    @JsonProperty("headquartersBranch")
    private String headquartersBranch;
    /**
     * 业务特长
     */
    @JsonProperty("businessExpertise")
    private String businessExpertise;
    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 信用等级
     */
    @JsonProperty("creditRating")
    private String creditRating;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 律所简介
     */
    @JsonProperty("summary")
    private String summary;
    /**
     * 组织形式
     */
    @JsonProperty("organizationForm")
    private String organizationForm;
    /**
     * 律所
     */
    @JsonProperty("entityType")
    private Integer entityType;
    /**
     * 是否有年报
     */
    @JsonProperty("haveReport")
    private Boolean haveReport;
    /**
     * 税务登记号
     */
    @JsonProperty("taxNumber")
    private String taxNumber;
    /**
     * 地址
     */
    @JsonProperty("regLocation")
    private String regLocation;
    /**
     * 发证日期
     */
    @JsonProperty("dateOfIssue")
    private String dateOfIssue;
    /**
     * 主管机关
     */
    @JsonProperty("authorities")
    private String authorities;
    /**
     * 企业网站
     */
    @JsonProperty("websiteList")
    private String websiteList;
    /**
     * 企业联系方式
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 成立日期
     */
    @JsonProperty("dateOfEstablishment")
    private String dateOfEstablishment;
    /**
     * 律所名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 证书
     */
    @JsonProperty("permit")
    private String permit;

}
