package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/8 13:32
 */
@Getter
@Setter
public class HiInvest {
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
     * Logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 占比
     */
    @JsonProperty("percent")
    private String percent;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 成立日期（时间戳）
     */
    @JsonProperty("estiblishTime")
    private Long estiblishTime;

    /**
     * 经营状态
     */
    @JsonProperty("regStatus")
    private String regStatus;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 评分（万分制）
     */
    @JsonProperty("pencertileScore")
    private Long pencertileScore;

    /**
     * 法人id
     */
    @JsonProperty("legalPersonId")
    private Long legalPersonId;

    /**
     * 金额
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
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;

    /**
     * 公司名称
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
     * 法人类型（0-无法人 1-人 2-企业）
     */
    @JsonProperty("personType")
    private Long personType;
}
