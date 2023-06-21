package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:37
 */
@Getter
@Setter
public class FoodProduceLicense {
    /**
     * 生产者名称
     */
    @JsonProperty("producerName")
    private String producerName;
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
     * 生产地址
     */
    @JsonProperty("productionAddress")
    private String productionAddress;
    /**
     * 食品类别
     */
    @JsonProperty("foodType")
    private String foodType;
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
     * 投诉举报电话
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
     * 签发人
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 有效期至
     */
    @JsonProperty("validToDate")
    private String validToDate;
}
