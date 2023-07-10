package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 15:44
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentIdPayload {

    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
}
