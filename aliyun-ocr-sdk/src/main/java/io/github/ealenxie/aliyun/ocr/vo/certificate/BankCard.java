package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/4/6 10:07
 */
@Setter
@Getter
public class BankCard {
    /**
     * 卡种。
     */
    @JsonProperty("cardType")
    private String cardType;
    /**
     * 银行名称。
     */
    @JsonProperty("bankName")
    private String bankName;
    /**
     * 银行卡号。
     */
    @JsonProperty("cardNumber")
    private String cardNumber;
    /**
     * 有效期限。
     */
    @JsonProperty("validToDate")
    private String validToDate;

}
