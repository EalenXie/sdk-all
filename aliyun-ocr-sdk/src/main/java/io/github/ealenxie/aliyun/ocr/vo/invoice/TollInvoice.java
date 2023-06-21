package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 12:59
 */
@Getter
@Setter
public class TollInvoice {
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;
    /**
     * 联次
     */
    @JsonProperty("formType")
    private String formType;
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
     * 日期
     */
    @JsonProperty("date")
    private String date;
    /**
     * 时间
     */
    @JsonProperty("time")
    private String time;
    /**
     * 车型
     */
    @JsonProperty("vehicleType")
    private String vehicleType;
    /**
     * 入口
     */
    @JsonProperty("entranceName")
    private String entranceName;
    /**
     * 出口
     */
    @JsonProperty("exitName")
    private String exitName;
    /**
     * 总金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
}
