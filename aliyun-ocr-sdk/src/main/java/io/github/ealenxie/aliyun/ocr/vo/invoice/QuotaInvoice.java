package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/4/3 12:35
 * 定额发票
 */
@Getter
@Setter
public class QuotaInvoice {


    /**
     * 发票代码
     */
    @JsonProperty("invoiceCode")
    private String invoiceCode;
    /**
     * 发票号码
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    /**
     * 大写金额
     */
    @JsonProperty("AmountInWords")
    private String amountInWords;
    /**
     * 小写金额
     */
    @JsonProperty("Amount")
    private String amount;
    /**
     * 发票标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 联次
     */
    @JsonProperty("formType")
    private String formType;
}
