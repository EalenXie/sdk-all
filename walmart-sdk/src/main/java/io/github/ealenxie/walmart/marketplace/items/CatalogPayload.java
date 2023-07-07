package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Filter;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 15:07
 * @version 1.0
 */

@Getter
@Setter
public class CatalogPayload {

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
