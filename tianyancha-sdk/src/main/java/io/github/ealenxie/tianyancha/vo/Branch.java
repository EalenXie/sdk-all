package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/31 13:45
 */
@Getter
@Setter
public class Branch {
    /**
     * 公司
     */
    @JsonProperty("id")
    private int id;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 成立日期
     */
    @JsonProperty("estiblishTime")
    private String estiblishTime;

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
     * 名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;

    /**
     * 法人类型 1-人 2-公司
     */
    @JsonProperty("personType")
    private int personType;

    /**
     * 企业logo
     */
    @JsonProperty("logo")
    private String logo;

}
