package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:40
 */
@NoArgsConstructor
@Data
public class LabelInformation {
    /**
     * labelData
     */
    @JsonProperty("labelData")
    private String labelData;
    /**
     * labelFormat
     */
    @JsonProperty("labelFormat")
    private String labelFormat;
    /**
     * trackingCode
     */
    @JsonProperty("trackingCode")
    private String trackingCode;
    /**
     * referenceTrackingCode
     */
    @JsonProperty("referenceTrackingCode")
    private String referenceTrackingCode;
    /**
     * epTrackerId
     */
    @JsonProperty("epTrackerId")
    private String epTrackerId;
    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * packageAsn
     */
    @JsonProperty("packageAsn")
    private String packageAsn;
    /**
     * masterTrackingCode
     */
    @JsonProperty("masterTrackingCode")
    private String masterTrackingCode;
    /**
     * master
     */
    @JsonProperty("master")
    private Boolean master;
}
