package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 16:12
 * @version 1.0
 */
@Getter
@Setter
public class Subscriber {
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
     * shippingAddress
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
}
