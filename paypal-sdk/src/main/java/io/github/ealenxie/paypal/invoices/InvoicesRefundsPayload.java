package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/21 11:05
 */
@Getter
@Setter
public class InvoicesRefundsPayload {
    /**
     * method
     */
    @JsonProperty("method")
    private String method;
    /**
     * refundDate
     */
    @JsonProperty("refund_date")
    private String refundDate;
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
}
