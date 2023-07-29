package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 10:03
 */
@Getter
@Setter
public class AuthorizePaymentOrderResponse {


    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * paymentSource
     */
    @JsonProperty("payment_source")
    private PayPalPayload<PaymentSource> paymentSource;
    /**
     * purchaseUnits
     */
    @JsonProperty("purchase_units")
    private List<PurchaseUnits> purchaseUnits;
    /**
     * payer
     */
    @JsonProperty("payer")
    private Payer payer;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
