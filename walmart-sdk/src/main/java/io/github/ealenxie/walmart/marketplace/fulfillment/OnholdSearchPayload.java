package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Filter;
import io.github.ealenxie.walmart.marketplace.Query;
import io.github.ealenxie.walmart.marketplace.Sort;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 10:53
 */
@NoArgsConstructor
@Data
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
