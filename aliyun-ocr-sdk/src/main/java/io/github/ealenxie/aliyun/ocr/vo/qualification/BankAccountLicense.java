package io.github.ealenxie.aliyun.ocr.vo.qualification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 17:29
 */
@Getter
@Setter
public class BankAccountLicense {

    /**
     * 账号
     */
    @JsonProperty("bankAccount")
    private String bankAccount;
    /**
     * 法定代表人
     */
    @JsonProperty("legalRepresentative")
    private String legalRepresentative;
    /**
     * 开户银行
     */
    @JsonProperty("depositaryBank")
    private String depositaryBank;
    /**
     * 核准号
     */
    @JsonProperty("approvalNumber")
    private String approvalNumber;
    /**
     * 名称
     */
    @JsonProperty("customerName")
    private String customerName;
    /**
     * 编号
     */
    @JsonProperty("permitNumber")
    private String permitNumber;
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
}
