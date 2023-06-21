package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/6/14 15:13
 */
@Setter
@Getter
public class Result3 {
    /**
     * 经营状态
     */
    @JsonProperty("regStatus")
    private String regStatus;
    /**
     * 类型
     */
    @JsonProperty("types")
    private String types;
    /**
     * 业务主管单位
     */
    @JsonProperty("businessUnit")
    private String businessUnit;
    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;
    /**
     * 登记管理机关
     */
    @JsonProperty("regInstitute")
    private String regInstitute;
    /**
     * 社会组织
     */
    @JsonProperty("entityType")
    private Integer entityType;

    /**
     * 是否有年报
     */
    @JsonProperty("haveReport")
    private Boolean haveReport;
    /**
     * 业务范围
     */
    @JsonProperty("businessScope")
    private String businessScope;
    /**
     * 成立登记日期
     */
    @JsonProperty("registrationDateStr")
    private String registrationDateStr;
    /**
     * 注册地址
     */
    @JsonProperty("regLocation")
    private String regLocation;
    /**
     * 企业联系方式列表
     */
    @JsonProperty("phoneList")
    private List<String> phoneList;
    /**
     * 法定代表人名称
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;
    /**
     * 企业网站
     */
    @JsonProperty("websiteList")
    private String websiteList;
    /**
     * 证书有效期
     */
    @JsonProperty("expiryDate")
    private String expiryDate;
    /**
     * 统一信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;
    /**
     * 企业联系方式
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 成立时间
     */
    @JsonProperty("registrationDate")
    private Long registrationDate;
    /**
     * 机构名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 公司logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;
}
