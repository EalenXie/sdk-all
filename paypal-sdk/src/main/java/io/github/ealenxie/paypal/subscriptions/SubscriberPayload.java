package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 14:17
 * @version 1.0
 */
@Getter
@Setter
public class SubscriberPayload {
    /**
     * shippingAddress
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    /**
     * name
     */
    @JsonProperty("name")
    private SubscriberName name;
    /**
     * emailAddress
     */
    @JsonProperty("email_address")
    private String emailAddress;
    /**
     * payerId
     */
    @JsonProperty("payer_id")
    private String payerId;
}
