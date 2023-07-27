package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 16:12
 * @version 1.0
 */
@Getter
@Setter
public class SubscriptionPayload {

    /**
     * planId
     */
    @JsonProperty("plan_id")
    private String planId;
    /**
     * startTime
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * shippingAmount
     */
    @JsonProperty("shipping_amount")
    private Money shippingAmount;
    /**
     * subscriber
     */
    @JsonProperty("subscriber")
    private Subscriber subscriber;
    /**
     * applicationContext
     */
    @JsonProperty("application_context")
    private SubscriptionContext applicationContext;
}
