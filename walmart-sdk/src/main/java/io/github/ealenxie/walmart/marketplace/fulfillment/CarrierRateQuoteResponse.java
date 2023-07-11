package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 14:39
 */
@Getter
@Setter
public class CarrierRateQuoteResponse {


    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * quoteId
     */
    @JsonProperty("quoteId")
    private String quoteId;
    /**
     * estimatedDeliveryDateTime
     */
    @JsonProperty("estimatedDeliveryDateTime")
    private String estimatedDeliveryDateTime;
    /**
     * quoteCreationDate
     */
    @JsonProperty("quoteCreationDate")
    private String quoteCreationDate;
    /**
     * carrier
     */
    @JsonProperty("carrier")
    private Carrier carrier;
    /**
     * rateQuote
     */
    @JsonProperty("rateQuote")
    private RateQuote rateQuote;
    /**
     * shipmentPackages
     */
    @JsonProperty("shipmentPackages")
    private List<ShipmentPackage> shipmentPackages;
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
}
