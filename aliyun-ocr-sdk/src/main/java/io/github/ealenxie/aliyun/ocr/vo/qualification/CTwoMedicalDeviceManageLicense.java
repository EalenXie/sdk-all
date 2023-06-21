package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:54
 */
@Getter
@Setter
public class CTwoMedicalDeviceManageLicense {
    /**
     * 备案编号
     */
    @JsonProperty("recordNumber")
    private String recordNumber;
    /**
     * 企业名称
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 住所
     */
    @JsonProperty("officeAddress")
    private String officeAddress;
    /**
     * 经营场所
     */
    @JsonProperty("businessAddress")
    private String businessAddress;
    /**
     * 库房地址
     */
    @JsonProperty("warehouseAddress")
    private String warehouseAddress;
    /**
     * 经营方式
     */
    @JsonProperty("businessType")
    private String businessType;
    /**
     * 经营方式
     */
    @JsonProperty("legalRepresentative")
    private String legalRepresentative;
    /**
     * 企业负责人
     */
    @JsonProperty("responsiblePerson")
    private String responsiblePerson;
    /**
     * 经营范围
     */
    @JsonProperty("businessScope")
    private String businessScope;
    /**
     * 备案部门
     */
    @JsonProperty("recordationAuthority")
    private String recordationAuthority;
    /**
     * 备案日期
     */
    @JsonProperty("recordationDate")
    private String recordationDate;
}
