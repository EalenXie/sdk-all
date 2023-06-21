package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:57
 */
@Getter
@Setter
public class CosmeticProduceLicense {

    /**
     * 证照名称
     */
    @JsonProperty("title")
    private String title;
    /**
     * 企业名称
     */
    @JsonProperty("enterpriseName")
    private String enterpriseName;
    /**
     * 社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;
    /**
     * 住址
     */
    @JsonProperty("officeAddress")
    private String officeAddress;
    /**
     * 法定代表人
     */
    @JsonProperty("legalRepresentative")
    private String legalRepresentative;
    /**
     * 法定代表人
     */
    @JsonProperty("responsiblePerson")
    private String responsiblePerson;
    /**
     * 质量安全负责人
     */
    @JsonProperty("safetyManager")
    private String safetyManager;
    /**
     * 生产地址
     */
    @JsonProperty("productionAddress")
    private String productionAddress;
    /**
     * 许可证编号
     */
    @JsonProperty("licenceNumber")
    private String licenceNumber;
    /**
     * 许可项目
     */
    @JsonProperty("licensedItemScope")
    private String licensedItemScope;
    /**
     * 日常监督管理机关
     */
    @JsonProperty("regulatoryAuthority")
    private String regulatoryAuthority;
    /**
     * 日常监督管理人员
     */
    @JsonProperty("regulatoryPersonnel")
    private String regulatoryPersonnel;
    /**
     * 投诉举报电话
     */
    @JsonProperty("reportHotline")
    private String reportHotline;
    /**
     * 签发人
     */
    @JsonProperty("issueOfficer")
    private String issueOfficer;
    /**
     * 发证机关
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 发证日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 有效期至
     */
    @JsonProperty("validToDate")
    private String validToDate;
}
