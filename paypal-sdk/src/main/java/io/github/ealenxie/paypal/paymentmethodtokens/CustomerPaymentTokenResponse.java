package io.github.ealenxie.paypal.paymentmethodtokens;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/26 16:13
 * @version 1.0
 */
@Getter
@Setter
public class CustomerPaymentTokenResponse {

    /**
     * customer
     */
    @JsonProperty("customer")
    private Customer customer;
    /**
     * paymentTokens
     */
    @JsonProperty("payment_tokens")
    private List<CustomerPaymentTokenPayload> paymentTokens;
    /**
     * links
     */
    @JsonProperty("links")
    private List<PaymentLink> links;
}
