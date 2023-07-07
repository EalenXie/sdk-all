package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitAmount;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:02
 */
@Getter
@Setter
public class OrderLineStatus {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * statusQuantity
     */
    @JsonProperty("statusQuantity")
    private UnitAmount statusQuantity;
    /**
     * trackingInfo
     */
    @JsonProperty("trackingInfo")
    private TrackingInfo trackingInfo;
    /**
     * returnCenterAddress
     */
    @JsonProperty("returnCenterAddress")
    private ReturnCenterAddress returnCenterAddress;
}
