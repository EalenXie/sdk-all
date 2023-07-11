package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 11:18
 */
@Getter
@Setter
public class ShipmentLabelPayload {

    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * labelSize
     */
    @JsonProperty("labelSize")
    private String labelSize;
    /**
     * labelFormat
     */
    @JsonProperty("labelFormat")
    private String labelFormat;
    /**
     * loadTypes
     */
    @JsonProperty("loadTypes")
    private List<LoadTypes> loadTypes;
}
