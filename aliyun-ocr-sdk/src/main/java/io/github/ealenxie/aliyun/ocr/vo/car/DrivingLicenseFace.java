package io.github.ealenxie.aliyun.ocr.vo.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/6 16:29
 */
@Getter
@Setter
public class DrivingLicenseFace {

    /**
     * 证号
     */
    @JsonProperty("licenseNumber")
    private String licenseNumber;
    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 性别
     */
    @JsonProperty("sex")
    private String sex;
    /**
     * 国籍
     */
    @JsonProperty("nationality")
    private String nationality;
    /**
     * 住址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 出生日期
     */
    @JsonProperty("birthDate")
    private String birthDate;
    /**
     * 初次领证日期
     */
    @JsonProperty("initialIssueDate")
    private String initialIssueDate;
    /**
     * 准驾类型
     */
    @JsonProperty("approvedType")
    private String approvedType;
    /**
     * 准驾类型
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 有效起始日期
     */
    @JsonProperty("validFromDate")
    private String validFromDate;
    /**
     * 有效起始日期
     */
    @JsonProperty("validPeriod")
    private String validPeriod;
}
