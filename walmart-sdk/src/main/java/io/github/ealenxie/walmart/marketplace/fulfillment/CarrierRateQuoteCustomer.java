package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 15:20
 */
@Getter
@Setter
public class CarrierRateQuoteCustomer {
    /**
     * customerId
     */
    @JsonProperty("customerId")
    private String customerId;
    /**
     * customerName
     */
    @JsonProperty("customerName")
    private String customerName;
}
