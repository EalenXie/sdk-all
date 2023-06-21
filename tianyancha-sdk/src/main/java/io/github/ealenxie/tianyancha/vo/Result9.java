package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/14 14:06
 */
@Setter
@Getter
public class Result9 {
    /**
     * 企业状态
     */
    @JsonProperty("regStatus")
    private String regStatus;
    /**
     * 网址
     */
    @JsonProperty("website")
    private String website;
    /**
     * 注册地址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 注册资金
     */
    @JsonProperty("regCapital")
    private String regCapital;
    /**
     * 经济类型
     */
    @JsonProperty("industryCategory")
    private String industryCategory;
    /**
     * 登记机关
     */
    @JsonProperty("regInstitute")
    private String regInstitute;
    /**
     * 新机构
     */
    @JsonProperty("entityType")
    private Integer entityType;
    /**
     * 经营范围
     */
    @JsonProperty("businessScope")
    private String businessScope;
    /**
     * 负责人名称
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;
    /**
     * 经营期限
     */
    @JsonProperty("expiryDate")
    private String expiryDate;
    /**
     * 负责人id
     */
    @JsonProperty("legalPersonId")
    private Long legalPersonId;
    /**
     * 负责人上级id
     */
    @JsonProperty("legalPersonPid")
    private Long legalPersonPid;
    /**
     * 机构类型
     */
    @JsonProperty("orgType")
    private String orgType;
    /**
     * 登记号
     */
    @JsonProperty("regNumber")
    private String regNumber;
    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;
    /**
     * 成立日期
     */
    @JsonProperty("establishTime")
    private String establishTime;
    /**
     * 联系电话
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 经济行业
     */
    @JsonProperty("businessUni")
    private String businessUni;
    /**
     * 机构名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 机构id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 所属省份
     */
    @JsonProperty("base")
    private String base;

}
