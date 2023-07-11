package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Filter;
import io.github.ealenxie.walmart.marketplace.Query;
import io.github.ealenxie.walmart.marketplace.Sort;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 10:53
 */
@Getter
@Setter
public class OnholdSearchPayload {

    /**
     * query
     */
    @JsonProperty("query")
    private Query query;
    /**
     * filters
     */
    @JsonProperty("filters")
    private List<Filter> filters;
    /**
     * sort
     */
    @JsonProperty("sort")
    private Sort sort;
}
