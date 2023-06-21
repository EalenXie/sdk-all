package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 13:04
 */
@Getter
@Setter
public class TaxClearanceDetails {
    /**
     * 原凭证号
     */
    @JsonProperty("voucherNumber")
    private String voucherNumber;
    /**
     * 税种
     */
    @JsonProperty("taxType")
    private String taxType;
    /**
     * 品目名称
     */
    @JsonProperty("itemName")
    private String itemName;
    /**
     * 税款所属期
     */
    @JsonProperty("taxPeriod")
    private String taxPeriod;
    /**
     * 入（退）库时间
     */
    @JsonProperty("date")
    private String date;
    /**
     * 实缴（退）金额
     */
    @JsonProperty("amount")
    private String amount;
}
