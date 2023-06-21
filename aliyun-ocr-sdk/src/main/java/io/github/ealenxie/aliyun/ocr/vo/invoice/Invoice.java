package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/4/1 15:51
 * 增值税发票
 */
@Getter
@Setter
public class Invoice {

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
     * 校验码
     */
    @JsonProperty("checkCode")
    private String checkCode;
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
     * 受票方联系信息(地址电话)
     */
    @JsonProperty("purchaserContactInfo")
    private String purchaserContactInfo;
    /**
     * 受票方开户行及账号
     */
    @JsonProperty("purchaserBankAccountInfo")
    private String purchaserBankAccountInfo;
    /**
     * 密码区
     */
    @JsonProperty("passwordArea")
    private String passwordArea;

    /**
     * 不含税金额
     */
    @JsonProperty("invoiceAmountPreTax")
    private String invoiceAmountPreTax;
    /**
     * 发票税额
     */
    @JsonProperty("invoiceTax")
    private String invoiceTax;
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
     * 销售方地址、电话
     */
    @JsonProperty("sellerContactInfo")
    private String sellerContactInfo;
    /**
     * 销售方开户行、账号
     */
    @JsonProperty("sellerBankAccountInfo")
    private String sellerBankAccountInfo;
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
    /**
     * 发票类型
     */
    @JsonProperty("invoiceType")
    private String invoiceType;

    @JsonProperty("specialTag")
    private String specialTag;
    /**
     * 发票详单
     * {@link InvoiceDetails}
     */
    @JsonProperty("invoiceDetails")
    private List<InvoiceDetails> invoiceDetails;
}
