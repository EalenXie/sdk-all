package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/8 13:44
 */
@Getter
@Setter
public class IcParentCompany {
    /**
     * 注册资本
     */
    @JsonProperty("reg_capital")
    private String regCapital;

    /**
     * 成立日期（日期格式）
     */
    @JsonProperty("estiblish_time")
    private String estiblishTime;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 法人图片
     */
    @JsonProperty("personLogo")
    private String personLogo;

    /**
     * 经营状态
     */
    @JsonProperty("reg_status")
    private String regStatus;

    /**
     * 总公司名
     */
    @JsonProperty("name")
    private String name;

    /**
     * Logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 公司简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;
}
