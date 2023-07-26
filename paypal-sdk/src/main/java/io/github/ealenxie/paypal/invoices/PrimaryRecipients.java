package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
public class PrimaryRecipients {
    /**
     * billingInfo
     */
    @JsonProperty("billing_info")
    private BillingInfo billingInfo;
    /**
     * shippingInfo
     */
    @JsonProperty("shipping_info")
    private ShippingInfo shippingInfo;
}
