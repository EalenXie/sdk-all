package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/21 10:51
 */
@Getter
@Setter
public class PaymentIdPayload {

    /**
     * paymentId
     */
    @JsonProperty("payment_id")
    private String paymentId;
}
