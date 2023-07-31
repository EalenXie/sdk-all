package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Report {
    /**
     * 发布时间
     */
    @JsonProperty("releaseTime")
    private String releaseTime;

    /**
     * 从业人数
     */
    @JsonProperty("employeeNum")
    private String employeeNum;

    /**
     * 资产总额
     */
    @JsonProperty("totalAssets")
    private String totalAssets;

    /**
     * 利润总额
     */
    @JsonProperty("totalProfit")
    private String totalProfit;

    /**
     * 年报股东列表
     */
    @JsonProperty("shareHolderList")
    private List<ReportShareHolder> shareHolderList;

    /**
     * 企业名称
     */
    @JsonProperty("companyName")
    private String companyName;

    /**
     * 年报变更列表
     */
    @JsonProperty("changeList")
    private List<Change> changeList;

    /**
     * 年报股权变更列表
     */
    @JsonProperty("equityChangeList")
    private List<EquityChange> equityChangeList;

    /**
     * 经营者名称
     */
    @JsonProperty("operatorName")
    private String operatorName;

    /**
     * 纳税总额
     */
    @JsonProperty("totalTax")
    private String totalTax;

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
     * 年报对外提供保证担保列表
     */
    @JsonProperty("guaranteeList")
    private List<Guarantee> guaranteeList;

    /**
     * 年报id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 企业经营状态
     */
    @JsonProperty("manageState")
    private String manageState;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 年报对外投资列表
     */
    @JsonProperty("outBoundList")
    private List<OutBound> outBoundList;

    /**
     * 年报社保列表
     */
    @JsonProperty("socialList")
    private List<Social> socialList;

    /**
     * 负债总额
     */
    @JsonProperty("totalLiability")
    private String totalLiability;

    /**
     * 邮政编码
     */
    @JsonProperty("postcode")
    private String postcode;

    /**
     * 销售总额(营业总收入)
     */
    @JsonProperty("totalSales")
    private String totalSales;

    /**
     * 净利润
     */
    @JsonProperty("retainedProfit")
    private String retainedProfit;

    /**
     * 年报年度
     */
    @JsonProperty("reportYear")
    private String reportYear;

    /**
     * 所有者权益合计
     */
    @JsonProperty("totalEquity")
    private String totalEquity;

    /**
     * 电话号
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * 企业通信地址
     */
    @JsonProperty("postalAddress")
    private String postalAddress;

    /**
     * 主营业务收入
     */
    @JsonProperty("primeBusProfit")
    private String primeBusProfit;

    /**
     * 年报网站列表
     */
    @JsonProperty("webList")
    private List<Web> webList;
}
