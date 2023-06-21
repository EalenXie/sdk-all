package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/14 15:13
 */
@Setter
@Getter
public class Result2 {
    /**
     * 押记登记册
     */
    @JsonProperty("mortgageS")
    private String mortgageS;
    /**
     * 企业状态
     */
    @JsonProperty("regStatus")
    private String regStatus;
    /**
     * 成立时间
     */
    @JsonProperty("estiblishTime")
    private Long estiblishTime;
    /**
     * 香港公司
     */
    @JsonProperty("entityType")
    private Integer entityType;
    /**
     * 备注
     */
    @JsonProperty("remarksS")
    private String remarksS;
    /**
     * 是否有年报
     */
    @JsonProperty("haveReport")
    private Boolean haveReport;
    /**
     * 英文名
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * 公司编号
     */
    @JsonProperty("companyNum")
    private String companyNum;
    /**
     * 公司名称(简体)
     */
    @JsonProperty("name")
    private String name;
    /**
     * 公司名称(繁体)
     */
    @JsonProperty("nameTraditional")
    private String nameTraditional;
    /**
     * 重要事项
     */
    @JsonProperty("importantItemsS")
    private String importantItemsS;
    /**
     * 公司logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 公司类型
     */
    @JsonProperty("companyOrgType")
    private String companyOrgType;
    /**
     * 清盘模式
     */
    @JsonProperty("liquidationModeS")
    private String liquidationModeS;
    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 结束时间
     */
    @JsonProperty("toTime")
    private String toTime;
    /**
     * 省份
     */
    @JsonProperty("base")
    private String base;

}
