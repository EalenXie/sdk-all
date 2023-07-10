package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 15:20
 */
@NoArgsConstructor
@Data
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
