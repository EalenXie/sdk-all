package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:22
 */
@Getter
@Setter
public class BusinessLicense {
    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;
    /**
     * 营业名称
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 类型
     */
    @JsonProperty("companyType")
    private String companyType;
    /**
     * 营业场所/住所
     */
    @JsonProperty("businessAddress")
    private String businessAddress;
    /**
     * 法人/负责人
     */
    @JsonProperty("legalPerson")
    private String legalPerson;
    /**
     * 经营范围
     */
    @JsonProperty("businessScope")
    private String businessScope;
    /**
     * 注册资本
     */
    @JsonProperty("registeredCapital")
    private String registeredCapital;
    /**
     * 注册日期
     */
    @JsonProperty("RegistrationDate")
    private String registrationDate;
    /**
     * 营业期限
     */
    @JsonProperty("validPeriod")
    private String validPeriod;
    /**
     * 格式化营业期限起始日期
     */
    @JsonProperty("validFromDate")
    private String validFromDate;
    /**
     * 格式化营业期限终止日期
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 组成形式
     */
    @JsonProperty("companyForm")
    private String companyForm;
}
