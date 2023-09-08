package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseInfo {
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
     * 负债总额
     */
    @JsonProperty("totalLiability")
    private String totalLiability;

    /**
     * 企业名称
     */
    @JsonProperty("companyName")
    private String companyName;

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
     * 经营者名称
     */
    @JsonProperty("operatorName")
    private String operatorName;

    /**
     * 净利润
     */
    @JsonProperty("retainedProfit")
    private String retainedProfit;

    /**
     * 纳税总额
     */
    @JsonProperty("totalTax")
    private String totalTax;

    /**
     * 年报年度
     */
    @JsonProperty("reportYear")
    private String reportYear;

    /**
     * 注册号
     */
    @JsonProperty("regNumber")
    private String regNumber;

    /**
     * 所有者权益合计
     */
    @JsonProperty("totalEquity")
    private String totalEquity;

    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 企业联系电话
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
     * 年报id
     */
    @JsonProperty("id")
    private Integer id;

    /**
     * 企业经营状态
     */
    @JsonProperty("manageState")
    private String manageState;

    /**
     * 电子邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 公司id
     */
    @JsonProperty("companyId")
    private String companyId;
}