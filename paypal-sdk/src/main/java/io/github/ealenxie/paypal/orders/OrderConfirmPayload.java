package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 9:57
 */
@Getter
@Setter
public class OrderConfirmPayload {


    /**
     * paymentSource
     */
    @JsonProperty("payment_source")
    private PayPalPayload<Paypal> paymentSource;
}
