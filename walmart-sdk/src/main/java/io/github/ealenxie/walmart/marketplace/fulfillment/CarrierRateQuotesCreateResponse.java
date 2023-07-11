package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 15:34
 */
@Getter
@Setter
public class CarrierRateQuotesCreateResponse {


    /**
     * shipmentId
     */
    @JsonProperty("shipmentId")
    private String shipmentId;
    /**
     * shipmentNumber
     */
    @JsonProperty("shipmentNumber")
    private String shipmentNumber;
    /**
     * rateQuotes
     */
    @JsonProperty("rateQuotes")
    private List<RateQuote> rateQuotes;
}
