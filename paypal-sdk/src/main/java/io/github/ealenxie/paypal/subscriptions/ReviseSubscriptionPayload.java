package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 14:29
 * @version 1.0
 */
@Getter
@Setter
public class ReviseSubscriptionPayload {

    /**
     * planId
     */
    @JsonProperty("plan_id")
    private String planId;
    /**
     * shippingAmount
     */
    @JsonProperty("shipping_amount")
    private Money shippingAmount;
    /**
     * shippingAddress
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    /**
     * applicationContext
     */
    @JsonProperty("application_context")
    private ReviseSubscriptionContext applicationContext;
}
