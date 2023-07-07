package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Filter;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 13:18
 */
@NoArgsConstructor
@Data
public class ItemListingDetailsPayload {
    /**
     * query
     */
    @JsonProperty("query")
    private Query query;
    @JsonProperty("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Filter filter;
}
