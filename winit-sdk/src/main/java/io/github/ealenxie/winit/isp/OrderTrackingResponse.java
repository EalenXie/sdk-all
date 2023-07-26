package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 17:27
 */
@Getter
@Setter
public class OrderTrackingResponse {

    /**
     * masterOrderNo
     */
    @JsonProperty("masterOrderNo")
    private String masterOrderNo;
    /**
     * 订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 追踪号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * 起始地
     */
    @JsonProperty("origin")
    private String origin;
    /**
     * 目的地
     */
    @JsonProperty("destination")
    private String destination;
    /**
     * 揽收方式
     */
    @JsonProperty("pickupMode")
    private String pickupMode;
    /**
     * 最新轨迹状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * vendorName
     */
    @JsonProperty("vendorName")
    private String vendorName;
    /**
     * 轨迹详情列表
     */
    @JsonProperty("trace")
    private List<Trace> trace;
    /**
     * occurTime
     */
    @JsonProperty("occurTime")
    private String occurTime;
    /**
     * logisticsStatus
     */
    @JsonProperty("logisticsStatus")
    private String logisticsStatus;
    /**
     * logisticsMess
     */
    @JsonProperty("logisticsMess")
    private String logisticsMess;
    /**
     * airLines
     */
    @JsonProperty("airLines")
    private String airLines;
    /**
     * flight
     */
    @JsonProperty("flight")
    private String flight;
    /**
     * expressCompany
     */
    @JsonProperty("expressCompany")
    private String expressCompany;
    /**
     * carrier
     */
    @JsonProperty("carrier")
    private String carrier;
    /**
     * carrierCode
     */
    @JsonProperty("carrierCode")
    private String carrierCode;
    /**
     * standardCarrier
     */
    @JsonProperty("standardCarrier")
    private String standardCarrier;
    /**
     * trackingUrl
     */
    @JsonProperty("trackingUrl")
    private String trackingUrl;
    /**
     * isTracked
     */
    @JsonProperty("isTracked")
    private String isTracked;
}
