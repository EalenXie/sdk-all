package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/6 10:29
 */
@Getter
@Setter
public class ExitEntryPermitToMainland {
    /**
     * 证件类别
     */
    @JsonProperty("permitType")
    private String permitType;
    /**
     * 中文姓名
     */
    @JsonProperty("nameCn")
    private String nameCn;
    /**
     * 英文姓名
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * 出生日期
     */
    @JsonProperty("birthDate")
    private String birthDate;
    /**
     * 性别
     */
    @JsonProperty("sex")
    private String sex;
    /**
     * 有效期限
     */
    @JsonProperty("validPeriod")
    private String validPeriod;
    /**
     * 签发机关。
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 签发地点
     */
    @JsonProperty("issuePlace")
    private String issuePlace;
    /**
     * 证件号码
     */
    @JsonProperty("permitNumber")
    private String permitNumber;
    /**
     * 签发次数
     */
    @JsonProperty("issueCount")
    private String issueCount;
}
