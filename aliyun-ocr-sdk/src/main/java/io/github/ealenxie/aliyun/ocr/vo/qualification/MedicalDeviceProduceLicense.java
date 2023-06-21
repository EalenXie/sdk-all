package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:50
 */
@Getter
@Setter
public class MedicalDeviceProduceLicense {

    /**
     * 注册地址
     */
    @JsonProperty("registeredAddress")
    private String registeredAddress;
    /**
     * 发证日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 许可证编号
     */
    @JsonProperty("licenseNumber")
    private String licenseNumber;
    /**
     * 发证部门
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 法定代表人
     */
    @JsonProperty("legalRepresentative")
    private String legalRepresentative;
    /**
     * 生产地址
     */
    @JsonProperty("productionAddress")
    private String productionAddress;
    /**
     * 企业负责人
     */
    @JsonProperty("responsiblePerson")
    private String responsiblePerson;
    /**
     * 企业名称
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 有效期限
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 住所
     */
    @JsonProperty("officeAddress")
    private String officeAddress;
    /**
     * 生产范围
     */
    @JsonProperty("productionScope")
    private String productionScope;
}
