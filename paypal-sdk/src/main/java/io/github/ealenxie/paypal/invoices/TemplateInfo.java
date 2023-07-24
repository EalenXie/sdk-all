package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class TemplateInfo {
    /**
     * configuration
     */
    @JsonProperty("configuration")
    private Configuration configuration;
    /**
     * detail
     */
    @JsonProperty("detail")
    private TemplateDetail detail;
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
     * additionalRecipients
     */
    @JsonProperty("additional_recipients")
    private List<String> additionalRecipients;
    /**
     * items
     */
    @JsonProperty("items")
    private List<TemplateItem> items;
    /**
     * amount
     */
    @JsonProperty("amount")
    private Amount amount;
}
