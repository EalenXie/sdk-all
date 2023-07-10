package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 14:38
 */
@Getter
@Setter
public class CarrierRateQuoteQueryParams {

    @JsonProperty("shipmentId")
    private String shipmentId;
    @JsonProperty("mode")
    private String mode;
}
