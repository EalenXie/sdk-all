package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:00
 */
@NoArgsConstructor
@Data
public class InvoiceUpdatePayload {


    /**
     * detail
     */
    @JsonProperty("detail")
    private InvoiceDetailPayload detail;
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
     * invoicer
     */
    @JsonProperty("invoicer")
    private Invoicer invoicer;
    /**
     * primaryRecipients
     */
    @JsonProperty("primary_recipients")
    private List<PrimaryRecipients> primaryRecipients;
    /**
     * items
     */
    @JsonProperty("items")
    private List<InvoiceItem> items;
    /**
     * configuration
     */
    @JsonProperty("configuration")
    private Configuration configuration;
    /**
     * amount
     */
    @JsonProperty("amount")
    private Amount amount;
}
