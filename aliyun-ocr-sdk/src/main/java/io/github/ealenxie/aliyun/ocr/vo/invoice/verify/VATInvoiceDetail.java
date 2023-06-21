package io.github.ealenxie.aliyun.ocr.vo.invoice.verify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 17:27
 */
@Getter
@Setter
public class VATInvoiceDetail {
    /**
     * allTax
     */
    @JsonProperty("allTax")
    private String allTax;
    /**
     * detailAmount
     */
    @JsonProperty("detailAmount")
    private String detailAmount;
    /**
     * detailNo
     */
    @JsonProperty("detailNo")
    private String detailNo;
    /**
     * expenseItem
     */
    @JsonProperty("expenseItem")
    private String expenseItem;
    /**
     * goodsName
     */
    @JsonProperty("goodsName")
    private String goodsName;
    /**
     * netValue
     */
    @JsonProperty("netValue")
    private String netValue;
    /**
     * num
     */
    @JsonProperty("num")
    private String num;
    /**
     * plateNo
     */
    @JsonProperty("plate_no")
    private String plateNo;
    /**
     * rowNo
     */
    @JsonProperty("rowNo")
    private String rowNo;
    /**
     * standard
     */
    @JsonProperty("standard")
    private String standard;
    /**
     * taxClassifyCode
     */
    @JsonProperty("taxClassifyCode")
    private String taxClassifyCode;
    /**
     * taxDetailAmount
     */
    @JsonProperty("taxDetailAmount")
    private String taxDetailAmount;
    /**
     * taxRate
     */
    @JsonProperty("taxRate")
    private String taxRate;
    /**
     * taxUnitPrice
     */
    @JsonProperty("taxUnitPrice")
    private String taxUnitPrice;
    /**
     * trafficDateEnd
     */
    @JsonProperty("trafficDateEnd")
    private String trafficDateEnd;
    /**
     * trafficDateStart
     */
    @JsonProperty("trafficDateStart")
    private String trafficDateStart;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
}
