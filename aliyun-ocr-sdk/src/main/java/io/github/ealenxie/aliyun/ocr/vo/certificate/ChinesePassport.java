package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/4/6 10:21
 */
@Getter
@Setter
public class ChinesePassport {

    /**
     * 证件类型
     */
    @JsonProperty("passportType")
    private String passportType;
    /**
     * 国家码
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * 护照号码
     */
    @JsonProperty("passportNumber")
    private String passportNumber;
    /**
     * 英文姓名
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * 中文姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 性别
     */
    @JsonProperty("sex")
    private String sex;
    /**
     * 出生地
     */
    @JsonProperty("birthPlace")
    private String birthPlace;
    /**
     * 国籍
     */
    @JsonProperty("nationality")
    private String nationality;
    /**
     * 签发地
     */
    @JsonProperty("issuePlace")
    private String issuePlace;
    /**
     * 签发机关
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 机读码一
     */
    @JsonProperty("mrzLine1")
    private String mrzLine1;
    /**
     * 机读码二
     */
    @JsonProperty("mrzLine2")
    private String mrzLine2;
    /**
     * 有效期至
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 出生日期
     */
    @JsonProperty("birthDate")
    private String birthDate;
    /**
     * 签发日期
     */
    @JsonProperty("issueDate")
    private String issueDate;

}
