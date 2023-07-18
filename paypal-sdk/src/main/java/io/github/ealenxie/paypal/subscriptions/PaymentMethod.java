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
public class PaymentMethod {
    /**
     * payerSelected
     */
    @JsonProperty("payer_selected")
    private String payerSelected;
    /**
     * payeePreferred
     */
    @JsonProperty("payee_preferred")
    private String payeePreferred;
}
