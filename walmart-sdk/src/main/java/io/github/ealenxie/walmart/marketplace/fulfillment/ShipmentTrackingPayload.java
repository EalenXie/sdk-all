package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 11:14
 */
@NoArgsConstructor
@Data
public class ShipmentTrackingPayload {

    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * carrierName
     */
    @JsonProperty("carrierName")
    private String carrierName;
    /**
     * trackingInfo
     */
    @JsonProperty("trackingInfo")
    private List<String> trackingInfo;
}
