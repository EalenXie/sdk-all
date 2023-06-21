package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/4/4 11:00
 */
@Getter
@Setter
public class NonTaxInvoice {
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
     * 开票日期
     */
    @JsonProperty("invoiceDate")
    private String invoiceDate;
    /**
     * 大写金额
     */
    @JsonProperty("totalAmountInWords")
    private String totalAmountInWords;
    /**
     * 发票金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 收款人
     */
    @JsonProperty("recipient")
    private String recipient;
    /**
     * 复核人
     */
    @JsonProperty("reviewer")
    private String reviewer;
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 交款人统一社会信用代码
     */
    @JsonProperty("payerCreditCode")
    private String payerCreditCode;
    /**
     * 交款人
     */
    @JsonProperty("payerName")
    private String payerName;
    /**
     * 校验码
     */
    @JsonProperty("validationCode")
    private String validationCode;
    /**
     * 其他信息
     */
    @JsonProperty("additionalInfo")
    private String additionalInfo;
    /**
     * 收款单位
     */
    @JsonProperty("payeeName")
    private String payeeName;

    @JsonProperty("invoiceDetails")
    private List<NonTaxInvoiceDetails> invoiceDetails;
}
