package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class DraftInvoiceDetailPayload {
    /**
     * currencyCode
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * invoiceNumber
     */
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    /**
     * reference
     */
    @JsonProperty("reference")
    private String reference;
    /**
     * invoiceDate
     */
    @JsonProperty("invoice_date")
    private String invoiceDate;
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * term
     */
    @JsonProperty("term")
    private String term;
    /**
     * memo
     */
    @JsonProperty("memo")
    private String memo;
    /**
     * paymentTerm
     */
    @JsonProperty("payment_term")
    private PaymentTerm paymentTerm;
}
