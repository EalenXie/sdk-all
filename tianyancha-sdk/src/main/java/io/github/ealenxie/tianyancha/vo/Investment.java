package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Investment {
    /**
     * 企业状态
     */
    @JsonProperty("regStatus")
    private String regStatus;

    /**
     * 投资金额
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * 开业时间
     */
    @JsonProperty("estiblishTime")
    private String estiblishTime;

    /**
     * 注册资金
     */
    @JsonProperty("regCapital")
    private String regCapital;

    /**
     * 投资类型（无用）
     */
    @JsonProperty("type")
    private String type;

    /**
     * 投资占比
     */
    @JsonProperty("percent")
    private String percent;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 经营范围
     */
    @JsonProperty("business_scope")
    private String businessScope;

    /**
     * 公司类型
     */
    @JsonProperty("orgType")
    private String orgType;

    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 被投资公司名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 被投资公司简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 公司id
     */
    @JsonProperty("id")
    private Integer id;

    /**
     * 行业
     */
    @JsonProperty("category")
    private String category;

    /**
     * 法人类型 1 人 2 公司
     */
    @JsonProperty("personType")
    private Integer personType;

    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;
}
