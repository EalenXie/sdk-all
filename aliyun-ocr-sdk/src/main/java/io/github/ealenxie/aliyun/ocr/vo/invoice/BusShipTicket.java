package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/4/4 10:30
 */
@Getter
@Setter
public class BusShipTicket {

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
     * 出发车站
     */
    @JsonProperty("departureStation")
    private String departureStation;
    /**
     * 达到车站
     */
    @JsonProperty("arrivalStation")
    private String arrivalStation;
    /**
     * 总金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 姓名
     */
    @JsonProperty("passengerName")
    private String passengerName;
    /**
     * 身份证号
     */
    @JsonProperty("idcardNo")
    private String idcardNo;
}
