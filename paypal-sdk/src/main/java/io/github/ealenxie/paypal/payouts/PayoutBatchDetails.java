package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/27 11:28
 **/
@Getter
@Setter
public class PayoutBatchDetails {

    /**
     * The total number of items in the full result list.
     */
    @JsonProperty("total_items")
    private int totalItems;
    /**
     * The total number of pages.
     */
    @JsonProperty("total_pages")
    private int totalPages;
    /**
     * A payout header. Includes the generated payout status.
     */
    @JsonProperty("batch_header")
    private BatchHeader batchHeader;
    /**
     * An array of individual items.
     */
    @JsonProperty("items")
    private List<PayoutItems> items;
    /**
     * An array of request-related HATEOAS links.
     */
    @JsonProperty("links")
    private List<Link> links;

}

