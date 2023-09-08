package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/8/9 13:34
 */
@Setter
@Getter
public class BaseInfoV3 {

    /**
     * 人员规模
     */
    @JsonProperty("staffNumRange")
    private String staffNumRange;

    /**
     * 经营开始时间
     */
    @JsonProperty("fromTime")
    private Long fromTime;

    /**
     * 法人类型，1 人 2 公司
     */
    @JsonProperty("type")
    private Integer type;

    /**
     * 股票名
     */
    @JsonProperty("bondName")
    private String bondName;

    /**
     * 企业id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 是否是小微企业 0不是 1是
     */
    @JsonProperty("isMicroEnt")
    private Integer isMicroEnt;

    /**
     * 股票曾用名
     */
    @JsonProperty("usedBondName")
    private String usedBondName;

    /**
     * 注册号
     */
    @JsonProperty("regNumber")
    private String regNumber;

    /**
     * 企业评分
     */
    @JsonProperty("percentileScore")
    private Long percentileScore;

    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;

    /**
     * 企业名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 登记机关
     */
    @JsonProperty("regInstitute")
    private String regInstitute;

    /**
     * 注册地址
     */
    @JsonProperty("regLocation")
    private String regLocation;

    /**
     * 行业
     */
    @JsonProperty("industry")
    private String industry;

    /**
     * 核准时间
     */
    @JsonProperty("approvedTime")
    private Long approvedTime;

    /**
     * 更新时间
     */
    @JsonProperty("updateTimes")
    private Long updateTimes;

    /**
     * 参保人数
     */
    @JsonProperty("socialStaffNum")
    private Integer socialStaffNum;

    /**
     * 企业标签
     */
    @JsonProperty("tags")
    private String tags;

    /**
     * 纳税人识别号
     */
    @JsonProperty("taxNumber")
    private String taxNumber;

    /**
     * 经营范围
     */
    @JsonProperty("businessScope")
    private String businessScope;

    /**
     * 英文名
     */
    @JsonProperty("property3")
    private String property3;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 组织机构代码
     */
    @JsonProperty("orgNumber")
    private String orgNumber;

    /**
     * 企业状态
     */
    @JsonProperty("regStatus")
    private String regStatus;

    /**
     * 成立日期
     */
    @JsonProperty("estiblishTime")
    private Long estiblishTime;

    /**
     * 股票类型
     */
    @JsonProperty("bondType")
    private String bondType;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 经营结束时间
     */
    @JsonProperty("toTime")
    private Long toTime;

    /**
     * 实收注册资金
     */
    @JsonProperty("actualCapital")
    private String actualCapital;

    /**
     * 企业类型
     */
    @JsonProperty("companyOrgType")
    private String companyOrgType;

    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;

    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 曾用名
     */
    @JsonProperty("historyNames")
    private String historyNames;

    /**
     * 曾用名列表
     */
    @JsonProperty("historyNameList")
    private List<String> historyNameList;

    /**
     * 股票号
     */
    @JsonProperty("bondNum")
    private String bondNum;

    /**
     * 注册资本币种
     */
    @JsonProperty("regCapitalCurrency")
    private String regCapitalCurrency;

    /**
     * 实收注册资本币种
     */
    @JsonProperty("actualCapitalCurrency")
    private String actualCapitalCurrency;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 网址列表
     */
    @JsonProperty("websiteList")
    private String websiteList;

    /**
     * 企业联系方式
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * 吊销日期
     */
    @JsonProperty("revokeDate")
    private Long revokeDate;

    /**
     * 吊销原因
     */
    @JsonProperty("revokeReason")
    private String revokeReason;

    /**
     * 注销日期
     */
    @JsonProperty("cancelDate")
    private Long cancelDate;

    /**
     * 注销原因
     */
    @JsonProperty("cancelReason")
    private String cancelReason;

    /**
     * 市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 区
     */
    @JsonProperty("district")
    private String district;

    /**
     * 主要人员列表
     */
    @JsonProperty("staffList")
    private StaffList staffList;

    /**
     * 国民经济行业分类
     */
    @JsonProperty("industryAll")
    private IndustryAll industryAll;

}
