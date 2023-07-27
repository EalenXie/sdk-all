package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/18 15:03
 * @version 1.0
 */
@Getter
@Setter
public class CreatePlanPayload {

    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * billingCycles
     */
    @JsonProperty("billing_cycles")
    private List<BillingCycles> billingCycles;
    /**
     * paymentPreferences
     */
    @JsonProperty("payment_preferences")
    private PaymentPreferences paymentPreferences;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * taxes
     */
    @JsonProperty("taxes")
    private Taxes taxes;
}
