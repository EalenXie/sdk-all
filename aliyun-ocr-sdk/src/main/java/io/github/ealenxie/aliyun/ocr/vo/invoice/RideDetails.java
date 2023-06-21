package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 12:41
 */
@Getter
@Setter
public class RideDetails {

    /**
     * 序号
     */
    @JsonProperty("Number")
    private String number;
    /**
     * 车型
     */
    @JsonProperty("carType")
    private String carType;

    /**
     * 上车时间
     */
    @JsonProperty("pickUpTime")
    private String pickUpTime;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 起点
     */
    @JsonProperty("startPlace")
    private String startPlace;
    /**
     * 终点
     */
    @JsonProperty("endPlace")
    private String endPlace;
    /**
     * 里程
     */
    @JsonProperty("mileage")
    private String mileage;
    /**
     * 金额
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 备注
     */
    @JsonProperty("remarks")
    private String remarks;


}
