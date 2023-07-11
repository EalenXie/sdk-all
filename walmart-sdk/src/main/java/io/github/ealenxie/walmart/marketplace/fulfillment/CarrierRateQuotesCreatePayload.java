package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 15:19
 */
@Getter
@Setter
public class CarrierRateQuotesCreatePayload {

    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * shipmentSource
     */
    @JsonProperty("shipmentSource")
    private String shipmentSource;
    /**
     * pickupFromDateTime
     */
    @JsonProperty("pickupFromDateTime")
    private String pickupFromDateTime;
    /**
     * pickupToDateTime
     */
    @JsonProperty("pickupToDateTime")
    private String pickupToDateTime;
    /**
     * deliveryFromDateTime
     */
    @JsonProperty("deliveryFromDateTime")
    private String deliveryFromDateTime;
    /**
     * deliveryToDateTime
     */
    @JsonProperty("deliveryToDateTime")
    private String deliveryToDateTime;
    /**
     * customer
     */
    @JsonProperty("customer")
    private CarrierRateQuoteCustomer customer;
    /**
     * originLocation
     */
    @JsonProperty("originLocation")
    private Location originLocation;
    /**
     * destinationLocation
     */
    @JsonProperty("destinationLocation")
    private Location destinationLocation;
    /**
     * returnLocation
     */
    @JsonProperty("returnLocation")
    private Location returnLocation;
    /**
     * shipmentPackages
     */
    @JsonProperty("shipmentPackages")
    private List<ShipmentPackage> shipmentPackages;
    /**
     * mode
     */
    @JsonProperty("mode")
    private String mode;
    /**
     * freightClass
     */
    @JsonProperty("freightClass")
    private String freightClass;
    /**
     * declaredValue
     */
    @JsonProperty("declaredValue")
    private Integer declaredValue;
    /**
     * loadTypes
     */
    @JsonProperty("loadTypes")
    private List<LoadTypes> loadTypes;
}
