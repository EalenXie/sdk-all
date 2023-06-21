package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:41
 */
@Getter
@Setter
public class FoodManageLicense {
    /**
     * 经营者名称
     */
    @JsonProperty("operatorName")
    private String operatorName;
    /**
     * 社会信用代码（身份证号码）
     */
    @JsonProperty("creditCode")
    private String creditCode;
    /**
     * 法定代表人（负责人）
     */
    @JsonProperty("legalRepresentative")
    private String legalRepresentative;
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
     * 主体业态
     */
    @JsonProperty("mainBusiness")
    private String mainBusiness;
    /**
     * 经营项目
     */
    @JsonProperty("businessScope")
    private String businessScope;
    /**
     * 许可证编号
     */
    @JsonProperty("licenceNumber")
    private String licenceNumber;
    /**
     * 日常监督管理机构
     */
    @JsonProperty("regulatoryAuthority")
    private String regulatoryAuthority;
    /**
     * 日常监督管理人员
     */
    @JsonProperty("regulatoryPersonnel")
    private String regulatoryPersonnel;
    /**
     * 日常监督管理人员
     */
    @JsonProperty("reportHotline")
    private String reportHotline;
    /**
     * 发证机关
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 签发人
     */
    @JsonProperty("issueOfficer")
    private String issueOfficer;
    /**
     * 签发日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 格式化签发日期
     */
    @JsonProperty("standardizedIssueDate")
    private String standardizedIssueDate;
    /**
     * 有效期至
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 格式化有效期至
     */
    @JsonProperty("standardizedValidToDate")
    private String standardizedValidToDate;
}
