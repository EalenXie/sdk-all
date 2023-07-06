package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:02
 */
@NoArgsConstructor
@Data
public class TrackingInfo {
    /**
     * shipDateTime
     */
    @JsonProperty("shipDateTime")
    private Long shipDateTime;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private CarrierName carrierName;
    /**
     * methodCode
     */
    @JsonProperty("methodCode")
    private String methodCode;
    /**
     * trackingNumber
     */
    @JsonProperty("trackingNumber")
    private String trackingNumber;
    /**
     * trackingURL
     */
    @JsonProperty("trackingURL")
    private String trackingURL;
}
