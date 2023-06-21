package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 12:55
 */
@Getter
@Setter
public class SocialSecurityCard {
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 社会保障号码
     */
    @JsonProperty("idNumber")
    private String idNumber;
    /**
     * 社保保障卡号
     */
    @JsonProperty("cardNumber")
    private String cardNumber;
    /**
     * 银行账号
     */
    @JsonProperty("bankAccount")
    private String bankAccount;
    /**
     * 发卡日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 有效期限
     */
    @JsonProperty("validPeriod")
    private String validPeriod;
}
