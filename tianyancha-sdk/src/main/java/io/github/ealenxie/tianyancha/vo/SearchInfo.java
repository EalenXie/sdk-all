package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchInfo {
    /**
     * 注册号
     */
    @JsonProperty("regNumber")
    private String regNumber;
    /**
     * 经营状态
     */
    @JsonProperty("regStatus")
    private String regStatus;

    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;

    /**
     * 成立日期
     */
    @JsonProperty("estiblishTime")
    private String estiblishTime;

    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;

    /**
     * 机构类型-1：公司；2：香港企业；3：社会组织；4：律所；5：事业单位；6：基金会；7-不存在法人、注册资本、统一社会信用代码、经营状态;8：台湾企业；9-新机构
     */
    @JsonProperty("companyType")
    private int companyType;

    /**
     * 公司名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 公司id
     */
    @JsonProperty("id")
    private long id;

    /**
     * 组织机构代码
     */
    @JsonProperty("orgNumber")
    private String orgNumber;

    /**
     * 1-公司 2-人
     */
    @JsonProperty("type")
    private int type;

    /**
     * 省份
     */
    @JsonProperty("base")
    private String base;

    /**
     * 法人
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 匹配原因
     */
    @JsonProperty("matchType")
    private String matchType;
}
