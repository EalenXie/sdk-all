package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/20 16:16
 */
@Getter
@Setter
public class DraftInvoiceResponse {


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
     * detail
     */
    @JsonProperty("detail")
    private DraftInvoiceDetail detail;
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
    private List<DraftInvoiceItem> items;
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
    /**
     * dueAmount
     */
    @JsonProperty("due_amount")
    private Money dueAmount;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
