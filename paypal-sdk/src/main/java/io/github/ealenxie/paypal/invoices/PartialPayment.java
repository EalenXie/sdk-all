package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
public class PartialPayment {
    /**
     * allowPartialPayment
     */
    @JsonProperty("allow_partial_payment")
    private Boolean allowPartialPayment;
    /**
     * minimumAmountDue
     */
    @JsonProperty("minimum_amount_due")
    private Money minimumAmountDue;
}
