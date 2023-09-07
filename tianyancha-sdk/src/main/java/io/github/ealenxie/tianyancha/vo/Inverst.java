package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/7 14:52
 */
@Getter
@Setter
public class Inverst {

    /**
     * 公司类型
     */
    @JsonProperty("orgType")
    private String orgType;

    /**
     * 经营范围
     */
    @JsonProperty("business_scope")
    private String businessScope;

    /**
     * 投资占比
     */
    @JsonProperty("percent")
    private String percent;

    /**
     * 企业状态
     */
    @JsonProperty("regStatus")
    private String regStatus;

    /**
     * 开业时间（毫秒数）
     */
    @JsonProperty("estiblishTime")
    private Long estiblishTime;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 公司类型（1-公司 2-人）
     */
    @JsonProperty("type")
    private Long type;

    /**
     * 投资金额
     */
    @JsonProperty("amount")
    private Double amount;

    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 行业
     */
    @JsonProperty("category")
    private String category;

    /**
     * 注册资金
     */
    @JsonProperty("regCapital")
    private String regCapital;

    /**
     * 被投资公司
     */
    @JsonProperty("name")
    private String name;

    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;

    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 被投资法人类型（0-无法人 1-人 2-公司）
     */
    @JsonProperty("personType")
    private Long personType;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 投资金额单位
     */
    @JsonProperty("amountSuffix")
    private String amountSuffix;
}
