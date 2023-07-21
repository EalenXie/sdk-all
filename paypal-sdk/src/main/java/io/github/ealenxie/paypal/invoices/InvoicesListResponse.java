package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/21 10:21
 */
@NoArgsConstructor
@Data
public class InvoicesListResponse {

    /**
     * totalItems
     */
    @JsonProperty("total_items")
    private Integer totalItems;
    /**
     * totalPages
     */
    @JsonProperty("total_pages")
    private Integer totalPages;
    /**
     * items
     */
    @JsonProperty("items")
    private List<InvoiceItem> items;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
