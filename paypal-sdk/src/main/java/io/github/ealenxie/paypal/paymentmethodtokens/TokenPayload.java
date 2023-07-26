package io.github.ealenxie.paypal.paymentmethodtokens;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 16:44
 * @version 1.0
 */
@Getter
@Setter
public class TokenPayload {

    /**
     * paymentSource
     */
    @JsonProperty("payment_source")
    private PaymentSourceToken paymentSource;
}
