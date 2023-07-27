package io.github.ealenxie.paypal.paymentmethodtokens;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/26 16:50
 * @version 1.0
 */
@Getter
@Setter
public class TokenResponse {

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
     * status
     */
    @JsonProperty("status")
    private String status;
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
