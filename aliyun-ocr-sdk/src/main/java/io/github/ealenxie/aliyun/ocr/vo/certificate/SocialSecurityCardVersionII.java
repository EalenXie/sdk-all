package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/4/6 10:38
 */
@Getter
@Setter
public class SocialSecurityCardVersionII {
    /**
     * 银行账号
     */
    @JsonProperty("bankAccount")
    private String bankAccount;
    /**
     * 社保保障卡号
     */
    @JsonProperty("cardNumber")
    private String cardNumber;
    /**
     * 社会保障号码
     */
    @JsonProperty("idNumber")
    private String idNumber;
    /**
     * 发卡日期
     */
    @JsonProperty("issueDate")
    private String issueDate;
    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 有效期限
     */
    @JsonProperty("validPeriod")
    private String validPeriod;
}
