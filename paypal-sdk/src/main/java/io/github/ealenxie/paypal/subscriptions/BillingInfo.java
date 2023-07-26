package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/26 14:17
 * @version 1.0
 */
@Getter
@Setter
public class BillingInfo {
    /**
     * outstandingBalance
     */
    @JsonProperty("outstanding_balance")
    private Money outstandingBalance;
    /**
     * cycleExecutions
     */
    @JsonProperty("cycle_executions")
    private List<CycleExecution> cycleExecutions;
    /**
     * lastPayment
     */
    @JsonProperty("last_payment")
    private LastPayment lastPayment;
    /**
     * nextBillingTime
     */
    @JsonProperty("next_billing_time")
    private String nextBillingTime;
    /**
     * failedPaymentsCount
     */
    @JsonProperty("failed_payments_count")
    private Integer failedPaymentsCount;
}
