package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutGuaranteeInfo {
    /**
     * 年报年度
     */
    @JsonProperty("reportYear")
    private String reportYear;

    /**
     * 债权人
     */
    @JsonProperty("creditor")
    private String creditor;

    /**
     * 债务人
     */
    @JsonProperty("obligor")
    private String obligor;

    /**
     * 主债权种类
     */
    @JsonProperty("creditoType")
    private String creditoType;

    /**
     * 主债权数额
     */
    @JsonProperty("creditoAmount")
    private String creditoAmount;

    /**
     * 履行债务的期限
     */
    @JsonProperty("creditoTerm")
    private String creditoTerm;

    /**
     * 保证的期间
     */
    @JsonProperty("guaranteeTerm")
    private String guaranteeTerm;

    /**
     * 保证的方式
     */
    @JsonProperty("guaranteeWay")
    private String guaranteeWay;

    /**
     * 保证担保的范围
     */
    @JsonProperty("guaranteeScope")
    private String guaranteeScope;
}