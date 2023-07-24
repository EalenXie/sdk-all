package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:42
 */
@Getter
@Setter
public class SearchInvoicesResponse {

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
    private List<InvoicesItem> items;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
