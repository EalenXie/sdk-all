package io.github.ealenxie.aliyun.ocr.vo.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/4/4 12:39
 */
@Getter
@Setter
public class RideHailingItinerary {

    /**
     * 服务商
     */
    @JsonProperty("serviceProvider")
    private String serviceProvider;
    /**
     * 申请日期
     */
    @JsonProperty("applicationDate")
    private String applicationDate;
    /**
     * 行程开始时间
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 行程结束时间
     */
    @JsonProperty("endTime")
    private String endTime;
    /**
     * 行程人手机号
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 总金额
     */
    @JsonProperty("totalAmount")
    private String totalAmount;
    /**
     * 行程详单
     */
    @JsonProperty("rideDetails")
    private List<RideDetails> rideDetails;
}
