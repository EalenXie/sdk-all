package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/24 10:33
 */
@Getter
@Setter
public class TrackingInfo {
    /**
     * shipDateTime
     */
    private Long shipDateTime;
    /**
     * carrierName
     */
    private CarrierName carrierName;
    /**
     * methodCode
     */
    private String methodCode;
    /**
     * trackingNumber
     */
    private String trackingNumber;
    /**
     * trackingURL
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingURL;
}
