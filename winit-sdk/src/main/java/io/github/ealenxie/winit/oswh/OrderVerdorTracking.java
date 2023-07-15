package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/15 13:49
 */
@NoArgsConstructor
@Data
public class OrderVerdorTracking {

    /**
     * masterOrderNo
     */
    @JsonProperty("masterOrderNo")
    private String masterOrderNo;
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
    private Object pickupMode;
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
    private Object isTracked;
    /**
     * podInfo
     */
    @JsonProperty("podInfo")
    private PodInfo podInfo;
}
