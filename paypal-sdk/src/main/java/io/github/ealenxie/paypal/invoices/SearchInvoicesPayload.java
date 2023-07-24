package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:32
 */
@Getter
@Setter
public class SearchInvoicesPayload {

    @JsonProperty("total_amount_range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private AmountRange totalAmountRange;
    @JsonProperty("invoice_date_range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DateRange invoiceDateRange;
    @JsonProperty("recipient_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String recipientEmail;
    @JsonProperty("recipient_first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String recipientFirstName;
    @JsonProperty("recipient_last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String recipientLastName;
    @JsonProperty("recipient_business_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String recipientBusinessName;
    @JsonProperty("invoice_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String invoiceNumber;
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> status;
    @JsonProperty("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reference;
    @JsonProperty("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String memo;
    @JsonProperty("payment_date_range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DateRange paymentDateRange;
    @JsonProperty("archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean archived;
    @JsonProperty("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> fields;
    @JsonProperty("currency_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currencyCode;
    @JsonProperty("due_date_range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DateRange dueDateRange;
    @JsonProperty("creation_date_range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DateRange creationDateRange;

}
