package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 17:43
 */
@Getter
@Setter
public class KoreaBusinessLicense {
    /**
     * 证件类型
     */
    @JsonProperty("certificateType")
    private String certificateType;
    /**
     * 注册号
     */
    @JsonProperty("registrationNo")
    private String registrationNo;
    /**
     * 法定名称
     */
    @JsonProperty("legalName")
    private String legalName;
    /**
     * 商号
     */
    @JsonProperty("tradeName")
    private String tradeName;
    /**
     * 商业类型
     */
    @JsonProperty("businessConstitution")
    private String businessConstitution;
    /**
     * 地址
     */
    @JsonProperty("businessAddress")
    private String businessAddress;
    /**
     * 责任日期
     */
    @JsonProperty("liabilityDate")
    private String liabilityDate;
    /**
     * 有效起始日期
     */
    @JsonProperty("validFromDate")
    private String validFromDate;
    /**
     * 有效终止日期
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 注册类型
     */
    @JsonProperty("registrationType")
    private String registrationType;
    /**
     * 审批机关详情
     */
    @JsonProperty("particularsOfApprovingAuthority")
    private String particularsOfApprovingAuthority;
    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 委任
     */
    @JsonProperty("designation")
    private String designation;
    /**
     * 管辖办事处
     */
    @JsonProperty("jurisdictionalOffice")
    private String jurisdictionalOffice;
    /**
     * 签发日期
     */
    @JsonProperty("issueDate")
    private String issueDate;

}
