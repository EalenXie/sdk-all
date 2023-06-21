package io.github.ealenxie.tianyancha.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/14 15:32
 */
@Setter
@Getter
public class ResultVO {
    /**
     * 曾用名
     */
    private String historyNames;
    /**
     * 取消时间
     */
    private Long cancelDate;
    /**
     * 企业状态
     */
    private String regStatus;
    /**
     * 注册资本
     */
    private String regCapital;
    /**
     * 城市
     */
    private String city;
    /**
     * 人员规模
     */
    private String staffNumRange;
    /**
     * 股票号
     */
    private String bondNum;
    /**
     * 曾用名
     */
    private List<String> historyNameList;
    /**
     * 行业
     */
    private String industry;
    /**
     * 股票名
     */
    private String bondName;
    /**
     * 吊销日期
     */
    private Long revokeDate;
    /**
     * 法人类型，1 人 2 公司
     */
    private Integer type;
    /**
     * 更新时间
     */
    private Long updateTimes;
    /**
     * 法人
     */
    private String legalPersonName;
    /**
     * 吊销原因
     */
    private String revokeReason;
    /**
     * 组成形式，1-个人经营、2-家庭经营
     */
    private Integer compForm;
    /**
     * 注册号
     */
    private String regNumber;
    /**
     * 统一社会信用代码
     */
    private String creditCode;
    /**
     * 英文名
     */
    private String property3;
    /**
     * 股票曾用名
     */
    private String usedBondName;
    /**
     * 核准时间
     */
    private Long approvedTime;
    /**
     * 经营开始时间
     */
    private Long fromTime;
    /**
     * 参保人数
     */
    private Integer socialStaffNum;
    /**
     * 实收注册资本币种 人民币 美元 欧元 等
     */
    private String actualCapitalCurrency;
    /**
     * 简称
     */
    private String alias;
    /**
     * 企业类型
     */
    private String companyOrgType;
    /**
     * 企业id
     */
    private Long id;
    /**
     * 取消原因
     */
    private String cancelReason;
    /**
     * 组织机构代码
     */
    private String orgNumber;
    /**
     * 经营结束时间
     */
    private Long toTime;
    /**
     * 实收注册资金
     */
    private String actualCapital;
    /**
     * 成立日期
     */
    private Long estiblishTime;
    /**
     * 登记机关
     */
    private String regInstitute;
    /**
     * 经营范围
     */
    private String businessScope;
    /**
     * 纳税人识别号
     */
    private String taxNumber;
    /**
     * 注册地址
     */
    private String regLocation;
    /**
     * 注册资本币种 人民币 美元 欧元 等
     */
    private String regCapitalCurrency;
    /**
     * 企业标签
     */
    private String tags;
    /**
     * 区
     */
    private String district;
    /**
     * 股票类型
     */
    private String bondType;
    /**
     * 企业名
     */
    private String name;
    /**
     * 企业评分
     */
    private Integer percentileScore;
    /**
     * 国民经济行业分类
     */
    private IndustryAllVO industryAll;
    /**
     * 是否是小微企业 0不是 1是
     */
    private Integer isMicroEnt;
    /**
     * 省份简称
     */
    private String base;
}
