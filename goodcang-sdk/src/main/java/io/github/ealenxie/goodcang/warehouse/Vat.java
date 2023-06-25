package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 17:44
 */
@Getter
@Setter
public class Vat {

    /**
     * 进出口商
     */
    @JsonProperty("vat_type")
    private Integer vatType;
    /**
     * 进/出口商编码
     */
    @JsonProperty("cv_id")
    private Integer cvId;
    /**
     * 公司名称
     */
    @JsonProperty("company_name")
    private String companyName;
    /**
     * 增值税号
     */
    @JsonProperty("vat_number")
    private String vatNumber;
    /**
     * 增值税豁免号
     */
    @JsonProperty("exemption_number")
    private String exemptionNumber;
    /**
     * EORI
     */
    @JsonProperty("eori")
    private String eori;
    /**
     * 海外仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 联系人
     */
    @JsonProperty("cv_contacter")
    private String cvContacter;
    /**
     * 联系人电话
     */
    @JsonProperty("cv_contact_phone")
    private String cvContactPhone;
    /**
     * 联系人邮箱
     */
    @JsonProperty("vat_email")
    private String vatEmail;
    /**
     * 公司主要营业地址
     */
    @JsonProperty("cv_business_address")
    private String cvBusinessAddress;
    /**
     * 进出口商状态
     */
    @JsonProperty("cv_status")
    private String cvStatus;
    /**
     * 创建时间
     */
    @JsonProperty("cv_create_time")
    private String cvCreateTime;
    /**
     * 审核时间
     */
    @JsonProperty("auditing_time")
    private String auditingTime;
    /**
     * 异动时间
     */
    @JsonProperty("cv_update_time")
    private String cvUpdateTime;
    /**
     * 营业执照/商业登记书文件
     */
    @JsonProperty("importer_company_licence")
    private FilePayload importerCompanyLicence;
    /**
     * 增值税证明文件
     */
    @JsonProperty("gst_certificate")
    private FilePayload gstCertificate;
}
