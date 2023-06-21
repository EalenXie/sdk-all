package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 14:57
 */
@Getter
@Setter
public class FulfillmentDTO {


    /**
     * 状态
     * Enum：NEW、PROCESSING、READY_FOR_SHIPMENT、READY_FOR_PICKUP、SENT、PICKED_UP、CANCELLED、SUSPENDED
     */
    @JsonProperty("status")
    private String status;
    @JsonProperty("shipmentSummary")
    private ShipmentSummary shipmentSummary;
}
