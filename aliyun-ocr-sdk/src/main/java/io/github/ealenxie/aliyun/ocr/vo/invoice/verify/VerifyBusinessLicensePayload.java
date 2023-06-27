package io.github.ealenxie.aliyun.ocr.vo.invoice.verify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 17:22
 */
@Getter
@Setter
public class VerifyBusinessLicensePayload {
    /**
     * 企业注册号或统一社会信用代码
     */
    @JsonProperty("CreditCode")
    private String creditCode;
    /**
     * 企业名称
     */
    @JsonProperty("CompanyName")
    private String companyName;
    /**
     * 企业法人姓名
     */
    @JsonProperty("LegalPerson")
    private String legalPerson;

}
