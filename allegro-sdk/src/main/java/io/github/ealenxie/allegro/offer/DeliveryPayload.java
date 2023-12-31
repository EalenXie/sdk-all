package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 16:43
 */
@Getter
@Setter
public class DeliveryPayload {
    /**
     * additionalInfo
     */
    @JsonProperty("additionalInfo")
    private String additionalInfo;
    /**
     * handlingTime
     */
    @JsonProperty("handlingTime")
    private String handlingTime;
    /**
     * shippingRates
     */
    @JsonProperty("shippingRates")
    private IdPayload shippingRates;
    /**
     * shipmentDate
     */
    @JsonProperty("shipmentDate")
    private String shipmentDate;
}
