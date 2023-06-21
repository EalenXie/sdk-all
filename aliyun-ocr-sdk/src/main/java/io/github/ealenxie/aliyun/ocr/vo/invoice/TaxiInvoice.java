package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/4/4 9:51
 */
@Getter
@Setter
public class TaxiInvoice {

    /**
     * 车牌号
     */
    @JsonProperty("licensePlateNumber")
    private String licensePlateNumber;
    /**
     * 乘车日期
     */
    @JsonProperty("date")
    private String date;
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
     * 里程
     */
    @JsonProperty("mileage")
    private String mileage;
    /**
     * 金额
     */
    @JsonProperty("fare")
    private String fare;
    /**
     * 下车时间
     */
    @JsonProperty("dropOffTime")
    private String dropOffTime;
    /**
     * 上车时间
     */
    @JsonProperty("pickUpTime")
    private String pickUpTime;


}
