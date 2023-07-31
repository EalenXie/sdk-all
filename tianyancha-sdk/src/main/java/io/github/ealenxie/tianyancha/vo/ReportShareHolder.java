package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/31 17:41
 */
@Getter
@Setter
public class ReportShareHolder {
    /**
     * 认缴出资额
     */
    @JsonProperty("subscribeAmount")
    private String subscribeAmount;

    /**
     * 认缴出资方式
     */
    @JsonProperty("subscribeType")
    private String subscribeType;

    /**
     * 实缴出资方式
     */
    @JsonProperty("paidType")
    private String paidType;

    /**
     * 认缴出资时间
     */
    @JsonProperty("subscribeTime")
    private String subscribeTime;

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
     * 实缴出资额
     */
    @JsonProperty("paidAmount")
    private String paidAmount;
}
