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
    private Object masterOrderNo;
    /**
     * orderNo
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * trackingNo
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
    /**
     * origin
     */
    @JsonProperty("origin")
    private String origin;
    /**
     * destination
     */
    @JsonProperty("destination")
    private String destination;
    /**
     * pickupMode
     */
    @JsonProperty("pickupMode")
    private String pickupMode;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * vendorName
     */
    @JsonProperty("vendorName")
    private Object vendorName;
    /**
     * trace
     */
    @JsonProperty("trace")
    private List<Trace> trace;
    /**
     * occurTime
     */
    @JsonProperty("occurTime")
    private Object occurTime;
    /**
     * logisticsStatus
     */
    @JsonProperty("logisticsStatus")
    private Object logisticsStatus;
    /**
     * logisticsMess
     */
    @JsonProperty("logisticsMess")
    private Object logisticsMess;
    /**
     * airLines
     */
    @JsonProperty("airLines")
    private Object airLines;
    /**
     * flight
     */
    @JsonProperty("flight")
    private Object flight;
    /**
     * expressCompany
     */
    @JsonProperty("expressCompany")
    private Object expressCompany;
    /**
     * carrier
     */
    @JsonProperty("carrier")
    private Object carrier;
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
