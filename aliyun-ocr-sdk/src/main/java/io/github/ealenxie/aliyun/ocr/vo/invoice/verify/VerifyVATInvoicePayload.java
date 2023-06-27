package io.github.ealenxie.aliyun.ocr.vo.invoice.verify;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 17:29
 */
@Getter
@Setter
public class VerifyVATInvoicePayload {

    /**
     * 发票代码。全电发票（发票类型代码为31，32）时可为空（发票类型代码见请求参数补充说明）
     */
    @JsonProperty("InvoiceCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String invoiceCode;

    /**
     * 发票号码
     */
    @JsonProperty("InvoiceNo")
    private String invoiceNo;

    /**
     * 开票日期（日期格式为：YYYYMMDD）。
     */
    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    /**
     * 发票类型代码为 01，03，15，20，31，32 时必填：为 01，03，20 时填写发票不含税金额；为 15 时填写发票车价合计；为 31，32 时填写含税金额。 其它类型可为空（发票类型代码见请求参数补充说明）。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("InvoiceSum")
    private String invoiceSum;

    /**
     * 机器验证码，取后6位。发票类型代码为 04，10，11，14 时必填，其他发票种类可为空（发票类型代码见请求参数补充说明）。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("VerifyCode")
    private String verifyCode;

}
