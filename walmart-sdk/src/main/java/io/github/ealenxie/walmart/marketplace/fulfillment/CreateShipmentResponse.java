package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 14:14
 */
@NoArgsConstructor
@Data
public class CreateShipmentResponse {

    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * shipToAddress
     */
    @JsonProperty("shipToAddress")
    private ShipToAddress shipToAddress;
    /**
     * shipmentItems
     */
    @JsonProperty("shipmentItems")
    private List<ShipmentItem> shipmentItems;
    /**
     * expectedDeliveryDate
     */
    @JsonProperty("expectedDeliveryDate")
    private String expectedDeliveryDate;
}
