package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/8 13:58
 */
@Getter
@Setter
public class AnnualReportShareholder {
    /**
     * 认缴出资额
     */
    @JsonProperty("subscribeAmount")
    private String subscribeAmount;

    /**
     * 认缴出资时间
     */
    @JsonProperty("subscribeTime")
    private String subscribeTime;

    /**
     * 年报id
     */
    @JsonProperty("clickId")
    private String clickId;

    /**
     * 股东名称
     */
    @JsonProperty("investorName")
    private String investorName;

    /**
     * 实缴出资时间
     */
    @JsonProperty("paidTime")
    private String paidTime;

    /**
     * 类型，1-人，2-公司
     */
    @JsonProperty("type")
    private String type;

    /**
     * 实缴出资方式
     */
    @JsonProperty("paidType")
    private String paidType;

    /**
     * 认缴出资方式
     */
    @JsonProperty("subscribeType")
    private String subscribeType;

    /**
     * 年报年度
     */
    @JsonProperty("reportYear")
    private String reportYear;

    /**
     * 拥有公司数量
     */
    @JsonProperty("toco")
    private String toco;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * Logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 实缴出资额
     */
    @JsonProperty("paidAmount")
    private String paidAmount;

    /**
     * 公司id
     */
    @JsonProperty("cid")
    private Long cid;
}
