package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/31 17:43
 */
@Getter
@Setter
public class Social {
    /**
     * 参加职工基本医疗保险本期实际缴费金额
     */
    @JsonProperty("medicalInsurancePayAmount")
    private String medicalInsurancePayAmount;

    /**
     * 单位参加失业保险缴费基数
     */
    @JsonProperty("unemploymentInsuranceBase")
    private String unemploymentInsuranceBase;

    /**
     * 参加失业保险本期实际缴费金额
     */
    @JsonProperty("unemploymentInsurancePayAmount")
    private String unemploymentInsurancePayAmount;

    /**
     * 单位参加失业保险累计欠缴金额
     */
    @JsonProperty("unemploymentInsuranceOweAmount")
    private String unemploymentInsuranceOweAmount;

    /**
     * 单位参加职工基本医疗保险累计欠缴金额
     */
    @JsonProperty("medicalInsuranceOweAmount")
    private String medicalInsuranceOweAmount;

    /**
     * 城镇职工基本养老保险人数
     */
    @JsonProperty("endowmentInsurance")
    private String endowmentInsurance;

    /**
     * 参加生育保险本期实际缴费金额
     */
    @JsonProperty("maternityInsurancePayAmount")
    private String maternityInsurancePayAmount;

    /**
     * 参加工伤保险本期实际缴费金额
     */
    @JsonProperty("employmentInjuryInsurancePayAmount")
    private String employmentInjuryInsurancePayAmount;

    /**
     * 失业保险人数
     */
    @JsonProperty("unemploymentInsurance")
    private String unemploymentInsurance;

    /**
     * 职工基本医疗保险人数
     */
    @JsonProperty("medicalInsurance")
    private String medicalInsurance;

    /**
     * 单位参加职工基本医疗保险缴费基数
     */
    @JsonProperty("medicalInsuranceBase")
    private String medicalInsuranceBase;

    /**
     * 单位参加城镇职工基本养老保险缴费基数
     */
    @JsonProperty("endowmentInsuranceBase")
    private String endowmentInsuranceBase;

    /**
     * 单位参加生育保险缴费基数
     */
    @JsonProperty("maternityInsuranceBase")
    private String maternityInsuranceBase;

    /**
     * 参加城镇职工基本养老保险本期实际缴费金额
     */
    @JsonProperty("endowmentInsurancePayAmount")
    private String endowmentInsurancePayAmount;

    /**
     * 工伤保险
     */
    @JsonProperty("employmentInjuryInsurance")
    private String employmentInjuryInsurance;

    /**
     * 单位参加城镇职工基本养老保险累计欠缴金额
     */
    @JsonProperty("endowmentInsuranceOweAmount")
    private String endowmentInsuranceOweAmount;

    /**
     * 生育保险人数
     */
    @JsonProperty("maternityInsurance")
    private String maternityInsurance;

    /**
     * 单位参加生育保险累计欠缴金额
     */
    @JsonProperty("maternityInsuranceOweAmount")
    private String maternityInsuranceOweAmount;

    /**
     * 单位参加工伤保险累计欠缴金额
     */
    @JsonProperty("employmentInjuryInsuranceOweAmount")
    private String employmentInjuryInsuranceOweAmount;
}

