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
public class CustomerPaymentTokenPayload {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * customer
     */
    @JsonProperty("customer")
    private Customer customer;
    /**
     * paymentSource
     */
    @JsonProperty("payment_source")
    private PaymentSourceCard paymentSource;
    /**
     * links
     */
    @JsonProperty("links")
    private List<PaymentLink> links;
}
