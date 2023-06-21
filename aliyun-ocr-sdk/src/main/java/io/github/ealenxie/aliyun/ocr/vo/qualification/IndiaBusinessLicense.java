package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 17:43
 */
@Getter
@Setter
public class IndiaBusinessLicense {
    /**
     * 证件类型
     */
    @JsonProperty("certificateType")
    private String certificateType;
    /**
     * 发行号
     */
    @JsonProperty("issuanceNo")
    private String issuanceNo;
    /**
     * 处理时间
     */
    @JsonProperty("processingTime")
    private String processingTime;
    /**
     * 英文公司名称
     */
    @JsonProperty("companyNameEn")
    private String companyNameEn;
    /**
     * 非英文公司名称
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 商业注册号
     */
    @JsonProperty("registrationNo")
    private String registrationNo;
    /**
     * 英文法人姓名
     */
    @JsonProperty("nameOfRepresentativeEn")
    private String nameOfRepresentativeEn;
    /**
     * 非英文法人姓名
     */
    @JsonProperty("nameOfRepresentative")
    private String nameOfRepresentative;
    /**
     * 法人证件号
     */
    @JsonProperty("residentRegistrationNo")
    private String residentRegistrationNo;
    /**
     * businessAddressEn
     */
    @JsonProperty("businessAddressEn")
    private String businessAddressEn;
    /**
     * 非英文商业地址
     */
    @JsonProperty("businessAddress")
    private String businessAddress;
    /**
     * 商业起始时间
     */
    @JsonProperty("businessCommencementDate")
    private String businessCommencementDate;
    /**
     * 商业注册时间
     */
    @JsonProperty("businessRegistrationDate")
    private String businessRegistrationDate;
    /**
     * 英文商业类型
     */
    @JsonProperty("businessTypeEn")
    private String businessTypeEn;
    /**
     * 非英文商业类型
     */
    @JsonProperty("businessType")
    private String businessType;
    /**
     * 英文经营范围
     */
    @JsonProperty("businessItemEn")
    private String businessItemEn;
    /**
     * 非英文经营范围
     */
    @JsonProperty("businessItem")
    private String businessItem;
    /**
     * 联合企业名称
     */
    @JsonProperty("jointCompanyName")
    private String jointCompanyName;
    /**
     * 联合企业注册号
     */
    @JsonProperty("jointCompanyRegistrationNo")
    private String jointCompanyRegistrationNo;
    /**
     * 签发日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 签发人
     */
    @JsonProperty("issuer")
    private String issuer;
}
