package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
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
