package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/31 13:37
 */
@Getter
@Setter
public class CbIc {
    /**
     * 企业状态
     */
    @JsonProperty("regStatus")
    private String regStatus;
    /**
     * 注销日期
     */
    @JsonProperty("cancelDate")
    private String cancelDate;
    /**
     * 分支机构列表
     */
    @JsonProperty("branchList")
    private List<Branch> branchList;
    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;
    /**
     * 股东列表
     */
    @JsonProperty("shareHolderList")
    private List<ShareHolder> shareHolderList;
    /**
     * 经营异常列表
     */
    @JsonProperty("abnormalList")
    private List<Abnormal> abnormalList;
    /**
     * 股权出质
     */
    @JsonProperty("equityList")
    private List<Equity> equityList;
    /**
     * 企业变更
     */
    @JsonProperty("changeList")
    private List<Change> changeList;
    /**
     * 严重违法
     */
    @JsonProperty("illegalList")
    private List<Illegal> illegalList;
    /**
     * 主要⼈员列表
     */
    @JsonProperty("staffList")
    private List<Staff> staffList;
    /**
     * 清算信息
     */
    @JsonProperty("liquidatingInfo")
    private LiquidatingInfo liquidatingInfo;
    /**
     * 简易注销
     */
    @JsonProperty("briefCancel")
    private BriefCancel briefCancel;
    /**
     * 对外投资
     */
    @JsonProperty("investList")
    private List<Investment> investList;
    /**
     * 知识产权出质
     */
    @JsonProperty("iprPledgeList")
    private List<IprPledge> iprPledgeList;
    /**
     * ⾏政处罚
     */
    @JsonProperty("punishList")
    private List<Punish> punishList;
    /**
     * 动产抵押
     */
    @JsonProperty("mortList")
    private List<Mort> mortList;
    /**
     * 年报
     */
    @JsonProperty("reportList")
    private List<Report> reportList;

    /**
     * 司法协助
     */
    @JsonProperty("judicialList")
    private List<Judicial> judicialList;
    /**
     * 抽查检查
     */
    @JsonProperty("checkList")
    private List<Check> checkList;
    /**
     * ⾏政许可
     */
    @JsonProperty("licenseList")
    private List<License> licenseList;

    /**
     * 行业
     */
    @JsonProperty("industry")
    private String industry;

    /**
     * 吊销日期
     */
    @JsonProperty("revokeDate")
    private String revokeDate;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 吊销原因
     */
    @JsonProperty("revokeReason")
    private String revokeReason;

    /**
     * 法人类型，1 人 2 公司
     */
    @JsonProperty("legalPersonType")
    private int legalPersonType;

    /**
     * 注册号
     */
    @JsonProperty("regNumber")
    private String regNumber;

    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 英文名
     */
    @JsonProperty("property3")
    private String property3;

    /**
     * 经营开始时间
     */
    @JsonProperty("fromTime")
    private String fromTime;

    /**
     * 核准时间
     */
    @JsonProperty("approvedTime")
    private String approvedTime;

    /**
     * 企业类型
     */
    @JsonProperty("companyOrgType")
    private String companyOrgType;
    /**
     * 公司id
     */
    @JsonProperty("id")
    private int id;

    /**
     * 组织机构代码
     */
    @JsonProperty("orgNumber")
    private String orgNumber;

    /**
     * 注销原因
     */
    @JsonProperty("cancelReason")
    private String cancelReason;

    /**
     * 经营结束时间
     */
    @JsonProperty("toTime")
    private String toTime;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 网址
     */
    @JsonProperty("website")
    private String website;

    /**
     * 成立时间
     */
    @JsonProperty("estiblishTime")
    private String estiblishTime;

    /**
     * 登记机关
     */
    @JsonProperty("regInstitute")
    private String regInstitute;

    /**
     * 经营范围
     */
    @JsonProperty("businessScope")
    private String businessScope;

    /**
     * 纳税人识别号
     */
    @JsonProperty("taxNumber")
    private String taxNumber;

    /**
     * 注册地址
     */
    @JsonProperty("regLocation")
    private String regLocation;
    /**
     * 表对应id
     */
    @JsonProperty("companyId")
    private int companyId;

    /**
     * 电话号
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * 企业名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 更新时间
     */
    @JsonProperty("updatetime")
    private String updatetime;

    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;
}
