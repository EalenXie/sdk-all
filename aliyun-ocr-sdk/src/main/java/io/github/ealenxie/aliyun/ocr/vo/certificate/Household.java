package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/4/6 9:48
 */
@Setter
@Getter
public class Household {
    /**
     * 地段号
     */
    @JsonProperty("sectionNo")
    private String sectionNo;
    /**
     * 户别
     */
    @JsonProperty("householdType")
    private String householdType;
    /**
     * 户主姓名
     */
    @JsonProperty("householderName")
    private String householderName;
    /**
     * 户主社区。
     */
    @JsonProperty("householderCommunity")
    private String householderCommunity;
    /**
     * 户号
     */
    @JsonProperty("householdNumber")
    private String householdNumber;
    /**
     * 住址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 承办人签章。
     */
    @JsonProperty("Registrar")
    private String registrar;
    /**
     * 签发日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
}
