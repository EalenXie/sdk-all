package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@Getter
@Setter
public class ShipmentLine {
    /**
     * shipmentLineNo
     */
    @JsonProperty("shipmentLineNo")
    private String shipmentLineNo;
    /**
     * fulfillerLineId
     */
    @JsonProperty("fulfillerLineId")
    private String fulfillerLineId;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Qty quantity;
}
