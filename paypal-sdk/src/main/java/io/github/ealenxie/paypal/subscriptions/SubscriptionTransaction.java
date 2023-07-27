package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.invoices.Name;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 15:41
 * @version 1.0
 */
@Getter
@Setter
public class SubscriptionTransaction {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * payerEmail
     */
    @JsonProperty("payer_email")
    private String payerEmail;
    /**
     * payerName
     */
    @JsonProperty("payer_name")
    private Name payerName;
    /**
     * amountWithBreakdown
     */
    @JsonProperty("amount_with_breakdown")
    private AmountWithBreakdown amountWithBreakdown;
    /**
     * time
     */
    @JsonProperty("time")
    private String time;
}
