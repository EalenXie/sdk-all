package io.github.ealenxie.wish.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 10:24
 * @version 1.0
 */
@Setter
@Getter
public class ShippingOptionPayload {

    /**
     * maxDaysToDeliver
     */
    @JsonProperty("max_days_to_deliver")
    private Integer maxDaysToDeliver;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * price
     */
    @JsonProperty("price")
    private Money price;
    /**
     * minDaysToDeliver
     */
    @JsonProperty("min_days_to_deliver")
    private Integer minDaysToDeliver;
    /**
     * daysToDeliver
     */
    @JsonProperty("days_to_deliver")
    private Integer daysToDeliver;
    /**
     * additionalTrackingServices
     */
    @JsonProperty("additional_tracking_services")
    private List<AdditionalTrackingServices> additionalTrackingServices;
    /**
     * carrier
     */
    @JsonProperty("carrier")
    private String carrier;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
