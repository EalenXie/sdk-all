package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class DraftInvoiceCreatePayload {

    /**
     * detail
     */
    @JsonProperty("detail")
    private DraftInvoiceDetailPayload detail;
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
    private List<DraftInvoiceItemPayload> items;
    /**
     * configuration
     */
    @JsonProperty("configuration")
    private Configuration configuration;
    /**
     * amount
     */
    @JsonProperty("amount")
    private AmountPayload amount;
}
