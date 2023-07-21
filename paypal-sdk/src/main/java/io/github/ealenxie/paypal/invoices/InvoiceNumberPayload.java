package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/21 18:00
 */
@NoArgsConstructor
@Data
public class InvoiceNumberPayload {

    /**
     * invoiceNumber
     */
    @JsonProperty("invoice_number")
    private String invoiceNumber;
}
