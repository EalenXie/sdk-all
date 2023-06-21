package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/4/3 18:09
 */
@Getter
@Setter
public class TrainInvoice {
    /**
     * 出发站
     */
    @JsonProperty("departureStation")
    private String departureStation;
    /**
     * 到达站
     */
    @JsonProperty("arrivalStation")
    private String arrivalStation;
    /**
     * 车次
     */
    @JsonProperty("trainNumber")
    private String trainNumber;
    /**
     * 开车时间
     */
    @JsonProperty("departureTime")
    private String departureTime;
    /**
     * 座位号
     */
    @JsonProperty("seatNumber")
    private String seatNumber;
    /**
     * 票价
     */
    @JsonProperty("fare")
    private String fare;
    /**
     * 座位类型
     */
    @JsonProperty("seatType")
    private String seatType;
    /**
     * 旅客信息
     */
    @JsonProperty("passengerInfo")
    private String passengerInfo;
    /**
     * 旅客姓名
     */
    @JsonProperty("passengerName")
    private String passengerName;
    /**
     * 票号
     */
    @JsonProperty("ticketNumber")
    private String ticketNumber;
    /**
     * 售票码
     */
    @JsonProperty("ticketCode")
    private String ticketCode;
    /**
     * 售票车站信息
     */
    @JsonProperty("saleInfo")
    private String saleInfo;
    /**
     * 检票口
     */
    @JsonProperty("ticketGate")
    private String ticketGate;
}
