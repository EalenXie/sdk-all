package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 15:33
 */
@Getter
@Setter
public class OrderDetailsResponse {

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
     * intent
     */
    @JsonProperty("intent")
    private String intent;
    /**
     * paymentSource
     */
    @JsonProperty("payment_source")
    private PayPalPayload<PaymentSource> paymentSource;
    /**
     * purchaseUnits
     */
    @JsonProperty("purchase_units")
    private List<PurchaseUnit> purchaseUnits;
    /**
     * payer
     */
    @JsonProperty("payer")
    private Payer payer;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
