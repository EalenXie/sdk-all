package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 15:27
 */
@Getter
@Setter
public class CreateOrderPayload {
    /**
     * intent
     */
    @JsonProperty("intent")
    private String intent;
    /**
     * purchaseUnits
     */
    @JsonProperty("purchase_units")
    private List<PurchaseUnit> purchaseUnits;
    /**
     * paymentSource
     */
    @JsonProperty("payment_source")
    private PayPalPayload<ExperienceContextPayload> paymentSource;
}
