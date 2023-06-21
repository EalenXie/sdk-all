package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 16:34
 */
@Getter
@Setter
public class Passport {


    /**
     * 证件类型
     */
    @JsonProperty("passportType")
    private String passportType;
    /**
     * 国家码
     */
    @JsonProperty("nationality")
    private String nationality;
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
     * 非英文姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 性别
     */
    @JsonProperty("sex")
    private String sex;
    /**
     * 出生地英文
     */
    @JsonProperty("birthPlaceEn")
    private String birthPlaceEn;
    /**
     * 非英文出生地
     */
    @JsonProperty("birthPlace")
    private String birthPlace;
    /**
     * 国籍
     */
    @JsonProperty("country")
    private String country;
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
     * 出生日期-年月日
     */
    @JsonProperty("birthDateYmd")
    private String birthDateYmd;
    /**
     * 签发日期
     */
    @JsonProperty("issueDateYmd")
    private String issueDateYmd;
    /**
     * 签发地
     */
    @JsonProperty("issuePlaceEn")
    private String issuePlaceEn;
    /**
     * 非英文签发地
     */
    @JsonProperty("issuePlace")
    private String issuePlace;
    /**
     * 签发机关
     */
    @JsonProperty("issueAuthorityEn")
    private String issueAuthorityEn;
    /**
     * 非英文签发机关
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 身份号
     */
    @JsonProperty("idNumber")
    private String idNumber;
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
     * 姓
     */
    @JsonProperty("surname")
    private String surname;
    /**
     * 名
     */
    @JsonProperty("givenName")
    private String givenName;
}
