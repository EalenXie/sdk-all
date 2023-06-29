package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 11:00
 */
@Getter
@Setter
public class CarriersTrackingWaybill {
    /**
     * waybill
     */
    @JsonProperty("waybill")
    private String waybill;
    /**
     * trackingDetails
     */
    @JsonProperty("trackingDetails")
    private TrackingDetails trackingDetails;
}
