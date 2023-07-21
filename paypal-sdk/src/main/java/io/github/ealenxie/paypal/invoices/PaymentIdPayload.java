package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/21 10:51
 */
@NoArgsConstructor
@Data
public class PaymentIdPayload {

    /**
     * paymentId
     */
    @JsonProperty("payment_id")
    private String paymentId;
}
