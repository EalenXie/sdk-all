package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 11:15
 * 通用 机打发票
 */
@Getter
@Setter
public class CommonPrintedInvoice {

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
     * 机器编码
     */
    @JsonProperty("machineCode")
    private String machineCode;
    /**
     * 打印发票代码
     */
    @JsonProperty("printedInvoiceCode")
    private String printedInvoiceCode;
    /**
     * 打印发票号码
     */
    @JsonProperty("printedInvoiceNumber")
    private String printedInvoiceNumber;

    /**
     * 受票方名称
     */
    @JsonProperty("purchaserName")
    private String purchaserName;
    /**
     * 受票方识别号(纳税人识别号)
     */
    @JsonProperty("purchaserTaxNumber")
    private String purchaserTaxNumber;

    /**
     * 发票金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 销售方名称
     */
    @JsonProperty("sellerName")
    private String sellerName;
    /**
     * 销售方税号
     */
    @JsonProperty("sellerTaxNumber")
    private String sellerTaxNumber;

    /**
     * 收款人
     */
    @JsonProperty("recipient")
    private String recipient;

    /**
     * 开票人
     */
    @JsonProperty("drawer")
    private String drawer;
    /**
     * 备注
     */
    @JsonProperty("remarks")
    private String remarks;
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 发票联次
     */
    @JsonProperty("formType")
    private String formType;


    @JsonProperty("invoiceDetails")
    private List<CommonPrintedInvoiceDetails> invoiceDetails;
}
