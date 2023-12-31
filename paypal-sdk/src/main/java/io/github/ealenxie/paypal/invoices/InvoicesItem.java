package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/21 10:22
 */
@Getter
@Setter
public class InvoicesItem {
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
    private InvoiceDetail detail;
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
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
