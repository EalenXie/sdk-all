package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 10:39
 */
@Getter
@Setter
public class UpdatedShipmentQtyPayload {

    /**
     * inboundOrderId
     */
    @JsonProperty("inboundOrderId")
    private String inboundOrderId;
    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * orderItems
     */
    @JsonProperty("orderItems")
    private List<UpdatedShipmentQtyItem> orderItems;
}
