package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/4/3 12:58
 * 航班详单
 */
@Getter
@Setter
public class Flight {
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
     * 承运人
     */
    @JsonProperty("carrier")
    private String carrier;
    /**
     * 航班号
     */
    @JsonProperty("flightNumber")
    private String flightNumber;
    /**
     * 舱位等级
     */
    @JsonProperty("cabinClass")
    private String cabinClass;
    /**
     * 乘机日期
     */
    @JsonProperty("flightDate")
    private String flightDate;
    /**
     * 乘机时间
     */
    @JsonProperty("flightTime")
    private String flightTime;
    /**
     * 座位等级
     */
    @JsonProperty("seatClass")
    private String seatClass;
    /**
     * 客票生效日期
     */
    @JsonProperty("validFromDate")
    private String validFromDate;
    /**
     * 有效截止日期
     */
    @JsonProperty("validToDate")
    private String validToDate;
    /**
     * 免费行李
     */
    @JsonProperty("freeBaggageAllowance")
    private String freeBaggageAllowance;
}
