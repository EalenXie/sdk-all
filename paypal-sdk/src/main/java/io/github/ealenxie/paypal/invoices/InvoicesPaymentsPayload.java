package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/21 10:46
 */
@Getter
@Setter
public class InvoicesPaymentsPayload {
    /**
     * method
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment_id")
    private String paymentId;

    @JsonProperty("note")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String note;
    /**
     * method
     */
    @JsonProperty("method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String method;
    /**
     * paymentDate
     */
    @JsonProperty("payment_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paymentDate;
    /**
     * amount
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("amount")
    private Money amount;

    @JsonProperty("shipping_info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ShippingInfoPayload shippingInfo;
}
