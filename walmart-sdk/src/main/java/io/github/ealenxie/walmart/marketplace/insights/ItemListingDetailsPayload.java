package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Filter;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:18
 */
@Getter
@Setter
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
