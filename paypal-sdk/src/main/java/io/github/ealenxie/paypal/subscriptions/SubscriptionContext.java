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
public class SubscriptionContext {
    /**
     * brandName
     */
    @JsonProperty("brand_name")
    private String brandName;
    /**
     * locale
     */
    @JsonProperty("locale")
    private String locale;
    /**
     * shippingPreference
     */
    @JsonProperty("shipping_preference")
    private String shippingPreference;
    /**
     * userAction
     */
    @JsonProperty("user_action")
    private String userAction;
    /**
     * paymentMethod
     */
    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;
    /**
     * returnUrl
     */
    @JsonProperty("return_url")
    private String returnUrl;
    /**
     * cancelUrl
     */
    @JsonProperty("cancel_url")
    private String cancelUrl;
}
