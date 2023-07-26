package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/26 18:08
 */
@Setter
@Getter
public class PayPalPayload<T> {
    @JsonProperty("paypal")
    private T paypal;
}
