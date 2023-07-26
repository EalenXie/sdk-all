package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/21 18:00
 */
@Getter
@Setter
public class InvoiceNumberPayload {

    /**
     * invoiceNumber
     */
    @JsonProperty("invoice_number")
    private String invoiceNumber;
}
