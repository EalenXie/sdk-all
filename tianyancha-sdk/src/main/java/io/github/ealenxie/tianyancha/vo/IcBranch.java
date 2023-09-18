package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/8 13:36
 */
@Getter
@Setter
public class IcBranch {
    /**
     * Logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 开业时间（时间戳）
     */
    @JsonProperty("estiblishTime")
    private Long estiblishTime;

    /**
     * 企业状态
     */
    @JsonProperty("regStatus")
    private String regStatus;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 行业code
     */
    @JsonProperty("category")
    private String category;

    /**
     * 注册资金
     */
    @JsonProperty("regCapital")
    private String regCapital;

    /**
     * 公司名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;

    /**
     * 法人类型（1-人 2-公司）
     */
    @JsonProperty("personType")
    private Integer personType;
}
