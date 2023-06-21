package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/6 10:09
 */
@Setter
@Getter
public class BirthCertification {
    /**
     * 新生儿姓名。
     */
    @JsonProperty("neonatalName")
    private String neonatalName;
    /**
     * 性别。
     */
    @JsonProperty("sex")
    private String sex;
    /**
     * 出生时间。
     */
    @JsonProperty("birthTime")
    private String birthTime;
    /**
     * 卡种。
     */
    @JsonProperty("gestationalAge")
    private String gestationalAge;
    /**
     * 出生体重。
     */
    @JsonProperty("birthWeight")
    private String birthWeight;
    /**
     * 出生身长。
     */
    @JsonProperty("birthLength")
    private String birthLength;
    /**
     * 出生地。
     */
    @JsonProperty("birthPlace")
    private String birthPlace;
    /**
     * 医疗机构名称。
     */
    @JsonProperty("medicalInstitutions")
    private String medicalInstitutions;
    /**
     * 母亲姓名。
     */
    @JsonProperty("motherName")
    private String motherName;
    /**
     * 母亲年龄。
     */
    @JsonProperty("motherAge")
    private String motherAge;
    /**
     * 母亲国籍。
     */
    @JsonProperty("motherNationality")
    private String motherNationality;
    /**
     * 母亲民族。
     */
    @JsonProperty("motherEthnicity")
    private String motherEthnicity;
    /**
     * 母亲住址。
     */
    @JsonProperty("motherAddress")
    private String motherAddress;
    /**
     * 母亲有效身份证件号。
     */
    @JsonProperty("motherIdCardNumber")
    private String motherIdCardNumber;
    /**
     * 父亲姓名。
     */
    @JsonProperty("fatherName")
    private String fatherName;
    /**
     * 父亲年龄。
     */
    @JsonProperty("fatherAge")
    private String fatherAge;
    /**
     * 父亲国籍。
     */
    @JsonProperty("fatherNationality")
    private String fatherNationality;
    /**
     * 父亲民族。
     */
    @JsonProperty("fatherEthnicity")
    private String fatherEthnicity;
    /**
     * 父亲住址。
     */
    @JsonProperty("fatherAddress")
    private String fatherAddress;
    /**
     * 父亲有效身份证件号。
     */
    @JsonProperty("fatherIdCardNumber")
    private String fatherIdCardNumber;
    /**
     * 签发机构。
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 签发日期。
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 编号。
     */
    @JsonProperty("certificateNumber")
    private String certificateNumber;

}
