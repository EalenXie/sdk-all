package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/8 13:47
 */
@Getter
@Setter
public class IcAnnualReport {

    /**
     * 发布时间
     */
    @JsonProperty("releaseTime")
    private String releaseTime;

    /**
     * 年报基本信息
     */
    @JsonProperty("baseInfo")
    private BaseInfo baseInfo;

    /**
     * 对外投资列表
     */
    @JsonProperty("outboundInvestmentList")
    private List<OutboundInvestment> outboundInvestmentList;

    /**
     * 股东及出资列表
     */
    @JsonProperty("shareholderList")
    private List<AnnualReportShareholder> shareholderList;

    /**
     * 年报社保信息
     */
    @JsonProperty("reportSocialSecurityInfo")
    private ReportSocialSecurityInfo reportSocialSecurityInfo;

    /**
     * 无用
     */
    @JsonProperty("govReport")
    private Object govReport;

    /**
     * 股权变更列表
     */
    @JsonProperty("equityChangeInfoList")
    private List<EquityChangeInfo> equityChangeInfoList;

    /**
     * 修改信息
     */
    @JsonProperty("changeRecordList")
    private List<ChangeRecord> changeRecordList;

    /**
     * 网站信息列表
     */
    @JsonProperty("webInfoList")
    private List<WebInfo> webInfoList;

    /**
     * 对外担保信息列表
     */
    @JsonProperty("outGuaranteeInfoList")
    private List<OutGuaranteeInfo> outGuaranteeInfoList;


}

