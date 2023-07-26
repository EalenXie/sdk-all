package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 15:03
 * @version 1.0
 */
@Getter
@Setter
public class PaymentPreferences {
    /**
     * autoBillOutstanding
     */
    @JsonProperty("auto_bill_outstanding")
    private Boolean autoBillOutstanding;
    /**
     * setupFee
     */
    @JsonProperty("setup_fee")
    private Money setupFee;
    /**
     * setupFeeFailureAction
     */
    @JsonProperty("setup_fee_failure_action")
    private String setupFeeFailureAction;
    /**
     * paymentFailureThreshold
     */
    @JsonProperty("payment_failure_threshold")
    private Integer paymentFailureThreshold;
}
