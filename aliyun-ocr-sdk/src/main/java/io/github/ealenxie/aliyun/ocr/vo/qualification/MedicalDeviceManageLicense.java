package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:45
 */
@Getter
@Setter
public class MedicalDeviceManageLicense {


    /**
     * 证照标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 许可证编号
     */
    @JsonProperty("licenseNumber")
    private String licenseNumber;
    /**
     * 企业名称
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 经营方式
     */
    @JsonProperty("businessType")
    private String businessType;
    /**
     * 住所
     */
    @JsonProperty("officeAddress")
    private String officeAddress;
    /**
     * 经营范围
     */
    @JsonProperty("businessScope")
    private String businessScope;
    /**
     * 经营场所
     */
    @JsonProperty("businessAddress")
    private String businessAddress;
    /**
     * 库房/仓库地址
     */
    @JsonProperty("warehouseAddress")
    private String warehouseAddress;
    /**
     * 发证日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
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
     * 企业负责人
     */
    @JsonProperty("responsiblePerson")
    private String responsiblePerson;
    /**
     * 质量管理人
     */
    @JsonProperty("qualityManager")
    private String qualityManager;
    /**
     * 注册地址
     */
    @JsonProperty("registeredAddress")
    private String registeredAddress;
    /**
     * 有效期限/许可期限
     */
    @JsonProperty("validToDate")
    private String validToDate;
}
