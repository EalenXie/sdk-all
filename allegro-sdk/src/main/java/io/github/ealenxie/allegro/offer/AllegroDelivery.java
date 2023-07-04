package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 15:17
 * @version 1.0
 */
@Getter
@Setter
public class AllegroDelivery {
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
    private Offer shippingRates;
    /**
     * shipmentDate
     */
    @JsonProperty("shipmentDate")
    private String shipmentDate;
}
