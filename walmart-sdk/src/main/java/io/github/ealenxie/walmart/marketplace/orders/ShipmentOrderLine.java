package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:02
 */
@Getter
@Setter
public class ShipmentOrderLine {
    /**
     * lineNumber
     */
    @JsonProperty("lineNumber")
    private String lineNumber;
    /**
     * intentToCancelOverride
     */
    @JsonProperty("intentToCancelOverride")
    private Boolean intentToCancelOverride;
    /**
     * sellerOrderId
     */
    @JsonProperty("sellerOrderId")
    private String sellerOrderId;
    /**
     * orderLineStatuses
     */
    @JsonProperty("orderLineStatuses")
    private OrderLineStatuses orderLineStatuses;
}
