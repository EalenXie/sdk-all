package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 10:03
 */
@Getter
@Setter
public class PurchaseUnits {
    /**
     * referenceId
     */
    @JsonProperty("reference_id")
    private String referenceId;
    /**
     * payments
     */
    @JsonProperty("payments")
    private AuthorizationsResponse payments;
}
